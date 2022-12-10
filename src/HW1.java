//Составить частотный словарь элементов одномерного массива
//        Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.
//
//        Пример:
//        Есть набор данных
//
//        { 1, 9, 9, 0, 2, 8, 0, 9 }
//        частотный массив может быть представлен так:
import java.util.HashSet;

public class HW1 {
    public static void main(String[] args) {
        Integer [] arr = {1, 1, 2, 3, 4, 5 , 8 ,5};
        countIt(makeASet(arr), arr);

    }
    //Формируем множество из заданного списка
    static HashSet <Integer> makeASet (Integer [] arr) {
        HashSet <Integer> numsSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (numsSet.contains(arr[i])) {
                continue;
            }
            else {
                numsSet.add(arr[i]);
            }
        }
        return numsSet;
    }
    //Подсчитываем количество повторений в массиве
    static void countIt(HashSet<Integer> numsSet, Integer [] arr) {
        for (Integer num: numsSet) {
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    counter += 1;
                }
                else {
                    continue;
                }
            }
            System.out.println(num + " встречается " + counter + " раз");
        }
    }
}