package lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Danil on 28.11.2022
 * @project DVFUHomework
 */
public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>();

        // checking exception for deleting from empty array
        try {
            System.out.println("Trying to remove from empty array");
            array.removeLast();
        } catch (MyArrayList.OutOfArrayBoundsException exception) {
            System.out.println("\t" + "Exception inspected: " + exception.getMessage());
        }

        System.out.println("Filling array by numbers in range from 0 to 9");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + "Adding " + i + " : ");
            array.addLast(i);
            System.out.println(array);
        }

        // checking exception for adding element in the full array
        try {
            System.out.println("Trying to add one more element");
            array.addLast(10);
        } catch (MyArrayList.OutOfArrayBoundsException exception) {
            System.out.println("\t" + "Exception inspected: " + exception.getMessage());
        }
        System.out.println(array);

        System.out.println("Removing 5 last elements from array");
        for (int i = 0; i < 4; i++) {
            System.out.print("\t" + "Removing last element: ");
            array.removeLast();
            System.out.println(array);
        }

        System.out.println("Getting elements by index");
        for (int i = 0; i < 6; i++)
            System.out.println("\t" + "Getting element by index " + i + ":" + array.get(i));

        try{
            System.out.println("Trying to get element which doesn't exist");
            System.out.println(array.get(7));
        }catch (NoSuchElementException exception){
            System.out.println("\t"+"Exception inspected: " + exception.getMessage());
        }

        try{
            System.out.println("Trying to get element by index which is out of bounds of the array");
            System.out.println(array.get(100));
        }catch (MyArrayList.OutOfArrayBoundsException exception){
            System.out.println("\t" + "Exception inspected: " + exception.getMessage());
        }


    }
}
