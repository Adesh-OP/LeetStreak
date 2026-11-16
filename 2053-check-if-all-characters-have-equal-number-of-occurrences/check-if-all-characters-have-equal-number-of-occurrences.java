class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int c=1;
        int i=0;
        int count=1;
        while(i<arr.length-1 && arr[i]==arr[i+1])
        {
            count++;
            i++;
        }
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]==arr[j+1])
            c++;
            else
            {
            if(c!=count)
            return false;
            c=1;
            }
        }
        if(c!=count)
        return false;
        return true;
    }
}