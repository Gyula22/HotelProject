package hu.progmatic;

public class Tool {
        protected String type;
        protected int price;
        protected int condition;
        protected boolean electric;
        protected boolean reusable;
        protected boolean furniture;
        protected boolean carWithDriver;
        protected boolean champagne;
        protected boolean freeBreakfast;
        protected boolean fruitPlate;
        protected boolean freeLaundry;
        protected boolean flowerPetals;
        protected boolean strawberryWithChocolate;

    public boolean isCarWithDriver() {
        return carWithDriver;
    }

    public void setCarWithDriver(boolean carWithDriver) {
        this.carWithDriver = carWithDriver;
    }

    public boolean isChampagne() {
        return champagne;
    }

    public void setChampagne(boolean champagne) {
        this.champagne = champagne;
    }

    public boolean isFreeBreakfast() {
        return freeBreakfast;
    }

    public void setFreeBreakfast(boolean freeBreakfast) {
        this.freeBreakfast = freeBreakfast;
    }

    public boolean isFruitPlate() {
        return fruitPlate;
    }

    public void setFruitPlate(boolean fruitPlate) {
        this.fruitPlate = fruitPlate;
    }

    public boolean isFreeLaundry() {
        return freeLaundry;
    }

    public void setFreeLaundry(boolean freeLaundry) {
        this.freeLaundry = freeLaundry;
    }

    public boolean isFlowerPetals() {
        return flowerPetals;
    }

    public void setFlowerPetals(boolean flowerPetals) {
        this.flowerPetals = flowerPetals;
    }

    public boolean isStrawberryWithChocolate() {
        return strawberryWithChocolate;
    }

    public void setStrawberryWithChocolate(boolean strawberryWithChocolate) {
        this.strawberryWithChocolate = strawberryWithChocolate;
    }

    public Tool(String type, int price, int condition, boolean electric, boolean reusable, boolean furniture,
                boolean carWithDriver , boolean freeBreakfast,boolean fruitPlate, boolean flowerPetals, boolean strawberryWithChocolate) {
            this.type = type;
            this.price = price;
            this.condition = condition;
            this.electric = electric;
            this.reusable = reusable;
            this.furniture = furniture;
            this.carWithDriver = carWithDriver;
            this.freeBreakfast = freeBreakfast;
            this.fruitPlate = fruitPlate;
            this.flowerPetals = flowerPetals;
            this.strawberryWithChocolate = strawberryWithChocolate;

        }

        public Tool(boolean furniture) {
            this.furniture = furniture;
        }

        public Tool(String type, int price, int condition, boolean electric, boolean reusable) {
            this.type = type;
            this.price = price;
            this.condition = condition;
            this.electric = electric;
            this.reusable = reusable;
        }

        public boolean isFurniture() {
            return furniture;
        }

        public void setFurniture(boolean furniture) {
            this.furniture = furniture;
        }

        @Override
        public String toString() {
            return "Tool{" +
                    "type='" + type + '\'' +
                    ", price=" + price +
                    ", condition=" + condition +
                    ", electric=" + electric +
                    ", reusable=" + reusable +
                    '}';
        }
    }


