import java.util.*;

public class BinarySearch {

    public boolean search(ArrayList<Integer> list, int item){
        int low = 0;
        int high = list.size() - 1;
        int mid = 0;

        int guess = 0;

        while(low <= high){
            mid = (low + high) / 2;
            guess = list.get(mid);

            if(guess == item){
                return true;
            }else if(guess > item){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }


    public static void main(String[] args){
        BinarySearch mySearch = new BinarySearch();
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
    
        System.out.println("\n" + mySearch.search(myList, 4));
        System.out.println(mySearch.search(myList, 1));
        System.out.println(mySearch.search(myList, 3));
    
    }
}

