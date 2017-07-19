public class Solution {
    public int myAtoi(String str) {
        int i=0,isNeg=1;
        long intVal=0;
        //boolean isNeg = false;
        //System.out.println(str.length());
        /*
        if(2147483640+7>=2147483647)
            System.out.println("True");
        int someInt=2147483640;
        if(someInt+7>=2147483647)
            System.out.println("True");
        */
        while(i<str.length() &&  str.charAt(i)==' ')
            i++;
        if(i<str.length() &&  str.charAt(i)=='-'){
            isNeg=-1;
            i++;
        }
        if(i<str.length() &&  str.charAt(i)=='+' && isNeg==1){
            // isNeg=1;
            i++;
        }
        // System.out.println(Character.getNumericValue('c'));
        // System.out.println(Character.getNumericValue('0')+4);
        // System.out.println(Character.getNumericValue('9'));
        
        while(i<str.length() && (Character.getNumericValue(str.charAt(i))>=0 && Character.getNumericValue(str.charAt(i))<=9)){
            // System.out.println("In Loop at val"+i);
            // System.out.println("    "+intVal*10);
            // System.out.println("    "+Character.getNumericValue(str.charAt(i)));
            // System.out.println(intVal*10+Character.getNumericValue(str.charAt(i)));
            if((intVal*10+Character.getNumericValue(str.charAt(i)) > Integer.MAX_VALUE && isNeg==1)){
                // System.out.println("Max Cal");
                return Integer.MAX_VALUE;
			}else if(intVal*10+Character.getNumericValue(str.charAt(i))-1 > Integer.MAX_VALUE && isNeg==-1){
                 // System.out.println("Min Cal");
                return Integer.MIN_VALUE;
			}else
                intVal=intVal*10+Character.getNumericValue(str.charAt(i++));
            // System.out.println(i+" "+intVal);
        }
        intVal=intVal*isNeg;
        // System.out.println(i);
        // System.out.println(intVal);
        return (int)intVal;
    }
}