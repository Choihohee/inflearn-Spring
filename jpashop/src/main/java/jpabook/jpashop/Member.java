package jpabook.jpashop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Member {
    @Id @GeneratedValue//식별자를 Id 에 매핑, 제너레이트로 자동생성되게 만듦
    private Long id;
    private String username;

}
