package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
   
    private List<String> authors = new ArrayList<String>();

    public Book() {
        // Hàm tạo mặc định
    }
    
    // Thêm tác giả (nếu chưa có trong danh sách)
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author " + authorName + " added.");
        } else {
            System.out.println("Author " + authorName + " already exists.");
        }
    }

    // Xóa tác giả (nếu có trong danh sách)
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author " + authorName + " removed.");
        } else {
            System.out.println("Author " + authorName + " not found.");
        }
    }
 // Ghi đè hàm toString để in thông tin Sách
    @Override
    public String toString() {
        return "Book - " + this.getTitle() + " - " + this.getCategory() + " - Authors: " + authors.toString() + " - " + this.getCost() + " $";
    }
}