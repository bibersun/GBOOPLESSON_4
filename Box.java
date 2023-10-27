import java.util.ArrayList;

public class Box<T extends Fruit> {

    public String nm;
    public float wt;

    public Box(T obj) {
        nm = obj.getNm();
        wt = obj.getWeight();

    }

    private ArrayList<T> fruits = new ArrayList<>();


    public void add(T obj, int qty) {
        for (int i = 0; i < qty; i++) {
            fruits.add(obj);
        }
        nm = obj.getNm();
        wt = obj.getWeight();
    }

    @Override
    public String toString() {
        return String.format("Ящик %s, в нем %d шт., весит %.1f", nm, fruits.size(), getweight());
    }

    public float getweight() {
        return fruits.size() * wt;
    }

    public boolean compare(Box obj) {
        return obj.getweight() == this.getweight();
    }

    public void sprinkle(Box<T> obj) {
        System.out.printf("В исходном ящике было %d %s\n", this.fruits.size(), this.nm);
        System.out.printf("В целевом ящике было %d %s\n", obj.fruits.size(), obj.nm);
        System.out.printf("Пересыпано %d %s\n", this.fruits.size(), this.nm);
        obj.add(this.fruits.getFirst(), this.fruits.size());
        this.fruits.clear();
        System.out.printf("Теперь в исходном ящике %d %s\n", this.fruits.size(), this.nm);
        System.out.printf("Теперь в целевом ящике %d %s\n", obj.fruits.size(), obj.nm);

    }
}
