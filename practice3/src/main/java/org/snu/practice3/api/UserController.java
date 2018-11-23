package org.snu.practice3.api;


import lombok.extern.slf4j.Slf4j;
import org.snu.practice3.model.DefaultRes;
import org.snu.practice3.model.User;
import org.snu.practice3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity getAllUsers() {
        log.info("get All Users");
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);

//        User user = new User(1, "류동일", "산업공학과");
//        DefaultRes<User> defaultRes = new DefaultRes<User>(HttpStatus.OK.value(), "Success Find User", user);
//        return new ResponseEntity(defaultRes, HttpStatus.OK);

//        DefaultRes defaultRes1 = new DefaultRes(HttpStatus.OK, "No User");
//        return new ResponseEntity(defaultRes1, HttpStatus.OK);
    }
}
