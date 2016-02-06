package com.derek.ml.models;


public class ML {

    private ML.Files fileName = Files.Car;
    private ML.TestType testType = ML.TestType.CrossValidation;

    public Files getFileName() {
        return fileName;
    }

    public void setFileName(Files fileName) {
        this.fileName = fileName;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public static enum Files {
        Bank, Census, Car, Contraceptive, Mammograph, Stock, Nba, Connect4, Mushrooms, TicTac, Seismic, Wine;
    }

    public static enum TestType {
        CrossValidation, TestData, Train;
    }

}