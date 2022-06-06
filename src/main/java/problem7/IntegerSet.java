package problem7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntegerSet {
    HashSet<Integer> integerSet1;
    HashSet<Integer> integerSet2;
    Scanner keyboard = new Scanner(System.in);

    public void setIntegerSet1() {
        integerSet1 = new HashSet<>();
        System.out.println("Please enter quantity of Integer in your set A");
        int setLength = Integer.parseInt(getKeyboard().nextLine());
        for (int i = 0; i < setLength; i++) {
            System.out.println("Please input the integer " + (i + 1));
            integerSet1.add(Integer.parseInt(getKeyboard().nextLine()));
        }
        System.out.println("integer set 1 was initialed");
        System.out.println(integerSet1);
    }

    public void setIntegerSet2() {
        integerSet2 = new HashSet<>();
        System.out.println("Please enter quantity of Integer in your set B");
        int setLength = Integer.parseInt(getKeyboard().nextLine());
        for (int i = 0; i < setLength; i++) {
            System.out.println("Please input the integer " + (i + 1));
            integerSet2.add(Integer.parseInt(getKeyboard().nextLine()));
        }
        System.out.println("integer set 2 was initialed");
        System.out.println(integerSet2);
    }

    public void addAllSet() {
        TreeSet<Integer> result = new TreeSet<>();
        result.addAll(integerSet1);
        result.addAll(integerSet2);
        System.out.println("addAll");
        System.out.println(result);
    }

    public void removeAllFromB() {
        TreeSet<Integer> result = new TreeSet<>();
        HashSet<Integer> removeAllFromB = new HashSet<>(integerSet1);
        removeAllFromB.removeAll(integerSet2);
        for (int number : removeAllFromB) {
            result.add(number);
        }
        System.out.println("remove all integer from set B");
        System.out.println(result);
    }

    public void retainAllFromB() {
        TreeSet<Integer> result = new TreeSet<>();
        HashSet<Integer> integerList = new HashSet<>(integerSet1);
        integerList.retainAll(integerSet2);
        for (int number : integerList) {
            result.add(number);
        }
        System.out.println("retain all integer from A & B");
        System.out.println(result);
    }
}
