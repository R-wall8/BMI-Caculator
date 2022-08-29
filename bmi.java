package courseProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 try {
		      File myObj = new File("javaBMI.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
   try {
	   while( true ) { // infinite loop
		System.out.print("Input name: (Enter q to terminate) ");
        String name= input.nextLine();
        if ( name.equals("q") )
        {
            break; // exit infinite loop
        }
        System.out.print("Input birthdate: ");
        String birthdate= input.nextLine();
        
		System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();
        
        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();
        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
        
        String end= input.nextLine();
   
	 
        if (BMI < 18.5 ) {
            System.out.print("Underweight. Insurance payment category low");
        }
        else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.print("Normal. Insurance payment category low");
        }
        else if (BMI >= 25 && BMI < 29.9) {
            System.out.print("Overweight. Insurance payment category high");
        }
        else  {
            System.out.print("Obese. Insurance payment category ");
             
        }
	   }
 } catch (Exception e) {//catch block
            System.out.println("Try Again");           
 } finally {//finally block
            }
        }   
	}


