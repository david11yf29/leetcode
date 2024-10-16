package com.example.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicArrayTest {

	@Test
	@DisplayName("DynamicArray 找到")
	public void test1() {
		DynamicArray dynamicArray = new DynamicArray();
		dynamicArray.addLast(1);
		dynamicArray.addLast(2);
		dynamicArray.addLast(3);
		dynamicArray.addLast(4);
		dynamicArray.addLast(5);
	}
}