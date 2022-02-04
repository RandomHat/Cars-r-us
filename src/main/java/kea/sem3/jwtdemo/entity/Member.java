package kea.sem3.jwtdemo.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MEMBER")
public class Member extends BaseUser {

    @Column(name = "fornavn")
    String firstName;

    @Column(name = "efternavn")
    String lastName;

    /*
    String street;
    String city;
    int zip;
    boolean approved;
    int ranking;
     */

    public Member(){}

    public Member(String username, String email, String password, String firstName, String lastName) {
        super(username, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
