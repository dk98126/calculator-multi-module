package ru.hh.school.calculator;

import ru.hh.school.operation.Operation;

public class Calculator {
  public int calculate(int a, Operation operation, int b) {
//    System.out.println(operation.description());
    return switch (operation) {
      case PLUS -> a + b;
      case MINUS -> a - b;
      case MULTIPLY -> a * b;
      case DIVIDE -> a / b;
    };
  }
}
