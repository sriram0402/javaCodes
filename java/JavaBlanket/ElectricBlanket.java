public class ElectricBlanket extends Blanket{

    int noOfHeatSetting;
    boolean automaticShutOff;

    public ElectricBlanket() {
        super(); // to set deafult values of fields in parent class
        this.noOfHeatSetting = 0;
        this.automaticShutOff = false;
        this.price = this.price+this.price*0.1; // adding 10% of total price for electric blanket
    }

    public ElectricBlanket(String size, String color, String material, int noOfHeatSetting, boolean automaticShutOff) {
        super(size, color, material);
        this.noOfHeatSetting = noOfHeatSetting;
        this.automaticShutOff = automaticShutOff;
        // additional charge if it has an automatic shut-off;
        if(this.automaticShutOff) this.price = this.price+10;
        this.price = this.price+this.price*0.1;
    }

    @Override
    public String toString() {
        return super.toString()+", Number of Heat Setting: "+this.noOfHeatSetting+", Automatic Shut-Off: "+this.automaticShutOff;
    }
}