package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

/**
 * 1 회원 목록 조회: GET /users              read
 * 2 회원 등록: POST /users                 create
 * 3 회원 조회: GET /users/{userId}         read
 * 4 회원 수정: PATCH /users/{userId}       update
 * 5 회원 삭제: DELETE /users/{userId}      delete
 */


@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user(){
        return "get users";
    }

    @PostMapping
    public String addUser(){
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable("userId") String userId){
        return "get userId = " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable("userId") String userId){
        return "update userId = " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        return "delete userId = " + userId;
    }



}
