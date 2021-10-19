package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String streeet;
    private String zipcode;

    public Address() {}

    public Address(String city, String streeet, String zipcode) {
        this.city = city;
        this.streeet = streeet;
        this.zipcode = zipcode;
    }
}
