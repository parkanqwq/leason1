package com.company;

public class Test {

    private String string;
    private int i;

    public Test(String string, int i) {
        this.string = string;
        this.i = i;
    }

    public void lookInfo(){
        System.out.println(string + ", " + i);
    }
}
