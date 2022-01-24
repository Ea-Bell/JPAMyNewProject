package jpabook.jpashop.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.domain.UserVO;
import jpabook.jpashop.repository.MemberTestRepository;

import jpabook.jpashop.repository.UserRepository;
import jpabook.jpashop.service.MemberTestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@Slf4j
@RequiredArgsConstructor
public class JPAWebController {

    private final MemberTestService  memberTestService;
    private final UserRepository userRepository;
     ObjectMapper objectMapper  =new ObjectMapper();



    @ResponseBody
    @GetMapping("/testjpa")
    String testController() throws Exception {

        TestMember member =new TestMember();
        member.setId(10L);
        member.setUsername("test");

        log.info("member {}",member.getId());
//        em.persist(member);

        System.out.println("============================");



//        memberTestRepository.save(member);
        System.out.println("============================");
        return "index";
    }

    @ResponseBody
    @GetMapping("/testUser")
    String testUser() throws Exception{
        UserVO userVO = new UserVO( "test");
        System.out.println("============================");
        memberTestService.joinUser(userVO);
        System.out.println("============================");
        return "test";
    }

}
