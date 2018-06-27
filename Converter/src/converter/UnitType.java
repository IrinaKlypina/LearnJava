/**
 * Класс, описывающий тип единицы измерения
*/
package converter;

public class UnitType {
    String name;
    Unit[] units;
    
    UnitType(String name){
        this.name = name;
    }
    
    UnitType(String name, Unit[] units){
        this.name = name;
        this.units = units;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
