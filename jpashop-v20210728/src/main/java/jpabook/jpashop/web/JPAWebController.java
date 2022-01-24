package jpabook.jpashop.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.repository.MemberTestRepository;

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


    @PersistenceContext
    private final EntityManager em;

    @Autowired
    MemberTestRepository memberTestRepository;

    @Autowired
    MemberTestService memberTestService;
     ObjectMapper objectMapper  =new ObjectMapper();

    @PostMapping("/jpa")
    String testController(@RequestBody @ModelAttribute TestMember member) throws Exception {

        log.info("member {}",member.getId());




        return "OK";
    }


    @ResponseBody
    @GetMapping("/testjpa")
    String testController() throws Exception {




        TestMember member =new TestMember();
        member.setId(10L);
        member.setUsername("test");

        log.info("member {}",member.getId());
//        em.persist(member);

        System.out.println("============================");

        memberTestService.join(member);

//        memberTestRepository.save(member);
        System.out.println("============================");
        return "/index";
    }

}
