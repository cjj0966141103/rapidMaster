<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>  
package ${basepackage}.service;

import ${basepackage}.entity.rest.${className};
import com.cmcc.somp.entity.base.RestPage;

import java.util.List;
import java.util.Map;


/**
 *
 */
public interface ${className}Service{

<#list table.columns as column>
<#if column.unique && column.pk>
	/**
	 *
	 */
	${className} selectByPrimaryKey(int primaryKey);

	/**
	 *
	 */
	${className} insert(${className} record);


	/**
	 *
	 */
	int updateByPrimaryKey(${className} entity);

	/**
	 *
	 */
	RestPage<${className}> listPageByMap(Map<String, Object> map);


	/**
	 *
	 */
	List<${className}> queryListByMap(Map<String, Object> map);

	/**
	 *
	 */
	List<${className}> queryListByEntity(${className} task);

	/**
	 *
	 */
	RestPage<${className}> listPageByEntity(${className} task);



</#if>
</#list>
}
