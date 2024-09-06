public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] mass = new int[10];
        boolean flag = true;
        int i = 0;
        int k = 0;
        while (flag) {
            int n = (int) (Math.random() * 100);
            if (40 <= n && n <= 100) {
                    mass[i] = n;
                    System.out.println(mass[i]);
                    i++;
            }
            if (i == 10) {
                flag = false;
            }
        }
        // average mass
        int sum = 0;
        for (int j = 0; j < mass.length; j++) {
            sum+= mass[j];
        }
        System.out.println("average mass: " + sum/mass.length);

        //count 60--80
        for (int j = 0; j < mass.length; j++) {
            if (mass[j] >= 60 && mass[j] <=80) {
                k++;
            }
        }
        System.out.println("count 60--80 : " + k);
    }
}
