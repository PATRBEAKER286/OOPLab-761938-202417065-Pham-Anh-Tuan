package hust.soict.dsai.aims.screen.manager;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.screen.addItem.AddBookToStoreScreen;
import hust.soict.dsai.aims.screen.addItem.AddCompactDiscToStoreScreen;
import hust.soict.dsai.aims.screen.addItem.AddDigitalVideoDiscToStoreScreen;
import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreManagerScreen extends JFrame{
    private Store store;
    private Cart cart;

    public JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;

    }
    public JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Options");


        JMenuItem viewStore = new JMenuItem("View hust.soict.hedspi.test1.store");
        menu.add(viewStore);
        viewStore.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                StoreManagerScreen.this.dispose();
                new StoreManagerScreen(store);
            }
        });

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBookItem = new JMenuItem("Add Book");
        smUpdateStore.add(addBookItem);
        addBookItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                StoreManagerScreen.this.dispose();
                new AddBookToStoreScreen(store, cart);
            }
        });


        JMenuItem addCDItem = new JMenuItem("Add CD");
        smUpdateStore.add(addCDItem);
        addCDItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                StoreManagerScreen.this.dispose();
                new AddCompactDiscToStoreScreen(store, cart);
            }
        });


        JMenuItem addDVDItem = new JMenuItem("Add DVD");
        smUpdateStore.add(addDVDItem);
        addDVDItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StoreManagerScreen.this.dispose();
                new AddDigitalVideoDiscToStoreScreen(store, cart);
            }
        });
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;

    }

    public JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.BOLD, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;

    }

    public JPanel createCenter(){

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));

        ArrayList<Media> mediaInStore = (ArrayList<Media>) store.getItemsInStore();
        for (Media media : mediaInStore) {
            MediaStore cell = new MediaStore(media);
            center.add(cell);
        }
        return center;

    }
    public StoreManagerScreen(Store store){
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);


        setTitle("Store");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Science Fiction", "The Wachowskis", 136, 19.8f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 18.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.9f);

        CompactDisc cd1 = new CompactDisc("Thriller", "Pop", "Michael Jackson", 40,  "Michael Jackson");
        CompactDisc cd2 = new CompactDisc("Back in Black", "Rock", "AC/DC", 53,  "AC/DC");
        CompactDisc cd3 = new CompactDisc("The Eminem Show", "Hip-Hop", "Eminem", 62, "Eminem");

        Media cd4 = new CompactDisc("The Dark Side of the Moon", "Progressive Rock", "Pink Floyd", 13.25f, "A");
        Media cd5 = new CompactDisc("Back in Blacks", "Rocks", "AC/DsC", 11.99f,"bdc");
        Media dvd4 = new DigitalVideoDisc("Pulp Fiction", "Crime", 10.75f);

        Book book1 = new Book("The Da Vinci Code", "Mystery", 15.50f);
        Book book2 = new Book("To Kill a Mockingbird", "Classic", 12.30f);
        Book book3 = new Book("Algorithms", "Education", 55.00f);


        store.addMedia(dvd1);
        store.addMedia(cd1);

        store.addMedia(dvd2);
        store.addMedia(cd2);

        store.addMedia(dvd3);
        store.addMedia(cd3);

        store.addMedia(cd4);
        store.addMedia(cd5);
        store.addMedia(dvd4);

        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);


        new StoreManagerScreen(store);
    }


    public void btnViewCartPressed(javafx.event.ActionEvent actionEvent) {
        ScreenNavigator.switchScene(actionEvent, "/hust/soict/dsai/aims/screen/Cart.fxml", this.cart, this.store);
    }
}