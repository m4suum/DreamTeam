public class Grapes extends Fruits {
    int countOfBerries;
    boolean isHaveBones;

    public Grapes(double weight, String name,
                  String colour,
                  String producer,
                  double price, int countOfBerries,
                  boolean isHaveBones) {
        super(weight, name, colour, producer, price);
        this.countOfBerries = countOfBerries;
        this.isHaveBones = isHaveBones;
    }

    public void setCountOfBerries(int countOfBerries) {
        this.countOfBerries = countOfBerries;
    }

    public int getCountOfBerries() {
        return this.countOfBerries;
    }

    public void setHaveBones(boolean isHaveBones) {
        this.isHaveBones = isHaveBones;
    }

    public boolean getHaveBones() {
        return this.isHaveBones;
    }


    public void buyGrapes(){
        super.buyFruit();
        System.out.println("вы помыли виноград ");
    }

    public void eatGrapes(){
        super.sellFruit();
        System.out.println("вы поделили виноград");
    }
    @Override
    public String toString() {
        return ("Ваш фрукт " + this.name + ", вес " + this.weight + "кг, цвет " + this.colour + ", Страна-изготовитель " + this.producer + ", Цена " + this.price + ", кол-во ягодок " + this.countOfBerries + ", наличие косточек " + this.isHaveBones);
    }

}
