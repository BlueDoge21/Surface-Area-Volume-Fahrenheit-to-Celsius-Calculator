/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodassignmentconsole;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public class MethodAssignmentConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Start of console version
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose what you would like to calculate");
        System.out.println("Enter 'r' to calculate rectange surface area and volume");
        System.out.println("Enter 'c' to calculate cylinder surface area and volume");
        System.out.println("Enter 't' to calculate celcius to fahrenheit");//T for temperature
        
        char choice  = scan.nextLine().charAt(0);
        
        switch(choice){
            case 'r':
                System.out.println("Please enter the length");
                double recLength = scan.nextDouble();
                System.out.println("Please enter the width");
                double recWidth = scan.nextDouble();
                System.out.println("Please enter the height");
                double recHeight = scan.nextDouble();
                double recSA = rectangleSurfaceArea(recLength,recWidth,recHeight);
                double recV = rectangleVolume(recLength,recWidth,recHeight);
                System.out.println("The surface area is "+recSA+" and the volume is "+ recV);              
                break;
                
            case 'c':
                System.out.println("Please enter the radius");
                double cylRadius = scan.nextDouble();
                System.out.println("Please enter the height");
                double cylHeight = scan.nextDouble();
                double cylSA = CylinderSurfaceArea(cylRadius,cylHeight);
                double cylV = CylinderVolume(cylRadius,cylHeight);
                System.out.println("The surface area is "+cylSA+" and the volume is "+ cylV);
                break; 
                
            case 't':
                System.out.println("Please enter the temperature in celcius");
                double celcius = scan.nextDouble();
                double fahrenheit = CelciusToFahrenheit(celcius);
                System.out.println("The temperature in fahrenheit is "+ fahrenheit);
                break;
            default:
                break;
        }
    }
    public static double rectangleSurfaceArea(double recL,double recW,double recH){//declaring the method with parameters for the SA of a rectangle.
        double recSurfaceArea = 2*recL*recW + 2*recL*recH + 2*recW*recH;//calculates the surface area of a rectangle with the given values
        recSurfaceArea = Math.round(recSurfaceArea * 100)/100.00;//rounds to two decimal places
        return recSurfaceArea;//returns the surface area of the rectangle
    }
    public static double rectangleVolume(double recL,double recW,double recH){
        double recVolume = recL*recW*recH;//calculates the volume of a rectangle with the given values
        recVolume = Math.round(recVolume * 100)/100.00;//rounds to two decimal places
        return recVolume;//returns the volume of the rectangle
    }
    public static double CylinderSurfaceArea(double cylR, double cylH){
        double cylSurfaceArea = Math.pow(cylR, 2)*Math.PI*2 + 2*Math.PI*cylR*cylH;//calculates the surface area of a cylinder with the given values
        cylSurfaceArea = Math.round(cylSurfaceArea * 100)/100.00;//rounds to two decimal places
        return cylSurfaceArea;//returns the surface area of the cylinder
    }
    public static double CylinderVolume(double cylR, double cylH){
        double cylVolume = Math.pow(cylR, 2)*Math.PI*cylH;//calculates the volume of a rectangle with the given values
        cylVolume = Math.round(cylVolume * 100)/100.00;//rounds to two decimal places
        return cylVolume;//returns the volume of the cylinder
    }
    public static double CelciusToFahrenheit(double celcius){
        double fahrenheit = celcius*9/5+32;//calculates fahrenheit with celcius
        fahrenheit = Math.round(fahrenheit * 100)/100.00;//rounds to two decimal places
        return fahrenheit;//returns the fahrenheit equivalent from celcius
    }
    
}
