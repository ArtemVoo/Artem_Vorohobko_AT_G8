package homework.day5.stringTasks;

public class StringObjectRunner {

    public static void main(String[] args) {
        new LettersInAColumn().lettersFromTextInAColumn("HelloGoodByePzzz");
        System.out.println("---------------");
        new AllDuplicates().findDuplicateWords("dog fish dog cat cat ezh dog fly dog dog dog");
        System.out.println("---------------");
        new FindDigitsInText().findDigits("1234fff 23fff ffff 234BB");
        System.out.println("---------------");
        new CurrentDateAndTime().printCurrentDateAndTime();
        System.out.println("---------------");
        new DateFormatChanging().changeDateFormat("22.00 07.09.2020");
        System.out.println("---------------");
    }
}
