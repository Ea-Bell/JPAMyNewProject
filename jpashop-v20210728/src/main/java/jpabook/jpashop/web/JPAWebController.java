package jpabook.jpashop.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.domain.KakaoVO;

import jpabook.jpashop.repository.UserRepository;
import jpabook.jpashop.service.MemberTestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class JPAWebController {

    private final MemberTestService  memberTestService;
    private final UserRepository userRepository;
     ObjectMapper objectMapper  =new ObjectMapper();


    @ResponseBody
    @GetMapping("/testUser")
    String testUser() throws Exception{
//        KakaoVO userVO = new KakaoVO( "test");
//        System.out.println("============================");
//        memberTestService.joinUser(userVO);
//        System.out.println("============================");
        return "test";
    }

}
