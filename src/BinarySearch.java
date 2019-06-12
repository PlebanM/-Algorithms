import java.util.List;

public class BinarySearch {


    public boolean findNumber(List<Integer> numbersList, int guess){
        Integer low = 0;
        Integer high = numbersList.size() - 1;
        Integer mid = 0;
        Boolean isNumberInList = false;
        while(isNumberInList==false) {
            if (high < low){
                break;
            }
            mid = (high + low) / 2;
            if (guess > numbersList.get(mid)) {
                low = mid + 1;
            }
            if (guess < numbersList.get(mid)) {
                high = mid - 1;
            }
            if (guess == numbersList.get(mid)){
                isNumberInList = true;
            }


        }
        return isNumberInList;
    }
}
