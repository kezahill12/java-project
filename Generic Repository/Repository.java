import java.util.List;
import java.util.ArrayList;

public class Repository<T>{

    List<T> item = new ArrayList<>();

    public void save(T item){
        this.item.add(item);
    }
    public List<T> findAll(){
        return item;
    }
    public void findByIndex(int index){
        if (index >= 0 && index < item.size()) {
            System.out.println("Item at index " + index + ": " + item.get(index));
        }
        else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + item.size());
        }
    }

    public void  delete(int index){
        if (index >= 0 && index < item.size()) {
            item.remove(index);
            System.out.println("Item at index " + index + " has been deleted.");
        }
        else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + item.size());
        }
    }
}