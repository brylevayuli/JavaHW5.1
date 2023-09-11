package ru.netology.JavaHW5.services;

public class MonthCalcService {

    public int calcMonth(int income, int expenses, int threshold){
                int count = 0; // счётчик месяцев отдыха
                int money = 0; // количество денег на счету

                for(int month = 0; month < 12; month++){
                    if(money >= threshold){ // можем ли отдыхать?
                        count++; // увеличиваем счётчик месяцев отдыха
                        money = money - expenses - ((money - expenses) / 3 * 2); // подсчитываем остаток денег на начало следующего после отдыха месяца
                    }else{
                        money = money + income - expenses; // подсчитываем остаток денег на начало следующего после работы месяца
                    }
                }
                return count;
        }


}