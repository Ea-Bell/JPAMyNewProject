package jpabook.jpashop.service;


import jpabook.jpashop.domain.TestMember;
import jpabook.jpashop.repository.MemberTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberTestService {

    private final MemberTestRepository memberTestRepository;



    public Long join(TestMember tm){
        memberTestRepository.save(tm);
        return  tm.getId();
    }
}
