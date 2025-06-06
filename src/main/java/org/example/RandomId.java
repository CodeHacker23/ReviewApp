package org.example;

import java.util.Random;

public class RandomId {
  private static int anInt = 0;

    public static int getAnInt() {
        return anInt++;
    }
}
