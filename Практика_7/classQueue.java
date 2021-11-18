package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class classQueue {
    private Queue<Integer> firstQ = new LinkedList();
    private Queue<Integer> secondQ = new LinkedList();
    private int digit = 0;

    classQueue(){
        Scanner console = new Scanner(System.in);
        for(int i= 0; i < 5; i++){
            firstQ.add(console.nextInt());
        }
        for(int i= 0; i < 5; i++){
            secondQ.add(console.nextInt());
        }
    }

    public void show() {
        if(digit > 106){
            System.out.println("botva");
        }else if(!firstQ.isEmpty()){
            System.out.println("first " + digit);
        }else{
            System.out.println("second " + digit);
        }
    }

    public void game() {
        int cardOne;
        int cardTwo;

        //Цикл
        //Беру первый элемент с помощью poll()
        //Сравниваю
        //Добавляю элементы в конец нужной очереди
        //digit++
        while (!firstQ.isEmpty() && !secondQ.isEmpty() && digit <= 106) {
            cardOne = firstQ.poll();
            cardTwo = secondQ.poll();

            if(cardOne == 0) {
                if (cardTwo == 9) {
                    cardOne = 10;
                }
            }

            if(cardTwo == 0) {
                if (cardOne == 9) {
                    cardTwo = 10;
                }
            }

            if(cardOne > cardTwo){
                firstQ.add(cardOne);
                firstQ.add(cardTwo);
            }else{
                secondQ.add(cardOne);
                secondQ.add(cardTwo);
            }
            digit++;
        }
    }
}
