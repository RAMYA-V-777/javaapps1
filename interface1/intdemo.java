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
public class intdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test obj=new test();
        obj.display();
    }
    
}
interface demo
{
    int a=10;//this var is static and it need to be assigned
    void display();
    
}
class test implements demo
{
    public void display()
    {
        System.out.println("Interface Implementation"+a);//this var i.e. a can be accessed
    }
}