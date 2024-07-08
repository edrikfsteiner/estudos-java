package javaFunctions.ordenation;

public class MainOrdenation {
    public static void main(String[] args) {
        double[] list = {2.0, 4.0, 1.0, 5.0, 3.0};
        ordenation MergeSort = new ordenation();
        list = MergeSort.mergeSort(list);
    }
} 