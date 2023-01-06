package hust.soict.dsai.aims.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1= new DigitalVideoDisc(1,"Cake", "Cooking",
                19.95f,87 , "Gordon Ramsay");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Friends", "Children",
                24.95f, 87, "Kamila Shamsie");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Harry Potter", "Fiction", 18.89f);
        Cart cart = new Cart();
    }
}
