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

## Second Approach

	However, there are alternative approaches available, such as the one presented by [@LimJY](https://github.com/LimJY03/WIA1002_UM/blob/main/Lab_03/ArrayBag.java). This method first converts the sets to arrays and then iterates through the smaller array to check if each element is present in the larger array. If a match is found, the element is added to the intersection set lowerFreq times, where lowerFreq is the minimum frequency of the element in the two sets.

	To illustrate the intersection operation, consider the following example:
```md
bagA = [a, a, a, b, b, c, c, e]
bagB = [a, a, b, c]
Intersection = [a, a, b, c]
```

	In this example, the intersection of bagA and bagB is computed by iterating through the smaller array, which is bagB. For each element in bagB, the code checks if the element is present in bagA and adds it to the intersection set lowerFreq times. In this case, a occurs three times in bagA and twice in bagB, so it is added to the intersection set twice. Similarly, b and c occur twice in bagA and once in bagB, so they are each added to the intersection set once.

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

## Third Approach
```java
@Override
	public BagInterface<T> intersection(BagInterface<T> anotherBag) {
		return batchRemove(anotherBag, false);
	}
	
	@Override
	public BagInterface<T> difference(BagInterface<T> anotherBag) {
		return batchRemove(anotherBag, true);
	}
	
	public BagInterface<T> batchRemove(BagInterface<T> anotherBag, boolean complement) {
		BagInterface<T> newBag = new ArrayBag<T>(numberOfEntries);
		
		for(int i = 0; i < numberOfEntries; i++) {			
			if(newBag.contains(bag[i])) 
				continue;
			
			int freq1 = getFrequencyOf(bag[i]);
			int freq2 = anotherBag.getFrequencyOf(bag[i]);
			int end = (complement) ? Math.abs(freq1 - freq2) : Math.min(freq1, freq2);
			
			for(int j = 0; j < end; j++)
				newBag.add(bag[i]);
		}
		
		return new ArrayBag<T>(newBag.toArray());
	}	
```

	Here is a possible revision of the paragraph:

"Both intersection and difference methods make use of a third method called batchRemove. batchRemove takes two input bags and a boolean value called complement. If complement is false, batchRemove functions as difference and removes from the first bag all items that appear in the second bag. It then returns a new bag that contains the remaining items. If complement is true, batchRemove functions as intersection, removing from the first bag all items that do not appear in the second bag. It then returns a new bag that contains the removed items.

For example, consider two bags bagA and bagB, where bagA contains [a, a, a, b, b, c, c, e] and bagB contains [a, a, b, c]. The intersection of bagA and bagB is [a, a, b, c], and the difference between them is [a, b, c, e].

To determine the frequency of an item in the new bag, we use Math.min() and Math.abs(). For instance, the frequency of 'a' in the intersection is 2, which is the minimum of the frequencies of 'a' in bagA and bagB. On the other hand, the frequency of 'b' in the difference is 1, which is the absolute difference between the frequencies of 'b' in bagA and bagB."
