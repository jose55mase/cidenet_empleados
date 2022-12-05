package com.development.todo1.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CANDIDATE")
@Access(AccessType.FIELD)
public class CandidateEntity extends ParentEntity {
    private static final long serialVersionUID = 8435405591663518471L;

    /**
     * <h1>Objeto Candidate</h1>
     * objeto de tipo de usuario que se presenta en .
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2022-12-04
     */

    @Id
    @Column(name = "code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "firstsur_name")
    private String firstSurName;

    @Column(name = "secondsur_name")
    private String secondSurName;

    @Column(name = "contry")
    private  String contry;

    @Column(name = "identity_type")
    private String identityType;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "email")
    private String email;

    public CandidateEntity(Long code, String firstName, String secondName, String firstSurName, String secondSurName, String contry, String identityType, String identityNumber, String email) {
        this.code = code;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstSurName = firstSurName;
        this.secondSurName = secondSurName;
        this.contry = contry;
        this.identityType = identityType;
        this.identityNumber = identityNumber;
        this.email = email;
    }

    public CandidateEntity() { }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstSurName() {
        return firstSurName;
    }

    public void setFirstSurName(String firstSurName) {
        this.firstSurName = firstSurName;
    }

    public String getSecondSurName() {
        return secondSurName;
    }

    public void setSecondSurName(String secondSurName) {
        this.secondSurName = secondSurName;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
