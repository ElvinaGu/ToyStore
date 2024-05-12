package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToy;
    private String prizeFile;

    public ToyStore() {
        this.toys = new ArrayList<>();
        this.prizeToy = new ArrayList<>();
        this.prizeFile = "prizeToys.txt";
    }

    // Добавление игрушки.
    public void addToy(Toy toy) {
        if (!toys.contains(toy)) {
            toys.add(toy);
        } else System.out.println("Игрушка [" + toy + "] уже есть в списке.");
    }

    // Игрушки, выигравшие в лотерее.
    public void toyForLottery() {
        PrizeDraw rnd = new PrizeDraw();
        Toy toy = rnd.lottery(toys);
        prizeToy.add(toy);
    }

    // Получение призовых игрушек.
    public Toy getPrize() {
        if (!prizeToy.isEmpty()) {
            Toy prize = prizeToy.remove(0);
            prize.setQuantity(prize.getQuantity() - 1);

            try {
                FileWriter wr = new FileWriter(prizeFile, true);
                wr.write(prizeFile + "\n");
                wr.close();
            } catch (IOException e) {
                System.out.println("Возникли неполадки при записи данных в файл.");
            }
            return prize;
        } else {
            System.out.println("Призовые игрушки разобраны.");
            return null;
        }
    }

    // Показать весь список игрушек магазина.
    public void showToys() {
        System.out.println("Ассортимент магазина: " + toys);
    }
}

