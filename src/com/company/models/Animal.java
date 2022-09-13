package com.company.models;

import com.company.interfaces.Operation;

public class Animal implements Operation {

    @Override
    public void eat() {
        System.out.println("I am eating!");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping!");
    }
}
