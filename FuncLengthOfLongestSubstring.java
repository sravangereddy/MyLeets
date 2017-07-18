public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char curVal,prevVal;
        int curLen,maxLen=1,startPos=0;
        if(s.length()<1)
            return 0;
        String curStrng = s.substring(0,1);
        //System.out.println(s.length());
        //System.out.println(curStrng.indexOf(s.charAt(1)));
        for(int i=1;i<s.length();i++){
            //System.out.println("pass "+i);
            //System.out.println("I am at "+curStrng.indexOf(s.charAt(i)));
            if(curStrng.indexOf(s.charAt(i))==-1){
                
                curStrng=curStrng+s.substring(i,i+1);
                //System.out.println(curStrng);
                
            }else{
                curLen=curStrng.length();
                if(curLen>maxLen){
                    maxLen=curLen;
                }
               
               //System.out.println(curStrng.substring(1)); 
               //System.out.println(s.substring(i,i+1));
                curStrng=curStrng.substring(curStrng.indexOf(s.charAt(i))+1)+s.substring(i,i+1); 
               //System.out.println(curStrng);
            }
        }
        curLen=curStrng.length();
        if(curLen>maxLen){
            maxLen=curLen;
        }
        return maxLen;
    }
}