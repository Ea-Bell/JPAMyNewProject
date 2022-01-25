package jpabook.jpashop.service;


import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.domain.UserVO;
import jpabook.jpashop.repository.MemberTestRepository;
import jpabook.jpashop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MemberTestService {

    @Autowired
    UserRepository userRepository;


//    public void join(TestMember tm){
//        System.out.println(" MemberTestServisce입니다.");
//        memberTestRepository.save(tm);
//
//    }
    public void joinUser(UserVO userVO){
        System.out.println(" MemberTestServisce입니다." );
        userRepository.save(userVO);
    }

    public List<UserVO> findUser(){
        return userRepository.findAll();
    }
}
