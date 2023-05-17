/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instr;
import java.awt.image.BufferedImage; // This library provides classes and methods for creating, manipulating, and saving images. 
import javax.imageio.ImageIO; // This library provides classes and methods for reading and writing images in different formats. 
import com.google.zxing.BarcodeFormat; //This library  provides a set of constants that represent different types of barcodes, such as QR codes,
import com.google.zxing.MultiFormatWriter; //This library  provides a high-level interface for generating barcodes of various formats. It supports encoding different types of barcodes, including QR codes
import com.google.zxing.WriterException; //This library represents an exception that can occur during barcode generation. It is thrown when there is an error while encoding or writing the barcode.
import com.google.zxing.client.j2se.MatrixToImageWriter; //This library is part of the ZXing project and provides utility methods for converting a BitMatrix (a two-dimensional matrix of bits) into a BufferedImage.
import com.google.zxing.common.BitMatrix; //This library is part of the ZXing project and represents a two-dimensional matrix of bits. It is used to store the encoded data of a barcode. 
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Muhammed Nader
 */
public class Qrr extends Instructor {
    public Qrr(){};
    public Qrr(int id, String name, String address, String dateOfBirth, String gender, String nationality,
            double nationalID, double phoneNumber, String email, String martialstatus, int experienceyears,
            String qualification, double salary, String instructorsdepartment) {
        super(id, name, address, dateOfBirth, gender, nationality, nationalID, phoneNumber, email, martialstatus,
                experienceyears, qualification, salary, instructorsdepartment);
    }

 
 
    public BufferedImage generateQRCode() throws WriterException { // BufferedImage is the return type of the function
        String instructorData = "Name: " + getName() + "\nAddress: " + getAddress() + "\nDate of Birth: "
                + getDateOfBirth() + "\nGender: " + getGender() + "\nNationality: " + getNationality()
                + "\nNational ID: " + getNationalID() + "\nPhone Number: " + getPhoneNumber() + "\nEmail: "
                + getEmail()+"\nID: "+getId()+"\nMartialStatus: "+getMartialStatus()+"\nExperienceYears: "+getExperienceYears()+"\nQualification: "+getQualification()+"\nSalary: "+getSalary()
                +"\nInstructor'sDepartment: "+getInstructorsDepartment();

        BitMatrix matrix = new MultiFormatWriter().encode(instructorData, BarcodeFormat.QR_CODE, 200, 200);
        // el method dy btst5dm MultiFormatWriter library 3shan t encode el instructors data to QRCode
        BufferedImage qrCodeImage = MatrixToImageWriter.toBufferedImage(matrix);
        // el method dy bt convert BitMatrix to BufferedImage. el conversion da by allow  el QRcode to be visualized as an image

        return qrCodeImage;
    }

    public void display() {
        Scanner input = new Scanner(System.in);
        ArrayList<Qrr> instructors = new ArrayList<>();

        System.out.println("Enter instructor details:");

        while (true) {
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine(); 

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Address: ");
            String address = input.nextLine();

            System.out.print("Date of Birth: ");
            String dateOfBirth = input.nextLine();

            System.out.print("Gender: ");
            String gender = input.nextLine();

            System.out.print("Nationality: ");
            String nationality = input.nextLine();

            System.out.print("National ID: ");
            double nationalID = input.nextDouble();
            input.nextLine(); 

            System.out.print("Phone Number: ");
            double phoneNumber = input.nextDouble();
            input.nextLine(); 

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Marital Status: ");
            String maritalStatus = input.nextLine();
            

            System.out.print("Experience Years: ");
            int experienceYears = input.nextInt();
            input.nextLine(); 

            System.out.print("Qualification: ");
            String qualification = input.nextLine();

            System.out.print("Salary: ");
            double salary = input.nextDouble();
            input.nextLine(); 

            System.out.print("Instructor's Department: ");
            String instructorsDepartment = input.nextLine();

            instructors.add(new Qrr(id, name, address, dateOfBirth, gender, nationality, nationalID, phoneNumber,
                    email, maritalStatus, experienceYears, qualification, salary, instructorsDepartment));


                        System.out.print("Do you want to add another instructor? (Y/N): ");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                break;
        }
    }

    try {
        for (Qrr instructor : instructors) {
            BufferedImage qrCodeImage = instructor.generateQRCode();

            // Save each QR code image with the instructor's name as the file name
            String fileName = "qrcode_" + instructor.getName() + ".png";
            ImageIO.write(qrCodeImage, "png", new File(fileName));

            System.out.println("QR code generated for " + instructor.getName() + ".");
        }
    } catch (Exception e) {
        System.out.println("Error generating QR code: " + e.getMessage());
    }

    input.close();

}}
