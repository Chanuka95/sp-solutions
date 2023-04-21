import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    problem one
    public static void functionOne(){

        List<Integer> listOne = new ArrayList<>();
        listOne.add(5);
        listOne.add(6);
        listOne.add(7);
        int sumInList = 0;
        for (int i = 0; i < listOne.size(); i++)
            sumInList += listOne.get(i);

        System.out.println("sum of the list one - " + sumInList);
    }

    public static void functionTwo(){

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(5);
        listTwo.add(1);
        listTwo.add(1);
        int sumInList = 0;
        int i = 0;

        while(i < listTwo.size()){
            sumInList += listTwo.get(i);
            i++;
        }

        System.out.println("sum of the list two - " + sumInList);
    }

//    problem two

    public static void listCombines(){
        List<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(4);
        listTwo.add(5);
        listTwo.add(6);
        List<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(listOne);
        mergeList.addAll(listTwo);
        System.out.println("List one : "+listOne);
        System.out.println("List two: "+listTwo);
        System.out.println("Merged : "+mergeList);
    }

//    problem three

    public static void fibonacci(){
        int n = 100, firstNum = 0, secondNum = 1;
        System.out.println("Fibonacci numbers -");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNum + ", ");

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
    }
    }


//    problem four

    public static String nonNegative(List<Integer> nums){

        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));


    }

    public static void main(String[] args) {
        functionOne();
        System.out.println("");
        functionTwo();
        System.out.println("");
        listCombines();
        System.out.println("");
        fibonacci();
        System.out.println("");

        List<Integer> num =  new ArrayList<>();

        num.add(50);
        num.add(2);
        num.add(1);
        num.add(9);

        String largestNumber = nonNegative(num);
        System.out.println("Largest number - " + largestNumber);
    }
}
