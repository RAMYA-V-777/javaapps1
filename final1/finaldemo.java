/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final1;

/**
 *
 * @author velmurugan
 */
public class finaldemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo obj=new demo();
        obj.display();
    }
    
}
class demo
{
    final int i=10;//constant=value cant be modified but just be printed
    void display()
    {
         System.out.println(i);//just can print,not can be modified(no ++i)
    }
}
class demo1 extends demo
{
    void display()
    {
       // .i....i.....i.....i;
    }
}