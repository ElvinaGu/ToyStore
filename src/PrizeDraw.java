package src;

import java.util.List;

public class PrizeDraw {
    public Toy lottery(List<Toy> toys) {
        double toyWeight = 0;
        for (Toy toy : toys)
            toyWeight += toy.getWeight();
        double rnd = Math.random() * toyWeight;
        toyWeight = 0;
        for (Toy toy : toys) {
            toyWeight += toy.getWeight();
            if (toyWeight >= rnd) return toy;
        }
        throw new RuntimeException("Упс, что-то пошло не так.");
    }
}
