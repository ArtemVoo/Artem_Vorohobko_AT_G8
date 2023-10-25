package homework.day5.stringTasks;

public class AllDuplicates {
    public void findDuplicateWords(String text) {
        String[] duplicates = text.split(" ");

        for (int i = 0; i < duplicates.length; i++) {
            if (duplicates[i] == null) {
                continue;
            }
            int x = 1;
            for (int y = i + 1; y < duplicates.length; y++) {
                if (duplicates[i].equals(duplicates[y])) {
                    x++;
                    duplicates[y] = null;
                }
            }
            if (x > 1) {
                System.out.println(duplicates[i]);
            }
        }
    }
}

