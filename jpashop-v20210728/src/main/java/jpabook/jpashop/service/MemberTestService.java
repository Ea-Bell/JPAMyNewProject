package jpabook.jpashop.service;


import jpabook.jpashop.domain.KakaoVO;
import jpabook.jpashop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MemberTestService {

    @Autowired
    UserRepository userRepository;

    public void joinUser(KakaoVO userVO){
        System.out.println(" MemberTestServisce입니다." );
        userRepository.save(userVO);
    }

    public List<KakaoVO> findUser(){
        return userRepository.findAll();
    }

}
