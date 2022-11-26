package com.juaracoding.UjianMingguKeLima.utils;

public enum TestScenarios {

    T1("User invalid login"),
    T2("User valid login"),
    T3("User searching for product not found"),
    T4("User search product item"),
    T5("User add cart jeans product item"),
    T6("User add cart coat product item"),
    T7("User doing checkout product");


    private String testName;

    TestScenarios(String value) {

        testName = value;
    }

    public String getTestName() {

        return testName;
    }
}
