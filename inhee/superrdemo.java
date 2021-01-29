/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inhee;

/**
 *
 * @author velmurugan
 */
public class superrdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bike obj =new bike();
        obj.display();
    }
    
}
class vehicle
{
    int speed=50;
    vehicle()
    {
         System.out.println("vehicle class");
    }
    void display()
    {
         System.out.println("Vehicle method");
    }
}
class bike extends vehicle
{
     int speed=100;//since it is present in adv cls itself
     bike()
     {
         super();
          System.out.println("bike class");
     }
     void display()
     {
         super.display();
          System.out.println(super.speed);//to access both the supr and sub cls->super is used
         System.out.println(speed);
     }
}