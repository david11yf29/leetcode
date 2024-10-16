package com.example.algorithm;

public class DynamicArray {

	private int size = 0;
	private final int capacity = 0;
	private int[] array = new int[capacity];

	public void addLast(int element) {
		array[size] = element;
	}

}
