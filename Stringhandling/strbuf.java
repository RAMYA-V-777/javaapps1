/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stringhandling;

/**
 *
 * @author velmurugan
 */
public class strbuf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer obj=new StringBuffer("oops class");
        System.out.println(obj.length());//how many characters=O/P->(10)
   System.out.println(obj.capacity());//how much memory is allocating def=16(DEFAULT)+10=(oops)=0/P->(26)
     obj.ensureCapacity(50);//allocating only the present without adding 16(minimum memory for the object)
      System.out.println(obj.capacity());
       obj.setLength(4);//need only upto oo from oops since two characters-.no return=0/P->(4)
      System.out.println(obj);
        System.out.println(obj.capacity());
        //charAt(index)---->character is get returned in the given position=0/P->(o)
        System.out.println(obj.charAt(1));
       //setCharAt(index,char)--------->no return so no sys . out.println,replace word based on posotion=O/P->(d)
        obj.setCharAt(2,'d');
        System.out.println(obj.charAt(2));
        char c[]=new char[10];
        obj.getChars(0,2,c,0);//converting str to char and assigning it to char and char is assigned from 0 to 2 from string=O/P->(o o)
        for(char i:c)
            System.out.println(i);//since no value its printing spaces
      ///append-->without index means last add->not available in string in only strbuff and strbuilder=O/P->(oodssin(90))
        obj.append("sin(").append(90).append(")");
        System.out.println(obj);
      //insert
        obj.insert(2,"rrr");//offset--->index->insert a str based on the index given-=O/P->(oorrrdssin(90))
        System.out.println(obj);
      //stringreverse=O/P->(reverse of previous)
   //   System.out.println(obj.reverse());//reverse from last
      //delete available only in stringbuffer
        obj.delete(2,6);
        System.out.println(obj.deleteCharAt(0));//delete as per the position=O/P->(ossin(90))
      //replace------------------>return type=string
        obj.replace(0,3,"hhhh");
        System.out.println(obj);
        //substring
        obj.substring(2);
        obj.substring(2,4);//end---------->end-1
        System.out.println(obj);
        //string builder
        StringBuilder obj1=new StringBuilder("Have a nice day");//above operations also present in string builder too
        System.out.println(obj1);
    }
}
/*OPERATIONS ABOVE
->obj.length());//how many characters=O/P->(10)
->obj.capacity());//how much memory is allocating def=16(DEFAULT)+10=(oops)=0/P->(26)
->  obj.ensureCapacity(50);//allocating only the present without adding 16(minimum memory for the object)
->     obj.setLength(4);//need only upto oo from oops since two characters-.no return=0/P->(4)
-> //charAt(index)---->character is get returned in the given position=0/P->(o)
->setCharAt(index,char)--------->no return so no sys . out.println,replace word based on posotion=O/P->(d)
->getChars(0,2,c,0);//converting str to char and assigning it to char and char is assigned from 0 to 2 from string=O/P->(o o)
->append-->without index means last add->not available in string in only strbuff and strbuilder=O/P->(oodssin(90))
-> obj.insert(2,"rrr");//offset--->index->insert a str based on the index given-=O/P->(oorrrdssin(90))
->   System.out.println(obj.deleteCharAt(0));//delete as per the position=O/P->(ossin(90))
->replace------------------>return type=string
-> //substring

*/