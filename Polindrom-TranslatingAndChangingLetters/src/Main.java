import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Seçimini Yapınız." +
                "\n1- Harf Saydirma\n" +
                "2- Harf Değiştirme\n" +
                "3- Palindrom Kontrolü");

        System.out.println("Bir seçim yapınız:");
        int secim = sc.nextInt();
        sc.nextLine();

        switch (secim){
            case 1:
                System.out.println("Kelimeyi girin:");
                String word = sc.nextLine();
                System.out.println("Harfi girin:");
                char letter = sc.next().charAt(0);
                System.out.println("Toplam : " + letterSum(word,letter));

                break;
            case 2:
                System.out.println("Kelimeyi girin:");
                String word2 = sc.nextLine();
                System.out.println("Harfi girin:");
                char letter2 = sc.next().charAt(0);
                if(letterSum(word2,letter2) > 0){
                    System.out.println("Değiştirilecek harfi girin:");
                    char letter3 = sc.next().charAt(0);
                    letterChange(word2,letter2,letter3);
                }
                break;
            case 3:
                System.out.println("Kelimeyi giriniz:");
                String palindromWord = sc.nextLine();
                palindromControl(palindromWord);
                break;
        }

    }

    public static int letterSum(String word, char letter){
        String[] array = charactersToArray(word);
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i].equalsIgnoreCase(String.valueOf(letter))){
                sum++;
                System.out.println("Girdiğiniz harf " + i + " indeksinde bulunmaktadır.");
            }
        }
        if (sum == 0){
                System.out.println("Girdiğiniz harf verdiğiniz kelimede bulunmamaktadır");
        }
        return sum;
    }

    public static String letterChange(String word, char letter,char newLetter){
        String[] array = charactersToArray(word);
        String newWord = "";

        for (int i = 0; i < array.length; i++){
            if(array[i].equalsIgnoreCase(String.valueOf(letter))){
                array[i] = String.valueOf(newLetter);
            }
        }
        for (int a = 0; a < array.length; a++){
            newWord += array[a];
        }

        System.out.println(newWord);

        return newWord;
    }


    public static String[] charactersToArray(String word){
        String[] array = new String[word.length()];
        for (int i = 0; i < word.length(); i++){
            array[i] = word.substring(i,i+1);
        }

        return array;
    }

    public static void palindromControl(String word){
    String reverse = new StringBuilder(word).reverse().toString();
    if (word.equals(reverse)){
        System.out.println("Palindrom bir kelimedir.");
    }else {
        System.out.println("Palindrom bir kelime değildir");
    }
    }

}