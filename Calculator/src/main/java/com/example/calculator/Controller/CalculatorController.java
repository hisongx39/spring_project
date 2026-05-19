//컨트롤러: 클라이언트 요청 URL을 보고 받아서 처리
package com.example.calculator.Controller;

import com.example.calculator.CalculatorAddRequest;
import com.example.calculator.CalculatorService;
import com.example.calculator.DTO.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")  // ← 이 컨트롤러의 모든 URL 앞에 /api/calculator 가 붙음
public class CalculatorController {

    private final CalculatorService calculatorService;

    /**
     * 생성자 주입 (Constructor Injection)
     *
     * 스프링이 CalculatorService 객체를 자동으로 만들어서 여기에 넣어줌
     * 이것을 "의존성 주입 (DI, Dependency Injection)" 이라고 함
     *
     * 💡 쉽게 말하면:
     *   "CalculatorController야, 네가 필요한 CalculatorService는
     *    내(스프링)가 알아서 만들어서 줄게. 걱정하지 마!"
     */
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /**
     * GET /api/calculator/add?number1=5&number2=10
     * → Controller가 요청을 받아 → Service에 계산을 위임
     */
    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest request) {
        return calculatorService.add(request.getNumber1(), request.getNumber2());
        //     ↑ Service에게 "계산해줘!" 하고 결과만 받아옴
    }

    @GetMapping("subtract")
    public int subtractTowNumbers(CalculatorAddRequest request){
        return calculatorService.subtract(request.getNumber1(), request.getNumber2());
    }

    /**
     * POST /api/calculator/multiply
     * Body: { "number1": 5, "number2": 10 }
     */
    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return calculatorService.multiply(request.getNumber1(), request.getNumber2());
    }

    @PostMapping("/divide")
    public double divideTwoNumbers(@RequestBody CalculatorMultiplyRequest request){
        return calculatorService.divide(request.getNumber1(), request.getNumber2());
    }
}