public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 15000;
        int total = 0;
        int mount = 0;
        while (total < 2_459_000) {
            total = total + money;
            mount = mount + 1;
            System.out.println("Месяц " + mount + " ,сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(" " + number);
        }

            System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }

            System.out.println();
        }


    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int year = 0;
        int increase = born - death;
        for (int i = 1; i <= 10; i++) {
            population = population + (population * increase / 1000);
            year = year + 1;
            System.out.println("Год " + year + ", численность населения составляет  " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        float money = 15000;
        float rate = 0.07f; // годовая доходность
        float total = 0; // сумма накоплений
        int mount = 0;
        while (total <= 12_000_000) {
            total = (total + money) * (1 + rate);
            mount = mount + 1;
            System.out.println("Месяц " + mount + " ,сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        float money = 15000;
        float rate = 0.07f; // годовая доходность
        float total = 0; // сумма накоплений
        int mount = 1;
        for (; total <= 12_000_000; mount = mount + 1) {
            total = (total + money) * (1 + rate);
            if (mount % 6 == 0) {
                System.out.println("Месяц " + mount + " ,сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        float money = 15000;
        float rate = 0.07f; // годовая доходность
        float total = 0; // сумма накоплений
        int mount = 1;
        for (; mount <= 108; mount = mount + 1) {
            total = (total + money) * (1 + rate);
            if (mount % 6 == 0) {
                System.out.println("Месяц " + mount + " ,сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int date = 5;
        do {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            date = date + 7;
        } while (date <= 31);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        int period = 79;
        int start = 2023 - 200;
        int finish = 2023 + 100;
        while (year < 2023) {
            year = year + period;
            if (year > start && year < finish)
                System.out.println(year);
            }
        }
    }

