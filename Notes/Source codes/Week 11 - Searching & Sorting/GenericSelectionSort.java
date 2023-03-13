
public class GenericSelectionSort {
  /**
    * Sorts the specified array of integers using the selection
    * sort algorithm.
    *
    * @param <T>
    * @param list the array to be sorted
    */
    public static <T extends Comparable<T>> void selectionSort(T[] list)
    {
        for (int i = 0; i < list.length-1; i++) {
          // Find the minimum in the list[i..list.length-1]
          T currentMin = list[i];
          int currentMinIndex = i;
          for (int j = i + 1; j < list.length; j++) {
            if (currentMin.compareTo(list[j]) > 0) {
              currentMin = list[j];
              currentMinIndex = j;
            }
          }

          // Swap list[i] with list[currentMinIndex] if necessary;
//          if (currentMinIndex != i) {
//            list[currentMinIndex] = list[i];
//            list[i] = currentMin;
//          }
          
          swap(list, currentMinIndex, i);
    }
  }
    
    /**
    * Swaps two elements in an array. Used by various sorting algorithms.
    *
    * @param data the array in which the elements are swapped
    * @param index1 the index of the first element to be swapped
    * @param index2 the index of the second element to be swapped
    */
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2)
    {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
