package hust.soict.dsai.aims.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1= new DigitalVideoDisc(1,"Canyfia", "Animation",
                19.95f,87 , "Tom Lord");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Authentic", "Science Fiction",
                24.95f, 87, "Mione Chris");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.89f);
        Store store = new Store();

    }
}
