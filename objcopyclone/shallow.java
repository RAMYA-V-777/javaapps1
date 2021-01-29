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
public class shallow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        shallow1 obj =new shallow1();//reference +instantiate
        shallow1 obj1=obj;//reference
        obj1.x=obj.x;
        obj1.y=obj.y;
        System.out.println(obj);
        System.out.println(obj1);
        obj1.x=90;
        System.out.println(obj);
        System.out.println(obj1);
        
        
    }
    
}
class shallow1
{
    int x=10,y=40;
    public String toString()
    {
        return "X:"+x+"\tY:"+y;
    }
}