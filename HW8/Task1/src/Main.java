public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] num  = {2, 4, 6, 7, 1, 3, 4, 8, 9, 7};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < num.length; i++) {
            System.out.println("массив " + num[i]);
        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println("массив с конца " + num[i]);
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        int[] reverse = new int[num.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = num[num.length - i - 1];
            System.out.println("перевернутый массив " + reverse[i]);
        }
    }
}
