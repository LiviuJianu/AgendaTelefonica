package com.java.agenda.model;

import com.java.agenda.controller.AbonatObserver;

import java.util.ArrayList;
import java.util.List;

public class CarteDeTelefonModel {

    private List<AbonatObserver> abonatObservers = new ArrayList<>();

    public void registerObserver(AbonatObserver abonatObserver) {
        abonatObservers.add(abonatObserver);
    }

    public void removeObserver(AbonatObserver abonatObserver) {
        if(abonatObservers.contains(abonatObserver)) {
            abonatObservers.remove(abonatObserver);
        }
    }

}
