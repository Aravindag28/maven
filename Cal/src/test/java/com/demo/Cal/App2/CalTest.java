package com.demo.Cal.App2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalTest {
  
  @Test
  public void testSum() {
    int result = Cal.sum(2, 3);
    assertEquals(5, result);
  }
  
  @Test
  public void testSumWithNegativeNumbers() {
    int result = Cal.sum(-5, 10);
    assertEquals(5, result);
  }
}