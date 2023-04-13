package LabTest2;

import java.util.*;

public class VecUtil {
    public static <E> ArrayList<E> arr2vec(Class<E> c, int[] array) {
        ArrayList<E> vec = new ArrayList<E>(array.length);
        for (int i : array) {
            try {
                E elem = c.getDeclaredConstructor(int.class).newInstance(i);
                vec.add(elem);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return vec;
    }

    public static <E> ArrayList<E> ones(Class<E> c, int size) {
        ArrayList<E> vec = new ArrayList<E>(size);
        for (int i = 0; i < size; i++) {
            try {
                E elem = c.getDeclaredConstructor(int.class).newInstance(1);
                vec.add(elem);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return vec;
    }

    public static <E extends NumberInterface<E>> void printVec(ArrayList<E> vec) {
        StringBuilder sb = new StringBuilder();
        sb.append('C').append('P').append('U').append('[');
        for (NumberInterface<E> obj : vec)
            sb.append(obj.toInteger()).append(',').append(' ');
        sb.setLength(sb.length() - 2);
        System.out.println(sb.append(']'));
    }

    public static <E extends NumberInterface<E>> ArrayList<E> mul(ArrayList<E> vec, E scalar) {
        ArrayList<E> newVec = new ArrayList<>();
        for (NumberInterface<E> obj : vec)
            newVec.add(obj.mul(scalar));
        return newVec;
    }

    public static <E extends NumberInterface<E>> ArrayList<E> mul(ArrayList<E> vec1, ArrayList<E> vec2) {
        ArrayList<E> newVec = new ArrayList<>();
        for (int i = 0; i < vec1.size(); i++)
            newVec.add(vec1.get(i).mul(vec2.get(i)));
        return newVec;
    }

    public static <E extends NumberInterface<E>> NumberInterface<E> dot(ArrayList<E> vec1, ArrayList<E> vec2) {
        ArrayList<E> newVec = new ArrayList<>();
        for (int i = 0; i < vec1.size(); i++) {
            newVec.add(vec1.get(i).mul(vec2.get(i)));
        }
        E dotProduct = newVec.get(0).fromInteger(0);
        for (NumberInterface<E> obj : newVec) {
            dotProduct = obj.add(dotProduct);
        }
        return dotProduct;
    }

}
