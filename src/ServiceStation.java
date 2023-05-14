public interface ServiceStation {
    void check();

     default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
