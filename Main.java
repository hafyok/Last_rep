package com.company;

public class Main {
    public static int recursion_6(int n, int del) {
        // условие выхода
        // Базовый случай
        // когда остановиться повторять рекурсию ?
            if (del > n){
                return 0;
            }else if (del / n == 1) {
                return 1;
            }else if(del % 2 == 0) {
                if (n == 2){
                    return 1;
                }
                //Т.к. если число делится на 2, оно уже составное, то далее рекурсии идут по нечетным числам
                recursion_6(n, del + 1);
                return 0;
            }else {
                //
                return recursion_6(n , del + 2);
            }
            // Шаг рекурсии / рекурсивное условие
    }

    public static void recursion_7(int n){
        if (n == 1){
            System.out.print(" ");
        }else if(n % 2 == 0){
            n = n / 2;
            System.out.print(" 2");
            recursion_7(n);
        }else if(n % 3 == 0){
            n = n / 3;
            System.out.print(" 3");
            recursion_7(n);
        }else if(n % 5 == 0){
            n = n / 5;
            System.out.print(" 5");
            recursion_7(n);
        }
        else if(n % 7 == 0){
            n = n / 7;
            System.out.print(" 7");
            recursion_7(n);
        }else if(n % 11 == 0){
            n = n / 11;
            System.out.print(" 11");
            recursion_7(n);
        }else if(n % 13 == 0){
            n = n / 11;
            System.out.print(" 11");
            recursion_7(n);
        }

    }

    public static int recursion_9(int a, int b, int k, boolean zero){
        if(b<0){
            System.out.print("");
        }else if(zero){//если предыдущее число 0, то след. число должно быть 1
            b--;
            k++;
            k = recursion_9(a, b, k, false);
        }else{
            a--;
            k = recursion_9(a, b, k, true);
        }
        return k;
    }

    /*public static void recursion_10(int n){
        if(n!=0){
            int digit = n;
            while(true){
                if(digit/10 > 0){
                    digit /=10;
                }else break;
            }
            recursion_10(n/10);
            System.out.print(digit);
        }

    }*/
    public static void main(String[] args) {
        int exer_1 = 103;
        System.out.println("Задание №6:\n"+"Число " + exer_1 + " простое? ");
        if (recursion_6(exer_1, 1) == 1) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        int exer_2 = 210;
        System.out.print("\nЗадание №7:\n" + "Число " + exer_2 + " состоит из множителей:\n");
        recursion_7(exer_2);


        System.out.println("\nЗадание №9:");
        int a = 2, b = 2, k = 0;
        System.out.print("Число с " + a + " нулями и " + b + " единицами содержит ");
        System.out.print(recursion_9(2, 2, 0, false) + " последовательностей");

    }
}
