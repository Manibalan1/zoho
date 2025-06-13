import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> generateNextPalindrome(int[] num, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry, solved = 0;
        int i, j;

        // Step 1: Try to make the right half mirror the left half, fixing if right < left
        for (i = (n + 1) / 2; i < n; i++) {
            if (num[i] < num[n - i - 1]) {
                num[i] = num[n - i - 1];
                for (j = i + 1; j < n; j++) {
                    num[j] = num[n - j - 1];
                }
                solved = 1;
                break;
            } else if (num[i] > num[n - i - 1]) {
                break;
            }
        }

        if (solved == 1) {
            for (i = 0; i < n; i++) {
                ans.add(num[i]);
            }
            return ans;
        }

        // Step 2: Increment the middle part and propagate carry if needed
        carry = 1;
        for (i = (n - 1) / 2; i >= 0; i--) {
            if (num[i] + carry == 10) {
                num[i] = 0;
                carry = 1;
            } else {
                num[i] += 1;
                carry = 0;
                break;
            }
        }

        // Step 3: If carry is still 1, prepend 1 to the list (means number size increased)
        if (carry == 1) {
            ans.add(1);
        }

        // Add the current digits to the answer
        for (i = 0; i < n; i++) {
            ans.add(num[i]);
        }

        // Increase n if carry added a new digit
        if (carry == 1) {
            n++;
        }

        // Step 4: Mirror left side to right side for palindrome property
        for (i = (n + 1) / 2; i < n; i++) {
            ans.set(i, ans.get(n - i - 1));
        }

        return ans;
    }
}
