/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interface1;

/**
 *
 * @author velmurugan
 */
public class nestedinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo3 obj=new test3();
        obj.display3();
        demo3.demo4 obj1=new test3();
        obj1.display4();
        
        
    }
    
}
interface demo3
{
    void display3();
    interface demo4
    {
            void display4();      
            
    }
}
class test3 implements demo3,demo3.demo4
{
    public void display3()
    {
        System.out.println("Interface-1");
    }
    
    public void display4()
    {
        System.out.println("Nested Interface-1");
    }
 
}
            
    
    
    
