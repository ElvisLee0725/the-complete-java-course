package practice.loops;

public class LoopPractice {
    public static void main(String[] args) {
        String str = "sfsfsddsa category:apperal and dsafesaf dlsfk category:makeup sdf ae esaf category:furniture";
        //printCategories(str);

        //printBackward("abcdefghijklmnopqrstuvwxyz");
        for(int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    private static void printBackward(String str) {
        for(int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }

    public static void printCategories(String str) {
        // Use indexOf to find the index of "category:". Once it's found, set start index to that index
        // plus 9 and use two pointers to find the range of category
        // Keep doing until start index is -1
        int start = 0;
        int end = 0;
        while(start != -1) {
            start = str.indexOf("category:", start);
            end = start;
            if(end == -1) {
                break;
            }

            while(end < str.length()-1 && str.charAt(end+1) != ' ') {
                end++;
            }
            System.out.println(str.substring(start+9, end+1));
            start = end + 1;
        }
    }
}
