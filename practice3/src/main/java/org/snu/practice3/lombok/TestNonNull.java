package org.snu.practice3.lombok;

import lombok.NonNull;

public class TestNonNull {
    private int user_idx;
    @NonNull    // Runtime 시에 Name 필드를 Null 체크하겠다는 의미
    private String name;
    private String email;
}
