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
public class anoninterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sample obj=new sample()
        {
            @Override
            public void display()
            {
                System.out.println("Interface Method Anonymous");
            }
        };
        obj.display();
    }
    
}
interface sample
{
    void display();
}
