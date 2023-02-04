class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            if(map.containsKey(magazine.charAt(i)))
            {
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }
            else
            {
                map.put(magazine.charAt(i),1);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++)
        {
            if(map.containsKey(ransomNote.charAt(i)))
            {
                Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
                while(it.hasNext())
                {
                    Map.Entry<Character, Integer> e = it.next();
                    if(ransomNote.charAt(i)==(char)e.getKey())
                    {
                        if((int)e.getValue()==1)
                        {
                            it.remove();
                        }
                        else
                        {
                            map.put((char)e.getKey(),(int)e.getValue()-1);
                        }
                    }
                }
            }
            else
            {
                return false;
            }

        }
        return true;
        
    }
}