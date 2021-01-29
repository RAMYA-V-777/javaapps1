/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
shape-->abs cls,sup cls
read
findarea
display
circle//sub cls-->have imple part
square//subcls-->have imple part
*/
package abstract1;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        shape1 obj=new circle();
        obj.read();
        obj.findarea();
        obj.display();
        square obj1=new square();
        obj1.read();
        obj1.findarea();
        obj1.display();
        
    }
    
}
abstract class shape1
{
    abstract void read();
    abstract void findarea();
    abstract void display();
    // Scanner obj=new Scanner(System.in);
}
class circle extends shape1
{
    double r,area;
     Scanner obj=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter r:");
        r=obj.nextInt();
    }
    void findarea()
    {
         area=3.14*r*r;
    }
    void display()
    {
        
     System.out.println("The area of the circle is:"+area);
    }
}
class square extends shape1
{
    int r,area;
    Scanner obj=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter r:");
        r=obj.nextInt();
    }
    void findarea()
    {
        area=r*r;
    }
    void display()
    {
         System.out.println("The area of the square is:"+area);
    }
}