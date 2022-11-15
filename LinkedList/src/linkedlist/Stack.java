/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

import java.util.*;
/**
 *
 * @author Sekar Ambar Arum
 */

public class Stack {
    public static void main(String[] args) {

    LinkedList<String> dessertStack = new LinkedList<>();
    dessertStack.push("Pudding");
    dessertStack.push("Cake");
    dessertStack.push("Pie");
    dessertStack.push("Pastry");
    

    System.out.println("Linked list : " + dessertStack);

    System.out.println("Stack Size: " + dessertStack.size());
    
    while(!dessertStack.isEmpty()) {
        System.out.println(dessertStack.pop());
    }
    System.out.println("Linked list : " + dessertStack);
    
    }
}