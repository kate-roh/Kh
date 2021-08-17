//7월 16 수업
//7월 16 복습 시도 했으나 실패하고, 17일 다시 복습 

package com.collection.part03_map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void test() {
		//설정 파일의 값을 읽어서 적용할 때 사용된다.
		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:this:@localhost:1521:xe");
		prop.setProperty("user", "KH");
		prop.setProperty("password", "KH");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.properties"),"jdbc driver");
		
			prop.store(new FileWriter("driver.txt"), "jdbc driver");	
			
			//7.16 여기서 막힘...재시도 하기
			//7.17 왜 수업때 안됬는가?
			//     1)오타때문에 수업때도 입력안됬던거야....오타조심하자..그때 진짜 절망스러웠어!!!
			//       오타 즉시 강사님께 말씀드렸어야 한다....!
			//     2)f5키로 새로고침을 눌렀어야 함
			prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	public void test2() {
		
		Properties prop = new Properties();
		
		try {
			//저장된 driver.properties의 값들을 불러온다. 
			prop.load(new FileInputStream("driver.properties"));
			
			//전체값출력
			System.out.println(prop);
			
			//driver.properties내의 driver값 출력
			System.out.println(prop.getProperty("driver"));
			
			//driver.properties내의 url값 출력
			System.out.println(prop.getProperty("url"));
			
			//잘못된 키값을 입력했을때는 null이 뜬다.
			System.out.println(prop.getProperty("ul"));


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
