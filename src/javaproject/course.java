
package javaproject;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;


enum Term{first_semester,second_semester,summer_semester}

enum textbooks{programming1_textbook , introCybersecurity_textbook, dataMining_textbook,AdvancedCalculus_textbook,softwareDevelopment_textbook,DistributedProcessing_textbook,
	        dataBase_textbook , Design_textbook, physiology_textbook , Financials_textbook , linearAlgebra_textbook,calculus_textbook,intro_com_sys_textbook,intro_data_science_textbook,
	        probability1_textbook,discrete_strcture_textbook,data_structures_and_algorithms_textbook , introArtificialIntelligence_textbook , 
	        programming2_textbook, probability2_textbook ,numericalComputations_textbook ,cloudComputing_textbook ,machineLearning_textbook , 
	         softwareEngineering_textbook,Anatomy_textbook,algorithms_textbook,mobileProgramming_textbook, webProgramming_textbook , operaringSystems_textbook,computerNetwork_textbook}


public class course{
    Scanner team4 = new Scanner(System.in);
private Term term;
private textbooks textBook;
private String prerequisiteCourses;
private  int credits;
private int courseNumber;
private int periods;
private int classroom;
private String[] instructors ={"Ezzat","Aly","Nader","Peter","Kamel","Filo","Marwan","Hamed","Bido","Yassin"};
   
public course() {
    }

    public course(Term term, textbooks textBook, String prerequisiteCourses, int credits, int courseNumber, int periods, int classroom) 
    {
        this.term = term;
        this.textBook = textBook;
        this.prerequisiteCourses = prerequisiteCourses;
        this.credits = credits;
        this.courseNumber = courseNumber;
        this.periods = periods;
        this.classroom = classroom;
    }

    public Term getTerm() {
        return term;
    }
    public void setTerm() {
        System.out.println("choose the term from 0 to 2 for regist the subject in it");
        for ( Term oop : Term.values()){
            System.out.println(oop.ordinal()+"."+oop);
        }
       int choose = team4.nextInt();
        Term selection =Term.values()[choose];
        this.term= selection;
    }
    public textbooks getTextBook() {
        return textBook;
    }

    public void setTextBook(textbooks textBook) {
        this.textBook = textBook;
    }

    public String getPrerequisiteCourses() {
        return prerequisiteCourses;
    }

