package tekpro.gaji;

abstract class Sortable {
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        // Shell sort implementation
        int n = a.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1; // 1, 4, 13, 40, 121, ...
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && a[j].compare(a[j - h]) > 0; j -= h) {
                    Sortable temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
            h /= 3;
        }
    }
}
