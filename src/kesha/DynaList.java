package kesha;

import java.util.Arrays;

public class DynaList {

    private static final int STEP = 5;
    private int size = 0;
    private int[] arr = new int[STEP];

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(int o) {
        increase();
        arr[size] = o;
        size ++;
        return true;
    }

    private void increase(){
        if(size == arr.length){
            int[] newArr = new int[STEP + size];
            for (int i = 0; i < size; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public void clear() {
        size = 0;
        arr = new int[STEP];
    }

    public int get(int index) {
        return arr[index];
    }

    public void remove(int index) {
        size--;
        int a = size / STEP;
        int b = size % STEP;
        int newSize = a * STEP;
        if(b > 0){
            newSize += STEP;
        }
        int[] newArr = new int[newSize];
        int j = 0;
        for (int i = 0; i < size + 1; i++) {
            if(i != index) {
                newArr[j] = arr[i];
                j++;
            }
        }
        arr = newArr;
    }


    @Override
    public String toString() {
        return "DynaList{" +
                "step=" + STEP +
                ", size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
