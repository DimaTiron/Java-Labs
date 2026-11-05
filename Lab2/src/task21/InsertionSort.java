package task21;

import java.util.List;

public class InsertionSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int j = i;
            //  внутрений цикл сравнения
            while (j > 0 && nums.get(j - 1) > nums.get(j)) {

                // Меняем местами элементы j-1 и j
                int temp = nums.get(j - 1);
                nums.set(j - 1, nums.get(j));
                nums.set(j, temp);

                // Двигаемся влево
                j--;
            }
        }
    }
}