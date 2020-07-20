package com.soebes.idea.bugs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

interface FooInterface {

  @ParameterizedTest
  @MethodSource
  default void checkValues(String value) {
    System.out.println("value = " + value);
  }

}
