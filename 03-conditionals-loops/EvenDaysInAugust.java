public class EvenDaysInAugust {
    public static void main(String[] args) {
        int totalDays = 31;
        int numberOfDays = 0;

        for(int i=1; i<=totalDays; i++){
            if(i%2 == 0) numberOfDays++;
        }

        System.out.println("Total Days = " + numberOfDays);
    }
}
