package com.soebes.idea.bugs;

import java.util.List;

class FooTest implements FooInterface {

  static List<String> checkValues() {
    return List.of("A", "B", "C");
  }

}
