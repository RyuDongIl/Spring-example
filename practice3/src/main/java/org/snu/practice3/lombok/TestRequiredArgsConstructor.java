package org.snu.practice3.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor    // @NonNull 필드 final 키워드가 붙은 필드의 생성자 자동 생성
public class TestRequiredArgsConstructor {
    private int user_idx;
    @NonNull
    private String name;
    private final String email;
}
