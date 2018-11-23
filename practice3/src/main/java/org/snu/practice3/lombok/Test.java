package org.snu.practice3.lombok;

import lombok.Data;

@Data   // 모든 멤버 변수의 생성자 및 접근자, toString, equals, hashCode 등 모든 메소드 자동 생성
public class Test {
    private int user_idx;
    private String name;
    private String email;
}
