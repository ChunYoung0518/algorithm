package EncodeStringByCounting;

public class EncodeStringByCounting {

    public static String solution(String str) {
        String res = "";
        String tmp = str + "9";
        char[] chars = tmp.toCharArray();
        int i = 0;
        int count = 1;
        while (i < chars.length-1) {
            if(chars[i+1] == chars[i]){
                count++;
            } else {
                res = res + chars[i] + count;
                count = 1;
            }
            i++;
        }
        return res;
    }
}
