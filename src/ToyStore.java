package src;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToy;
    private String prizeFile;

    public ToyStore() {
        this.toys = new ArrayList<>();
//        this.prizeToy = prizeToy;
//        this.prizeFile = prizeFile;
    }

    // Добавление игрушки.
    public void addToy (Toy toy){
        if (!toys.contains(toy)){
            toys.add(toy);
        }else System.out.println("Игрушка [" + toy + "] уже есть в списке.");
    }

    public Toy getToyForLottery(){
        PrizeDraw rnd = new PrizeDraw();
        Toy toy = rnd.lottery(toys);
        return toy;
    }

    public void showToys(){
        System.out.println("Ассортимент магазина: " + toys);
    }
}
