class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(arr[i]!='A'&&arr[i]!='a'&&arr[i]!='E'&&arr[i]!='e'&&arr[i]!='I'&&arr[i]!='i'&&arr[i]!='O'&&arr[i]!='o'&&arr[i]!='U'&&arr[i]!='u')
            i++;
            if(arr[j]!='A'&&arr[j]!='a'&&arr[j]!='E'&&arr[j]!='e'&&arr[j]!='I'&&arr[j]!='i'&&arr[j]!='O'&&arr[j]!='o'&&arr[j]!='U'&&arr[j]!='u')
            j--;
            if((arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||arr[i]=='i'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u')&&(arr[j]=='A'||arr[j]=='a'||arr[j]=='E'||arr[j]=='e'||arr[j]=='I'||arr[j]=='i'||arr[j]=='O'||arr[j]=='o'||arr[j]=='U'||arr[j]=='u'))
            {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
        }
        return new String(arr);
    }
}