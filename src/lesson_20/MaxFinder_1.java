package lesson_20;

class MaxFinder_1 extends Thread {
    private int[] array;
    private int max;

    public MaxFinder_1(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
    }

    public int getMax() {
        return max;
    }
}
