public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // Sức chứa tối đa của giỏ
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; // Mảng chứa đĩa
    private int qtyOrdered = 0; // Số lượng đĩa hiện có trong giỏ

public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
        itemsOrdered[qtyOrdered] = disc; // Thêm đĩa vào vị trí trống tiếp theo
        qtyOrdered++; // Tăng biến đếm lên 1
        System.out.println("The disc has been added.");
    } else {
        System.out.println("The cart is almost full.");
    }
}

//Thêm 2 đĩa cùng lúc
public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    addDigitalVideoDisc(dvd1);
    addDigitalVideoDisc(dvd2);
}

//Thêm một mảng các đĩa
/*
public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    for (int i = 0; i < dvdList.length; i++) {
        addDigitalVideoDisc(dvdList[i]);
    }
}
*/ 
//Thêm số lượng đĩa tùy ý (Varargs)
public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
    for (DigitalVideoDisc disc : dvdList) {
        addDigitalVideoDisc(disc);
    }
}

public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i] == disc) {
            // Dịch các phần tử phía sau lên 1 vị trí
            for (int j = i; j < qtyOrdered - 1; j++) {
                itemsOrdered[j] = itemsOrdered[j + 1];
            }
            itemsOrdered[qtyOrdered - 1] = null; // Xóa tham chiếu ở vị trí cuối cùng
            qtyOrdered--;
            System.out.println("The disc has been removed.");
            return; // Thoát khỏi hàm sau khi xóa xong
        }
    }
    System.out.println("The disc is not in the cart.");
}
public float totalCost() {
    float total = 0;
    for (int i = 0; i < qtyOrdered; i++) {
        total += itemsOrdered[i].getCost();
    }
    return total;
 }
//Hàm in danh sách các đĩa trong giỏ
public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCost() + " $");
    }
    System.out.println("Total cost: " + totalCost() + " $");
    System.out.println("***************************************************");
 }
}