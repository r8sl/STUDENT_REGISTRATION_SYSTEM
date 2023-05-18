/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectt;
import java.util.Scanner;
/**
 *
 * @author Blu-Ray
 */
public class Student implements PersonalInformation {
    
    Scanner team4 = new Scanner(System.in);
    int degree,parents_num,college_id,enrolled_year, parents_job;
    String enrolled_semester, school_graduated_from, certificate_type,parents_name,hobbies;
    
    

    public Student(int degree, int parents_num, int college_id, int enrolled_year, int parents_job, String enrolled_semester, String school_graduated_from, String certificate_type, String parents_name, String hobbies) {
        this.degree = degree;
        this.parents_num = parents_num;
        this.college_id = college_id;
        this.enrolled_year = enrolled_year;
        this.parents_job = parents_job;
        this.enrolled_semester = enrolled_semester;
        this.school_graduated_from = school_graduated_from;
        this.certificate_type = certificate_type;
        this.parents_name = parents_name;
        this.hobbies = hobbies;
    }

    public Student() {
    }

    public int setDegree() {
        System.out.println("Please enter your degree");
        return team4.nextInt();
    }

    public String setParents_num() {
        System.out.println("Please enter your parents' phone number");
        return team4.nextLine();
    }

    public int setCollege_id() {
        System.out.println("Please enter your college ID");
        return team4.nextInt();
    }

    public int setEnrolled_year() {
        System.out.println("Please enter the year you enrolled in");
        return team4.nextInt();
    }

    public String setParents_job() {
        System.out.println("Please enter your parents' jobs");
        return team4.nextLine();
    }

    public String setEnrolled_semester() {
        System.out.println("Please enter the semester you enrolled in");
        return team4.nextLine();
    }

    public String setSchool_graduated_from() {
        System.out.println("Please enter the name of the school you graduated from");
        return team4.nextLine();
    }

    public String setCertificate_type() {
        System.out.println("Please enter your certificate");
        return team4.nextLine();
    }

    public String setParents_name() {
        System.out.println("Please enter your parents' name");
        return team4.nextLine();
    }

    public String setHobbies() {
        System.out.println("Please enter your hobbies");
        return team4.nextLine();
    }
    public String setName() {
        System.out.println("Please enter your name");
        return team4.nextLine();
    }

    public String setAddress() {
        System.out.println("Please enter your address");
        return team4.nextLine();
    }

    public String setDateOfBirth() {
        System.out.println("Please enter your date of birth");
        return team4.nextLine();
    }

    public String setGender() {
        System.out.println("Please enter your gender in the same given spelling and format as follows");
        System.out.println("Male / Female");
        String g = team4.nextLine();
        String s1 = "Male";
        String s2 = "Female";
        String s3 = "Error";
        if(g.equals(s1) || g.equals(s2))
            return g;
        else 
            return s3;
    }

    public String setNationality() {
        System.out.println("Please enter your nationality");
        return team4.nextLine();
    }

    public String setEmail() {
        System.out.println("Please enter your email");
        return team4.nextLine();
    }

    public double setNationalID() {
        System.out.println("Please enter your national id");
        return team4.nextDouble();
    }

    public int setPhoneNumber() {
        System.out.println("Please enter your phone number");
        return team4.nextInt();
    }
    

}
