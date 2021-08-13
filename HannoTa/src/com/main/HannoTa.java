package com.main;

public class HannoTa {
	public int count = 0;
	public void Hanno(int n,char A,char B,char C) {
		if(n==1) {
			//System.out.println(A+"---->"+C);
			count++;
			return ;
		}
		if(n<1) {
			//System.out.println("ÊäÈëÓĞÎó!");
			return ;
		}
		Hanno(n-1, A, C, B);
		//System.out.println(A+"---->"+C);
		count++;
		Hanno(n-1, B, A, C);
	}
	public int Count(int n) {
		if(n==1) {
			return 1;
		}
		return 2*this.Count(n-1)+n;
	}
}
