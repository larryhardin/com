package com.linkedlists;

public class IntArray {
	private int[] items;
	private int count;
	
	public IntArray(int length) {
		//Lot of problems with this class in the Tutorial!
		//For purposes of making it work as described, instantiate
		//with zero. Otherwise a much more extensive refactor would
		//need to be done.
		items = new int[length];
		count = length;
	}
	
	public void insert(int item) {
		//Upon further reflection, the original logic to check if the
		//array length is equal to count is the crux of the issue. Insert 
		//operation means just that, add it to the end...
		//Leaving commented code for reference only.
		//if ( items.length == count) {
	
		//Increase size by 1
		int[] newItems = new int[count + 1];			
		//Copies items from to new array.
		for ( int i = 0; i < count; i++) {
			newItems[i] = items[i];
		}
		items = newItems;
		//Important note: count is incremented AFTER the assignment!
		items[count++] = item;		
	}
	public void removeAt(int index) {		
		if ( index < 0 || index >= count)
			throw new IllegalArgumentException("Index is out of bounds.");
		
		int[] newItems = new int[count-1];
		//The value at the specified index is not to be copied,
		//implicitly deleting it.
		for ( int i = 0; i<count;i++) {			
			if (i < index )
				newItems[i]=items[i];
			if (i > index )
				newItems[i - 1] = items[i];
		}
		items = newItems;
		count--;
	}

	public int indexOf(int value) {
		for ( int i=0;i<count;i++)
			if ( items[i] == value )
				return i;
		return -1;
	}
	
	public int getLength() {
		return items.length;
	}
	
	
	public void print() {
		for ( int i=0;i<count;i++)
			System.out.println(items[i]);
	}
	
}
