import java.util.List;
//Strategy
public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Phone> phoneList, String sortByProperty) {
        System.out.println("Sorting using Bubble Sort by " + sortByProperty + "...");
    }
}
