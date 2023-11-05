package jpabook.jpashop;

import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;   //엔티티매니저 약자

    public Long save(Member member) {   //저장하는 코드
        em.persist(member);
        return member.getId();  //member로 반환하지 않고 왜 getId만 반환하냐?
        // -> 커맨드랑 쿼리 분리 저장하고 나면 사이드이펙트 일으킴. 그래서 리턴값 안 만들지만, 아이디로 하면 편하니까 반환시켜준다.
    }

    public Member find(Long id) {    //하나씩 찾는 것
        return em.find()
    }

}
