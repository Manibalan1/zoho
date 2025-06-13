import java.util.Scanner;

public class Longest {
    static boolean isChar(char ch)
    {
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Hi how are you";

        int start_index = 0;
        int last_index = 0;
        int i = 0;
        int j = i;

        while(i<str.length())
        {
            if(!isChar(str.charAt(i)))
            {
                if((i-j)>(last_index-start_index+1))
                {
                    start_index = j;
                    last_index = i-1;
                }
                j = 0;
            }
            else
            {
                if(j==0)
                {
                    j = i;
                }
            }
            i++;
        }
        if((i-j)>(last_index-start_index+1))
        {
            start_index = j;
            last_index = i-1;
        }
        for(int k = start_index;k<=last_index;k++)
        {
            System.out.print(str.charAt(k));
        }
    }
}

//public class SecondLargestString {
//
//    public static String findSecondLargestString(String input) {
//        if (input == null || input.isEmpty()) {
//            return "";
//        }
//
//        int largestLength = 0;
//        int secondLargestLength = 0;
//        int currentLength = 0;
//        int startIndex = 0;
//        int secondLargestStartIndex = -1;
//        int secondLargestEndIndex = -1;
//
//
//        for (int i = 0; i <= input.length(); i++) {
//            if (i < input.length() && input.charAt(i) != ' ') {
//                currentLength++;
//            } else {
//                if (currentLength > largestLength) {
//                    secondLargestLength = largestLength;
//                    secondLargestStartIndex = startIndex;
//                    secondLargestEndIndex = i;
//                    largestLength = currentLength;
//                } else if (currentLength > secondLargestLength && currentLength != largestLength) {
//                    secondLargestLength = currentLength;
//                    secondLargestStartIndex = startIndex;
//                    secondLargestEndIndex = i;
//                }
//                currentLength = 0;
//                startIndex = i + 1;
//            }
//        }
//
//        return (secondLargestStartIndex != -1) ? input.substring(secondLargestStartIndex, secondLargestEndIndex) : "";
//    }
//
//    public static void main(String[] args) {
//        String inputString = "This is a test string with some words of varying lengths";
//        String secondLargest = findSecondLargestString(inputString);
//        System.out.println("Second largest string: " + secondLargest);  // Output: string
//
//        String inputString2 = "short longer longest";
//        String secondLargest2 = findSecondLargestString(inputString2);
//        System.out.println("Second largest string: " + secondLargest2);  // Output: longer
//
//        String inputString3 = "onlyone";
//        String secondLargest3 = findSecondLargestString(inputString3);
//        System.out.println("Second largest string: " + secondLargest3); // Output: ""
//
//        String inputString4 = "test test test";
//        String secondLargest4 = findSecondLargestString(inputString4);
//        System.out.println("Second largest string: " + secondLargest4); // Output: ""
//    }
//}