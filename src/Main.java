public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int cats = 2;
        System.out.println("Значение переменной cat с типом int равно " + cats);
        byte apples = 10;
        System.out.println("Значение переменной apple с типом byte равно " + apples);
        short documents = 300;
        System.out.println("Значение переменной documents с типом short равно " + documents);
        long seeds = 200000000000L;
        System.out.println("Значение переменной seeds с типом long равно " + seeds);
        float part1 = 2.5f;
        System.out.println("Значение переменной part1 с типом float равно " + part1);
        double part2 = 6.99999999999999999999999999999;
        System.out.println("Значение переменной part2 с типом double равно " + part2);

        System.out.println("Задача 2");
        float number1 = 27.12f;
        long number2 = 987678965549L;
        double number3 = 2.786;
        boolean number4 = false;
        char number5 = 569;
        int number6 = -159;
        short number7 = 27897;
        byte number8 = 67;

        System.out.println("Задача 3");
        short ludmila_Students = 23;
        short anna_Students = 27;
        short ekaterina_Students = 30;
        int totalStudents = ludmila_Students + anna_Students + ekaterina_Students;
        int totalPaper = 480;
        int paperPerStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        System.out.println("Задача 4");
        byte productivityIn2Minutes = 16;
        int productivityIn20Minutes = 20 / 2 * productivityIn2Minutes;
        System.out.println("За 20 минут машина произвела бутылок " + productivityIn20Minutes + " штук");
        int day = 60 * 24;
        int productivityInDay = day / 2 * productivityIn2Minutes;
        System.out.println("За сутки машина произвела бутылок " + productivityInDay + " штук");
        int  threedays = day * 3;
        int productivityInThreedays = threedays / 2 * productivityIn2Minutes;
        System.out.println("За 3 дня машина произвела бутылок " + productivityInThreedays + " штук");
        int month = day * 30;
        int productivityInMonth = month / 2 * productivityIn2Minutes;
        System.out.println("За 1 месяц машина произвела бутылок " + productivityInMonth + " штук");

        System.out.println("Задача 5");
        byte totalPaintNeeded = 120;
        byte whitePaintPerRoom = 2;
        byte brownPaintPerRoom = 4;
        int rooms = totalPaintNeeded / (whitePaintPerRoom + brownPaintPerRoom);
        int whitePaintTotal = whitePaintPerRoom * rooms;
        int brownPaintTotal = brownPaintPerRoom * rooms;
        System.out.println("В школе, где " + rooms + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски.");

        System.out.println("Задача 6");
        byte bananaWeightGramms = 80;
        byte milkWeightGramms = 105;
        byte icecreamWeightGramms = 100;
        byte eggsWeightGramms = 70;
        byte bananaCount = 5;
        byte milkCount = 2;
        byte icecreamcount = 2;
        byte eggscount = 4;
        float totalDishWeight = ((bananaWeightGramms * bananaCount) + (milkWeightGramms * milkCount) + (icecreamWeightGramms * icecreamcount) + (eggsWeightGramms * eggscount)) / (float)1000;
        System.out.println("Общий вес спорт-завтрака: " + totalDishWeight + " кг");

        System.out.println("Задача 7");
        short weightGoal = 7 * 1000;
        short diet1 = 250;
        short diet2 = 500;
        int daysForDiet1 = weightGoal / diet1;
        int daysForDiet2 = weightGoal / diet2;
        int daysAverage = (daysForDiet1 + daysForDiet2) / 2;
        System.out.println("Чтобы добиться результата, спортсмену потребуется в среднем " + daysAverage + " дней");

        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        double mashaNewSalary = (mashaSalary * 0.1) + mashaSalary;
        double denisNewSalary = (denisSalary * 0.1) + denisSalary;
        double christinaNewSalary = (christinaSalary * 0.1) + christinaSalary;
        double mashaAnnualSalaryDifference = (mashaNewSalary * 12) - (mashaSalary * 12);
        double denisAnnualSalaryDifference = (denisNewSalary * 12) - (denisSalary * 12);
        double christinaAnnualSalaryDifference = (christinaNewSalary * 12) - (christinaSalary * 12);
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + christinaNewSalary + " рублей. Годовой доход вырос на " + christinaAnnualSalaryDifference + " рублей.");


    }
}