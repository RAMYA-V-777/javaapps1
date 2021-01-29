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
public class stainncls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer2.inner obj=new outer2.inner();
        obj.display();
    }
    
}
class outer2
{
    static class inner
    {
        void display()
        {
                
                System.out.println("Static inner class");
        }
    }
}
/*static class fff
{
    
}*///->not posiible,only possible in nested inner class as above