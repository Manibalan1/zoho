import java.util.Arrays;

public class overlap {
    public static int findMaxOverlap(int[] entry, int[] exit) {
        Arrays.sort(entry);
        Arrays.sort(exit);

        int i = 0, j = 0;
        int currentOverlap = 0;
        int maxOverlap = 0;

        while (i < entry.length && j < exit.length) {
            if (entry[i] <= exit[j]) {
                currentOverlap++;
                maxOverlap = Math.max(maxOverlap, currentOverlap);
                i++;
            } else {
                currentOverlap--;
                j++;
            }
        }
        return maxOverlap;
    }

    public static void main(String[] args) {
        int[] entry = {1,3,5,8};
        int[] exit = {4,6,9,10};

        int maxOverlap = findMaxOverlap(entry, exit);
        System.out.println(maxOverlap);
    }
}