//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberOneCount = 0;
        int numberTwo =4;
        int numberTwoCount = 0;
        int [] numbers={1,4,5,6,1,1,4,8,4,4,4,1,1};

        for (int number: numbers){
            if(number == numberOne){
                numberOneCount++;
            }if(number == numberTwo){
                numberTwoCount++;
            }
        }

        if (numberOneCount > numberTwoCount){
            System.out.println("True");
            System.out.println("Number one count : " + numberOneCount
            +"\nNumber two count : " + numberTwoCount);
        }else if(numberOneCount == numberTwoCount){
            System.out.println("Counts are equal");
        }else{
            System.out.println("False");
            System.out.println("Number one count : " + numberOneCount
                    +"\nNumber two count : " + numberTwoCount);
        }

    }
}