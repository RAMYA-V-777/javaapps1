/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
inheritance->MAIN ADV->REUSABILITY/CODE SHARING
EG->mobile->old version->call.msg
latest version->setalarm.......
to use all versions in all mobile use the concept of inheritance
KEYWORD USED->extends
SINGLE//class a alone
class a
{
 call();
{
}
msg()
{
}
}
class b extends a
{
 setalarms()
{
}
LIGHT()
{
}
CAMERA()
{
}
}
class c extends b
{
}
class d extends c
{
}
TYPES->Single=only one level->class a alone
Multilevel=more than one level-> class a,b,c,d...........................
Hierarchial=accessing one class info from n number of classes
Eg:class a
{
}
class b extends a//make use of a
{
}
class c extends a//also make use of a
{
}
Hybrid=combination of more than two inheritance or all the inheritance
Multiple(NOT SUPPORTED IN JAVA)but acheived in java by Interface concept
class a
{
}
class b
{
}
class c extends a,b//COMPILE TIME ERROR
{
}
Relationship b/w super and sub class=is a
//POLYMORPHISM
->acheived by 2
*Method overloading->n no of method name is same but parameter we are gonna pass is diff in same cls
compiler will understand which method to call during complie time
syntax:for frst
            class summation
{
add()
{
}
add(int,int)
{
}
add(double,double)
{
}
add(String,String)
{
}
}
*Method overriding
compiler will understand which method to call during only runtime
n no of method name is same but parameter we are gonna pass is same b/w 2 diff cls
syntax:
class a//super cls
{
add()
{
}
}
class b extends a//sub cls
{
add()
{
}
}//relation is gonna here i.e. inheritance relationship
super -> is a keyword
         using this super class information will be accesses
----->super.varname;=to access variable
------>super()or super(parameter
----->super.methodname();

*/

package inhee;

/**
 *
 * @author velmurugan
 */
public class inheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
