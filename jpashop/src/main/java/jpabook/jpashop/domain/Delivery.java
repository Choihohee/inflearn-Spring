package jpabook.jpashop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    private Order order;

    private Address address;

    private DeliveryStatus status;

}
