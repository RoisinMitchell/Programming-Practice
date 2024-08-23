import java.util.*;

public class Phone_Book {
    private int entryNumber;
    private Map<String, String> phoneBook = new HashMap<>();
    
    public void setEntryNumber(int number){
        this.entryNumber = number;
    }
    
    public void addNumbers(ArrayList<String> names, ArrayList<String> numbers){
        for(int i = 0; i < entryNumber; i++){
            phoneBook.put(names.get(i), numbers.get(i));
        }
    }
    
    public void printNumber(String name){
        if(phoneBook.get(name) != null){
            System.out.println(name + "=" + phoneBook.get(name));
        }else{
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        Phone_Book myPhoneBook = new Phone_Book();
        int entryNumber = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter number of phone book entries you will be adding:"); 
        
        if(in.hasNext()){
            entryNumber = Integer.parseInt(in.nextLine());
            myPhoneBook.setEntryNumber(entryNumber);
        }
        
        System.out.println("Enter contacts in the format (Name Number) and press enter after each:");
        for(int i = 0; i < entryNumber; i++){
            String input = in.nextLine();
            String[] parts = input.split(" ");

            names.add(parts[0]);
            numbers.add(parts[1]);
        }
        
        myPhoneBook.addNumbers(names, numbers);
        
        System.out.println("Enter name for the number you which to retreive: ");
        while(in.hasNext()){
            myPhoneBook.printNumber(in.nextLine());
        }
    }
}