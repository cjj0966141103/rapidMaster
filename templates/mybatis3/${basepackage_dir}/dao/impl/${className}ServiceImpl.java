<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.entity.rest.${className};
import com.cmcc.somp.service.${className}Service;
import com.cmcc.somp.entity.base.RestPage;


/**
 *
 */
@Service
public class ${className}ServiceImpl  implements ${className}Service{

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ${className}Dao dao;

	<#list table.columns as column>
	<#if column.unique && column.pk>


	@Override
	public ${className} selectByPrimaryKey(int primaryKey) {
		return dao.getById(primaryKey);
		}

	@Override
	public ${className} insert(${className} entity) {
		return dao.save(entity);
	}

	@Override
	public int updateByPrimaryKey(${className} entity) {
		return dao.update(entity);

	}

	@Override
	public RestPage<${className}> listPageByMap(Map<String, Object> map) {
		return dao.listPageByMap(map);
	}

	@Override
	public List<${className}> queryListByMap(Map<String, Object> map) {
		return dao.queryListByMap(map);
	}

	@Override
	public List<${className}> queryListByEntity(${className} entity) {
		return dao.queryListByEntity(entity);
	}

	@Override
	public RestPage<${className}> listPageByEntity(${className} entity) {
		return dao.listPageByEntity(entity);
	}

	</#if>
	</#list>


}
