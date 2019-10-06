package com.senal.lucky;

import java.util.ArrayList;
import java.util.List;

public class MyPicks {

	public static void main(String[] args) {
		List<Rows> rr = new ArrayList<>();
		List<Pick> pp = new ArrayList<>();
		while(rr.size() <18) {
			Rows r = new Rows(6);
			if (pp.isEmpty()) {
				pp.addAll(r.getPicks());
			} else {
				r = new Rows(pp, 6);
			}
			rr.add(r);
			String index = String.format("%02d: ", rr.size());
			System.out.println(index.concat(r.toString()));
		}
	}
}
