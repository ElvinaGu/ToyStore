package src;

public abstract class Toy {
    protected String name;
    protected float weight;
    protected int quantity;

    public Toy(String name, float weight, int quantity) {
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("toy = %s, weight = %s, quantity = %s", name, weight, quantity);
    }
}
