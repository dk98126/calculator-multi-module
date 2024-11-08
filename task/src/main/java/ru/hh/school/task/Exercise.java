package ru.hh.school.task;

import ru.hh.school.calculator.Calculator;
import ru.hh.school.operation.Operation;

public class Exercise {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Result: " + calculator.calculate(1, Operation.PLUS, 1));
  }
}
