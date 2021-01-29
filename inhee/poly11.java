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
public class poly11{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      art obj=new art();//-Automatically call the default constructor//Method Overloading/Compile time polymorphism
      obj.add(10,20);
      obj.add(10,20,30);
      obj.add("Ramya","Jasmine");
      art obj1=new art("2");//Constructor polymorphism
      art obj2=new art(3);
    }
    
}
class art
{
    art()//cons overloading and duplicate cons can't be there
    {
        System.out.println("First Constructor");
    }
    art(String a)
    {
        System.out.println("Constructor"+a);
    }
    art(int a)
    {
        System.out.println("Constructor"+a);
    }
    void add(int a,int b)//method overloading
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void add(String a,String b)
    {
        System.out.println(a+b);
    }
}

    
