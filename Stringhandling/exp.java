/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
String->immutable(value can't be changed) Handling---->primitive datatype or clss
to change we have to create a new memory only
String s="welcome123";-------------->1//directly access string pool
String s1="welome123";----------------->3//directly access string pool
String s2=new String("WELCOME");----------------->2//||| to cls obj creation("new" keyword--->indirectly access string pool)
DIFF B/W 1 AND 2 IS
Stack
s-101
s1-101//both are pointing to same mem location
s2-1000
Heapmemory----->current obj info is stored
s2->100=>1000("new" keyword--->indirectly access string pool)
String pool--->portion for storing the string(present in heap for handling string value)//value not changed only mem address(ref) will be updated
100 welcome
101 welcome123
StringBuffer-->4
StringBuilder-->5
by 4 and 5 we can make the string mutable


*/

package Stringhandling;

/**
 *
 * @author velmurugan
 */
public class exp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
