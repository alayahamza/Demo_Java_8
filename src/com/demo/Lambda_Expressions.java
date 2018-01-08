package com.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Lambda_Expressions {
    public Lambda_Expressions() {
    }


    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        log.info("addition : " + operate(6, 5, addition));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().map(x -> x.toString()).forEach(log::info);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
