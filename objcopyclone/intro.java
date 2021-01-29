/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
TYPES OF COPYING IN JAVA:
1.shallow---->different copied objects points to same memory
2.deep--->objects have seperate memory
3.cloning
EG:
1.sample obj =new sample();   obj->1000(datamembers)x and y
2..sample obj1 =obj;          obj->1000(datamembers)x or y
obj1.x=obj.x;

Interface cloneable--->Giving access to use clone() method in obj cls
class object
--->clone()-->method
-->return type object
--->EXCEPTION:CloneNotSupportedException
SYNTAX:


*/
package objcopyclone;

/**
 *
 * @author velmurugan
 */
public class intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
