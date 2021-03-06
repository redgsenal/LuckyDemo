package com.senal.lucky;

import java.util.Random;

public class Pick implements Comparable<Pick> {
	private int value;

	public Pick(int value) {
		this.value = (value < 1) ? 1 : value;		
	}
	public Pick() {
		value = getRandomIntegerBetweenRange(1, 49);
	}
	
	public Pick(int minValue, int maxValue) {
		value = getRandomIntegerBetweenRange(minValue, maxValue);
	}

	public int getValue() {
		return value;
	}
	
	public String getStringValue() {
		return String.format("%02d", getValue());
	}

	private int getRandomIntegerBetweenRange(int min, int max) {
	    return (new Random()).nextInt((max - min) + 1) + min;	    
	}

	@Override
	public int compareTo(Pick o) {
		if (o instanceof Pick) {
			return this.getValue() - o.getValue();
		}
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		Pick pp = (Pick) o;
		if (o instanceof Pick) {
			return this.getValue() == pp.getValue();
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return "pick " + this.getValue();
	}
	
}
