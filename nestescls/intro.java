/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
INNER/NESTED CLASS->a class with a class
SYNTAX:
class outerclsname
{
//private
class innerclsname
{
}
}
ADVANTAGE OF INNERCLASS/NESTEDCLASS:
*readability
*maintainability
*all the members from outer cls can be accesse in innercls even a private member
*code optimization(reducing usage of code again and again)
TYPES:
1.non static class:
 *member inner cls//outer cls within there will be inner class
 *anonymous inner cls//dont have a name for class,directly we can create the obj-->implemented using *abstract cls and interface
 *local inner cls//inner cls is present inside outer cls method
2.static class
 *static inner cls

*/

package nestescls;

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
