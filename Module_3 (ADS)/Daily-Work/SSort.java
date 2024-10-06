class SSort {
    static void ssort(int a1[]) {
        int n = a1.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a1[j] < a1[min]) {
                    min = j;
                }
            }
            int temp = a1[min];
            a1[min] = a1[i];
            a1[i] = temp;
        }
    }

    public static void main(String args[]) {
        int a1[] = {50, 40, 30, 20, 10};

        // Print original array
        System.out.print("Original Array: ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();  // For a new line

        // Sort the array
        ssort(a1);

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();  // For a new line
    }
}
