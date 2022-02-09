package kea.sem3.jwtdemo.entity;

import kea.sem3.jwtdemo.dto.CarRequest;
import kea.sem3.jwtdemo.dto.CarResponse;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "biler")
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String brand;
    String model;

    @Column(name = "dagpris")
    double pricePrDay;

    @Column(name = "rabat")
    double discount;

    @Column(name = "oprettet")
    @CreationTimestamp
    LocalDateTime created;

    @Column(name = "rettet")
    @UpdateTimestamp
    LocalDateTime updated;

    public Car(String brand, String model, double pricePrDay, double discount) {
        this.brand = brand;
        this.model = model;
        this.pricePrDay = pricePrDay;
        this.discount = discount;
    }

    public Car(CarRequest body) {
        this.brand = body.getBrand();
        this.model = body.getModel();
        this.pricePrDay = body.getPricePrDay();
        this.discount = body.getDiscount();
    }
}
