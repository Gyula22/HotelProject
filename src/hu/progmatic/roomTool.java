package hu.progmatic;

public class roomTool extends Tool {
    private boolean changeable;


    public roomTool(String type, int price, int condition, boolean electric, boolean reusable,
                    boolean changeable, boolean furniture, boolean champagne, boolean fruitPlate,
                    boolean flowerPetals, boolean strawberryWithChocolate, boolean freeLaundry,boolean carWithDriver, boolean freeBreakfast) {
        super(type, price, condition, electric, reusable, furniture, carWithDriver, freeBreakfast, fruitPlate, flowerPetals, strawberryWithChocolate);
        this.changeable = changeable;
    }
}

