package lotto;

import static lotto.Message.*;

public class Print {
    private static Print print;

    private Print() {
    }

    public static Print getInstance() {
        if (print == null) {
            print = new Print();
        }
        return print;
    }

    public int printSix(int value) {
        System.out.println(EQUAL_SIX.getEqualValue(value));
        return 2000000000 * value;
    }

    public int printFive(int value) {
        System.out.println(EQUAL_FIVE.getEqualValue(value));
        return 1500000 * value;
    }

    public int printFiveBonus(int value) {
        System.out.println(EQUAL_FIVE_BONUS.getEqualValue(value));
        return 30000000 * value;
    }

    public int printFour(int value) {
        System.out.println(EQUAL_FOUR.getEqualValue(value));
        return 50000 * value;
    }

    public int printThree(int value) {
        System.out.println(EQUAL_THREE.getEqualValue(value));
        return 5000 * value;
    }

    public void printProfitResultMessage(int result, int price) {
        System.out.println(PROFIT_RESULT.getProfitValue(result, price));
    }

    public void printAmountMessage(int amount) {
        System.out.println(+amount + OUTPUT_AMOUNT.getValue());
    }

    public void printGetPriceMessage() {
        System.out.println(INPUT_PRICE.getValue());
    }

    public void printWinningNumberMessage() {
        System.out.println(INPUT_NUMBER.getValue());
    }

    public void printBonusNumberMessage() {
        System.out.println(INPUT_BONUS.getValue());
    }

    public void printResult(int[] place, int price) {
        int result = 0;
        result += printThree(place[4]);
        result += printFour(place[3]);
        result += printFive(place[2]);
        result += printFiveBonus(place[1]);
        result += printSix(place[0]);
        printProfitResultMessage(result, price);
    }

}
