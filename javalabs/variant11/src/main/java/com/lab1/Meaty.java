package com.lab1;

/**
 * Класс, описывающий Мясную пиццу.
 */
public class Meaty extends Pizza {
    /**
     * Создает экземпляр Мясной пиццы.
     */
    public Meaty(double price, double weight, double diameter, int calories) {
        super("Мясная", price, weight, diameter, calories);
    }
}
