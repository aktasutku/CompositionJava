import java.awt.*;

public class Case {
    private String modelName, manufacturer;
    private Dimension theDimension;

    public Case(String modelName, String manufacturer, Dimension theDimension) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.theDimension = theDimension;
    }

    public void PressPowerButton(){
        System.out.println("Power button pressed..");
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getTheDimension() {
        return theDimension;
    }
}
