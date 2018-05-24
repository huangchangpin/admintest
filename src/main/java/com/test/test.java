package com.test;

public class test {
    private  String name;

    public test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                '}';
    }

    public test() {
        super();
    }
}
