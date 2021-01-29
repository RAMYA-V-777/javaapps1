/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
io\p
123
781
672
905
109
op
781
672
123
905
109
*/
package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author velmurugan
 */
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(1112);
        obj.add(8978);
        obj.add(9700);
        Collections.sort(obj,new java());
        System.out.println(obj);
         
        
        
    }
    
}
class java implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        System.out.println(i1+"...."+i2);
        return i1%10-i2%10;
    }
}