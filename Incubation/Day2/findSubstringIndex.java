public class findSubstringIndex {
    public static void main(String[] args) {

        String str1 = "djfjwbfjefjdgfasjdqd manibalanwdiffhuf";
        String str2 = "manibalan";

        int left = 0;
        int right = 0;
        int i = 0;

        while(right<str1.length() && i<str2.length())
        {
            if(str1.charAt(right)==str2.charAt(i))
            {
                right++;
                i++;
            }
            else
            {
                i = 0;
                left++;
                right=left;
            }
        }
        if(i==str2.length())
        {
            System.out.println(left);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
