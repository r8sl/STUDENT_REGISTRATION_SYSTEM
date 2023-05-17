/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;


enum cyberSecurity{ introCybersecurity,dataMining,programming1,linearAlgebra,calculus,softwareDevelopment,DistributedProcessing,intro_computer_system,intro_data_science,dataStructures_and_algorithms,dataBase,probability1,discreteStrctures,introArtificialIntelligence,programming2,probability2,numerical_computations,cloud_computing,softwareEngineering, operaringSystems,computerNetwork}
enum healthycare{anatomy,programming1,linearAlgebra,calculus,intro_computer_system,dataStructures_and_algorithms,DistributedProcessing,physiology,probability1,discreteStrctures,programming2,probability2,numerical_computations,data_mining_and_analtics }
enum dataScience{intr_data_science,AdvancedCalculus,programming1,linearAlgebra,calculus,intro_computer_system,DistributedProcessing ,intro_data_science,dataStructures_and_algorithms,dataBase,probability1,programming2,probability2,numerical_computations}
enum ArtificialIntelligence{introArtificialIntelligence,dataMining,programming1 ,linearAlgebra,calculus,intro_computer_system,DistributedProcessing,softwareDevelopment,dataStructures_and_algorithms,dataBase,probability1,programming2,probability2,numerical_computations,machineLearning,softwareEngineering,mobileProgramming, webProgramming }
enum multiMedia{Design,programming1,linearAlgebra,calculus,intro_computer_system,dataStructures_and_algorithms,DistributedProcessing,probability1,programming2,probability2,numerical_computations,mobileProgramming, webProgramming }
enum bussiness{introBusinnes,programming1,linearAlgebra,Financials, calculus,intro_computer_system,dataStructures_and_algorithms,DistributedProcessing,probability1,programming2,probability2,numerical_computations}

enum departments{cybersecurity,healthycare,AI,multiMedia,BusinessAnalytics,DataScience}
public class department {
    Scanner team4= new Scanner(System.in);

    public void setDep(){
     
        System.out.println("Please enter your department from 0 to 5");
        for(departments oop : departments.values()){
            System.out.println(oop.ordinal()+" "+oop);
        }
        int choose=team4.nextInt();
        
        switch(departments.values()[choose]){
           
            case cybersecurity:
       System.out.println("these are the subjects of cybersecurity: ");

                for(int i=0; i<=20;i++){
               System.out.println(cyberSecurity.values()[i]);
                }
                break;
            case healthycare:
               System.out.println("these are the subjects of healthycare: ");

                for(int i=0; i<=13;i++){
               System.out.println(healthycare.values()[i]);
                }
                break;
            case AI:
                       System.out.println("these are the subjects of ArtificialIntelligence: ");

               for(int i=0; i<=17;i++){
               System.out.println(ArtificialIntelligence.values()[i]);
                }
                break;
            case multiMedia:
                       System.out.println("these are the subjects of multiMedia: ");

                for(int i=0; i<=12;i++){
               System.out.println(multiMedia.values()[i]);
                }
                break;
            case BusinessAnalytics:
                       System.out.println("these are the subjects of BusinessAnalytics: ");

         for(int i=0; i<=11;i++){
               System.out.println(bussiness.values()[i]);
                }
                break;
            case DataScience :
                       System.out.println("these are the subjects of dataScience: ");

                for(int i=0; i<=13;i++){
               System.out.println(dataScience.values()[i]);
                }
                break;
           default:
                System.out.println("Invalid department");
                break;
        }
}
}
