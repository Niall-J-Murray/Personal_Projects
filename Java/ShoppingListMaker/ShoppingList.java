import java.util.ArrayList;

public class ShoppingList {
    // Using Arrays can be impractical for lists of unknown or changeable lengths.
    // E.G. Below, shopping list length [10] must be known when array is declared.
    //private String[] shoppingListArray = new String[10];
    //Instead, we use ArrayList interface as part of List Collection.
    private ArrayList<String> shoppingList = new ArrayList<>();

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public void addItem(String item) {
        //shoppingListArray[0] = item; //Example of what would be done using array.
        shoppingList.add(item);
    }

    public boolean onList(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

    private int findItem(String searchItem) {
        return shoppingList.indexOf(searchItem);
    }

    public void printList() {
        System.out.println("Shopping list contains " + shoppingList.size() + " items.");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(i + 1 + ". " + shoppingList.get(i));
        }
    }

    public void replaceItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            replaceItem(position, newItem);
        }
    }

    private void replaceItem(int position, String newItem) {
        String removedItem = shoppingList.get(position);
        shoppingList.set(position, newItem);
        System.out.println("Item number " + (position + 1) + "(" + removedItem + ") has been replaced with " + newItem + ".");
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeItem(position);
        }
    }

    private void removeItem(int position) {
        String removedItem = shoppingList.get(position);
        shoppingList.remove(position);
        System.out.println("Item " + (position + 1) + ". " + removedItem + " has been removed.");
    }
}
