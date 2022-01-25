package jpabook.jpashop.service;

<<<<<<< HEAD
import jpabook.jpashop.domain.KakaoVO;

import java.util.List;

public interface UserService {

    /**
     *  회원가입
     */
    public Long join(KakaoVO userVO);

    /**
     * 전체 회원 조회
     */
    public List<KakaoVO> findUser();

    public KakaoVO findOne(Long userID);

=======
public interface UserService {

>>>>>>> origin/main
}
