package com.github.thatnerdjack.SearchSortSandbox;

import java.util.Arrays;


// class SSSData -- class to manage a list of integer data for search/sort exploration.
// SSSData gets a size specified when it is creacontains will range
// from 1 to double that size (so an SSData(4) will contain numted; the data it bers from 1 to 8);
public class SSSData {
	
	private int[] data = null;
	private int hits = 0;
	
	public SSSData(int size) {
		data = new int[size];
		randomize();
	}

    public int getSize() {
        return data.length;
    }

	public void resetHitCount() {
		hits = 0;
	}
	
	public int get(int index) {
		hits++;
		return data[index];
	}
	
	public void put(int n, int index) {
		hits++;
		data[index] = n;
	}
	
	public void randomize() {
		int maxValue = data.length * 2;
		boolean[] used = new boolean[maxValue + 1];
		for (int i = 0; i < data.length; i++) {
			int tryN = 0;
			do {
				tryN = (int) (Math.random() * maxValue + 1);
			}
			while (used[tryN]);
			used[tryN] = true;
			data[i] = tryN;
		}
	}
	
	public void sort() {
		Arrays.sort(data);
	}
	
	public void print() {
		for (int i = 0; i < data.length; i++) 
			System.out.print(data[i] + " ");
		System.out.println();
	}
	
	public void printHits() {
		System.out.println("Hits = " + hits);
	}
}
