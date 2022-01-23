package jpabook.jpashop.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.service.MemberTestService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class JPAWebController {
//
//    @Resource(name = "memberService")
//    MemberTestService memberService;
//     ObjectMapper objectMapper  =new ObjectMapper();
//
//    @PostMapping("/jpa")
//    String testController(@RequestBody @ModelAttribute TestMember member) throws Exception {
//
//        log.info("member {}",member.getId());
//
//
//         memberService.join(member);
//
//        return "OK";
//    }

}
