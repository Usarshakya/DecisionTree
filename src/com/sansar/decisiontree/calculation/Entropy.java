/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansar.decisiontree.calculation;

import com.sansar.decisiontree.Hw1;
import com.sansar.decisiontree.entity.Record;
import java.util.ArrayList;

public class Entropy {	
	public static double calculateEntropy(ArrayList<Record> data) {
		double entropy = 0;
		
		if(data.size() == 0) {
			// nothing to do
			return 0;
		}
		
		for(int i = 0; i < Hw1.setSize("wind"); i++) {
			int count = 0;
			for(int j = 0; j < data.size(); j++) {
				Record record = data.get(j);
				
				if(record.getAttributes().get(4).getValue() == i) {
					count++;
				}
			}
				
			double probability = count / (double)data.size();
			if(count > 0) {
				entropy += -probability * (Math.log(probability) / Math.log(2));
			}
		}
		
		return entropy;
	}
	
	public static double calculateGain(double rootEntropy, ArrayList<Double> subEntropies, ArrayList<Integer> setSizes, int data) {
		double gain = rootEntropy; 
		
		for(int i = 0; i < subEntropies.size(); i++) {
			gain += -((setSizes.get(i) / (double)data) * subEntropies.get(i));
		}
		
		return gain;
	}
}

