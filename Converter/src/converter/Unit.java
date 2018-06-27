/**
 * Класс, описывающий единицу измерения
 */
package converter;

public class Unit {
    String name;
    double power;
    
    public Unit(String name){
        this.name = name;
        power = 1;
    }
    
    public Unit(String name, double power){
        this.name = name;
        this.power = power;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
