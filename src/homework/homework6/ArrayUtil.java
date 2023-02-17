package homework.homework6;

public class ArrayUtil {

    int maxofArray(int[] array) {
        int max = array[0];
        for(int i : array) {
            if(i>max) {
                max = i;
            }
        }
        return max;
    }
}
