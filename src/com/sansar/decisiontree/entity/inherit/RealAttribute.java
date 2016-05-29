/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansar.decisiontree.entity.inherit;

import com.sansar.decisiontree.entity.Attribute;


public class RealAttribute extends Attribute {

	public RealAttribute() {
		super("", 0);
	}
	
	public RealAttribute(String name, double value) {
		super(name, value);
	}
	
	public RealAttribute(String name, String value) {
		super(name, value);
	}

}

