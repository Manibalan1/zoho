public class StringReverse {
    public static void main(String[] args) {
        String str = "m2n4o5rn";
        int left = 0;
        int right = str.length()-1;

        char arr[] = str.toCharArray();

        while(left<right)
        {
            if(Character.isLetter(arr[left]) && Character.isLetter(arr[right]))
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(!Character.isLetter(arr[left]) && !Character.isLetter(arr[right]))
            {
                left++;
                right--;
            }
            else if(!Character.isLetter(arr[left]))
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        System.out.println(new String(arr));
    }
}