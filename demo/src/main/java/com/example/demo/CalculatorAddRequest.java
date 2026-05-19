package com.example.demo;

/**
 * ⚡CalculatorAddRequest (DTO)
 *  GET 요청에서 두 개의 숫자를 받기 위한 데이터 전송 객체
 *
 *  URL: /add?number1=5&number2=10 으로 요청이 오면
 *  스프링이 자동으로 number1=5, number2=10 을 이 클래스에 채워줌
 */
public class CalculatorAddRequest {
    private final int number1;  // 첫 번째 숫자 (URL의 number1 값)
    private final int number2;  // 두 번째 숫자 (URL의 number2 값)

    // 생성자: 객체를 만들 때 두 숫자를 받아서 저장
    public CalculatorAddRequest(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Getter: private 변수는 직접 접근 불가 → 메서드로 값을 꺼냄
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}