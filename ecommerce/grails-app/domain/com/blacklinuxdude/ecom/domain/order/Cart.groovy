package com.blacklinuxdude.ecom.domain.order

import com.blacklinuxdude.ecom.domain.user.Customer;

class Cart {

    static constraints = {
    }
	
	Customer owner
	
	static hasMany = [entries : CartEntry]
}
