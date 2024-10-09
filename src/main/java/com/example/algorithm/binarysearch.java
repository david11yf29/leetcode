package com.example.algorithm;

public class binarysearch {
	/// # 二分查找基礎版<br/>
	/// <br/>
	/// Params:<br/>
	/// - arr: 待查找的升序数组<br/>
	/// - target: 待找的目标值<br/>
	/// <br/>
	/// Returns:<br/>
	/// - 找到则返回索引<br/>
	/// - 找不到返回-1<br/>
	public static int binarySearch(int[] arr, int target) {
		int i = 0, j = arr.length - 1;
		while (i <= j) {
			int m = (i + j) / 2;
			if (target < arr[m]) {
				j = m - 1;
			} else if (arr[m] < target){
				i = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}

}
