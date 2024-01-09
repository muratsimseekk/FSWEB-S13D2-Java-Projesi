public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        boolean isTrue =  isPalindrome(1001) ;
        System.out.println("is number true ? "+isTrue);

        boolean isPerfect = isPerfectNumber(28) ;
        System.out.println("is number perfect ? " +isPerfect);
        System.out.println("is number to word : " +numberToWords(12987465));
    }

    public static boolean isPalindrome(int number) {
//        number = Math.abs(number);
//        int sum =0 , temp , a ;
//
//        temp = number;
//
//        while(temp >0)
//        {
//            a = temp %10;
//            sum = sum *10 + a;
//            temp=temp/10;
//        }
//
//        if (sum == number){
//            return true;
//        }
//        else {return false;}
        number = Math.abs(number);
        //Rakamlari tek tek gezmek icin char array yapariz.
        char[] digits = String.valueOf(number).toCharArray();
        //TO DO 122 => 221
        String reversed = "";
        for (int i=digits.length -1 ; i>=0 ; i--){
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(number));

    }

    public static boolean isPerfectNumber (int number) {
        if (number <0){
            return false;
        }

        else {
            int temp =1;
            int total = 0;
            while (temp<number) {
                if (number % temp == 0) {
                    total += temp;
                }
                temp++;
            }
            return total == number;
        }
    }

    public static String numberToWords(int number) {
        if (number <0) {
            return "Invalid Value";
        }
        char [] digits = String.valueOf(number).toCharArray();

        String numToText = "";

        for (char digit : digits){
            switch (digit){
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }
        return  numToText.trim();


    }
}