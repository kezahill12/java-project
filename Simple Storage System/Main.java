public class Main {
    public static void main(String[] args) {

        Storage<String> stringStorage = new Storage<>(); 
        stringStorage.setItem("Hello, World!");
        System.out.println("String Storage: " + stringStorage.getItem());

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.setItem(42);
        System.out.println("Integer Storage: " + integerStorage.getItem());

        NumberStorage<Dounble> doubleStorage = new NumberStorage<>();
    }
}

