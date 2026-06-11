package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.screen.manager.CartScreenController;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aims extends Application {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    @Override
    public void start(Stage primaryStage) throws Exception {
        initData();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/aims/screen/designFXML/cart.fxml"));
        loader.setControllerFactory(type -> {
            if (type == CartScreenController.class) {
                return new CartScreenController(cart, store);
            }
            try {
                return type.newInstance(); // Cho các controller khác nếu có
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        Parent root = loader.load();
        primaryStage.setTitle("AIMS - Project");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void initData() {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Vua Cao Bang", "Game", "Dung Thanh No", 36, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Anh toi do", "Nhan van", "Phung Thanh Do", 87, 24.95f);
        Book book1 = new Book("Kho ga de tem", "Huong dan lam giau", 17.2f);
        book1.addAuthor("Do Mixi");
        CompactDisc cd1 = new CompactDisc("Alo Vu a Vu", "Music", "QNT", 11.9f, "Anh toi");
        cd1.addTrack(new Track("Waiting For Love", 6));
        cd1.addTrack(new Track("The nights", 4));

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(book1);
        store.addMedia(cd1);

        cart.addMedia(dvd1);
        cart.addMedia(book1);
        cart.addMedia(cd1);
    }

    public static void main(String[] args) {
        try {
            launch(args);
        } catch (Exception e) {
            System.err.println("Fatal error during application startup:");
            e.printStackTrace();
        }
    }
}