/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worksheet2;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
class cube
{
    double height;
    double width;
    double depth;
   
   void getvalue()
   {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the height,width,depth:");
       height=obj.nextDouble();
       width=obj.nextDouble();
       depth=obj.nextDouble();
   }
   void volume()
   {
       double vol=height*width*depth;
       System.out.println("The volume is"+vol);
   }
}
       
   

public class volumeprgrm {
    public static void main(String[] args){
        //TODO code application logic here
        cube obj=new cube();
        obj.getvalue();
        obj.volume();
        
           cube obj1=new cube();
        obj1.getvalue();
        obj1.volume();
    }
    
}
