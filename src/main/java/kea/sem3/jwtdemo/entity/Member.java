package kea.sem3.jwtdemo.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MEMBER")
public class Member extends BaseUser {

    String firstName;

    String lastName;

    String street;

    String city;

    String zipCode;

    boolean approved;

    int ranking;

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
