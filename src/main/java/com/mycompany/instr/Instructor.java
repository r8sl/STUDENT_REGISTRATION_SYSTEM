/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instr;

import java.awt.image.BufferedImage;


/**
 *
 * @author Muhammed Nader
 */

public class Instructor implements Personalinformation {


    private  int id;
    private  String name;
    private  String address;
    private String dateOfBirth;
    private String gender;
    private String nationality;
    private double nationalID;
    private double phoneNumber;
    private String email;
    private String martialstatus;
    private int experienceyears;
    private String qualification;
    double salary;
    String instructorsdepartment;

        public Instructor(){};
        public Instructor(int id, String name, String address, String dateOfBirth, String gender, String nationality, double nationalID, double phoneNumber, String email, String martialstatus, int experienceyears, String qualification, double salary,String instructorsdepartment) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.nationalID = nationalID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.martialstatus = martialstatus;
        this.experienceyears = experienceyears;
        this.qualification = qualification;
        this.salary = salary;
        this.instructorsdepartment=instructorsdepartment;
    }
        @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public double getNationalID() {
        return nationalID;
    }

    @Override
    public double getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getMartialStatus() {
        return martialstatus;
    }

    public int getExperienceYears() {
        return experienceyears;
    }

    public String getQualification() {
        return qualification;
    }

    public double getSalary() {
        return salary;
    }

    public String getInstructorsDepartment() {
        return instructorsdepartment;
    }





}
