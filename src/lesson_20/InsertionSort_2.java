package lesson_20;

class InsertionSort_2 implements Runnable {
    private int[] array;

    public InsertionSort_2(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
