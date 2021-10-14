//6월 29일
package com.silsub1.model;

public class Sample {

	public void munjae1() {
		int [][] iarr = new int[4][4];
		
		//값 기록
		for(int i=0; i<iarr.length-1;i++) {
			for(int j=0; j<iarr[i].length-1;j++) {
				iarr[i][j] = (int)(Math.random()*100)+1;
			}
		}
		
		//계산
		for(int i=0; i<iarr.length-1; i++) {
			for(int j =0;j<iarr[i].length-1;j++) {
				
			}
		}
		
		
		
		
		
		
		//출력확인
		for (int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+ "/t" );
			}
			System.out.println();
			
		
		
		
	}
	
	}
	}
