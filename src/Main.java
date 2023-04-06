public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1 task ---");
        int[] array = new int[50];
        for(int a = 1, b = 0; a <= 99; a++){
            if(a%2 != 0){
                array[b] = a;
                System.out.println(array[b] + "");
                b++;
            }
        }

        System.out.println("--- 2 task ---");

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------------------------");
        for (int j = 1; j < arr.length; j += 2) {
            arr[j] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n --- 3 task ---");

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];
        double sumOfNumbers1 = 0, sumOfNumbers2 = 0, sumOfNumbers3 = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)((Math.random()*6));
            System.out.print(arr1[i] + " ");
            sumOfNumbers1 += arr1[i];
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)((Math.random()*6));
            System.out.print(arr2[i] + " ");
            sumOfNumbers2 += arr2[i];
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int)((Math.random()*6));
            System.out.print(arr3[i] + " ");
            sumOfNumbers3 += arr3[i];
        }
        System.out.println("\n---------");

        double averageValuue1 = sumOfNumbers1 / arr1.length;
        double averageValuue2 = sumOfNumbers2 / arr2.length;
        double averageValuue3 = sumOfNumbers3 / arr3.length;

        System.out.println("Середнє значення першого масиву: " + averageValuue1);
        System.out.println("Середнє значення другого масиву: " + averageValuue2);
        System.out.println("Середнє значення третього масиву: " + averageValuue3);

        if(averageValuue1 > averageValuue2 && averageValuue1 > averageValuue3){
            System.out.println("Середнє значення першого масиву є більшим за інші");
        } else if(averageValuue2 > averageValuue1 && averageValuue2 > averageValuue3){
            System.out.println("Середнє значення другого масиву є більшим за інші");
        } else if(averageValuue3 > averageValuue1 && averageValuue3 > averageValuue2){
            System.out.println("Середнє значення третього масиву є більшим за інші");
        } else if(averageValuue2 == averageValuue1 && averageValuue2 == averageValuue3){
            System.out.println("Середнє значення масивів є рівними");
        }

        System.out.println("\n --- 4 task ---");

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*11);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random()*11);
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n-----------------------");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.print(array3[i] + " ");
        }

        System.out.println("\n --- 5 task ---");

        int[] a = new int[15];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*11);
            System.out.print(a[i] + " ");
            if(a[i] % 2 == 0){
                count += 1;
            }
        }
        System.out.println("\nПарних чисел: " + count);

        System.out.println(" --- 6 task ---");

        int[][] ar = new int[15][0];

        ar[0] = new int[5];
        ar[1] = new int[5];
        ar[2] = new int[5];
        ar[3] = new int[5];
        ar[4] = new int[8];
        ar[5] = new int[8];
        ar[6] = new int[8];
        ar[7] = new int[8];
        ar[8] = new int[3];
        ar[9] = new int[3];
        ar[10] = new int[3];
        ar[11] = new int[3];
        ar[12] = new int[9];
        ar[13] = new int[9];
        ar[14] = new int[9];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = (int)(Math.random()*16);
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}