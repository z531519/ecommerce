package com.blacklinuxdude.ecom.domain

class Product {
	static searchable = true
	
    static constraints = {
		String id		
    }
	String description

	static hasMany = [prices : Price]
}
