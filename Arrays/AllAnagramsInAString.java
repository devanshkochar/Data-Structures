class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] stringp = p.toCharArray();
        
        int[] parray = new int[26];
        for(int i=0;i<26;i++)
        {
            parray[i]=0;
        }
        for(int i=0;i<p.length();i++)
        {
            parray[stringp[i]-'a']+=1;
        }
        List<Integer> index = new ArrayList<Integer>();
        for(int i=0;i<=s.length()-p.length();i++)
        {
            String substr = s.substring(i,i+p.length());
            int flag=0;
            //System.out.println(substr);
            char[] stringsubstr = substr.toCharArray();
            int[] substrarray = new int[26];
            for(int j=0;j<26;j++)
            {
                substrarray[j]=0;
            }
            for(int j=0;j<substr.length();j++)
            {
                substrarray[stringsubstr[j]- 'a']+=1;
            }

            for(int j=0;j<26;j++)
            {
                if(parray[j]!=substrarray[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                index.add(i);
            }
        }
        return index;
    }
}