<%@ page import="com.blacklinuxdude.ecom.domain.Price" %>



<div class="fieldcontain ${hasErrors(bean: priceInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="price.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="price" value="${fieldValue(bean: priceInstance, field: 'price')}" required=""/>
</div>

