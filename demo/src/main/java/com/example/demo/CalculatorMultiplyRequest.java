package com.example.demo;

/**
 * ⚡CalculatorMultiplyRequest (DTO)
 *  POST 요청에서 두 개의 숫자를 받기 위한 데이터 전송 객체
 *
 *  클라이언트가 Body로 보낸 JSON:
 *  { "number1": 5, "number2": 10 }
 *  → 스프링이 자동으로 이 클래스의 필드에 매핑해줌
 */
public class CalculatorMultiplyRequest {
    private final int number1;
    private final int number2;

    public CalculatorMultiplyRequest(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() { return number1; }
    public int getNumber2() { return number2; }
}