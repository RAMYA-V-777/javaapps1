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
public class locinncls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer1 obj=new outer1();
        obj.display();
        
    }
    
}
class outer1
{
    void display()
    {
        class inner
        {
            void display1()
            {
                System.out.println("Local inner class");
            }
        }
        inner obj1=new inner();
        obj1.display1();
    }
}
