/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author velmurugan
 */
public class sampleprg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list=new ArrayList<>();
        //add data
        list.add("Ramya");
        list.add("Ammu");
        list.add("dog");
        list.add(1,"rrr");//with the help of position adding the elements
        System.out.println(list);
         ArrayList<String> list1=new ArrayList<>();//same type of 2 arraylist can be formed
         list1.add("puppy");
         list1.add("violet");
         list.addAll(2,list1);
        System.out.println(list);
        //remove
      //list.remove(0);
     // list.remove("puppy");
       // list.removeAll(list1);
      //  System.out.println(list);
        //enhanced for loop
     /*  for(String i:list)//print verticalllly
        {
            if(i.equals("puppy"))
            System.out.println("Element found");
            else
               System.out.println("Ele not found");
        }
        Iterator itr=list.iterator();//------------>interfacee
        while(itr.hasNext())//check the elements
        {
             System.out.println(itr.next());
        }
    //  list.forEach(s->System.out.println(s);)//lambda expression->just for printing the available data
       // list.removeIf(s -> s.endsWith("a"));//to check a condition and removing
       //  System.out.println(list);
       //  list.replaceAll(s ->s.toUppercase());
         // System.out.println(list);
      
        
        //list.clear();//clearing the list
          // System.out.println(list.isEmpty());
            System.out.println(list.get(3));
            list.set(3,"kkkkkkkkkkkkkk");
             System.out.println(list.get(3));*/
             //sorting in collection
             Collections.sort(list,Collections.reverseOrder());//descending order
              System.out.println(list);
              Collections.reverse(list);//reverse the list
               System.out.println(list);
                  list.retainAll(list1);//only the specified ele are present
               
               
        //   ArrayList<Integer> list2=new ArrayList<>();
           
    }
    
}
