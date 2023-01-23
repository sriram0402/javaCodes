public class Blanket {

    protected String size;
    protected String color;
    protected String material;
    protected double price;

    public Blanket() {
        this.size = "TWIN";
        this.color = "WHITE";
        this.material = "COTTON";
        this.price = 30;
    }

    public Blanket(String size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = 30; // base price

        // additional price for size
        if(size.equalsIgnoreCase("DOUBLE")) this.price = this.price+10;
        else if(size.equalsIgnoreCase("QUEEN")) this.price = this.price+25;
        else if(size.equalsIgnoreCase("KING")) this.price = this.price+40;

        //additional price for material
        if(material.equalsIgnoreCase("WOOL")) this.price = this.price+20;
        else if(material.equalsIgnoreCase("CASHMERE")) this.price = this.price+45;
    }

    @Override
    public String toString() {
        return " Size: "+this.size+", Color: "+this.color+", Material: "+material+", Price: $"+this.price;
    }
}
