package homework.day5.stringTasks;

public class AllDuplicates {
    public void findDuplicateWords(String text) {
        String[] words = text.split(" ");
        String[] duplicates = new String[words.length];
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isDuplicate = false;

            for (int x = i + 1; x < words.length; x++) {
                if (word.equals(words[x])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                boolean added = false;
                for (int y = 0; y < count; y++) {
                    if (word.equals(duplicates[y])) {
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    duplicates[count] = word;
                    count++;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(duplicates[i]);
        }
    }
}
