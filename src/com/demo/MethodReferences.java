package com.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MethodReferences {
    public MethodReferences() {
    }


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Hamza");
        names.add("Achraf");
        names.add("Mahdi");
        names.forEach(log::info);
    }

}
