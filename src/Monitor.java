public class Monitor {
    private String modelName, manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String modelName, String manufacturer, int size, Resolution nativeResolution) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+" , "+y+" wiht color"+color);
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
