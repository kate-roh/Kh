//7.15 1교시 수업
//7월 16 복습

package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	public void test() {
		//ArrayList test 
		//순서가 유지 된다. 집어 넣는 순서대로 인덱스값 배정.
		
		ArrayList alist = new ArrayList();
		
		//다형성 적용
		List list = new ArrayList();
		Collection clist = new ArrayList();
		
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());		
		
		for(int i=0; i<alist.size(); i++) {
		System.out.println(i+ ":" + alist.get(i));
	}
		
		
		//중복저장허용
		alist.add("apple");
		System.out.println("alist: " + alist);
		
		//원하는 위치에 추가되며, 추가된 만큼 밀린다. 
		alist.add(1,"banana");
		System.out.println("alist: " + alist);
		
		//삭제
		alist.remove(2);
		System.out.println("alist: " + alist);
		
		//값을 수정함(인덱스, 변경값)
		alist.set(2,45);
		System.out.println("alist: " + alist);
		
		//전체삭제!
		alist.clear();
		System.out.println("alist: " + alist);
		
		//Arraylistsms 오름차순 정렬을 할수 있도록 sort()메소드 제공
		//정렬
		System.out.println();
		alist.add("apple");
		alist.add("orange");
		alist.add("banana");
		alist.add("mango");
		alist.add("grape");
		
		System.out.println("alist: " + alist);
		
		Collections.sort(alist);
		System.out.println("alist Sort: " + alist);

}
}