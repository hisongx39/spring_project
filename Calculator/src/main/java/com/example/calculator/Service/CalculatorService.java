package com.example.calculator;

import org.springframework.stereotype.Service;

/**
 * ⚡CalculatorService
 *  실제 계산 로직을 담당하는 서비스 레이어
 *
 *  @Service: 스프링에게 "이 클래스는 서비스 역할을 해!" 라고 알리는 표시
 *  → 스프링이 자동으로 이 클래스를 관리(Bean으로 등록)해줌
 */
@Service
public class CalculatorService {

    // 비즈니스 로직: 두 숫자를 더하는 메서드
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    // 두 숫자 빼기
    public int subtract(int number1, int number2){
        return number1 - number2;
    }

    // 비즈니스 로직: 두 숫자를 곱하는 메서드
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    // 두 숫자 나누기
    public double divide(int number1, int number2){
        return (double) number1 / number2;
    }
}