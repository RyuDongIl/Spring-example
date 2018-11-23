package org.snu.practice3.lombok;

public class Main {

    public static void main(String... args) {
        // Builder 클래스 생
        TestBuilder.TestBuilderBuilder builder = new TestBuilder.TestBuilderBuilder();

        // Builder 메소드로 빌드
        TestBuilder.builder()
                .user_idx(1)
                .name("류동일")
                .email("ehddlf@ehddlf.com")
                .build();

        TestValue testValue = new TestValue(0, "류동일", "jules010@naver.com");

        TestValue testValue1 = testValue.withUser_idx(1);
    }
}
