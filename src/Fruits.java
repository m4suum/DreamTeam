public class Fruits {
    double weight;
    String name;
    String colour;
    String producer;
    double price;

    public Fruits (double weight, String name,
    String colour,
    String producer,
    double price) {
        this.colour = colour;
        this.name = name;
        this.producer = producer;
        this.weight = weight;
        this.price = price;
    }

    public void setWeight (double weight ){
        this.weight = weight;
    }public double getWeight (){
        return this.weight;
    }

    public void setPrice (double price ){
        this.price = price;
    }public double getPrice (){
        return this.price;
    }

    public void setName (String name ){
        this.name = name;
    }public String getName (){
        return this.name;
    }


    public void setColour (String colour ){
        this.colour = colour;
    }public String getColour (){
        return this.colour;
    }


    public void setProducer (String producer ){
        this.producer = producer;
    }public String getProducer (){
        return this.producer;
    }

    public void buyFruit(){
        System.out.println("Вы купили фрукт: " + name);
    }

    public void sellFruit(){
        System.out.println("Вы продали фрукт: " + name);
    }


    @Override
    public String toString() {
        return (this.name + " " + this.weight + " " + this.colour + " " + this.producer + " " + this.price);
    }
}
