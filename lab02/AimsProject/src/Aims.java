
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các đối tượng DVD mới và thêm chúng vào giỏ
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        /*
     // In ra danh sách đĩa và tổng tiền ban đầu
        anOrder.print();

        // Test phần 13: Xóa đĩa dvd2 (Star Wars) khỏi giỏ
        System.out.println("\nTiến hành xóa đĩa Star Wars...");
        anOrder.removeDigitalVideoDisc(dvd2);

        // In lại danh sách sau khi xóa để kiểm tra
        System.out.println("\nGiỏ hàng sau khi xóa:");
        anOrder.print();
        */
        anOrder.addDigitalVideoDisc(dvd1, dvd2); // Test thêm 2 đĩa cùng lúc
        anOrder.addDigitalVideoDisc(dvd3);
	}

}
