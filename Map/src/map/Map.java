/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;

import java.util.HashMap;

/**
 *
 * @author Sekar Ambar Arum
 */
public class Map {

    public static void main(String[] args) {
    HashMap<String, String> mapdessertMenu = new HashMap<String, String>();
    mapdessertMenu.put("Pudding", "Chocolate");
    mapdessertMenu.put("Cake", "Cheese");
    mapdessertMenu.put("Pie", "Strawberry");
    mapdessertMenu.put("Pastry", "Cream");
    
    if (mapdessertMenu.containsKey("Pudding")) {
    System.out.println("Dessert Menu Chocolate Pudding");
    
    if (mapdessertMenu.containsValue("Cake")) {
    System.out.println("Dessert Menu Cheese Cake");
}
    
    }
    
    }
    
}
