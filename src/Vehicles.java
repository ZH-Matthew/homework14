public abstract class Vehicles implements ServiceStation{
    private final String modelName;
    private final int wheelsCount;

    public Vehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }


    @Override
    public void check() {
        if (this.modelName != null && this.wheelsCount != 0) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                updateTyre();
            }
            if (this.getClass().equals(Car.class) || this.getClass().equals(Truck.class)) {
                checkEngine();
            }
            if (this.getClass().equals(Truck.class)) {
                checkTrailer();
            }
        } else {
            System.out.println("В объекте отсутствуют заполненные поля");
        }
    }
}
