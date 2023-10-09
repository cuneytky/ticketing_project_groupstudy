package com.cydeo.enums;

import lombok.Value;

public enum Gender {
    MALE("Male"),FEMALE("Female");

    private String value;

    public String getValue() {
        return value;
    }

    Gender(String value) {
        this.value = value;
    }
}
