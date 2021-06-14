/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_arraylist;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author asmaa
 */
public class Test_arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       ArrayList<String> mylist=new ArrayList<String>();//Creating arraylist    
//      mylist.add("Mango");//Adding object in arraylist    
//      mylist.add("Apple");    
//      mylist.add("Banana");    
//      mylist.add("tea "); 
//      
//      //Printing the arraylist object   
//      System.out.println(mylist); 
//      mylist.add(2, "test");
//      System.out.println(mylist); 
//        Iterator itr=mylist.iterator();//getting the Iterator  
//  while(itr.hasNext())
//  {//check if iterator has the elements  
//   System.out.println(itr.next());//printing the element and move to next  
//  //changing the element  
//    }
//  
//     System.out.println("print element in index 1 "+mylist.get(1));//it will return the 2nd element, because index starts from 0  

   //////////////
    List<Integer> list2=new ArrayList<Integer>();  
  list2.add(21);  
  list2.add(11);  
  list2.add(51);  
  list2.add(1);  
  //Sorting the list  
  Collections.sort(list2);  
   //Traversing list through the for-each loop  
  for(Integer number:list2) { 
    System.out.println(number); 
}
}}