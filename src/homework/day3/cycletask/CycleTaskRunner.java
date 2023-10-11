package homework.day3.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        NumbersWhile numbersWhile = new NumbersWhile();
        numbersWhile.displayNumbersWhile();

        System.out.println();

        NumbersFor numbersFor = new NumbersFor();
        numbersFor.displayNumbersFor();

        System.out.println();

        ShowArrayIntRandom showArrayIntRandom = new ShowArrayIntRandom();
        showArrayIntRandom.showArrayIntegerRandom();

        System.out.println();

        ArrayIntReverse arrayIntReverse = new ArrayIntReverse();
        arrayIntReverse.arrayNumbersReverse();

        System.out.println();

        ArrayIntMultFive arrayIntMultFive = new ArrayIntMultFive();
        arrayIntMultFive.arrayNumbersMultFive();

        System.out.println();

        ArrayIntSquare arrayIntSquare = new ArrayIntSquare();
        arrayIntSquare.arrayNumbersSquare();

        System.out.println();

        ArrayIntMin arrayIntMin = new ArrayIntMin();
        arrayIntMin.arrayNumbersMin();

        System.out.println();

        ArrayIntSwap arrayIntSwap = new ArrayIntSwap();
        arrayIntSwap.arrayNumsSwap();

        System.out.println();

        ArrayIntBubbleSort arrayIntBubbleSort = new ArrayIntBubbleSort();
        arrayIntBubbleSort.arrayNumbersBubbleSort();

    }
}
