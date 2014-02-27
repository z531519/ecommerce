package com.blacklinuxdude.ecom.domain.order

import com.blacklinuxdude.ecom.domain.product.Product;

class CartEntry {

    static constraints = {
    }
	
	Product product
	int quantity
}
