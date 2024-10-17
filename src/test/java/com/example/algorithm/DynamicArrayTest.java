package com.example.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicArrayTest {

	@Test
	public void test1() {
		DynamicArray dynamicArray = new DynamicArray();
		dynamicArray.addLast(1);
		dynamicArray.addLast(2);
		dynamicArray.addLast(3);
		dynamicArray.addLast(4);
//		dynamicArray.addLast(5);
		dynamicArray.add(2, 5);

		for (int i = 0; i < 5; i++) {
			System.out.println(dynamicArray.get(i));
		}
	}

	@Test
	public void test2() {
		DynamicArray dynamicArray = new DynamicArray();
		dynamicArray.addLast(1);
		dynamicArray.addLast(2);
		dynamicArray.addLast(3);
		dynamicArray.addLast(4);

		dynamicArray.forEach();
	}
}