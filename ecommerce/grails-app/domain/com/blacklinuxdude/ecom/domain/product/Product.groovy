package com.blacklinuxdude.ecom.domain.product

class Product {
	static searchable = true
	
    static constraints = {
		String id		
    }
	String description
	double price
	static hasMany = [variants : Variant]
}
