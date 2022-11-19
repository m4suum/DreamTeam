public class Banana extends Fruits {
    double length;
    boolean isSkin = true;
    boolean mark;

    public Banana(double weight, String name,
                  String colour,
                  String producer,
                  double price, double length,
                  boolean isSkin,
                  boolean mark) {
        super(weight, name, colour, producer, price);
        this.length = length;
        this.isSkin = isSkin;
        this.mark = mark;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setIsSkin(boolean isSkin) {
        this.isSkin = isSkin;
    }

    public boolean getIsSkin() {
        return this.isSkin;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public boolean getMark() {
        return this.mark;
    }

    public void buyBanana(){
        super.buyFruit();
        System.out.println("вы cняли шкурку");
    }

    public void eatBanana(){
        super.sellFruit();
        System.out.println("вы поделились шкуркой");
    }

    @Override
    public String toString() {
        return ("Ваш фрукт " + this.name + ", вес " + this.weight + "кг, цвет " + this.colour + ", Страна-изготовитель " + this.producer + ", Цена " + this.price + ", длина банана " + this.length + ", шкурка " + this.isSkin + ", наклейка " + this.mark);
    }
}
