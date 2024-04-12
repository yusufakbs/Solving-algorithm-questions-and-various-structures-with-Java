//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int controlNumber = 2;
        int[] numbers = { 2, -256, 2, 1258, 2, 2 };
        boolean controlState = false;
        for (int i = 0; i < numbers.length - 1; i++){
                if(numbers[i] == controlNumber && numbers[i + 1] == controlNumber){
                    System.out.println("True");
                    controlState = true;
                    break;
                }
        }
        if (controlState == false){
            System.out.println("False");
        }
    }
}