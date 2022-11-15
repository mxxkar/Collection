/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Sekar Ambar Arum
 */
public class Set {

    public static void main(String[] args) {
        HashSet<String> dessertMenu = new HashSet<>();
           dessertMenu.add("Pudding");
           dessertMenu.add("Cake");
           dessertMenu.add("Pie");
           dessertMenu.add("Pastry");
        
    
        if (dessertMenu.isEmpty()) {
            System.out.println("The set is empty");
        } else {
            System.out.println("The set is not empty");
        }
        
        Iterator<String> iterator = dessertMenu.iterator();
 
        while (iterator.hasNext()) {
            String dessert = iterator.next();
            System.out.println(dessert);
        }
    }
}
