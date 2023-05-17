/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class classroom {
    Scanner team4 =new Scanner(System.in);
    private int Id;
    private String location;
    private int class_capacity;
    public classroom(){
        Id=0;
        location=null;
        class_capacity=0;
    }
    public classroom(String l,int c,int i){
        Id=i;
        location=l;
        class_capacity=c;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public void setlocation(String location){
        this.location=location;
    }
    public void setclass_capacity(int class_capacity){
        this.class_capacity=class_capacity;
    }
    public String getlocation(){
        return location;
    }
    public int getclass_capacity(){
        return class_capacity;
    }
    public int getId() {
        return Id;
    }   
    public void classcondition(){
  int number_of_student=1;
        System.out.println("Enter the size of classroom:");
        int n=team4.nextInt();
        setclass_capacity(n);
       for (int i=0;i<=getclass_capacity();i++){
        if(number_of_student<=getclass_capacity()){
            System.out.println("The student number"+number_of_student+"  , can join the classroom because the capacity is empty.");
            number_of_student++;
            } else{
            System.out.println("The student number"+(getclass_capacity()+1)+"  , can not join the classroom because the capacity is full.");
        }
}
}
}
