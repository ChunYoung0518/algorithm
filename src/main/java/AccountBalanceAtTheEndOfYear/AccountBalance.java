package AccountBalanceAtTheEndOfYear;

public class AccountBalance {

    public static int solution(int[] A, String[] D) {
        int[] monthlyCardCount = new int[12];
        int[] monthlyCardAmount = new int[12];
        int totalAmount = 0;

        //calculate the total amount
        for(int a : A) {
            totalAmount += a;
        }

        //count the card transaction each month and total amount each month
        for(int i=0; i<=A.length-1; i++) {
            if(A[i] < 0) {
                String[] monthyString = D[i].split("-");
                int month = Integer.valueOf(monthyString[1])-1;
                monthlyCardCount[month]++;
                monthlyCardAmount[month] += A[i];
            }
        }

        //total amount - monthly fee;
        totalAmount -= 60;
        for(int month=0; month<12; month++) {
            if(monthlyCardCount[month] >=3 && monthlyCardAmount[month]<=-100) {
                totalAmount +=5;
            }
        }

        return totalAmount;
    }

}
