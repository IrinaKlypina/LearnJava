/**
 * Класс, в котором педставлен метод для создания единиц измерения
 */
package converter;

public class CreateUnits {
    static UnitType[] create(){
        Unit[] time = {
            new Unit("Секунда", 1),
            new Unit("Минута", 60),
            new Unit("Час", 3600),
            new Unit("Сутки", 86400),
            new Unit("Неделя", 604800)
        };
        Unit[] length = {
            new Unit("Миллиметр", 1),
            new Unit("Сантиметр", 10),
            new Unit("Метр", 1000),
            new Unit("Километр", 1_000_000),
            new Unit("Фут", 304.8)
        };
        Unit[] weight = {
            new Unit("Грамм", 1),
            new Unit("Килограмм", 1000),
            new Unit("Тонна", 1_000_000),
            new Unit("Унция", 28.3495),
            new Unit("Фунт", 453.592)
        };
        Unit[] amountOfInformation = {
            new Unit("Бит", 1),
            new Unit("Байт", 8),
            new Unit("Килобайт", 8000),
            new Unit("Мегабайт", 8_000_000),
            new Unit("Гигабайт", 8_000_000_000.0)
        };
        Unit[] temperature = {
            new Unit("Кельвин", 1),
            new Unit("Градус Фаренгейта", 255.928),
            new Unit("Градус Цельсия", 274.15)
        };
        UnitType[] elements = {
                new UnitType("Время", time),
                new UnitType("Длина", length), 
                new UnitType("Масса", weight),
                new UnitType("Объем информации", amountOfInformation),                               
                new UnitType("Температура", temperature)
            };
        
        return elements;
    }
}
