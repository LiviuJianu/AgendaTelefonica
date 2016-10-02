package com.java.agenda.controller;

import com.java.agenda.model.CarteDeTelefonModel;
import com.java.agenda.view.CarteDeTelefonView;

public class CarteDeTelefonController {

    private CarteDeTelefonView carteDeTelefonView;
    private CarteDeTelefonModel carteDeTelefonModel;



    public CarteDeTelefonController(CarteDeTelefonModel model) {
        carteDeTelefonModel = model;
        carteDeTelefonView = new CarteDeTelefonView(this, carteDeTelefonModel);
    }

    public void init() {
        carteDeTelefonView.init();
    }


    public void deleteAbonat() {
        carteDeTelefonView.deleteAbonat();

    }

    public void activate() {
        System.out.println("Activated");
    }

    public void save() {
        System.out.println("Saved");
    }

    public void cancelInput() {
        System.out.println("Cancelled");
    }

    public void update() {
        System.out.println("Updated");

    }
}