    public void setPrerequisiteCourses() {
        System.out.println("Is there any subject you want to know its prerequistes? write yes or no");
        Scanner input = new Scanner(System.in);
        String yesorno=input.nextLine();
        if(yesorno.equals("yes")){System.out.println("Enter the subject");
        String subjects=input.nextLine();
       
        if (subjects.equals("Programming 1")) {
            System.out.println("You are not allowed to register for Data Structures, Introduction to Database, Programming 2, Operating Systems, Web Programming, Mobile Programming");
        } else {
            System.out.println("You are allowed to register for Data Structures, Introduction to Database, Programming 2, Operating Systems, Web Programming, Mobile Programming");
        }

        if (subjects.equals("Programming 1") || subjects.equals("Introduction to computer Systems")) {
            System.out.println("You are not allowed to register for Operating Systems, Computer Networks");
        } else {
            System.out.println("You are allowed to register for Operating Systems, Computer Networks");
        }

        if (subjects.equals("Data Structures and Algorithms") || subjects.equals("Introduction to computer Systems")) {
            System.out.println("You are not allowed to register for Distributed Processing");
        } else {
            System.out.println("You are allowed to register for Distributed Processing");
        }
        
        if (subjects.equals("Linear Algebra")) {
            System.out.println("You are not allowed to register for Numerical Computations");
        } else {
            System.out.println("You are allowed to register for Numerical Computations");
        }

        if (subjects.equals("Introduction to computer Systems")) {
            System.out.println("You are not allowed to register for Introduction to Artificial Intelligence");
        } else {        System.out.println("You are allowed to register for Introduction to Artificial Intelligence");
    }
   if (subjects.equals("Probability and Statistics 1")) {
        System.out.println("You are not allowed to register for Probability and Statistics 2");
    } else {
        System.out.println("You are allowed to register for Probability and Statistics 2");
    }

    if (subjects.equals("Data Structures and Algorithms")) {
        System.out.println("You are not allowed to register for Cloud Computing, Algorithm Design");
    } else {
        System.out.println("You are allowed to register for Cloud Computing, Algorithm Design");
    }

    if (subjects.equals("Introduction to Artificial Intelligence")) {
        System.out.println("You are not allowed to register for Machine Learning");
    } else {
        System.out.println("You are allowed to register for Machine Learning");
    }

    if (subjects.equals("Programming 2")) {
        System.out.println("You are not allowed to register for Software Engineering");
   } else {
        System.out.println("You are allowed to register for Software Engineering");
    }

    if (subjects.equals("Probability and Statistics 2")) {
        System.out.println("You are not allowed to register for Data Mining and Analytics");
    } else {
        System.out.println("You are allowed to register for Data Mining and Analytics");
    }

    if (!subjects.equals("Programming 1") && !subjects.equals("Introduction to computer Systems") && !subjects.equals("Linear Algebra") &&
        !subjects.equals("Probability and Statistics 1") && !subjects.equals("Data Structures and Algorithms") &&
        !subjects.equals("Introduction to Artificial Intelligence") && !subjects.equals("Programming 2") &&
        !subjects.equals("Probability and Statistics 2")) {
        System.out.println("This subject is not recognized");}
  }
    }
  public void courseInfo() {
        System.out.println("enter a subject to know the information about it? ");
        String subject = team4.nextLine();
        
       
        switch(subject){
           
            case "Programming 1":
                setTerm();
                System.out.println("the course number is "+1250);
                System.out.println("the text book is "+textbooks.programming1_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in first period");
                System.out.println("number of classroom is "+103);
                System.out.println("The instructor for this course is: "+instructors[0]);
                setPrerequisiteCourses();
              break;
            case "Programming 2":
                   setTerm();
                System.out.println("the course number is "+1500);
                System.out.println("the text book is "+textbooks.programming2_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in second period");
                System.out.println("number of classroom is "+103);
                System.out.println("The instructor for this course is: "+instructors[1]);

                setPrerequisiteCourses();
                break;
            case "Probability and Statistics 1":
                setTerm();
                System.out.println("the course number is "+1750);
                System.out.println("the text book is "+textbooks.probability1_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in first period");
                System.out.println("number of classroom is "+104);
                System.out.println("The instructor for this course is: "+instructors[2]);

                setPrerequisiteCourses();
                break;
            case "Probability and Statistics 2":
                setTerm();
                System.out.println("the course number is "+2000);
                System.out.println("the text book is "+textbooks.programming2_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in third period");
                System.out.println("number of classroom is "+104);
                System.out.println("The instructor for this course is: "+instructors[3]);

                setPrerequisiteCourses();
                break;
                case "Linear Algebra":
                    setTerm();
                System.out.println("the course number is "+2250);
                System.out.println("the text book is "+textbooks.linearAlgebra_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in sixth period");
                System.out.println("number of classroom is "+105);
                System.out.println("the instructor for this course "+instructors[4]);
                setPrerequisiteCourses();
                break;
              case "IntoCyberSecurity":
                  setTerm();
                System.out.println("the course number is "+2500);
                System.out.println("the text book is "+textbooks.introCybersecurity_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in second period");
                System.out.println("number of classroom is "+105);
                  System.out.println("The instructor for this course is: "+instructors[5]);

                setPrerequisiteCourses();
                break;
                case "design":
                 setTerm();
                System.out.println("the course number is "+2750);
                System.out.println("the text book is "+textbooks.Design_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in third period");
                System.out.println("number of classroom is "+106);
                System.out.println("The instructor for this course is: "+instructors[6]);

                setPrerequisiteCourses();
                break;
                case "data base":
                setTerm();
                System.out.println("the course number is "+3000);
                System.out.println("the text book is "+textbooks.dataBase_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in forth period");
                System.out.println("number of classroom is "+106);
                System.out.println("The instructor for this course is: "+instructors[7]);
                setPrerequisiteCourses();
                break;
                case "physiology":
                setTerm();
                System.out.println("the course number is "+3500);
                System.out.println("the text book is "+textbooks.physiology_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in second period");
                System.out.println("number of classroom is "+107);
                System.out.println("The instructor for this course is: "+instructors[8]);
                setPrerequisiteCourses();
                break;
                case "finacials":
                setTerm();
                System.out.println("the course number is "+3750);
                System.out.println("the text book is "+textbooks.Financials_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in third period");
                System.out.println("number of classroom is "+107);
                System.out.println("The instructor for this course is: "+instructors[9]);
                setPrerequisiteCourses();
                break;
                case "calculus":
                setTerm();
                System.out.println("the course number is "+4000);
                System.out.println("the text book is "+textbooks.calculus_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in forth period");
                System.out.println("number of classroom is "+201);
                System.out.println("The instructor for this course is: "+instructors[0]);
                setPrerequisiteCourses();
                break;
                case "introduction to computer Systems":
                setTerm();
                System.out.println("the course number is "+4250);
                System.out.println("the text book is "+textbooks.intro_com_sys_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in first period");
                System.out.println("number of classroom is "+201);
                System.out.println("The instructor for this course is: "+instructors[1]);
                setPrerequisiteCourses();
                break;
                case "intro_data_science":
                setTerm();
                System.out.println("the course number is "+4500);
                System.out.println("the text book is "+textbooks.intro_data_science_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in second period");
                System.out.println("number of classroom is "+202);
                System.out.println("The instructor for this course is: "+instructors[2]);
                setPrerequisiteCourses();
                break;
                case "discrete structure":
                setTerm();
                System.out.println("the course number is "+4750);
                System.out.println("the text book is "+textbooks.discrete_strcture_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in sixth period");
                System.out.println("number of classroom is "+202);
                System.out.println("The instructor for this course is: "+instructors[3]);
                setPrerequisiteCourses();
                break;
                case "Data Structures and Algorithms":
                setTerm();
                System.out.println("the course number is "+5000);
                System.out.println("the text book is "+textbooks.data_structures_and_algorithms_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in fifth period");
                System.out.println("number of classroom is "+203);
                System.out.println("The instructor for this course is: "+instructors[4]);
                setPrerequisiteCourses();
                break;
                case "intrduction to Artificial intelligence":
                setTerm();
                System.out.println("the course number is "+5250);
                System.out.println("the text book is "+textbooks.introArtificialIntelligence_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in sixth period");
                System.out.println("number of classroom is "+203);
                System.out.println("The instructor for this course is: "+instructors[5]);
                setPrerequisiteCourses();
                break;
                case "Numerical Computations":
                setTerm();
                System.out.println("the course number is "+5500);
                System.out.println("the text book is "+textbooks.numericalComputations_textbook);
                System.out.println("the credits is "+2+" houres");
                System.out.println("the periods is in second period");
                System.out.println("number of classroom is "+204);
                System.out.println("The instructor for this course is: "+instructors[6]);
                setPrerequisiteCourses();
                break;
               case "Cloud Computing ":
                setTerm();
                System.out.println("the course number is "+5750);
                System.out.println("the text book is "+textbooks.cloudComputing_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in first period");
                System.out.println("number of classroom is "+204);
                System.out.println("The instructor for this course is: "+instructors[7]);
                setPrerequisiteCourses();
                break;
                case "Machine Learning":
                setTerm();
                System.out.println("the course number is "+6000);
                System.out.println("the text book is "+textbooks.machineLearning_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in third period");
                System.out.println("number of classroom is "+205);
                System.out.println("The instructor for this course is: "+instructors[8]);
                setPrerequisiteCourses();
                break;
                case "Software Enginnering ":
                setTerm();
                System.out.println("the course number is "+6250);
                System.out.println("the text book is "+textbooks.softwareEngineering_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in fifth period");
                System.out.println("number of classroom is "+205);
                System.out.println("The instructor for this course is: "+instructors[9]);
                setPrerequisiteCourses();
                break;
                case "Mobile Programming ":
                setTerm();
                System.out.println("the course number is "+6500);
                System.out.println("the text book is "+textbooks.mobileProgramming_textbook);
                System.out.println("the credits is "+2+" houres");
                System.out.println("the periods is in sixth period");
                System.out.println("number of classroom is "+206); 
                System.out.println("The instructor for this course is: "+instructors[0]);
                setPrerequisiteCourses();
                break;
                case "Web Programming ":
                setTerm();
                System.out.println("the course number is "+6750);
                System.out.println("the text book is "+textbooks.webProgramming_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in second period");
                System.out.println("number of classroom is "+206);
                System.out.println("The instructor for this course is: "+instructors[1]);
                setPrerequisiteCourses();
                break;
                case "Operating System":
                setTerm();
                System.out.println("the course number is "+7000);
                System.out.println("the text book is "+textbooks.operaringSystems_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in first period");
                System.out.println("number of classroom is "+207);
                System.out.println("The instructor for this course is: "+instructors[2]);
                setPrerequisiteCourses();
                break;
                case "Computer Network":
                setTerm();
                System.out.println("the course number is "+7250);
                System.out.println("the text book is "+textbooks.computerNetwork_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in third period");
                System.out.println("number of classroom is "+207);
                System.out.println("The instructor for this course is: "+instructors[3]);
                setPrerequisiteCourses();
                break;
                case "Algorithms":
                setTerm();
                System.out.println("the course number is "+7500);
                System.out.println("the text book is "+textbooks.algorithms_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in sixth period");
                System.out.println("number of classroom is "+301);
                System.out.println("The instructor for this course is: "+instructors[4]);
                setPrerequisiteCourses();
                break;
                case "Anatomy":
                setTerm();
                System.out.println("the course number is "+7750);
                System.out.println("the text book is "+textbooks.Anatomy_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in forth period");
                System.out.println("number of classroom is "+301);
                System.out.println("The instructor for this course is: "+instructors[5]);
                setPrerequisiteCourses();
                break;
                case "data Mining":
                setTerm();
                System.out.println("the course number is "+8000);
                System.out.println("the text book is "+textbooks.dataMining_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in fifth period");
                System.out.println("number of classroom is "+302);
                System.out.println("The instructor for this course is: "+instructors[6]);
                setPrerequisiteCourses();
                break;
                case "AdvancedCalculus":
                setTerm();
                System.out.println("the course number is "+8250);
                System.out.println("the text book is "+textbooks.AdvancedCalculus_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in third period");
                System.out.println("number of classroom is "+302);
                System.out.println("The instructor for this course is: "+instructors[7]);
                setPrerequisiteCourses();
                break;
                case "SoftwareDevelopment":
                setTerm();
                System.out.println("the course number is "+8500);
                System.out.println("the text book is "+textbooks.softwareDevelopment_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in second period");
                System.out.println("number of classroom is "+303);
                System.out.println("The instructor for this course is: "+instructors[8]);
                setPrerequisiteCourses();
                break;
                case "DistributedProcessing":
                setTerm();
                System.out.println("the course number is "+8750);
                System.out.println("the text book is "+textbooks.DistributedProcessing_textbook);
                System.out.println("the credits is "+3+" houres");
                System.out.println("the periods is in first period");
                System.out.println("number of classroom is "+303);
                System.out.println("The instructor for this course is: "+instructors[9]);
                setPrerequisiteCourses();
                break;
            default:
                System.out.println("Invalid Subject");
                break;
        }

  }

    }

    
    
        
        
    


 



