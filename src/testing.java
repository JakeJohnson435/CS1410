public class testing {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int size = (int) (Math.random() * 100 + 10);
            int[] a = new int[size];
            int num2s = 0;
            for (int j = 0; j < a.length; j++) {
                a[j] = (int) (Math.random() * 10);
                if (a[j] == 2) {
                    num2s++;
                }
                System.out.print(a[j]);
            }
            System.out.println(" there are " + num2s);
        }

    }
}
