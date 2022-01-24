package jpabook.jpashop.service;

import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.repository.MemberTestRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(value = false)
public class MemberTestServiceTest {

    @Autowired
    MemberTestRepository memberTestRepository;

    @Autowired
    MemberTestService memberTestService;


    @Test
    public void 회원가입 () throws  Exception{

        TestMember tm = new TestMember();
        tm.setUsername("testMemberA");
        //when

        memberTestService.join(tm);
        TestMember findTestMember = memberTestRepository.findOne(tm.getId());



        //then
        assertThat(findTestMember.getId()).isEqualTo(tm.getId());
        assertThat(findTestMember.getId()).isEqualTo(tm.getId());

    }
}