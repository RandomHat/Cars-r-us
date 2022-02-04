package kea.sem3.jwtdemo.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("MEMBER")
public class Member extends BaseUser {

    @Column(name = "fornavn")
    String firstName;

    @Column(name = "efternavn")
    String lastName;

    @Column(name = "vejnavn")
    String street;

    @Column(name = "bynavn")
    String city;

    @Column(name = "postnummer")
    String zipCode;

    @Column(name = "godkendt")
    boolean approved;

    @Column(name = "anciennitet")
    int ranking;

    @Column(name = "oprettet")
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @Column(name = "rettet")
    @UpdateTimestamp
    private LocalDateTime dateEdited;


    public Member(){}

    public Member(String username, String email, String password, String firstName, String lastName,
                  String street, String city, String zipCode, boolean approved, int ranking) {
        super(username, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.approved = approved;
        this.ranking = ranking;
    }
}
