/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.instr;
 import java.util.ArrayList;



/**
 *
 * @author Muhammed Nader
 */
public class Instr {

    public static void main(String[] args) {        ArrayList<Instructor> instructors = new ArrayList<>();

        Instructor instructor1 = new Instructor(1, "Mohamed", "Sidigaber", "01-01-1995",
                "Male", "Egyptian", 123456789, 1234567890, "Mohamed@example.com", "Married", 5,
                "Ph.D. in Computer Science", 5000.0,"(HealthCare,DataScience)");

        Instructor instructor2 = new Instructor(2, "Ali", "Semouha", "01-01-1975",
                "Male", "American", 987654321, 9876543210L, "Ali@example.com", "Single", 3,
                "M.Sc. in Mathematics", 6000.0,"(Cybersecurity,AI)");
        
       Instructor instructor3 = new Instructor(3, "Gehad", "SidiBeshr", "01-01-1979",
                "Female", "American", 987654321, 9876543210L, "Gehad@example.com", "Married", 3,
                "M.Sc. in Mathematics", 3000.0,"(BussinessMulti,Media)");
       

        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);

        for (Instructor instructor : instructors) {
            System.out.println("Instructor ID: " + instructor.getId());
            System.out.println("Name: " + instructor.getName());
            System.out.println("Address: " + instructor.getAddress());
            System.out.println("Date of Birth: " + instructor.getDateOfBirth());
            System.out.println("Gender: " + instructor.getGender());
            System.out.println("Nationality: " + instructor.getNationality());
            System.out.println("National ID: " + instructor.getNationalID());
            System.out.println("Phone Number: " + instructor.getPhoneNumber());
            System.out.println("Email: " + instructor.getEmail());
            System.out.println("Marital Status: " + instructor.getMartialStatus());
            System.out.println("Experience Years: " + instructor.getExperienceYears());
            System.out.println("Qualification: " + instructor.getQualification());
            System.out.println("Salary: " + instructor.getSalary());
            System.out.println("Instructor's Departments: "+instructor.getInstructorsDepartment());
            System.out.println();
        }
        Qrr qr = new Qrr();
        qr.display();
    }
}
