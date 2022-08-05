public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача_1");
        var box=3;
        byte apple=1;
        short water=570;
        int te=568956;
        long tyre=14526635L;
        float a=1.4572f;
        double b=5.598769852;



        System.out.println("Задача_2");
        float weightBoxer1=78.2f;
        float weightBoxer2=82.7f;
        float totalWeight=weightBoxer1+weightBoxer2;
        System.out.println("Общий вес боксёров "+totalWeight+" кг");
        float weightDifference=weightBoxer2-weightBoxer1;
        System.out.println("Разница в весе боксёров "+weightDifference+" кг");


        System.out.println("Задача_3");
        byte weightBanan=80;
        byte weightMilk100Ml=105;
        byte weightIceCreamBriquette=100;
        byte weightEgg=70;
        float weightBreakfast=weightBanan*5+weightIceCreamBriquette*2+weightEgg*4+200/100*weightMilk100Ml;
        System.out.println("Вес завтрака "+weightBreakfast+" г.");
        float weightBreakfastKg=weightBreakfast/1000;
        System.out.println("Вес завтрака в килокгаммах "+weightBreakfastKg+" кг");


        System.out.println("Задача_4");
        byte reducewWightKg=7;
        short programm1G=250;
        short programm2G=500;
        int reducewWightG=reducewWightKg*1000;
        System.out.println("Нужно сбросить "+reducewWightG+" г");
        int numberDaysProgram1= reducewWightG/programm1G;
        System.out.println("Потребуется дней с 1-ой программой - "+numberDaysProgram1);
        int numberDaysProgram2= reducewWightG/programm2G;
        System.out.println("Потребуется дней с 2-ой программой - "+numberDaysProgram2);
        int numberDaysAverageProgram= (numberDaysProgram1+numberDaysProgram2)/2;
        System.out.println("Потребуется дней в среднем - "+numberDaysAverageProgram);


        System.out.println("Задача_5");
        int MashaSalary=67760;
        int DenisSalary=83690;
        int KristinaSalary=76230;

        double NewMashaSalary= MashaSalary*1.1;
        System.out.println("Маша теперь получает "+NewMashaSalary+" рублей");
        float NewDenisSalary= (float) (DenisSalary*1.1);
        System.out.println("Денис теперь получает "+NewDenisSalary+" рублей");
        double NewKristinaSalary=KristinaSalary*1.1;
        System.out.println("Кристина теперь получает "+NewKristinaSalary+" рублей");

        double changeInAnnualSalary_Masha=(NewMashaSalary-MashaSalary)*12;
        System.out.println("Годовой доход Маши вырос на "+changeInAnnualSalary_Masha+" рублей");
        double changeInAnnualSalary_Denis=(NewDenisSalary-DenisSalary)*12;
        System.out.println("Годовой доход Дениса вырос на "+changeInAnnualSalary_Denis+" рублей");
        double changeInAnnualSalary_Kristina=(NewKristinaSalary-KristinaSalary)*12;
        System.out.println("Годовой доход Кристины вырос на "+changeInAnnualSalary_Kristina+" рублей");

        System.out.println("Маша теперь получает "+NewMashaSalary+" рублей. Годовой доход вырос на "+changeInAnnualSalary_Masha+" рублей");
        System.out.println("Денис теперь получает "+NewDenisSalary+" рублей. Годовой доход вырос на "+changeInAnnualSalary_Denis+" рублей");
        System.out.println("Кристина теперь получает "+NewKristinaSalary+" рублей. Годовой доход вырос на "+changeInAnnualSalary_Kristina+" рублей");














    }
}