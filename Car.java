/* Модель класса
*  1) Марка машины
*  2) Вес машины
*  3) Мощнность машины
*  4) Обьём двигателя
*  5) Цвет машины
*  6) Год производства
*  7) Пробег
*  8) Количество владельцев
*  9) Рассчёт стоимости
* */
public class Car {
    String model;
    int weight;
    int powerEngine;
    int volumeEngine;
    String color;
    int yearСreation;
    int mileageCar;
    int owners;
    int condition;
    int price;

    public Car()
    {
        model = "";
        weight = 0;
        powerEngine = 0;
        volumeEngine = 0;
        color = "";
        yearСreation = 0;
        mileageCar = 0;
        owners = 0;
        condition = 0;
        price = 0;
    }

    public void createCar()
    {
        String[] modelCar = new String[7];
        modelCar[0] = "Lada"; modelCar[1] = "BMW"; modelCar[2] = "Mercedes-Benz"; modelCar[3] = "Audi";
        modelCar[4] = "Mazda"; modelCar[5] = "Ford"; modelCar[6] = "Porsche";
        int randomNum =  0 + (int) (Math.random() * 6);
        model = modelCar[randomNum];
        randomNum = 900 + (int) (Math.random() * 1700);
        weight = randomNum;
        randomNum = 360 + (int) (Math.random() * 800);
        powerEngine = randomNum;
        randomNum = 1200 + (int) (Math.random() * 7000);
        volumeEngine = randomNum;
        String[] colorCar = new String[11];
        colorCar[0] = "Жёлтый"; colorCar[1] = "Чёрный"; colorCar[2] = "Зелёный"; colorCar[3] = "Белый";
        colorCar[4] = "Синий"; colorCar[5] = "Красный"; colorCar[6] = "Розовый"; colorCar[7] = "Серый";
        colorCar[8] = "Коричневый"; colorCar[9] = "Золото"; colorCar[10] = "Хаки";
        randomNum = 0 + (int) (Math.random() * 10);
        color = colorCar[randomNum];
        randomNum = 0 + (int) (Math.random() * 25);
        yearСreation = randomNum + 1995;
        randomNum = 0 + (int) (Math.random() * 1000000);
        mileageCar = randomNum;
        randomNum = 1 + (int) (Math.random() * 6);
        owners = randomNum;
        condition = 100 - (yearСreation - 1995) - (owners * 2) - (mileageCar / 1000000);
        price = (powerEngine * 50) + (volumeEngine * 80) + (yearСreation * 50) + (mileageCar * 5);
    }
    public void print()
    {
        System.out.println("Марка: " + model);
        System.out.println("Вес: " + weight);
        System.out.println("Мощность двигателя: " + powerEngine);
        System.out.println("Объём двигателя: " + volumeEngine);
        System.out.println("Цвет машины: " + color);
        System.out.println("Год создания: " + yearСreation);
        System.out.println("Пробег: " + mileageCar);
        System.out.println("Владельцы: " + owners);
        System.out.println("Состояние: " + condition + "%");
        System.out.println("\u001B[31m" + "Цена: " + price + "\u001B[0m");      // Красный цвет
    }
}
