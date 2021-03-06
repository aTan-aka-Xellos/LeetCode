package arrays.easy;

public class TwoSum_167 {

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    public int[] _twoSum(int[] a, int t) {
        int i = 0, j = a.length - 1;
        while  (a[j] != t - a[i]) {
            if (a[j] <  t - a[i]) i++;
            else                  j--;
        }
        return new int[]{++i, ++j};
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] diff = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            diff[i] = target - numbers[i];
        }

        int i = 0, j = numbers.length - 1;
        while (numbers[j] != diff[i]) {
            if (diff[i] > numbers[j]) i++;
            if (diff[i] < numbers[j]) j--;
        }
        return new int[]{++i, ++j};
    }
}
