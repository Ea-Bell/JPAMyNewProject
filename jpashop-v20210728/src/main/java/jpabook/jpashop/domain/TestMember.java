package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TestMember {

    @Id @GeneratedValue
    Long id;
    String username;

    @Override
    public String toString() {
        return "TestMember{" +
                "id=" + id +
                ", name='" + username + '\'' +
                '}';
    }
}
