class Solution 
{
    public String reverseWords(String s) 
    {
        s = s.trim();
        String[] str2 = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = str2.length-1; i >= 0 ;i--)
        {
            sb.append(str2[i]);
            if(i != 0)sb.append(" ");
        } 

        return sb.toString();   
    }
    
}