/**
 * Перевод из двоичной системы счисления в десятичную и наоборот
 */
package translationofnumbersystems;

public class TranslationOfNumberSystems {

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(11101000));
        System.out.println(decimalToBinary(22));
    }
    
    /**
     * Функция переводит число из двоичной системы счисления в десятичную
     * @param bin - число в двоичной системе счисления
     */
    public static long binaryToDecimal(long bin){
        long answ = 0;
        for(int i = 0; bin != 0; i++){
           answ += bin % 10 * Math.pow(2, i);
           bin /= 10;
        }
        return answ;
    }
    
    /**
     * Функция переводит число из десятичной системы счисления в двоичную
     * @param dec - число в десятичной системе счисления
     */
    public static long decimalToBinary(long dec){
        String answ = "";
        while(dec > 1){
            answ = dec % 2 + answ;
            dec /= 2;
        }
        answ = dec + answ;
        return Long.parseLong(answ);
    }
    
}
