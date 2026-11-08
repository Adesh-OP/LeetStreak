class Solution {
    public String longestPalindrome(String s) {
        String max="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=s.length();j>i;j--)
            {
                String str=s.substring(i,j);
                if(isPalindrome(str))
                {
                    if(str.length()>max.length())
                    max=str;
                    break;
                }
            }
        }
        return max;
    }
    public boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}