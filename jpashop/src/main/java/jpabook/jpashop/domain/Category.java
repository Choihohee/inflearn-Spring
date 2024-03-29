package jpabook.jpashop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private List<Item> items = new ArrayList<>();

    private List<child> children = new
}
