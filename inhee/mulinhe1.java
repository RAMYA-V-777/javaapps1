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
public class mulinhe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boxcost obj=new boxcost(10,3,20,100,30);
        System.out.println(obj.volume());
        System.out.println(obj.weight);
        System.out.println(obj.cost);
    }
    
}
class box//super/base/parent
{
     double height;
     double width;
     double depth;
     double volume(double h,double d,double w)
     {
         height=h;
         width=w;
         depth=d;
          return height*width*depth;
     }
}
     
class boxweight extends box//sub/derived/child
{
    double weight;
   
}
class boxcost extends boxweight
{
    double cost;
     boxcost(double h,double d,double w,double w1,double c)
    {
        height=h;
         width=w;
         depth=d;
         weight=w1;
         cost=c;
    }
}