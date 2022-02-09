package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;

    @BeforeAll
    static void setUp(@Autowired CarRepository carRepository) {
        for(int i = 0; i<3; i++){
            carRepository.save(new Car("car" + i, "mærke", i, 0.25));
        }
    }

    @Test
    void testCount() {
        assertEquals(3, carRepository.count());
    }

}