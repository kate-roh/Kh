//7.19 수업
package com.test02.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
	public static void main(String[] args) throws IOException {
		//소켓 생성
		DatagramSocket ds = new DatagramSocket();
		System.out.println("보냅니다.");
		
		//보낼 data
		byte[]buff= "연습 메세지입니다.".getBytes();
		
		//packet으로 감싼다.
		DatagramPacket sendP = new DatagramPacket(buff,buff.length,InetAddress.getByName("localhost"),9999);
		 //어디에게, 누구에게라는 데이터를 가지고 있음!
		
		//보낸다.
		ds.send(sendP);
		
		//종료
		ds.close();
		ds.disconnect();
		
		
	}

	
}
