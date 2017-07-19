public class Solution {
    public int reverse(int x) {
        String number=""+x;
        if(x<0) 
            number=number.substring(1);
        StringBuilder strNumber = new StringBuilder();
        strNumber.append(number);
        strNumber=strNumber.reverse(); 
        //System.out.println(strNumber);
        if(x<0)
            number="-"+strNumber.toString();
        else
            number=strNumber.toString();
        long result = Long.parseLong(number);
        //System.out.println(result);
        if(Integer.MIN_VALUE<result && result<Integer.MAX_VALUE)
            return Integer.parseInt(number);
            //return result;
        else
            return 0;
            
    }
}