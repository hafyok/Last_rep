package com.company;
import java.util.Stack;
import java.util.Scanner;



public class classStack {
    public Stack<Integer> first = new Stack<Integer>();
    public Stack<Integer> second = new Stack<Integer>();
    public int digit = 0;

    classStack(){
        Scanner console = new Scanner(System.in);
        for(int i= 0; i < 5; i++){
            first.push(console.nextInt());
        }
        for(int i= 0; i < 5; i++){
            second.push(console.nextInt());
        }
    }

    public void show() {
        if(digit > 106){
            System.out.println("botva");
        }else if(!second.isEmpty()){
            System.out.println("second " + digit);
        }else{
            System.out.println("first " + digit);
        }


    }

    public void game(){
        int cardOne;
        int cardTwo;

        while(!first.empty() && !second.empty() && digit<=106){
            cardOne = first.get(0);
            if(cardOne == 0) cardOne = 10;
            cardTwo = second.get(0);
            if(cardTwo == 0) cardTwo = 10;

            if(cardOne > cardTwo){
                // 2 4 6 ( 1 колода)
                // 1 3 5 (2 колода)

                // 2 1(сравнение)

                //4 6 2 1 (1 колода получила)
                //3 5 (2 колода потеряла)
                int per;//промежуточная переменная
                per = cardOne;
                first.push(per);//добавляем вниз первой колоды первую карту
                per = cardTwo;
                first.push(per);//вторую карту
                Stack<Integer> arr = new Stack<Integer>();
                for(int i = 1; i < first.size(); i++){
                    arr.push(first.get(i));//создаем новый стек и копируем все элементы кроме первого
                }
                first = (Stack<Integer>)arr.clone();//копируем новый стек в старй стек

                //Нужно убрать из второго стека 1 элемент
                    //Создать второй стек, скопировать туда все элементы кроме первого
                    //Второй копировать в первый
                arr.clear();
                for(int i = 1; i < second.size(); i++){
                    arr.push(second.get(i));//создаем новый стек и копируем все элементы кроме первого
                }
                second = (Stack<Integer>) arr.clone();

            }else {
                int per;//промежуточная переменная
                per = cardOne;
                second.push(per);//добавляем вниз первой колоды первую карту
                per = cardTwo;
                second.push(per);//вторую карту
                Stack<Integer> arr = new Stack<Integer>();
                for(int i = 1; i < second.size(); i++){
                    arr.push(second.get(i));//создаем новый стек и копируем все элементы кроме первого
                }
                second = (Stack<Integer>)arr.clone();//копируем новый стек в старй стек

                arr.clear();
                for(int i = 1; i < first.size(); i++){
                    arr.push(first.get(i));//создаем новый стек и копируем все элементы кроме первого
                }
                first = (Stack<Integer>) arr.clone();
            }
            digit++;
        }
    }
}
