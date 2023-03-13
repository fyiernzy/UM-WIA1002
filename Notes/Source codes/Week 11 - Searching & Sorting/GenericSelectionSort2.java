
 public class GenericSelectionSort2 {
    public static <T extends Comparable<T>> void selectionSort(T[] list)
    {
       for (int i = 0; i < list.length-1; i++) {
          T currentMin = list[i];
          int currentMinIndex = i;
          
          for (int j = i + 1; j < list.length; j++) {
             if (currentMin.compareTo(list[j]) > 0) {
                currentMin = list[j];
                currentMinIndex = j;
             }
          }
          swap(list, currentMinIndex, i);
       }
    }
    
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2)
    {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
 }
 
 
