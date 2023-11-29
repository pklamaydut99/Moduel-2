package lop_va_doi_tuong;

import java.sql.Time;
import java.util.Random;

public class Bai2 {
    // StopWatch
    //------------------------------
    // - startTime: long
    // - endTime: long
    //------------------------------
    // + StopWatch()
    // + getStartTime(): long
    // + getEndTime(): long
    // + start(): void
    // + stop(): void
    // + getElapsedTime(): long
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000);

        StopWatch stopwatch = new StopWatch();

        // Thực hiện thuật toán sắp xếp chọn
        selectionSort(arr);

        // Dừng đồng hồ đo thời gian
        stopwatch.stop();

        // Hiển thị thời gian đã trôi qua
        System.out.println("Thời gian thực thi: " + stopwatch.getElapsedTime() + " ms");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
    public static class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
            startTime = System.currentTimeMillis();
        }

        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            if (endTime == 0) {
                return System.currentTimeMillis() - startTime;
            } else {
                return endTime - startTime;
            }
        }
    }
}
