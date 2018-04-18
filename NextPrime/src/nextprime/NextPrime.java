package nextprime;

/*
* Выводит следующее простое число, пока пользователь спрашивает.
* Для остановки программы ввести 'q'.
*/

import java.util.Scanner;

public class NextPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prime = 2;       
        System.out.print(prime);
        while (scanner.hasNextLine()) {
            // флаг, по которому закончится выполнение программы
            if (scanner.nextLine().equals("q")) break;
            
            for (int i = prime + 1;; i++) {
                boolean isPrime= true;
                
                // проверка, является ли число простым
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    prime = i;
                    break;
                }
            }
            System.out.print(prime);
        }
    }
}
