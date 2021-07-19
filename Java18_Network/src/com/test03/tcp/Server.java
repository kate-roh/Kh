//7.19 수업

package com.test03.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		//1)
		ServerSocket serverSocket = null;
		//2)통신을 위한 연결
		Socket serviceSocket = null;
		//3)통신을 위한 출력
		PrintWriter out = null;
		//4)
		BufferedReader in = null;
		//서버 생성

		//serverSocket : 요청을 받기 위한 소켓넣기
		serverSocket = new ServerSocket(8888);

		//반복문
		while(true) {
			System.out.println("client를 기다립니다.");
			
			//접속시키기
			serviceSocket = serverSocket.accept();
			//접속한거 받았으면 출력해!
			System.out.println("client가 접속햇습니다..... ");
		
			//연결확인 됬으면 시작함
			//data를 읽어서
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
                  //문자단위 스트림										     //읽어오는 스트림
			
			//보내주겠다.
			out = new PrintWriter(serviceSocket.getOutputStream(), true);
			
			//여기까지 string이 준비가 된거임.
			
			String inputLine = null;
			
			//읽어오자 
			while((inputLine= in.readLine()) != null) {
				System.out.println("클라이언트가 보낸 메세지 : "+ inputLine);
			
				out.println(inputLine);
			}
			
			out.close();
			in.close();
			serviceSocket.close();
			serverSocket.close();
		}
	}
}
