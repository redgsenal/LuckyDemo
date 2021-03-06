package com.senal.lucky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rows {
	private static final int PICK_SIZE = 6;
	private int size;
	List<Pick> picks = new ArrayList<>();
	List<Pick> prevPicks = new ArrayList<>();
	
	public Rows(int picksize) {
		generatePicks(new ArrayList<>(), picksize);
	}
	public Rows(Integer[] prevValues, int picksize) {
		prevPicks = new ArrayList<>();
		for(int p : prevValues) {
			Pick pv = new Pick(p);
			if (!prevPicks.contains(pv)) {
				prevPicks.add(pv);
			}
		}
		generatePicks(prevPicks, picksize);
	}
	public Rows(List<Pick> prevPicks, int picksize) {
		this.prevPicks = (prevPicks != null && !prevPicks.isEmpty()) ? prevPicks : new ArrayList<>();
		generatePicks(this.prevPicks, picksize);
	}
	
	public Rows() {
		generatePicks(new ArrayList<>(), PICK_SIZE);
	}

	private void generatePicks(List<Pick> prevPicks, int size) {
		this.size = (size < 1) ? 6 : size;
		picks = new ArrayList<>();
		while (picks.size() < size) {
			Pick p = new Pick();
			if (!picks.contains(p)) {
				picks.add(p);
				prevPicks.add(p);
			}
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public List<Pick> getPicks() {
		return picks;
	}
	
	@Override
	public String toString() {
		Collections.sort(picks);
		StringBuilder sb = new StringBuilder();
		sb.append("Picks ");
		for(Pick p : picks) {
			sb.append(" ").append(p.getStringValue());
		}
		return sb.toString();
	}
}
