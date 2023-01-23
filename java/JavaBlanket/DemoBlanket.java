public class DemoBlanket {
    public static void main(String[] args) {
        Blanket kingBlanket = new Blanket("KING", "BROWN", "CASHMERE" );
        System.out.println("King Blanket details:"+kingBlanket);

        Blanket doubleBlanket = new Blanket("DOUBLE", "BLACK", "WOOL");
        System.out.println("Double Blanket details:"+doubleBlanket);

        ElectricBlanket kingElecBlanket = new ElectricBlanket("KING", "RED", "CASHMERE" , 2, false);
        System.out.println("King Electric Blanket details:"+kingElecBlanket);

        ElectricBlanket doubleElecBlanket = new ElectricBlanket("DOUBLE", "GREEN", "WOOL" , 1, true);
        System.out.println("Double Electric Blanket details:"+doubleElecBlanket);
    }
}