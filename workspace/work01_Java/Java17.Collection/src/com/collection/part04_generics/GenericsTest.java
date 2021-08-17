//7.16 2교시 수업
//7.16,17 복습

package com.collection.part04_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericsTest {
	public void test1() {
		ArrayList list = new ArrayList();
		
		list.add(new String("Object"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("저장된 객체 수: " + list.size());
		System.out.println("list:"+ list);
		
		for(int i= 0; i<list.size(); i++) {
			Object obj=list.get(i);
			
			System.out.println(obj);
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}else if(obj instanceof Student) {
				((Student)obj).score();
			} else if(obj instanceof Car) {
				((Car)obj).printCar();
			}
			
		}
		
	}

	public void test2() {
		//제네릭스: 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능

		//차이점 1.add할때 북클래스 add만 쓸수 있다. 
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		//list.add("test");
		
		list2.add(new Book());
		list2.add(new Book());
		//list2.add("test");
		
		for(Object obj: list2) {
			((Book)obj).printBook();
		}	
			
		for(Book obj:list)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 {
			obj.printBook();
		}
		

	}
	
	public void test3() {
		HashMap<String, Book> map = new HashMap<>();
		//list와 다른점 : 제네릭트부분이 2개가 들어감!
		map.put("one", new Book());
		map.put("two", new  Book());
		map.put("three", new  Book());
		
		System.out.println(map);
		
		//Q. Map.Entry를 이용하여 Iterator을 생성하고, 키 벨류를 동시에 처리하는 방법
		//단!! generics설정을 하며 작성하기
		//참조할 부분 : hashmaptest.java의 2번 [Map 내부클래스 entry 이용: entryset()] 
		
		//3교시
		//A. 강사님이 풀어주신 해답
		Set<Map.Entry<String,Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String,Book>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,Book> ent = iter.next();
			String key = ent.getKey();
			Book value = ent.getValue();
			
			System.out.println(key+"="+value);
			
		}
		
		//set에 key만 추출하여 Iterator활용
		Set<String> keys = map.keySet();
		
		Iterator<String> keyIter = keys.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Book b = map.get(key);
			System.out.println(key+"="+b);
		}
}

}

class Book{
	private String title;
	
	public Book() {	}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call....");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call....");
		
	}
	@Override
	public String toString() {
		return "Student";
	}
}

class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call....");
	}
	@Override
	public String toString() {
		return "Car";
	}
}
