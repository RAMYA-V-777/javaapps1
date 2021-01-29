/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worksheet2;
class box
{
   double height;
   double width;
   double depth;
   
}


/**
 *
 * @author velmurugan
 */
public class vol {
    public static void main(String[] args){
        box obj=new box();
        obj.height=10;
         obj.width=20;
          obj.depth=30;
          double vol=obj.depth*obj.width*obj.height;
          System.out.println(vol);
          
       
        
    }
    
}
