public class Program {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Orange> orangeBox2 = new Box<>(new Orange());
        System.out.println(orangeBox);
        Box<Apple> appleBox = new Box<>(new Apple());
//        добавление в коробку
        orangeBox.add(new Orange(), 10);
        System.out.println(orangeBox);
        appleBox.add(new Apple(), 15);
        System.out.println(appleBox);
//        пересыпаем
        orangeBox.sprinkle(orangeBox2);

//        сравниваем, равны ли по весу ящик с яблоками и с апельсинами
        System.out.println(appleBox);
        System.out.println(orangeBox);
        System.out.println(appleBox.compare(orangeBox));

    }
}
