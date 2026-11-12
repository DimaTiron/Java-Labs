package task22;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorting<Integer> {

    @Override
    public void sort(List<Integer> nums) {
        slice(nums, 0, nums.size() - 1);
    }

    private void slice(List<Integer> nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end) / 2;
        slice(nums, start, middle);
        slice(nums, middle + 1, end);
        merge(nums, start, middle, end);
    }

    private void merge(List<Integer> nums, int start, int middle, int end) {
        List<Integer> temp = new ArrayList<>();
        int i = start;
        int j = middle + 1;

        // Шаг 3: Сравниваем элементы из левой и правой половин
        while (i <= middle && j <= end) {
            if (nums.get(i) <= nums.get(j)) {
                temp.add(nums.get(i));
                i++;
            } else {
                temp.add(nums.get(j));
                j++;
            }
        }

        // Шаг 4: Докидываем остатки
        while (i <= middle) {
            temp.add(nums.get(i));
            i++;
        }
        while (j <= end) {
            temp.add(nums.get(j));
            j++;
        }

        // Шаг 5: Возвращаем обратно в nums
        for (int k = 0; k < temp.size(); k++) {
            nums.set(start + k, temp.get(k));
        }
    }
}