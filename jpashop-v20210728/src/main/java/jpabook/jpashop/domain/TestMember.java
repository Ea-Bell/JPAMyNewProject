package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class TestMember {

    @Id @GeneratedValue
    private Long id;

    @Column(name="username")
    private String username;



    @Override
    public String toString() {
        return "TestMember{" +
                "id=" + id +
                ", name='" + username + '\'' +
                '}';
    }
}
