package com.beyond.fileio;

import com.beyond.fileio.practice.A_FileByteStream;

public class Application {

	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
//		new A_FileByteStream().fileSave();
		new A_FileByteStream().fileRead();
		
		System.out.println("프로그램 종료");

	}

}
