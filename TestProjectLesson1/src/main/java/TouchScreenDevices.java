public class TouchScreenDevices {
    private String brandOfTouchScreenDevice;
    private String modelOfTouchScreenDevice;
    private String colorOfTouchScreenDevice;
    private String nameCpuOfTouchScreenDevice;
    private String displayTypeOfTouchScreenDevice;
    private String displayResolutionOfTouchScreenDevice;
    private int ramOfTouchScreenDevice;
    private int memoryOfTouchScreenDevice;
    private int quantityCoresCpuOfTouchScreenDevice;

    public TouchScreenDevices(String brandOfTouchScreenDevice, String modelOfTouchScreenDevice, String colorOfTouchScreenDevice, String nameCpuOfTouchScreenDevice, String displayTypeOfTouchScreenDevice, String displayResolutionOfTouchScreenDevice, int ramOfTouchScreenDevice, int memoryOfTouchScreenDevice, int quantityCoresCpuOfTouchScreenDevice) {
    this.brandOfTouchScreenDevice = brandOfTouchScreenDevice;
    this.modelOfTouchScreenDevice = modelOfTouchScreenDevice;
    this.colorOfTouchScreenDevice = colorOfTouchScreenDevice;
    this.nameCpuOfTouchScreenDevice = nameCpuOfTouchScreenDevice;
    this.displayTypeOfTouchScreenDevice = displayTypeOfTouchScreenDevice;
    this.displayResolutionOfTouchScreenDevice = displayResolutionOfTouchScreenDevice;
    this.ramOfTouchScreenDevice = ramOfTouchScreenDevice;
    this.memoryOfTouchScreenDevice = memoryOfTouchScreenDevice;
    this.quantityCoresCpuOfTouchScreenDevice = quantityCoresCpuOfTouchScreenDevice;
    }

    public void identifyOperationSystem() {
        String operationSystem;
        switch (brandOfTouchScreenDevice) {
            case "Samsung":
                operationSystem = "Android";
                break;
            case "iPhone":
                operationSystem = "IOS";
                break;
            case "Microsoft":
                operationSystem = "Windows phone";
                break;
        }

    }

    public void displayAction() {
        String displaySwipe;
        switch (displayTypeOfTouchScreenDevice) {
            case "Swipe left":
                displaySwipe = "Turn the screen to the right";
                break;
            case "Swipe right":
                displaySwipe = "Turn the screen to the left";
                break;
            case "Swipe down":
                displaySwipe = "Turn the screen to the top";
                break;
            case "Swipe up":
                displaySwipe = "Turn the screen to the bottom";

        }
    }

    public void applicationsOnScreen() {
        String[] mainScreen = {"Application on main screen :", "Weather widget", "Youtube", "Viber", "Telegram", "discord"};
        for (String i : mainScreen) {
            System.out.println(i);
        }
    }


    public void displayInformationOfTouchScreenDevices() {
        System.out.println("Brand of touch screen device : " + brandOfTouchScreenDevice);
        System.out.println("Model of touch screen device : " + modelOfTouchScreenDevice);
        System.out.println("Color of touch screen device : " + colorOfTouchScreenDevice);
        System.out.println("Name cpu of touch screen device : " + nameCpuOfTouchScreenDevice);
        System.out.println("Display type of touch screen device : " + displayTypeOfTouchScreenDevice);
        System.out.println("Display resolution of touch screen device : " + displayResolutionOfTouchScreenDevice);
        System.out.println("Ram of touch screen device : " + ramOfTouchScreenDevice);
        System.out.println("Memory of touch screen device : " + memoryOfTouchScreenDevice);
        System.out.println("Quantity cores cpu of touch screen device : " + quantityCoresCpuOfTouchScreenDevice);
    }



    public String getBrandOfTouchScreenDevice() {
        return brandOfTouchScreenDevice;
    }

    public void setBrandOfTouchScreenDevice(String brandOfTouchScreenDevice) {
        this.brandOfTouchScreenDevice = brandOfTouchScreenDevice;
    }

    public String getModelOfTouchScreenDevice() {
        return modelOfTouchScreenDevice;
    }

    public void setModelOfTouchScreenDevice(String modelOfTouchScreenDevice) {
        this.modelOfTouchScreenDevice = modelOfTouchScreenDevice;
    }

    public String getColorOfTouchScreenDevice() {
        return colorOfTouchScreenDevice;
    }

    public void setColorOfTouchScreenDevice(String colorOfTouchScreenDevice) {
        this.colorOfTouchScreenDevice = colorOfTouchScreenDevice;
    }

    public String getNameCpuOfTouchScreenDevice() {
        return nameCpuOfTouchScreenDevice;
    }

    public void setNameCpuOfTouchScreenDevice(String nameCpuOfTouchScreenDevice) {
        this.nameCpuOfTouchScreenDevice = nameCpuOfTouchScreenDevice;
    }

    public String getDisplayTypeOfTouchScreenDevice() {
        return displayTypeOfTouchScreenDevice;
    }

    public void setDisplayTypeOfTouchScreenDevice(String displayTypeOfTouchScreenDevice) {
        this.displayTypeOfTouchScreenDevice = displayTypeOfTouchScreenDevice;
    }

    public String getDisplayResolutionOfTouchScreenDevice() {
        return displayResolutionOfTouchScreenDevice;
    }

    public void setDisplayResolutionOfTouchScreenDevice(String displayResolutionOfTouchScreenDevice) {
        this.displayResolutionOfTouchScreenDevice = displayResolutionOfTouchScreenDevice;
    }

    public int getRamOfTouchScreenDevice() {
        return ramOfTouchScreenDevice;
    }

    public void setRamOfTouchScreenDevice(int ramOfTouchScreenDevice) {
        this.ramOfTouchScreenDevice = ramOfTouchScreenDevice;
    }

    public int getMemoryOfTouchScreenDevice() {
        return memoryOfTouchScreenDevice;
    }

    public void setMemoryOfTouchScreenDevice(int memoryOfTouchScreenDevice) {
        this.memoryOfTouchScreenDevice = memoryOfTouchScreenDevice;
    }

    public int getQuantityCoresCpuOfTouchScreenDevice() {
        return quantityCoresCpuOfTouchScreenDevice;
    }

    public void setQuantityCoresCpuOfTouchScreenDevice(int quantityCoresCpuOfTouchScreenDevice) {
        this.quantityCoresCpuOfTouchScreenDevice = quantityCoresCpuOfTouchScreenDevice;
    }



    public static void main(String[] args) {
        TouchScreenDevices productOne = new TouchScreenDevices("Samsung", "M12", "Green", "Exynos 850", "PLS", "1600x720", 4, 64, 8);
        productOne.displayInformationOfTouchScreenDevices();
        productOne.applicationsOnScreen();
    }

}