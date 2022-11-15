/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

import java.util.*;
/**
 *
 * @author Sekar Ambar Arum
 */
public class Queue {

     public static void main(String[] args) {
    
    PriorityQueue<String> dessertMenu = new PriorityQueue<String>();
        dessertMenu.add("Pudding");
        dessertMenu.add("Cake");
        dessertMenu.add("Pie");
        dessertMenu.add("Pastry");
    
    Iterator itr = dessertMenu.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());
    }
    
    System.out.println("");
    
    dessertMenu.remove();  
    dessertMenu.poll();  
    System.out.println("after removing two elements:");  
    Iterator<String> itr2 = dessertMenu.iterator();  
    while(itr2.hasNext()){  
    System.out.println(itr2.next());  
        }            
    }   
}