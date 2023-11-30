package org.example.auto_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private final Calculator calculator;

  public CalculatorTest() {
    this.calculator = new Calculator();
  }

  @Test
  void add_returnsSum() {
    assertEquals(calculator.add(1, 1), 2);
  }

  @Test
  void subtract_returnsDifference() {
    assertEquals(calculator.subtract(2, 1), 1);
  }
}
