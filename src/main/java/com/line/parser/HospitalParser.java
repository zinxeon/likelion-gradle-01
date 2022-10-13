package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser {
    public Hospital parse(String str) { // void하면 안됨, Hospital이라는 클래스를 return, String을 받아서 return
        // return을 new Hospital을 하도록 만듦
        // Hospital object 없으니까 create class 만든다. (alt + enter)
//        return new Hospital(); // 처음 생성 시 빈값이없지만 Hospital.java에서의 오류가 발생하므로 id에 대한 값 초기화 필요
        return new Hospital("1"); // 값 초기화 시 Hospital에서 parser하면 id는 1을 return

    }
}
