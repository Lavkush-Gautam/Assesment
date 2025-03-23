public class FassendSeconDesc {
    public static void ascending(int s, int e, int[] a) {
        if (s == e) {
            return;
        }
        for (int i = s; i < e; i++) {
            for (int j = i + 1; j <= e; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void descending(int s, int e, int[] a) {
        if (s == e) {
            return;
        }
        for (int i = s; i < e; i++) {
            for (int j = i + 1; j <= e; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 5, 4, 8, 6 };
        int mid = (arr.length - 1) / 2;
        ascending(0, mid, arr);
        descending(mid + 1, arr.length - 1, arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}