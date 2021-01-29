/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objcopyclone;

/**
 *
 * @author velmurugan
 */
public class objclone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException
    {
        // TODO code application logic here
        s1 obj=new s1();//time taken
        s1 obj1=(s1)obj.clone();//fast
        System.out.println(obj);
        System.out.println(obj1);
        obj1.x=90;
          System.out.println(obj1);
    }
    
}
class s1 implements Cloneable//if no cloneable will be aerror
{
    int x=10,y=20;
    public String toString()
    {
         return "X:"+x+"\tY:"+y;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
}