package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Member;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @BeforeAll
    static void setUp(@Autowired MemberRepository memberRepository) {
        for (int i = 0; i < 3; i++) {
            memberRepository.save(new Member("member" + i, "x" + i + "@x.dk", "test12", "lars", "hansen", "vejnavn", "by", "2200", false, 0));
        }
    }

    @Test
    void testCount(){
        assertEquals(3, memberRepository.count());
    }
}