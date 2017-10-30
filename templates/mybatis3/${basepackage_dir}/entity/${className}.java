<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 */
public class ${className} extends DomainObject{

	private static final long serialVersionUID = 3466696109837920080L;



	<#list table.columns as column>
	private ${column.javaType} ${column.columnNameLower}; //${column.columnAlias}
	</#list>

<@generateJavaColumns/>

}


<#macro generateJavaColumns>
	<#list table.columns as column>
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}


	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>
