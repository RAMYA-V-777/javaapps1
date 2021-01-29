/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objcopyclone;

/**
 *
 * @author velmurugan
 */
public class equalsdemo{//to check both the objects are equal or not

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        s obj=new s();
        s obj1=new s();//since objects are different it is not equal,if s obj1=obj means equal
        System.out.println(obj);
          System.out.println(obj1);
          if(obj.equals(obj1))
          {
                System.out.println("Equal");
          }
          else
                System.out.println("Not Equal");
        
    }
    
}
class s //extends Object----->inbuilt
{
    int x=10,y=20;
}