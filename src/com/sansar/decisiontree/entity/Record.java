/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansar.decisiontree.entity;

import com.sansar.decisiontree.entity.inherit.DiscreteAttribute;
import java.util.*;

public class Record {
	private ArrayList<DiscreteAttribute> attributes;

	public ArrayList<DiscreteAttribute> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(ArrayList<DiscreteAttribute> attributes) {
		this.attributes = attributes;
	}
}
