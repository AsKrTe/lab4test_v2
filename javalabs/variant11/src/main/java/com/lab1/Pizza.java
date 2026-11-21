package com.lab1;

/**
 * Абстрактный класс, представляющий базовую структуру пиццы.
 */
public abstract class Pizza {
    private String name;
    private double price;
    private double weight;
    private double diameter;
    private int calories;

    /**
     * Конструктор для создания пиццы.
     * @param name Название пиццы
     * @param price Цена в рублях
     * @param weight Вес в граммах
     * @param diameter Диаметр в сантиметрах
     * @param calories Калорийность в ккал
     */
    public Pizza(String name, double price, double weight, double diameter, int calories) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.diameter = diameter;
        this.calories = calories;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getWeight() { return weight; }
    public double getDiameter() { return diameter; }
    public int getCalories() { return calories; }

    @Override
    public String toString() {
        return String.format("%s [Цена: %.2f руб., Вес: %.1f г, Диаметр: %.1f см, Калории: %d ккал]", 
                name, price, weight, diameter, calories);
    }
}
