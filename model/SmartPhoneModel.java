public class SmartPhoneModel {

    private int modelCode;
    private String modelName;
    private int modelQty;
    private float modelPrice;
    private String OS;
    private String connectivity;

    public SmartPhoneModel(int modelCode, String modelName, int modelQty, float modelPrice, String OS, String connectivity) {
        this.modelCode = modelCode;
        this.modelName = modelName;
        this.modelQty = modelQty;
        this.modelPrice = modelPrice;
        this.OS = OS;
        this.connectivity = connectivity;
    }

    // getter method
    public int getModelCode() {
        return this.modelCode;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getModelQty() {
        return this.modelQty;
    }

    public float getModelPrice() {
        return this.modelPrice;
    }

    public String getOS() {
        return this.OS;
    }

    public String getConnectivity() {
        return this.connectivity;
    }

    // setter method
    public void setModelCode(int modelCode) {
        this.modelCode = modelCode;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelQty(int modelQty) {
        this.modelQty = modelQty;
    }

    public void setModelPrice(float modelPrice) {
        this.modelPrice = modelPrice;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }
}
