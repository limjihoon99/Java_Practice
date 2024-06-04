package com.beyond.variable;

import com.beyond.variable.practice.A_Variable;

public class Application {
    public static void main(String[] args) {

    	// 1-2) import 문을 사용하여 클래스 생
        A_Variable variable = new A_Variable();
        
        // 2) 생성한 클래스로 메소드 실행(호출)
        //  [표현법]
        //     변수명.메소드명();
        variable.variableTest();
        variable.practice();
        
    }
}