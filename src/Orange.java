public class Orange extends Fruits {
    int countOfParts;
    double radius;
    String sort;

    public Orange(double weight, String name,
                  String colour,
                  String producer,
                  double price, int countOfParts,
                  double radius,
                  String sort) {
        super(weight, name, colour, producer, price);
        this.countOfParts = countOfParts;
        this.radius = radius;
        this.sort = sort;
    }

    public void setCountOfParts(int countOfParts) {
        this.countOfParts = countOfParts;
    }

    public int getCountOfParts() {
        return this.countOfParts;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSort() {
        return this.sort;
    }

    public void buyOrange(){
        super.buyFruit();
        System.out.println("вы почистиил апельсин");
    }

    public void eatOrange(){
        super.sellFruit();
        System.out.println("вы поделили апельсин");
    }

    @Override
    public String toString() {
        return ("Ваш фрукт " + this.name + ", вес " + this.weight + "кг, цвет " + this.colour + ", Страна-изготовитель " + this.producer + ", Цена " + this.price + ", Кол-во долек " + this.countOfParts + ", радиус " + this.radius + ", сорт " + this.sort);
    }
}
