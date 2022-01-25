package jpabook.jpashop.repository;


import jpabook.jpashop.domain.KakaoVO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private  EntityManager em;

    public void save(KakaoVO userVO){
        System.out.println("UserRepository입니다.");
        em.persist(userVO);
    }
    public KakaoVO findOne(Long id){
        return em.find(KakaoVO.class, id);
    }
    public List<KakaoVO> findAll(){
        return em.createQuery("select m from UserVO u ", KakaoVO.class).getResultList();
    }
    public List<KakaoVO> findByUserName(String username){
        return em.createQuery("seelct u from UserVO u where u.username=:username",
                KakaoVO.class)
                .setParameter("username", username)
                .getResultList();
    }
}
