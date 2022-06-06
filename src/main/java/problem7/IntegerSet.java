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
  }

  public void setIntegerSet2() {
    integerSet2 = new HashSet<>();
    System.out.println("Please enter quantity of Integer in your set B");
    int setLength = Integer.parseInt(getKeyboard().nextLine());
    for (int i = 0; i < setLength; i++) {
      System.out.println("Please input the integer " + (i + 1));
      integerSet1.add(Integer.parseInt(getKeyboard().nextLine()));
    }
    System.out.println("integer set 2 was initialed");
  }

  public void addAllSet() {
    TreeSet<Integer> addAllSet = new TreeSet<>();
    addAllSet.addAll(integerSet1);
    addAllSet.addAll(integerSet2);
    System.out.println("addAll");
    System.out.println(addAllSet);

    //      for(Integer number: integerTreeSet){
    //      System.out.println(number);
    //      }
  }

  public void removeAllFromB() {
//    TreeSet<Integer> removeAllFromB = new TreeSet<>();
    HashSet<Integer> removeAllFromB = new HashSet<>();
    removeAllFromB.addAll(integerSet1);
    removeAllFromB.removeAll(integerSet2);
      System.out.println("removeAll");

      System.out.println(removeAllFromB);
  }

  public void retainAllFromB() {
//    TreeSet<Integer> retainAll = new TreeSet<>(integerSet1);
      HashSet<Integer> retainAll = new HashSet<>();
      retainAll.addAll(integerSet1);
    retainAll.retainAll(integerSet2);
      System.out.println("retainAll");

      System.out.println(retainAll);
  }
}
