public class NumberStorage<T extends Number> {
    private T number;

    public double setNumber(T Number){
        this.number = number;
    }
    public double getNumber(){
        return number.doubleValue();
    }
    
    public double square(T other){
        return number.doubleValue() * number.doubleValue();
    }
}
