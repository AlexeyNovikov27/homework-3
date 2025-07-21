import java.security.AlgorithmParameterGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            if (age < 18) {
                System.out.println("Если возраст человека равен" + age + "то он не достиг совереннолетия, нужно немного подождать");
            }
        }
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + "градусов, нужно надеть шапку");
        } else {
            if (temperature > 5) {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");

            }
        }
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
        } else {
            if (speed < 60) {
                System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
            }
        }
        System.out.println("Задача 4");
        int age1 = 30;
        System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить");

        if (age1 >= 2 && age1 <= 6) {
            System.out.println("в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("в университет");
        } else if (age1 > 24) {
            System.out.println("На работу");
        }

        System.out.println("Задача 5");
        int age2 = 15;
        boolean hasAdult = true;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка " + age2 + ", то он не может кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка " + age2 + ", то можно кататься в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка " + age2 + ", то нельзя кататься (требуется взрослый)");
            }
        } else {  // age2 >= 14
            System.out.println("Если возраст ребенка " + age2 + ", то можно кататься без сопровождения");
        }
        System.out.println("Задача 6");
        int seating = 60;
        int totalCapacity = 102;
        int passengers = 85;
        if (passengers < seating) {
            System.out.println(" В вагоне есть свободные места");
        }else if (passengers < totalCapacity) {
            System.out.println(" В Вагоне остались только стоячие места");
        }else {
            System.out.println(" Вагон полностью забит");
        }
        System.out.println("Задача 7");
        int one = 5;
        int two = 12;
        int three = 7;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        }
        else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        }
        else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}


