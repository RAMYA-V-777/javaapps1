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
public class singlee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boxweight bx=new boxweight(10,20,30,100);
        System.out.println(bx.volume());
        System.out.println(bx.weight);
    }
    
}
class box//super/base/parent
{
     double height;
     double width;
     double depth;
     void volume(double h,double d,double w)
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
    boxweight(double h,double d,double w,double w1)
    {
        height=h;
         width=w;
         depth=d;
         weight=w1;
    }
}
