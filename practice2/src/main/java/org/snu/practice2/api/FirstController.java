package org.snu.practice2.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    // 같은 의미의 컨트롤러 메소드가 두 개 이상 있을 경우 서버 실행 에러 발생!

    @GetMapping("1")     // "" 부분에 URL Mapping을 지정
    public String hello() {
        return "Hello World!!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "") // GET Method이면서 URL Mapping은 ""라는 의미
    public String hello2() {
        return "Nice to meet you!!";
    }

    @GetMapping("name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        return "My name is " + name;
    }

    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part", defaultValue = "") final String part) {
        return part;
    }

    @GetMapping("/info")
    public String getInfo(
            @RequestParam(value = "name") final String name,
            @RequestParam(value = "type", defaultValue = "yb") final String type) {
        return name + "이고 " + type + "입니다.";
    }

    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num) {
        int sum = 0;
        for(int i : num) {
            sum += i;
        }
        return sum;
    }
}
