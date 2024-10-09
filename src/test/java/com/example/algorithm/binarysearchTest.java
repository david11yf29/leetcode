package com.example.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class binarysearchTest {

	@Test
	@DisplayName("binarySearchBasic 找到")
	public void test1() {
		int[] arr = {7, 13, 21, 30, 38, 44, 52, 53};
		assertEquals(0, binarysearch.binarySearch(arr, 7));
		assertEquals(1, binarysearch.binarySearch(arr, 13));
		assertEquals(2, binarysearch.binarySearch(arr, 21));
		assertEquals(3, binarysearch.binarySearch(arr, 30));
		assertEquals(4, binarysearch.binarySearch(arr, 38));
		assertEquals(5, binarysearch.binarySearch(arr, 44));
		assertEquals(6, binarysearch.binarySearch(arr, 52));
		assertEquals(7, binarysearch.binarySearch(arr, 53));
	}

	@Test
	@DisplayName("binarySearchBasic 沒找到")
	public void test2() {
		int[] arr = {7, 13, 21, 30, 38, 44, 52, 53};
		assertEquals(-1, binarysearch.binarySearch(arr, 0));
		assertEquals(-1, binarysearch.binarySearch(arr, 15));
		assertEquals(-1, binarysearch.binarySearch(arr, 60));
	}
}