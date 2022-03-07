package ru.skypro;

public class Main {

    public static void main(String[] args) {
        float WeightOfOneBoxer = 78.2f;
        float WeightOfTwoBoxer = 82.7f;
        float Difference = WeightOfTwoBoxer - WeightOfOneBoxer;
        System.out.println (" Разница в весе " + Difference + " кг" );

        byte Bananas = 5;
        byte WeightOneBanana = 80;
        int WeightOfAllBananas = Bananas * WeightOneBanana;
        short Milk = 200;
        byte WeightMilk100Ml = 105;
        int WeightMilk = (Milk / 100) * WeightMilk100Ml;
        byte Cream = 2;
        byte Weight1Cream = 100;
        int WeightCream = Cream * Weight1Cream;
        byte Eggs = 4;
        byte Weight1Eggs = 70;
        int WeightEggs = Eggs * Weight1Eggs;
        int SportBreakfast = WeightOfAllBananas + WeightMilk + WeightCream + WeightEggs;
        System.out.println(" Колличество грамм Спорт-Завтрака " + SportBreakfast + " Тоесть 1 килограмм 90 грамм");

        byte NeedReset = 7;
        short LoseWeight1 = 250;
        short LoseWeight2 = 500;
        int NeedToResetInGrams = NeedReset * 1000;
        int Weight1 = NeedToResetInGrams / LoseWeight1;
        System.out.println(" Сбрасывая вес каждый день по 250 грамм " + Weight1 + " Дней");
        int Weight2 = NeedToResetInGrams / LoseWeight2;
        System.out.println(" Сбрасывая вес каждый день по 500 грамм " + Weight2 + " Дней");

        int Maha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        byte Percent = 10;
        int Percent1 = (Maha * Percent) / 100;
        System.out.println(" Повышение зарплаты составит " + Percent1 + " Рублей");
        int Percent2 = (Denis * Percent) / 100;
        System.out.println(" Повышение зарплаты составит " + Percent2 + " Рублей");
        int Percent3 = (Kristina * Percent) / 100;
        System.out.println(" Повышение зарплаты составит " + Percent3 + " Рублей");
        int SalaryRaise1 = Maha + Percent1;
        System.out.println(" Маша теперь получает " + SalaryRaise1 + " Рублей");
        int SalaryRaise2 = Denis + Percent2;
        System.out.println(" Денис теперь получает " + SalaryRaise2 + " Рублей");
        int SalaryRaise3 = Kristina + Percent3;
        System.out.println(" Кристина теперь получает " + SalaryRaise3 + " Рублей");
        byte Year = 12;
        int SalaryBeforeRaising1 = Maha * Year;
        System.out.println(" Зарплата Маши до повышения " + SalaryBeforeRaising1 + " Рублей");
        int SalaryBeforeRaising2 = Denis * Year;
        System.out.println(" Зарплата Дениса до повышения " + SalaryBeforeRaising2 + " Рублей");
        int SalaryBeforeRaising3 = Kristina * Year;
        System.out.println(" Зарплата Кристины до повышения " + SalaryBeforeRaising3 + " Рублей");
        int SalaryAfterRaising1 =SalaryRaise1 * Year;
        System.out.println(" Зарплата Маши после повышения " + SalaryAfterRaising1 + " Рублей");
        int SalaryAfterRaising2 = SalaryRaise2 * Year;
        System.out.println(" Зарплата Дениса после повышения " + SalaryAfterRaising2 + " Рублей");
        int SalaryAfterRaising3 = SalaryRaise3 * Year;
        System.out.println(" Зарплата Кристины после повышения " + SalaryAfterRaising3 + " Рублей");
        int DifferenceMahi = SalaryAfterRaising1 - SalaryBeforeRaising1;
        System.out.println(" Разница мужеду до и после " + DifferenceMahi + " Рублей");
        int DifferenceDenisa = SalaryAfterRaising2 - SalaryBeforeRaising2;
        System.out.println(" Разница мужеду до и после " + DifferenceDenisa + " Рублей");
        int DifferenceKristini = SalaryAfterRaising3 - SalaryBeforeRaising3;
        System.out.println(" Разница мужеду до и после " + DifferenceKristini + " Рублей");
    }
}

