package JavaAssignmentQ4;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static int[] findIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        int[] intersection = new int[result.size()];
        for (int idx = 0; idx < result.size(); idx++) {
            intersection[idx] = result.get(idx);
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        int[] intersection = findIntersection(arr1, arr2, arr3);

        System.out.print("Intersection: [");
        for (int i = 0; i < intersection.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(intersection[i]);
        }
        System.out.println("]");
    }
}

