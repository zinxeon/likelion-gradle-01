package com.line.domain;

public class Hospital {
    private String id;  //

    // constructor를 통해서 초기화 해주기 (alt + insert)
    public Hospital(String id) {    // related problem 발생하는데 HospitalParser.java에서 발생하는 것.
        this.id = id;
    }

    // getter 만들기
    public String getId() {
        return id;
    }
}
