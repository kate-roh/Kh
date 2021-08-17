package com.view;

import java.util.Scanner;

import com.controller.ProductController;

public class ProductView {
	
	public int getMenu() {
		int select = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************");
		System.out.println("1. 전체 조회하기");
		System.out.println("2. 상품 추가하기");
		System.out.println("3. 상품 수정하기");
		System.out.println("4. 상품 삭제하기");
		System.out.println("5. 상품 검색하기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("**************");
		System.out.print("메뉴 선택: ");
		select = sc.nextInt();
		
		return select;
	}
	
	public ProductView() {
		int select = -1;
		ProductController pc = new ProductController();
		
		while(select != 0) {
			select = getMenu();
			
			switch(select) {
			case 1:
				List<Product>res = pc.selectAll()	;
				for(Product p:res) {
					System.out.println("product_id:" +p.getProduct_id()+ ", p_name:" + p.getP_name()
									+ ", price: " + p.getPrice() + ",description: "+ p.getDecscription()+ ",stock: "+ p.getStock( ));
				}
				break;
			case 2:
				int resInsert = pc.insert();
				if(resInsert>0) {
					System.out.println("[insert] 성공!!");
				}else {
					System.out.println("[insert] 실패ㅠㅠ");
				}
				break;
			case 3:
				int resUpdate = pc.update();
				if(resUpdate>0) {
					System.out.println("[update] 성공!!");
				}else {
					System.out.println("[update] 실패ㅜㅜ");
				}
				break;
			case 4:
				int resDel = pc.delete();
				if(resDel>0) {
					System.out.println("[delete] 성공!!");
				}else {
					System.out.println("[delete] 실패ㅜㅜ");
				}
				break;
			case 5:
				Product p = pc.selectOne();
				if(p ! = null) {
					System.out.println("product_id:" +p.getProduct_id()+ ", p_name:" + p.getP_name()
					+ ", price: " + p.getPrice() + ",description: "+ p.getDecscription()+ ",stock: "+ p.getStock( ));					
				}else {
					System.out.println("검색한 정보가 없습니다!");
				}
				break;
			case 0:
				break;
			}
		}
		
		
		
		
	}
}
