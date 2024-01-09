public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        boolean isTrue =  isPalindrome(1001) ;
        System.out.println("is number true ? "+isTrue);

        boolean isPerfect = isPerfectNumber(28) ;
        System.out.println("is number perfect ? " +isPerfect);
    }

    public static boolean isPalindrome(int number) {
        int sum =0 , temp , a ;

        temp = number;

        while(temp >0)
        {
            a = temp %10;
            sum = sum *10 + a;
            temp=temp/10;
        }

        if (sum == number){
            return true;
        }
        else {return false;}
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

    public static void numberToWords(int number) {
        int[] sayilar = {0,1,2,3,4,5,6,7,8,9} ;
        String[] words = {"zero","one" ,"two","three","four","five","six","seven","eight","nine"};

        for (int sayi : sayilar){

        }

    }
}