package jpabook.jpashop.service;

import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.domain.UserVO;
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
    public void 회원가입2() throws Exception{

        //given
        UserVO userVO = new UserVO();
        userVO.setName("test");

    }
}