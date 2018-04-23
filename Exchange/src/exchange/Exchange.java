package exchange;
/**
*   Программа рассчитывает сдачу и количество мелких монет,
*   необходимых для сдачи
*/
import java.util.LinkedHashMap;
import java.util.Map;

public class Exchange {

    public static void main(String[] args){
        refund(150, 3458.25);
    }
    
    /**
    *   Метод выводит сдачу  и количество мелких монет, необходимых для сдачи
    *   
    *   @param price - стоимость
    *   @param money - количество денег
    */
    public static void refund(double price, double money){
        if(money < price){
            System.out.println("Money is less than the price");
            return;
        }
        
        double change = (double)Math.round((money - price) * 100) / 100; // сдача
        System.out.println("Сдача: " + change);
        Map<String, Integer> coinsChange = new LinkedHashMap<String, Integer>();
        change %= 50;
        coinsChange.put("10 руб", (int)(change/10));
        change %= 10;
        coinsChange.put("5 руб", (int)(change/5));
        change %= 5;
        coinsChange.put("2 руб", (int)(change/2));
        change %= 2;
        coinsChange.put("1 руб", (int)Math.floor(change));
        change = (change * 100) % 100;
        coinsChange.put("50 коп", (int)(change / 50));
        change %= 50;
        coinsChange.put("10 коп", (int)(change / 10));
        change %= 10;
        coinsChange.put("1 коп", (int)Math.ceil(change));
        
        System.out.println("Кол-во монет:");
        for(Map.Entry entry:coinsChange.entrySet()){
            if((int)entry.getValue() != 0){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
    
}
