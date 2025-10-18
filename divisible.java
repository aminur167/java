public class divisible {

    public static void main(String[] args) {
        int cnt = 0;

        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
                cnt++;
                if (cnt == 10) {
                    System.out.println();
                    cnt = 0;
                }
            }
        }
    }
}