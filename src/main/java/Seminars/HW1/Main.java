package Seminars.HW1;
/*
Класс Notebook содержит поля:
Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)
 */
import java.util.*;

public class Main {

    enum manufacturer {
        Lenuvo,
        Asos,
        MacNote,
        Eser,
        Xamiou
    }

    public static void main(String[] args) {
        List<Double> price = List.of(100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0);
        List<Integer> ram = List.of(4, 8, 16, 20, 24, 28, 32);
        List<manufacturer> manufact = List.of(manufacturer.values());

        Random rnd = new Random();
        ArrayList<Notebook> notebooks = new ArrayList<>();

        int i = 0;
        while (i <= 1000){
            notebooks.add(new Notebook(manufact.get(rnd.nextInt(manufact.size())),
                    price.get(rnd.nextInt(price.size())), ram.get(rnd.nextInt(ram.size()))));
            i++;
        }

        Collections.sort(notebooks);
        for (Notebook n: notebooks) {
            System.out.println(n);
        }
    }
}
