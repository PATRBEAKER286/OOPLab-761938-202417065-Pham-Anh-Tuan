package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private final int max_Ordereds = 100;
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    public void addMedia(Media media){
        if(itemsInStore.size() < max_Ordereds){
            itemsInStore.add(media);
            System.out.println("has been added");
        }
        else System.out.println("store's full");
    }
    public void removeMedia(Media media){
        if(!itemsInStore.contains(media)){
            System.out.println("Not found!");
        }
        else{
            itemsInStore.remove(media);
            System.out.println("removed");
        }
    }
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
    
}