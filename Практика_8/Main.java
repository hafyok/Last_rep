package com.company;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String uran = new String("Уран");
        String neptun = new String("Нептун");


        //добавление
        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter, uran, neptun));
        ArrayList<String> solarSystem2 = new ArrayList<>();
        Collections.addAll(solarSystem2, mercury, venus, earth, mars, jupiter, uran, neptun);//метод добавления с возможностью изменять размер
        System.out.println(solarSystem2);


        //удаление
        solarSystem2.remove(1);//удаление по индексу
        System.out.println(solarSystem2);
        solarSystem2.remove(earth);//удаление по ссылке
        System.out.println(solarSystem2);

        //замена элемента
        solarSystem2.set(0, earth);
        System.out.println(solarSystem2);

        //перемешивание
        Collections.shuffle(solarSystem2);
        System.out.println(solarSystem2);

        //случайный элемент
        int random_number = 0 + (int)(Math.random() * solarSystem2.size());
        String planet = solarSystem2.get(random_number);
        System.out.println(planet);

        //показ индекса элемента (метод indexOf)
        System.out.println(solarSystem2.indexOf("Юпитер"));

        //проверка наличия элемента
        if(solarSystem2.contains("Уран")){
            System.out.println("Элемент есть");
        }else{
            System.out.println("Элемента нет");
        }

        //*размер списка, метод size() возвращает размер списка
        System.out.println(solarSystem1.size());
        System.out.println(solarSystem2.size());

        //Удаление всех элементов с помощью метода clear()
        solarSystem2.clear();
        System.out.println(solarSystem2);
    }
}
