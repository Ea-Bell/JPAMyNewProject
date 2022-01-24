package jpabook.jpashop.repository;


import jpabook.jpashop.domain.UserVO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private  EntityManager em;

    public void save(UserVO userVO){
        System.out.println("UserRepository입니다.");
        em.persist(userVO);
    }
    public UserVO findOne(Long id){
        return em.find(UserVO.class, id);
    }
    public List<UserVO> findAll(){
        return em.createQuery("select m from UserVO u ", UserVO.class).getResultList();
    }
}
