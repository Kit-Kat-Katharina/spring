package com.cydeo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.val;

@ToString
@AllArgsConstructor
public  enum Gender {
MALE("MALE"),
FEMALE("FEMALE");
@Getter private final String val;
}
