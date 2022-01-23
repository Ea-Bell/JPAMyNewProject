package jpabook.jpashop.repository;

import jpabook.jpashop.domain.TestMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
//@RequiredArgsConstructor
public class MemberTestRepository {

    @PersistenceContext
    private  EntityManager em;

    public Long save(TestMember tm) {
        em.persist(tm);
        return tm.getId();
    }
    public TestMember findOne(Long id) {
        return em.find(TestMember.class, id);
    }

}
