<%@ page import="com.blacklinuxdude.ecom.domain.Product" %>



<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="product.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${productInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'prices', 'error')} ">
	<label for="prices">
		<g:message code="product.prices.label" default="Prices" />
		
	</label>
	<g:select name="prices" from="${com.blacklinuxdude.ecom.domain.Price.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.prices*.id}" class="many-to-many"/>
</div>

