package com.beyond.variable.practice;

public class A_Variable {
    /**
     * 
     */
    public void variableTest() {
        // 논리형
        boolean isTrue;

        // 정수형
        byte bNum;
        short sNum;
        int iNum;
        long lNum;

        // 실수형
        float fNum;
        double dNum;

        // 문자형
        char ch = 90;
        
        System.out.println("ch: " + ch);
        System.out.println();

        // 문자열
        // String name; // 문자열을 가리킬 수 있는 참조 변수를 선언
        // String name = ""; // 빈 문자열로 초기화
        // String name = new String("홍길");
       String name = null;
        
        System.out.println("name: " + name);
        System.out.println();
        

        // 지역 변수를 생성 후 초기화가 되지 않은 경우 에러가 발생한다.
        // System.out.println(isTrue);

        isTrue = false; // 선언 후 초기화
        // isTrue = 1; // 에러 발생

        System.out.println("isTrue: " + isTrue);
        
        // bNum = 128; // 에러 발생
        bNum = 127;
        sNum = 32000;
        iNum = 234567991;
        lNum = 92233;
        // long 타입의 리터럴은 숫자 뒤에 L 또는 l을 입력해야 한다.
        // lNum = 9223372036854775807; // 에러 발
        lNum = 9223372036854775807L;
        
        System.out.println("bNum: " + bNum);
        System.out.println("sNum: " + sNum);
        System.out.println("iNum: " + iNum);
        System.out.println("lNum: " + lNum);
        System.out.println();
        
        // float 타입의 리터럴에서 숫자 뒤에 F 또는 f를 입력해야 한다.
        fNum = 3.141592F;
        // dNum = 3.24D;
        dNum = 3.14;
        
        System.out.println("fNum: " + fNum);
        System.out.println("dNum: " + dNum);
        System.out.println();
    }
    
    
    
    
    /*
     * 실습 문제
     * 홀길동 국어 점수 60점, 영어 점수 70점, 수학 점수 66점을 받았다.
     * 이 학생의 총점과 평균을 출력하시오.
     * 
     * 예시)
     * 국어 점수: 60점
     * 영어 점수: 70점
     * 수학 점수: 66점
     * 
     * 총점: 196점
     * 평균: 65점
     */
    
    public void practice() {
    	int ch = 60;
    	int math = 66;
    	int eng = 70;
    	
    	int sum = ch + math + eng;
    	double avg = sum / 3.0;
    	
    	System.out.printf("국어 점수: %d점\n", ch);
    	System.out.printf("영어 점수: %d점\n", math);
    	System.out.printf("수학 점수: %d점\n", eng);
    	System.out.println("총점: " + sum + "점");
    	System.out.println("평균: " + avg + "점");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}