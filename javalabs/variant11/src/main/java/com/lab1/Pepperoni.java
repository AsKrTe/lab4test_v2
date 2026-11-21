package com.lab1;

/**
 * Класс, описывающий пиццу Пепперони.
 */
public class Pepperoni extends Pizza {
    /**
     * Создает экземпляр пиццы Пепперони.
     */
    public Pepperoni(double price, double weight, double diameter, int calories) {
        super("Пепперони", price, weight, diameter, calories);
    }
}
