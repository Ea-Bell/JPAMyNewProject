package jpabook.jpashop.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class UserVO {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String name;

    public UserVO() {
    }

    public UserVO( String name) {
        this.name = name;
    }


}
