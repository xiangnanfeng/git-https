package com.itheima.table;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======");
		getSum();
		System.out.println("===============");
	}
	
	public static void getSum() {
		for(int x=1;x<=9;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(x+"*"+y+"="+x*y +"\t");
			}
			System.out.println();
		}
	}
}