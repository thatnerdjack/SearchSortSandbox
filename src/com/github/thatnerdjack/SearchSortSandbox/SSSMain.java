package com.github.thatnerdjack.SearchSortSandbox;

public class SSSMain {

    public static int lookupLinear(SSSData data, int value) {
        for(int i = 0; i < data.getSize(); i++) {
            int currentNum = data.get(i);
            if(currentNum == value) {
                return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		SSSData d1 = new SSSData(1000);
		SSSData d2 = new SSSData(1000);

		d1.print();
		d1.randomize();
		d1.print();

		d2.print();
		d2.sort();
		d2.print();

	}
}
