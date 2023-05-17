/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;

/**
 *
 * @author alyel
 */
public class JAVAPROJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      course c = new course();
        c.courseInfo();

    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
    });
    
    }
    
}
