package com.raj.library.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Seller")
public class Seller {
    @Id
    private String userName;
    private String password;
    private String name;
    private int age;
    private String phoneNumber;
    private String emailId;

    public Seller(){

    }
    public Seller(String userName, String password, String name, int age, String phoneNumber, String emailId) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }
//    I use Many to Many annotation from JPA repo because seller has multiple books and books also have multiple seller it automatically manage two tables
    @ManyToMany
//    to use this mapping we need a intermediate (junction) table to connect two entities
//    the @ManyToMany does not create the Join table so we need to create this
    @JoinTable(
            name = "seller_book", //the junction table name
            joinColumns = @JoinColumn(name = "seller_id"),// foreign key (FK) refer seller
            inverseJoinColumns = @JoinColumn(name = "book_id")//foreign key (FK) referring to Book
    )
//    use join table method to join seller table and book table with seller_book table where seller_id from seller table is the foreign key to refer seller and book_id from book table is the foreign key to refer book

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
