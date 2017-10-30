<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>  
package ${basepackage}.dao;

import ${basepackage}.entity.rest.${className};
import java.util.Map;

/**
 *
 */
public interface ${className}Dao extends BaseDao<${className}, Integer>{
	<#list table.columns as column>
	<#if column.unique && column.pk>
	/**
	 *
	 */
	public List<${className}> queryListByMap(Map<String,Object> map) ;

	/**
	 *
	 */
	public List<${className}> queryListByEntity(${className} entity);
	</#if>
	</#list>
}
