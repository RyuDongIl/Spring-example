package org.snu.practice3.lombok;

import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

// Immutable class로 만드는 Annotation
// 모든 필드값 private final
// Getter 메소드는 생성하지만 Setter 메소드는 생성하지 않음
// 해당 클래스는 더이상 상속 불가
@Value
public class TestValue {
    @Wither(AccessLevel.PROTECTED)  // 값을 변경한 새로운 객체를 만들어줌.
    private int user_idx;
    @NonFinal   // 필드의 final을 선언하지 않을 때 사용
    private String name;
    private String email;
}
