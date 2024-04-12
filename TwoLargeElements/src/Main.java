import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int bigOne;
        int bigTwo;
        int[] sayilar = { 120, 130, 125, -256, 16, 1300, 1258, 81, 14 };

        // Way 1
        Arrays.sort(sayilar);
        bigOne = sayilar[sayilar.length - 1];
        bigTwo = sayilar[sayilar.length - 2];
        System.out.println("En büyük birinci sayi: " + bigOne +
        "\nEn büyük ikinci sayi:" + bigTwo );

        //Way 2
        int bigValueOne = Integer.MIN_VALUE;
        int bigValueTwo = Integer.MIN_VALUE;

        for (int sayi : sayilar){
            if (sayi > bigValueOne){
                bigValueTwo = bigValueOne;
                bigValueOne = sayi;
            }else if(sayi > bigValueTwo && sayi != bigOne){
                bigValueTwo = sayi;
            }
        }
        System.out.println("En büyük ikinci sayi : " + bigValueTwo);


    }
}