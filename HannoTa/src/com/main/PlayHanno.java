package com.main;

public class PlayHanno {

	public static void main(String[] args) {
		HannoTa player = new HannoTa();
		int x;
		for(x=1;x<20;x++) {
			player.Hanno(x, 'A', 'B', 'C');
	
			System.out.println(player.count);
		}
		System.out.println(player.Count(19));
	}

}
//A[n]=2A[n-1]+n
