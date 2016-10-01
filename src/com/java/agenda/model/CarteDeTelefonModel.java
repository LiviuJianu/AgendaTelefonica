package com.java.agenda.model;

import com.java.agenda.controller.AbonatObserver;

import java.util.ArrayList;
import java.util.List;

public class CarteDeTelefonModel {

    private List<AbonatObserver> abonatObservers = new ArrayList<>();
    private List<Abonat> abonati;

    public CarteDeTelefonModel() {
        abonati = new ArrayList<>();
        init();
    }

    private void init() {
        NrTelefon tel = new NrMobil("0723456789");
        Abonat a1 = new Abonat(1, "Ion", "Popescu", "1780909322231", tel);
        Abonat a2 = new Abonat(2, "Dan", "Antonescu", "1881109322231", tel);
        Abonat a3 = new Abonat(3, "Mihai", "Moraru", "1940315322231", tel);

        abonati.add(a1);
        abonati.add(a2);
        abonati.add(a3);
    }

    public List<Abonat> getListaAbonati() {
        return abonati;
    }


    public void registerObserver(AbonatObserver abonatObserver) {
        abonatObservers.add(abonatObserver);
    }

    public void removeObserver(AbonatObserver abonatObserver) {
        if (abonatObservers.contains(abonatObserver)) {
            abonatObservers.remove(abonatObserver);
        }
    }

    public void notifyAbonatObservers() {
        for (int i = 0; i < abonatObservers.size(); i++) {
            AbonatObserver abonatObserver = abonatObservers.get(i);
            abonatObserver.uppdateAbonat();
        }
    }

}
