package Tickets;

import java.util.*;

class Sorter<T extends Number> implements Comparator<T> {
    public void bubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(list.get(j), list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public int compare(T a, T b) {
        return Double.compare(a.doubleValue(), b.doubleValue());
    }

    public void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private int partition(List<T> list , int low, int high) {
        T pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(list.get(j),pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<T> list, int i, int j) {
        var temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

class Main {
    public static void main(String[] args) {
        Sorter<Integer> integerSorter = new Sorter<>();
        List<Integer> list = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));
        integerSorter.bubbleSort(list);

        for (var item: list)
            System.out.print(item + " ");

        System.out.println();

        Sorter<Double> doubleSorter = new Sorter<> ();
        List<Double> list1 = new ArrayList<>(Arrays.asList(5.6, 4.5, 3.6, 2.2, 1.1));
        doubleSorter.quickSort(list1, 0, list1.size() - 1);

        for (var item: list1)
            System.out.print(item + " ");

        System.out.println();

        Sorter<Long> longSorter = new Sorter<>();
        List<Long> list2 = new Vector<>(Arrays.asList(5L, 4L, 3L, 2L, 1L));
        longSorter.quickSort(list2, 0, list1.size() - 1);

        for (var item: list2)
            System.out.print(item + " ");
    }
}