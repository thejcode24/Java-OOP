/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.ArrayList;

/**
 *
 * @author thejcode24
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        System.out.println(meals);
    }

    public void clearMenu() {
        meals.clear();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Menu myMenu = new Menu();

        myMenu.addMeal("Spaghetti and Meatballs");
        myMenu.addMeal("Porkchops");
        myMenu.addMeal("Chicken Burrito");
        myMenu.addMeal("Hamburger and Fries");

        myMenu.printMeals();
        myMenu.clearMenu();
        myMenu.printMeals();

    }

}
