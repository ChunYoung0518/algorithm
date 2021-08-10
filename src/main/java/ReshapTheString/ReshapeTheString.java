package ReshapTheString;

public class ReshapeTheString {

    public static String reshape(int n, String str) {
        String tmp = str.replaceAll(" ", "");
        String res = "";
        int i = 0;

        while(i*n+n <=tmp.length()) {
            res = res + "\n" + tmp.substring(i*n, i*n + n);
            i++;
        }
        res = res + "\n" + tmp.substring(i*n, tmp.length());
        res = res.replaceFirst("\n", "");

        return res;
    }

}
