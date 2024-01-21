import java.util.Arrays;
import java.util.Random;

public class LotteryHomework {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotteryCompany = new int[7];
        int[] player = new int[7];
        for (int i = 0; i < lotteryCompany.length; i++) {
            lotteryCompany[i] = random.nextInt(10);
            player[i] = random.nextInt(10);

        }
        Arrays.sort(lotteryCompany);
        Arrays.sort(player);
        int zbig = 0;
        System.out.print("Збiглися: ");
        for (int i = 0; i < lotteryCompany.length; i++) {
            if (lotteryCompany[i] == player[i]) {
                zbig++;
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println(Arrays.toString(lotteryCompany));
        System.out.println(Arrays.toString(player));
        System.out.println("Кількість збігів: " + zbig);
    }
}
