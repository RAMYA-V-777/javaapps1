/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nestescls;

/**
 *
 * @author velmurugan
 */
public class testforobjcls{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sample1 obj=new sample1();
          System.out.println(obj);
          sample1 obj1=new sample1();
          System.out.println(obj1);
          
    }
    
}
class sample1 extends Object//object is the inbuilt cls and supr clr class for all the class in java and the object is identified by hash code and we dont want to call it will call by itself
{
    int x=10,y=10;
    @Override//since it is present in inbuilt class 
   public String toString()
    {
        return "X:"+x+"\nY:"+y;
                
    }
}
