package com.lab1;

/**
 * Класс, описывающий Сырную пиццу.
 */
public class Cheesy extends Pizza {
    /**
     * Создает экземпляр Сырной пиццы.
     */
    public Cheesy(double price, double weight, double diameter, int calories) {
        super("Сырная", price, weight, diameter, calories);
    }
}
