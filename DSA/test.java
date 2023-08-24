package DSA;

public class test {
    public static void main(String[] args) {
        String input = "AB";
        int length = input.length();
       perm(input, 0, length - 1);
    }

    public static void perm(String str, int left, int right) {
        if (left == right)
            System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                perm(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String s, int i, int j) {
        char temp;
        char[] arr = s.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
