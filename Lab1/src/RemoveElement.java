public class RemoveElement {
    public static int removeElementInplace(int[] arr, int val) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            // Если текущий элемент не равен val то оставляем его.
            if (arr[i] != val) {
                arr[index] = arr[i];
                // сдвигаем по индексу
                index++;
            }
        }

        // index равен числу оставшихся элементов и пт итогу новой длине
        return index;
    }
}