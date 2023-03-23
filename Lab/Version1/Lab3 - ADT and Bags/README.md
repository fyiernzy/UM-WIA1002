# About Intersection and Difference

There are actually much algorithms regarding the intersection and difference. The most natural and intuitive approach are as shown:

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

The underlying idea of this approach is that every time this.bag is being traversed, it will traverse the bag2Array as well to see if there is a match. If yes, then the `intersection` will add the item; otherwise, it will just ignore it.

This will be the most time-effective approach compared to the approach I'll introduce later. However
