class Solution {
    public int maximumSwap(int num) {
        String num_s=Integer.toString(num);
        int num_r[]=new int[num_s.length()];
        for(int i=0;i<num_s.length();i++){
            num_r[i]=Character.getNumericValue(num_s.charAt(i));
        }
        Arrays.sort(num_r);
        ArrayUtils.reverse(num_r);
        String nums_sr=Integer.toString(num_r);
        System.out.println(nums_sr);
        char num_c[] = num_s.toCharArray();
        System.out.println(num_s);
        int max_int=Character.getNumericValue(num_c[0]);
        int max_ind=0;
        for(int i=1;i<num_s.length();i++)
            if(max_int<=Character.getNumericValue(num_c[i])){
                max_int=Character.getNumericValue(num_c[i]);
                max_ind=i;
            }
        System.out.println(max_int);
        for(int i=0;i<num_s.length();i++)
            if(Character.getNumericValue(num_c[i])<max_int && i < max_ind){
                num_c[max_ind]=num_c[i];
                num_c[i]=Integer.toString(max_int).charAt(0);
                break;
            }
        num_s=String.valueOf(num_c);
        System.out.println(num_s);
        return Integer.parseInt(num_s);
                                        
    }
}