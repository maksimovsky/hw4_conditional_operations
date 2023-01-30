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
        int age = 17;
        System.out.print("Если возраст человека равен " + age);
        if (age >= 18) {
            System.out.println(", то он совершеннолетний");
        } else {
            System.out.println(", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int temp = 7;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int velocity = 59;
        System.out.print("Если скорость " + velocity);
        if (velocity < 60) {
            System.out.println(", то можно ездить спокойно");
        } else {
            System.out.println(", то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        int age = 8;
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if (2 <= age && age < 7) {
            System.out.println("в детский сад");
        } else if (7 <= age && age <= 18) {
            System.out.println("в школу");
        } else if (18 < age && age <= 24) {
            System.out.println("в университет");
        } else if (age > 24) {
            System.out.println("на работу");
        } else {
            System.out.println("в подгузник :)");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        int age = 14;
        System.out.print("Если возраст ребенка равен " + age + ", то ему ");
        if (5 <= age && age < 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("нельзя кататься на аттракционе");
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        int countPassengers = 102;
        if (countPassengers < 0) {
            System.out.println("Отрицательное количество пассажиров");
        } else if (countPassengers < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (countPassengers >= 60 && countPassengers < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        int one = 342;
        int two = 430;
        int three = 32;
        int max;
        if (two > one && two > three) {
            max = two;
        } else if (three > one && three > two) {
            max = three;
        } else {
            max = one;
        }
        System.out.println(max);
    }
}