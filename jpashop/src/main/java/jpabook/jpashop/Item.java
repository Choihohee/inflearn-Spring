package jpabook.jpashop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)   //싱글 테이블 전략
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Item {    // 구현체를 가지고 할 거기 때문에 추상 클래스

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;
}
