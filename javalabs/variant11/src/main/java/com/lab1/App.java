package com.lab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс приложения для демонстрации работы с иерархией пицц.
 */
public class App {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();

        //  Создаем не менее 3 экземпляров каждого класса пицц 
        pizzas.add(new Pepperoni(550, 420, 30, 1100));
        pizzas.add(new Pepperoni(750, 600, 35, 1550));
        pizzas.add(new Pepperoni(380, 290, 25, 750));

        pizzas.add(new Cheesy(480, 380, 30, 980));
        pizzas.add(new Cheesy(680, 540, 35, 1400));
        pizzas.add(new Cheesy(320, 250, 25, 650));

        pizzas.add(new Meaty(620, 480, 30, 1250));
        pizzas.add(new Meaty(820, 680, 35, 1800));
        pizzas.add(new Meaty(420, 320, 25, 830));

        System.out.println("=== Все доступные пиццы ===");
        for (Pizza p : pizzas) {
            System.out.println(p);
        }

        // Вывести количество пицц, вес которых превышает заданный
        double targetWeight = 450.0;
        long weightCount = pizzas.stream().filter(p -> p.getWeight() > targetWeight).count();
        System.out.println("\n=== Анализ по весу ===");
        System.out.println("Количество пицц весом более " + targetWeight + "г: " + weightCount);

        // Вывести цену каждой пиццы, диаметр которой превышает заданный
        double targetDiameter = 32.0;
        System.out.println("\n=== Анализ по диаметру (вывод цен для диаметра > " + targetDiameter + "см) ===");
        for (Pizza p : pizzas) {
            if (p.getDiameter() > targetDiameter) {
                System.out.printf("Пицца: %s, Диаметр: %.1f см -> Цена: %.2f руб.\n", 
                        p.getName(), p.getDiameter(), p.getPrice());
            }
        }
    }
}
