public class Food {
    private String nameOfFood;
    private String colorOfFood;
    private String shapeOfFood;
    private String typeOfFood;
    private String shellOfFood;
    private double proteinsOfFood;
    private double carbohydratesOfFood;
    private double fatsOfFood;
    private int weightOfFood;
    private int kilocaloriesOfFood;


    public Food(String nameOfFood, String colorOfFood, String shapeOfFood, String typeOfFood, String shellOfFood, double proteinsOfFood, double carbohydratesOfFood, double fatsOfFood, int weightOfFood, int kilocaloriesOfFood) {
        this.nameOfFood = nameOfFood;
        this.colorOfFood = colorOfFood;
        this.shapeOfFood = shapeOfFood;
        this.typeOfFood = typeOfFood;
        this.shellOfFood = shellOfFood;
        this.proteinsOfFood = proteinsOfFood;
        this.carbohydratesOfFood = carbohydratesOfFood;
        this.fatsOfFood = fatsOfFood;
        this.weightOfFood = weightOfFood;
        this.kilocaloriesOfFood = kilocaloriesOfFood;
    }

    public void identifyAppleVariety(){
        String appleVariety;
        switch (colorOfFood) {
            case "Red":
                appleVariety = "Jonathan";
                break;
            case "Yellow":
                appleVariety = "Golden Delicious";
                break;
            case "Green":
                appleVariety = "Granny Smith";
                break;
        }
    }

    public void weightLevel(){
        if (weightOfFood < 140)
            System.out.println("Low");
        else if (weightOfFood < 180)
            System.out.println("Middle");
        else if (weightOfFood > 220)
            System.out.println("High");
        else
            System.out.println("Invalid weight");
    }

    public void energyValueLevel() {
        String energyLevelValue;
        switch (kilocaloriesOfFood) {
            case 100:
                energyLevelValue = "Low";
                break;
            case 250:
                energyLevelValue = "Middle";
                break;
            case 350:
                energyLevelValue = "High";
                break;
        }
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public String getColorOfFood() {
        return colorOfFood;
    }

    public void setColorOfFood(String colorOfFood) {
        this.colorOfFood = colorOfFood;
    }

    public String getShapeOfFood() {
        return shapeOfFood;
    }

    public void setShapeOfFood(String shapeOfFood) {
        this.shapeOfFood = shapeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getShellOfFood() {
        return shellOfFood;
    }

    public void setShellOfFood(String shellOfFood) {
        this.shellOfFood = shellOfFood;
    }

    public double getProteinsOfFood() {
        return proteinsOfFood;
    }

    public void setProteinsOfFood(double proteinsOfFood) {
        this.proteinsOfFood = proteinsOfFood;
    }

    public double getCarbohydratesOfFood() {
        return carbohydratesOfFood;
    }

    public void setCarbohydratesOfFood(double carbohydratesOfFood) {
        this.carbohydratesOfFood = carbohydratesOfFood;
    }

    public double getFatsOfFood() {
        return fatsOfFood;
    }

    public void setFatsOfFood(double fatsOfFood) {
        this.fatsOfFood = fatsOfFood;
    }

    public int getWeightOfFood() {
        return weightOfFood;
    }

    public void setWeightOfFood(int weightOfFood) {
        this.weightOfFood = weightOfFood;
    }

    public int getKilocaloriesOfFood() {
        return kilocaloriesOfFood;
    }

    public void setKilocaloriesOfFood(int kilocaloriesOfFood) {
        this.kilocaloriesOfFood = kilocaloriesOfFood;
    }

    public double getTotalCarbohydrateValue(){
        return (carbohydratesOfFood * 100 / weightOfFood + carbohydratesOfFood);
    }



    public double totalProteinsValue(){
        return (proteinsOfFood * 100 / weightOfFood + proteinsOfFood);
    }


    public double totalFatValue(){
        return (fatsOfFood * 100 / weightOfFood + fatsOfFood);
    }




public void displayProductInformation() {
        System.out.println("Name is : " + nameOfFood);
        System.out.println("Color is : " + colorOfFood);
        System.out.println("Shape is : " + shapeOfFood);
        System.out.println("Weight is : " + weightOfFood + " grams");
        System.out.println("Type is : " + typeOfFood);
        System.out.println("Have shell? : " + shellOfFood);
        System.out.println("Proteins is : " + proteinsOfFood);
        System.out.println("Carbohydrates is : " + carbohydratesOfFood);
        System.out.println("Fats is : " + fatsOfFood);
        System.out.println("Kilocalories is : " + kilocaloriesOfFood);
        }

public static void main(String[] args) {
        Food productOne = new Food("apple", "red", "circular", "fruit", "Yes", 3.2, 68 ,0, 176, 273);
        productOne.displayProductInformation();
        System.out.println("Total fat of " + productOne.getNameOfFood() + " is " + productOne.totalFatValue());

    }
}
