package com.demo;

public class Server {
	
	//矩形
	public void demo1(){
		for (int i = 0 ; i <= 5 ; i ++ ) {//循环几列
			//循环长度
			for ( int k = 0 ; k <= 15 ; k++ ) {
				System.out.print("*");//不换行
			}
			System.out.println("");//换行
		}
	}
	//直角三角形
	public void demo2(){
		for ( int i = 1 ; i <= 7 ; i ++  ) {
			for ( int k = 0 ; k < i; k ++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//倒直角三角形
	public void demo3(){
		for ( int i = 1 ; i <= 7 ; i ++  ) {
			for ( int k = 0 ; k < 7-i; k ++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	//右直角三角形
	public void demo4(){
		for ( int i = 0 ; i <= 7 ; i ++  ) {
			for ( int k = 0 ; k <= 7; k ++){
				if(k >= 7-i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
	//右倒直角三角形
	public void demo5(){
		for ( int i = 0 ; i <= 7 ; i ++  ) {
			for ( int k = 0 ; k <= 7; k ++){
				if ( 7-k > 7-i ) {
					System.out.print(" ");
				}else  {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	//锐角三角形
	public void demo6() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
