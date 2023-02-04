class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> r =new ArrayList<>();
        Set<String> s=new HashSet<>();
        for(int i=0;i<strs.length;i++){
            if(!s.contains(strs[i])){
            List<String> l=new ArrayList<>();
                    l.add(strs[i]);
            
            for(int j=i+1;j<strs.length ;j++){
                if(comp(strs[i],strs[j])){
                    s.add(strs[j]);
                    l.add(strs[j]);
                }
            }
           r.add(l);
            
        }}
         
        return r;
        
    }
    Boolean comp(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int[]a=new int[26];
        int[]b=new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
             b[s2.charAt(i)-'a']++;
            
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
