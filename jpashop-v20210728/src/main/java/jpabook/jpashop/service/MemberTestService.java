package jpabook.jpashop.service;


import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.repository.MemberTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberTestService {

    private final MemberTestRepository memberTestRepository;



    public Long join(TestMember tm){
        System.out.println(" MemberTestServisce입니다.");
        memberTestRepository.save(tm);
        return  tm.getId();
    }
}
