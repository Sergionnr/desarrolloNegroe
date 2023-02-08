package com.anahuac.desarrollo.comportamiento.strategy;

public class ListaNum {
	SortBehavor sb;
	int[] nums;
	public ListaNum(SortBehavor sb, int[] nums) {
		this.nums = nums;
		this.sb = sb;
	}
	public void display() {
		for(int i = 0; i < this.nums.length; i++) {
			System.out.print(this.nums[i] + ", ");
		}
		System.out.println("");
	}
	public void performSort() {
		this.nums = sb.sort(this.nums); 
	}
	public void setSort(SortBehavor sb) {
		this.sb = sb;
	}
	public void setNums(int[] nums) {
		this.nums = nums;
	}
}
