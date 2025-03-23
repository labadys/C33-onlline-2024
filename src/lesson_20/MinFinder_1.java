package lesson_20;

class MinFinder_1 extends Thread {
    private int[] array;
    private int min;

    public MinFinder_1(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
    }

    public int getMin() {
        return min;
    }
}