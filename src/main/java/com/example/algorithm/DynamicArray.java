package com.example.algorithm;

public class DynamicArray {

	private int size = 0;
	private final int capacity = 0;
	private int[] array = new int[capacity];

	public void addLast(int element) {
//		array[size] = element;
//		size++;
		add(size, element);
	}

	public void add(int index, int element) {
		if (index >= 0 && index < size) {
			System.arraycopy(array, index, array, index+1, size-index);
		}

		array[index] = element;
		size++;
	}

}
