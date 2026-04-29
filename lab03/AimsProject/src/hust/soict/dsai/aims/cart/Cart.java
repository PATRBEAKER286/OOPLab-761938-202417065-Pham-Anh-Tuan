package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    
    // Dùng ArrayList chứa Media
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            if (!itemsOrdered.contains(media)) {
                itemsOrdered.add(media);
                System.out.println("The media has been added to the cart.");
            } else {
                System.out.println("The media is already in the cart.");
            }
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed from the cart.");
        } else {
            System.out.println("The media is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
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

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle() != null && media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found item: " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match is found for title: " + title);
        }
    }
    
    public void searchById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found item: " + media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match is found for ID: " + id);
        }
    }
}