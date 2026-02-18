public class Main {
    public static void main(String[] args) {

        Storage<String> stringStorage = new Storage<>(); 
        stringStorage.setItem("Hello, World!");
        System.out.println("String Storage: " + stringStorage.getItem());

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.setItem(42);
        System.out.println("Integer Storage: " + integerStorage.getItem());

        NumberStorage<Integer> intNum = new NumberStorage<>(5);
        System.out.println(intNum.square());
        NumberStorage<Double> doubleNum = new NumberStorage<>(2.5);
        System.out.println(doubleNum.square());

    }
}

