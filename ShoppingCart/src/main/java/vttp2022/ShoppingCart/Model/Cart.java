package vttp2022.ShoppingCart.Model;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    public String username;
    public Cart(){

    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public List<String> getCartContents() {
        return cartContents;
    }
    public void setCartContents(List<String> cartContents) {
        this.cartContents = cartContents;
    }
    public List<String> cartContents = new LinkedList<>();
    
}
