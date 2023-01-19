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

    public static void task1 () {
        System.out.println("Задача 1");
        byte B = -2;
        short S = 10000;
        int I = 333333333;
        long L = -2324314235534535L;
        float F = 5.3f;
        double D = -4.33333333333333;
        System.out.println("Значение переменной " + 'B' + " с типом byte = " + B);
        System.out.println("Значение переменной " + 'S' + " с типом short = " + S);
        System.out.println("Значение переменной " + 'I' + " с типом int = " + I);
        System.out.println("Значение переменной " + 'L' + " с типом long = " + L);
        System.out.println("Значение переменной " + 'F' + " с типом float = " + F);
        System.out.println("Значение переменной " + 'D' + " с типом double = " + D);

        //код для задачи 1
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float B = 27.12f;
        long S = 987678965549L;
        float I = 2.786f;
        short L = 569;
        short F = -159;
        short D = 27897;
        byte D2 = 67;
        System.out.println(B);
        System.out.println(S);
        System.out.println(I);
        System.out.println(L);
        System.out.println(F);
        System.out.println(D);
        System.out.println(D2);
         //код для задачи 2
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsL = 23;
        byte studentsA = 27;
        byte studentsE = 30;
        short sheets = 480;
        int totalStudents = studentsL + studentsA + studentsE;
        int sheetsPerStudent = sheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //код для задачи 3


    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottlesPerTime = 16;
        byte time = 2;
        int bottlesPerMin = bottlesPerTime / time;
        byte newTime1 = 20;
        int bottlesPerNewTime1 = bottlesPerMin * newTime1;
        System.out.println("За " + newTime1 + " минут машина произвела " + bottlesPerNewTime1 + " штук бутылок");

        int newTime2 = 1;
        int bottlesPerNewTime2 = bottlesPerNewTime1 * 3 * 24;
        System.out.println("За " + newTime2 + " сутки машина произвела " + bottlesPerNewTime2 + " штук бутылок");

        int newTime3 = newTime2 * 3;
        int bottlesPerNewTime3 = bottlesPerNewTime2 * 3;
        System.out.println("За " + newTime3 + " суток машина произвела " + bottlesPerNewTime3 + " штук бутылок");

        int newTime4 = newTime3 * 10;
        int bottlesPerNewTime4 = bottlesPerNewTime3 * 10;
        System.out.println("За " + newTime4 + " суток машина произвела " + bottlesPerNewTime4 + " штук бутылок");

        //код для задачи 4


    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaintCan = 120;
        byte perClassWhite = 2;
        byte perClassBrown = 4;
        int perClassTotal = perClassWhite + perClassBrown;
        int numberClass = totalPaintCan / perClassTotal;
        int totalWhiteCan = numberClass * perClassWhite;
        int totalBrownCan = numberClass * perClassBrown;
        System.out.println("В школе, где " + numberClass + " классов, нужно " + totalWhiteCan + " банок белой краски и " + totalBrownCan + " банок коричневой краски");

        //код для задачи 5
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int totalWeightG = bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        double totalWeightKg = totalWeightG / 1000.0;
        System.out.println("Завтрак спортсмена весит " + totalWeightG + " грамм или " + totalWeightKg + " кг");

        //код для задачи 6
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte weightGoalKg = 7;
        int weightGoalG = 7 * 1000;
        short minLosePerDay = 250;
        short maxLosePerDay = 500;
        int daysMax = weightGoalG / minLosePerDay;
        int daysMin = weightGoalG / maxLosePerDay;
        short daysAv = (short) ((daysMax +  daysMin) / 2);

        System.out.println("Чтобы похудеть спортсмену потребуется максимум " + daysMax + " дней, минимум " + daysMin + " дней, а в среднем " + daysAv + " день");

        //код для задачи 7
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int wageMasha = 67760;
        int wageDen = 83690;
        int wageKri = 76230;
        float newWageMasha = wageMasha * 1.1f;
        float newWageDen = wageDen * 1.1f;
        float newWageKri = wageKri * 1.1f;
        float difWagePerYearMasha = (newWageMasha - wageMasha) * 12;
        float difWagePerYearDen = (newWageDen - wageDen) * 12;
        float difWagePerYearKri = (newWageKri - wageKri) * 12;
        System.out.println("Маша теперь получает " + newWageMasha + " рублей. Годовой доход вырос на " + difWagePerYearMasha + " рублей");
        System.out.println("Денис теперь получает " + newWageDen + " рублей. Годовой доход вырос на " + difWagePerYearDen + " рублей");
        System.out.println("Кристина теперь получает " + newWageKri + " рублей. Годовой доход вырос на " + difWagePerYearKri + " рублей");

        //код для задачи 8
    }

}