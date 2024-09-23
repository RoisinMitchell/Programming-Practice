public class QuickSort {

    public int partition(int[] list, int low, int high) {
        int pivot = list[high];  // Correct pivot usage
        int lowIndex = low - 1;

        for (int i = low; i < high; i++) {
            if (list[i] < pivot) {
                lowIndex++;

                // Swapping list[lowIndex] and list[i]
                int temp = list[lowIndex];
                list[lowIndex] = list[i];
                list[i] = temp;
            }
        }

        // Swapping list[lowIndex + 1] and list[high] (the pivot)
        int temp = list[lowIndex + 1];
        list[lowIndex + 1] = list[high];
        list[high] = temp;

        return lowIndex + 1;
    }

    public void sort(int[] list, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(list, low, high);

            sort(list, low, partitionIndex - 1);
            sort(list, partitionIndex + 1, high);
        }
    }

    static void printArray(int[] list) {
        int n = list.length;
        for (int i = 0; i < n; ++i)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int[] list = {10, 7, 8, 9, 1, 5};
        int n = list.length;

        QuickSort ob = new QuickSort();
        ob.sort(list, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(list);
    }
}
