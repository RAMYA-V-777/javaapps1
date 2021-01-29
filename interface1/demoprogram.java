/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interface1;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class demoprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        doll obj=new doll();
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter product code:");
        int i=obj1.nextInt();
        obj.getproductdetails(i);
         obj.getproductprice(i);
        
        
        
    }
}
  interface productcode
        {
            int tv=101;
            int laptop=102;
            int mobile=103;
        }
interface productdetails
{
    void getproductdetails();
    void getproductprice();
}

class doll implements productcode,productdetails
{
    public void getproductdetails(int code)
    {
        switch(code)
        {
            case tv:
                System.out.println("SONY");
                break;
            case laptop:
                System.out.println("COMPAC");
                break;
            case mobile:
                System.out.println("SAMSUNG");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
     public void getproductprice(int code)
    {
        switch(code)
        {
            case tv:
                System.out.println("$.10000");
                break;
            case laptop:
                System.out.println("$.40000");
                break;
            case mobile:
                System.out.println("$.19000");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}