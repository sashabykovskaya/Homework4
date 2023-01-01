public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int age1 = 45;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        int age2 = 16;
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то он совершеннолетний");
        }
            }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature1 = 10;
        if (temperature1 >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (temperature1 < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        int temperature2 = 2;
        if (temperature2 < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature2 >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("На улице " + temperature2 + " градусов, нужно надеть шапку");
        }
    public static void task3() {
        System.out.println("Задача 3");
        int normalSpeed = 55;
        if (normalSpeed > 60) {
            System.out.println("Если скорость " + normalSpeed + ", то придется заплатить штраф");
        }
        if (normalSpeed < 60) {
            System.out.println("Если скорость " + normalSpeed + ", то можно ездить спокойно");
        }
        int increasedSpeed = 70;
        if (increasedSpeed < 60) {
            System.out.println("Если скорость " + increasedSpeed + ", то можно ездить спокойно");
        }
        if (increasedSpeed > 60) {
            System.out.println("Если скорость " + increasedSpeed + ", то придется заплатить штраф");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age1 = 3;
        if (age1 < 5) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему нельзя кататься на аттракционе");
        } else if (age1 > 5 && age1 < 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься только в сопровождении взрослых. Если взрослых нет, то кататься нельзя");
        } else if (age1 < 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }
        int age2 = 10;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        } else if (age2 > 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься только в сопровождении взрослых. Если взрослых нет, то кататься нельзя");
        } else if (age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }
        int age3 = 15;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        } else if (age3 > 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься только в сопровождении взрослых. Если взрослых нет, то кататься нельзя");
        } else if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
       int wagonCapacity = 120;
       int seatPlace = 60;
       int standingPlace = wagonCapacity - seatPlace;
       int human = 30;
       if (human <= 60) {
           System.out.println("В вагоне есть сидячих " + (seatPlace - human) + " мест и осталось еще " + standingPlace + " стоячих мест");
       } else if (human > 60 && human <= 120) {
           System.out.println("В вагоне закончились сидячие места, осталость только" + standingPlace + " стоячих мест");
       } else if (human > 120) {
           System.out.println("Вагон полностью забит, переполнено на " + (wagonCapacity - human) + " человек");
       }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее из трех чисел");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " большее из трех чисел");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " большее из трех чисел");
        }
        }
    }