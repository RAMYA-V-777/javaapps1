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
public class poly22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* System.out.println("\nFRST OBJ CREATION");
        sbi obj=new sbi();
        System.out.println(obj.getrateofinterest());
         iob obj1=new iob();
        System.out.println(obj1.getrateofinterest());
         cbi obj2=new cbi();
        System.out.println(obj2.getrateofinterest());
        System.out.println("\nSECOND OBJ CREATION");*/
        bank1 b;//reference alone not a memory//this way of creation of obj for super cls is called DYNAMIC METHOD DISPATCH
        b=new sbi();//other way of creating an obj for this like concepts i.e.Memory for the particular cls
        System.out.println(b.getrateofinterest());
        b=new iob();//other way of creating an obj for this like concepts i.e.Memory for the particular cls
        System.out.println(b.getrateofinterest());
        b=new cbi();//other way of creating an obj for this like concepts i.e.Create Memory for the particular cls
        System.out.println(b.getrateofinterest());
    }
    
}
class bank1//super cls
{
    int getrateofinterest()
    {
        return 0;
    }
}
class sbi extends bank1//sub cls
{
    int getrateofinterest()//yellow bulb-anatation not error
    {
        return 8;
    }
}
class iob extends bank1
{
    int getrateofinterest()
    {
        return 7;
    }
}
class cbi extends bank1
{
    int getrateofinterest()
    {
        return 6;
    }
}