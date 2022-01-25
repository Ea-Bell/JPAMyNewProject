package jpabook.jpashop.service;

import jpabook.jpashop.domain.KakaoVO;
import jpabook.jpashop.repository.MemberTestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


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
        KakaoVO userVO = new KakaoVO();
        userVO.setName("test");

    }
}