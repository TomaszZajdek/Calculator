package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        CalculatorApplication calculator = new CalculatorApplication();

        calculator.add(5,5);

        calculator.subtract(10,5);

    }
    public void add(int a, int b){
        int c = a + b;
        System.out.println("wynik z dodawania = " + c);

    }
    public void subtract(int a, int b){
        int c = a - b;
        System.out.println("wynik z odejmowania = " + c);
    }

}
