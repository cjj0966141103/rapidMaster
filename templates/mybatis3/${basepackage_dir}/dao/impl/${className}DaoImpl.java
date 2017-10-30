<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao.impl;

import org.springframework.stereotype.Repository;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.entity.rest.${className};


/**
 * 
 */
@Repository
public class ${className}DaoImpl extends BaseDaoImpl<${className}, Integer> implements ${className}Dao{

	<#list table.columns as column>
	<#if column.unique && column.pk>

	@Override
	public List<${className}> queryListByMap(Map<String,Object> map) {
		return this.getSqlSession().selectList(getNamespace("queryListByMap"),map);
	}

	@Override
	public List<${className}> queryListByEntity(${className} entity) {
		return this.getSqlSession().selectList(getNamespace("queryListByEntity"), entity);
	}

	</#if>
	</#list>


}
