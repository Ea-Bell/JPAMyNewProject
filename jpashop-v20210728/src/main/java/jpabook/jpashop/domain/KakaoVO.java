package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
public class KakaoVO {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private Boolean has_signed_up;
    
    //서비스에 연결 완료된 시각, UTC* 시간으로 표시됨 한국시간으로 변환 필요
    private LocalDateTime connected_at;

    //카카오싱크 간편가입을 통해 로그인한 시각, UTC* 시간으로 표시됨 한국시간으로 변환 필요
    private LocalDateTime synched_at;

    private String accessToken;
    private String refreshToken;

    


    public KakaoVO() {
    }




}
