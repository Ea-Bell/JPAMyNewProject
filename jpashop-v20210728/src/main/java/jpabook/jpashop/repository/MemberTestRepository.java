package jpabook.jpashop.repository;

import jpabook.jpashop.domain.TestMember;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository

public class MemberTestRepository {

    @PersistenceContext
    private   EntityManager em;

    public void save(TestMember tm) {
        System.out.println("MemberTestRepossitory입니다.");
        em.persist(tm);
    }
    public TestMember findOne(Long id) {
        return em.find(TestMember.class, id);
    }

}
