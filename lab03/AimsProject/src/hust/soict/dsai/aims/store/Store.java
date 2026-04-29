package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    // Dùng ArrayList chứa Media thay vì mảng DigitalVideoDisc
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    // Đổi tên hàm từ addDVD thành addMedia
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("The media has been added to the store.");
        } else {
            System.out.println("The media is already in the store.");
        }
    }

    // Đổi tên hàm từ removeDVD thành removeMedia
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media); // ArrayList tự động dồn chỗ trống, rất nhàn!
            System.out.println("The media has been removed from the store.");
        } else {
            System.out.println("The media is not in the store.");
        }
    }
}