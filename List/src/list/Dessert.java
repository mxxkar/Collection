/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package List;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sekar Ambar Arum
 */
public class Dessert {

    //collection list
    public static void main(String[] args) {
           List<String> dessertMenu = new ArrayList<String>();
           dessertMenu.add("Pudding");
           dessertMenu.add("Cake");
           dessertMenu.add("Pie");
           dessertMenu.add("Pastry");
           
           System.out.print("dessertMenu : " + dessertMenu + "\n");
           
           dessertMenu.remove("Pie");
           
           System.out.print("dessertMenu : " + dessertMenu + "\n");
           
           dessertMenu.add("Candy");

    }
    
}
