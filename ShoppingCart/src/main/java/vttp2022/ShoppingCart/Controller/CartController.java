package vttp2022.ShoppingCart.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp2022.ShoppingCart.Model.Cart;

@Controller
//TODO change path
@RequestMapping(path={"/","/tempholder"})
public class CartController {
    private Logger logger = LoggerFactory.getLogger(CartController.class);
    public Cart cart1;
    
    @GetMapping
    public String showCartPage(Model model){
        model.addAttribute("shoppingCart", new Cart());    
        logger.info("Get request done");
        return "cartPage";
    }
    
    @PostMapping
    public String updateCart(@ModelAttribute Model model, Cart cart){
        logger.info("username is>>>"+cart.getUsername());
        if(null!=cart && null!=cart.getUsername()){
            //TODO display cartlist
            logger.info("display cart list");
        }
        return "cartPage";
    }



}
