# About Intersection and Difference

There are various algorithms available for computing the intersection and difference of two sets. 

## First Approach

One of the most intuitive and efficient methods is to iterate through the first set and compare its elements with the elements of the second set. If a match is found, the element is added to the intersection set; otherwise, it is ignored. In this regard, the code provided by [@samweihong](https://github.com/samweihong/WIA1002-Data-Structure/blob/master/src/lab3/ArrayBag.java) for the intersection method is a good example of this approach. The code iterates through the first set and checks if each element is present in the second set. If a match is found, the element is added to the intersection set. 

Reference: 
```java
public BagInterface<T> intersection(BagInterface<? extends T> bag2) {
	BagInterface<T> intersection = new ArrayBag<>();
	T[] bag2Array = bag2.toArray();
        for (int i = 0; i < numberOfEntries; i++) {
            T item = bag[i];
            for (int j = 0; j < bag2Array.length; j++) {
                if (item.equals(bag2Array[j])) {
                    intersection.add(item);
                    bag2Array[j] = null;
                    break;                }
            }
        }
        return intersection;
}
```

However, there are other approaches available as well, such as the one presented by [@LimJY](https://github.com/LimJY03/WIA1002_UM/blob/main/Lab_03/ArrayBag.java). This method first converts the sets to arrays and then iterates through the smaller array to check if each element is present in the larger array. If a match is found, the element is added to the intersection set.

```java
public BagInterface<T> intersect(BagInterface<T> bag) {
	int size; T[] bagArr;

        if (numberOfEntries <= bag.numberOfEntries) {
		size = numberOfEntries;
		bagArr = this.toArray();
	} else {
		size = bag.numberOfEntries;
		bagArr = bag.toArray();
	}
		
        ArrayBag<T> newBag = new ArrayBag<>(this.getCurrentSize());
	
	for (int i = 0; i < bag.getCurrentSize(); i++) {
		if (!newBag.contains(bagArr[i])) {
			int lowerFreq = Math.min(getFrequencyOf(bagArr[i]), bag.getFrequencyOf(bagArr[i]));

			for (int j = 0; j < lowerFreq; j++) 
				newBag.add(bagArr[i]);
		}
	 }
        return newBag;
    }
```
