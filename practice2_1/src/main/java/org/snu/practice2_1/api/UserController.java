package org.snu.practice2_1.api;

import org.snu.practice2_1.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    // 현재 시간 반환
    @GetMapping("")
    public String getDate() {
        Date today = new Date();
        return today.toString();
    }

    // 모든 회원 데이터 반환 or 회원 이름으로 회원 찾기 or 파트로 해당 파트 회원들 찾기
    @GetMapping("/users")
    public String getAllUsers(
            @RequestParam(value = "name", defaultValue = "", required = false) final String name,
            @RequestParam(value = "part", defaultValue = "", required = false) final String part) {
        if(name.equals("") && part.equals("")) {
            StringBuilder stringBuilder = new StringBuilder();
            if(userList.isEmpty())
                return "리스트가 비었습니다";
            for(User user : userList) {
                stringBuilder.append(user.toString()).append("\n");
            }
            return stringBuilder.toString();
        } else if(part.equals("")) {
            for(User user : userList) {
                if(user.getName() == name) {
                    return user.toString();
                }
            }
            return "없습니다";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for(User user : userList) {
                if(user.getPart() == part) {
                    stringBuilder.append(user.toString()).append("\n");
                }
            }
            if(stringBuilder.toString().isEmpty()) return "없습니다";
            else return stringBuilder.toString();
        }
    }

    @GetMapping("/users/{user_idx}")
    public String searchUserWithIdx(@PathVariable(value = "user_idx") final int user_idx) {
        for(User user : userList) {
            if(user.getUser_idx() == user_idx) {
                return user.toString();
            }
        }
        return "없습니다";
    }

    @PostMapping("/users")
    public String postUser(@RequestBody final User user) {
        userList.add(user);
        return "회원 저장 성공";
    }

    @PutMapping("/users/{user_idx}")
    public String updateUser(
            @PathVariable(value = "user_idx") final int user_idx,
            @RequestBody final User user) {
        for(User u : userList) {
            if(u.getUser_idx() == user_idx) {
                userList.remove(u);
                userList.add(user);
                return "회원 정보 업데이트 성공";
            }
        }
        return "회원 정보 없음";
    }

    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@PathVariable(name = "user_idx") final int user_idx) {
        for(User u : userList) {
            if(u.getUser_idx() == user_idx) {
                userList.remove(u);
                return "회원 정보 삭제 성공";
            }
        }
        return "해당 회원 없음";
    }

}
