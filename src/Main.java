import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,88,766,879,891, 987,988,5554));

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.findNumber(numbersList, 56));

    }
}
