package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
public class Cart {
    private static final int Max_numbers_ordered = 20;
    private final ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public void addMedia(Media media){
        if(itemsOrdered.size() < Max_numbers_ordered){
            itemsOrdered.add(media);
            System.out.println("has been added");
        }
        else System.out.println("Cart's full");
    }
    public void removeMedia(Media media){
        if(!itemsOrdered.contains(media)){
            System.out.println("Not found");
        }
        else{
            itemsOrdered.remove(media);
            System.out.println("done!");
        }
    }
    public float totalCost(){
        float sum = 0;
        for(Media media : itemsOrdered){
            sum += media.getCost();
        }
        return sum;
    }
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
     public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }
    public void searchById(int id) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m.getId() == id) {
                System.out.println("Found match for ID " + id + ": " + m.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id); 
        }
    }
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m.isMatch(title)) {
                System.out.println("Found match for title '" + title + "': " + m.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title containing: " + title); 
        }
    }

}
