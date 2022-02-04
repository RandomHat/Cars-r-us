package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;

    @BeforeEach
    void setUp() {
        for(int i = 0; i<3; i++){
            carRepository.save(new Car("car" + i, "mærke", i));
        }
    }

    @Test
    void testCount() {
        assertEquals(3, carRepository.count());
    }

}