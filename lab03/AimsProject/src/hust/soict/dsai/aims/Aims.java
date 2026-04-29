package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các đối tượng DVD mới và thêm chúng vào giỏ
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1); // Đã đổi tên hàm thành addMedia

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2); 

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3); 
     // --- TEST ĐA HÌNH: THÊM SÁCH VÀO GIỎ HÀNG ---
        Book book1 = new Book();
        book1.setTitle("Harry Potter");
        book1.setCategory("Fantasy");
        book1.setCost(15.99f);
        book1.addAuthor("J.K. Rowling");
        
        // Nhét sách vào cùng cái giỏ đang chứa DVD
        anOrder.addMedia(book1);

        // In ra danh sách các món đồ trong giỏ và tổng tiền
        System.out.println("Danh sach gio hang hien tai:");
        anOrder.print();
        
        // Test thử xóa một đĩa
        anOrder.removeMedia(dvd2);
        
        // In lại để kiểm tra xem đã xóa thành công chưa
        System.out.println("\nDanh sach sau khi xoa:");
        anOrder.print();
    }
}