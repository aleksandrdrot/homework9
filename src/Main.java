import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++){
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила "+ sum +" рублей");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int sumMin = arr[0];
        int sumMax = arr[0];
        for (int index = 1; index < arr.length; index++){
            //System.out.println(arr[index]);
            if (sumMin > arr[index]){
                sumMin = arr[index];
            }
            if (sumMax < arr[index]){
                sumMax = arr[index];
            }
        }
        System.out.println("Сумма за месяц: минимальная - "+ sumMin +", максимальная - "+sumMax);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++){
            //System.out.println(arr[index]);
            sum += arr[index];
        }
        System.out.println("Средняя сумма трат за месяц составила "+ sum/arr.length +" рублей");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String str = new String();
        for (int index = reverseFullName.length - 1; index >= 0; index--){
            str += reverseFullName[index];
        }
        System.out.println(str);
    }
}