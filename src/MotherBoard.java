public class MotherBoard {
    private String modelName, manufacturer;
    private int ramSlots, cardSlots;

    public MotherBoard(String modelName, String manufacturer, int ramSlots, int cardSlots) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String ProgramName){
        System.out.println(ProgramName + " is loading...");
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
