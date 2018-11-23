package org.snu.practice3.service;

import org.snu.practice3.model.DefaultRes;
import org.snu.practice3.model.User;

import java.util.List;

public interface UserService {

    // 전체 user 조회
    DefaultRes<List<User>> findAll();

    // userIdx로 user 조회
    DefaultRes<User> findByUserIdx(final int user_idx);

    // User 저장
    DefaultRes save(final User user);

    // user 수정
    DefaultRes<User> update(final int user_idx, final User user);

    // user_idx로 user 삭제
    DefaultRes deleteByUserIdx(final int user_idx);
}
