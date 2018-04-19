package mortgagecalc;

/**
 * Вычисляет ежемесячный платеж по кредиту
 */

import java.lang.Math;

public class MortgageCalc {

    public static void main(String[] args) {
        System.out.println(calculate(2_000_000, 120, 7.4));
    }

    /**
     * Метод вычисляет ежемесячный платеж по кредиту
     *
     * @param sumOfCredit - сумма кредита
     * @param months - процентная ставка годовых
     * @param percentOfTheYear - количество месяцев, в которые выплачивается
     * кредит
     */
    public static double calculate(double sumOfCredit, int months, double percentOfTheYear) {
        double percentOfTheMonth = percentOfTheYear * 0.01 / 12;
        double result = sumOfCredit
                * ((percentOfTheMonth * Math.pow(1 + percentOfTheMonth, months))
                / (Math.pow(1 + percentOfTheMonth, months) - 1));
        return Math.round(result * 100) / (double) 100;
    }

}
