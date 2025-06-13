public class vowel {
    static boolean checkVowel(char ch)
    {
        if(ch=='a' ||ch =='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        String str = "apples";
        int end = 0;
        String ans = "";
        String ans1 = "";

        while(end<str.length())
        {
            if(checkVowel(str.charAt(end)))
            {
                if(ans1.length()>ans.length())
                {
                    ans = ans1;
                }
                ans1 = "";
                end++;
            }
            else
            {
                ans1 = ans1 + str.charAt(end);
                end++;
            }
        }
        if(ans1.length()>ans.length())
        {
            ans = ans1;
        }
        System.out.println(ans);
    }
}