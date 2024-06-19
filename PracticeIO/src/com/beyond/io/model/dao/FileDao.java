package com.beyond.io.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public void fileSave() {
		String content = null;
		String save = null;
		String fileName = null;
		StringBuilder sb = new StringBuilder();
		
		System.out.println("파일에 저장할 내용을 반복해서 입력하시요.(\"exit\"을 입력하면 내용 입력 끝): ");
		
		while(true) {
			
			content = sc.nextLine();

			if (content.equalsIgnoreCase("exit")) {
				break;
			} else {
				sb.append(content);
				sb.append("\n");
			}
			
		}
		
		System.out.print("저장하시겠습니까?(y/n): ");
		save = sc.nextLine();
		
		if (save.equalsIgnoreCase("y")) {
			System.out.print("저장할 파일명을 입력하시오 : ");
			fileName = sc.nextLine();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
				bw.write(sb.toString());
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
	}
	
	public void fileOpen() {
		String content = null;
		String fileName = null;
		
		System.out.print("열기 할 파일 명: ");
		fileName = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"))) {
			
			while ((content = br.readLine()) != null) {
				System.out.println(content);				
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없어유~");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileEdit() {
		
		String content = null;
		String save = null;
		String fileName = null;
		StringBuilder sb = new StringBuilder();
		
		System.out.print("수정 할 파일 명: ");
		fileName = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt", true))) {
			
			while ((content = br.readLine()) != null) {
				System.out.println(content);				
			}
			
			System.out.println("파일에 추가할 내용을 입력하세요.: ");
			
			while(true) {
				
				content = sc.nextLine();

				if (content.equalsIgnoreCase("exit")) {
					break;
				} else {
					sb.append(content);
					sb.append("\n");
				}
				
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까?(y/n): ");
			save = sc.nextLine();
			
			if (save.equalsIgnoreCase("y")) {
				bw.write(sb.toString());
				System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
				
			} else {
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}