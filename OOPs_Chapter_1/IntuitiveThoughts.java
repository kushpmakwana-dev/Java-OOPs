package OOPs_Chapter_1;

import java.util.Arrays;

public class IntuitiveThoughts {
    public static void main(String[] args) {
        String name = "Kush Makwana";
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] nums = arr;

        arr[4] = 4;
        nums[0] = 10;

        System.out.println(Arrays.toString(arr));

        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam){
        naam = "Push Makwana";
        System.out.println(naam);
    }

}
