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
public class sinhe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        advcal obj=new advcal();
        System.out.println(obj.add(2,3));
         System.out.println(obj.sub(10,3));
          System.out.println(obj.mul(7,7));
          System.out.println(obj.div(10,2));
          System.out.println(obj.mod(10,3)); 
           System.out.println(obj.pow(2,3));
        
    }
    
}
class basecal
{
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
}
    

class advcal extends basecal
{
    int mod(int a,int b)
    {
        return a%b;
    }
    double pow(int a,int b)
    {
        return Math.pow(a,b);
    }

}