package ru.hh.school.operation;

public enum Operation {
  PLUS("+"),
  MINUS("-"),
  MULTIPLY("*"),
  DIVIDE("/"),
  ;

  Operation(String operation) {
    str = operation;
  }

  private final String str;

  public static Operation from(String str) {
    for (Operation op : Operation.values()) {
      if (op.str.equals(str)) {
        return op;
      }
    }
    throw new IllegalArgumentException();
  }

  @Override
  public String toString() {
    return str;
  }

  public String description() {
    return switch (this) {
      case PLUS -> "сложение";
      case MINUS -> "вычитание";
      case MULTIPLY -> "умножение";
      case DIVIDE -> "деление";
    };
  }
}
