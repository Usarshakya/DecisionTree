/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansar.decisiontree.entity;

import java.util.*;

public class LearningSet {
	private ArrayList<AttributeSet> attributes;
	
	public LearningSet() {
		attributes = new ArrayList<AttributeSet>();
	}

	public void setAttributes(ArrayList<AttributeSet> attributes) {
		this.attributes = attributes;
	}

	public ArrayList<AttributeSet> getAttributes() {
		return attributes;
	}
}

