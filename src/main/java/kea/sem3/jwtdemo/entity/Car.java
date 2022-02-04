package kea.sem3.jwtdemo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "biler")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String brand;
    String model;

    @Column(name = "dagpris")
    double pricePrDay;

    @Column(name = "oprettet")
    @CreationTimestamp
    LocalDateTime created;

    @Column(name = "rettet")
    @UpdateTimestamp
    LocalDateTime lastUpdated;

    public Car(){}

    public Car(String brand, String model, double pricePrDay) {
        this.brand = brand;
        this.model = model;
        this.pricePrDay = pricePrDay;
    }
}
