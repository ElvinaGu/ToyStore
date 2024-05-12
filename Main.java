import src.Toy;
import src.ToyStore;
import src.impl.Educational;
import src.impl.Musical;
import src.impl.Soft;



public class Main {
    public static void main(String[] args) {

        ToyStore assortment = new ToyStore();

        Musical metallophone = new Musical("Металлофон", 0.14f, 6);
        Musical saxophone = new Musical("Саксофон", 0.18f, 3);
        Soft bear = new Soft("Плюшевый медведь", 2, 4);
        Soft rabbit = new Soft("Плюшевый кролик", 1, 7);
        Educational cube = new Educational("Кубик-рубик", 0.16f, 9);
        Educational designer = new Educational("Конструктор-головоломка", 1, 2);

        assortment.addToy(metallophone);
        assortment.addToy(saxophone);
        assortment.addToy(bear);
        assortment.addToy(rabbit);
        assortment.addToy(cube);
        assortment.addToy(designer);

        assortment.showToys();

        assortment.toyForLottery();

        Toy prize = assortment.getPrize();
        if (prize != null){
            System.out.println("Призовая игрушка: " + prize.getName());
        }
        assortment.showToys();
    }
}
