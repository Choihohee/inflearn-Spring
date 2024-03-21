package jpabook.jpashop.domain;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Album {
    @Id
    @GeneratedValue
    private Long id;

    private String artist;

    private String etc;
}
