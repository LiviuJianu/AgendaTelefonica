package com.java.agenda.model;

import com.java.agenda.controller.AbonatObserver;

import java.util.ArrayList;
import java.util.List;

public class CarteDeTelefonModel {

    private List<AbonatObserver> abonatObservers = new ArrayList<>();
    private List<Abonat> listaAbonati;
    private ModelTabelAbonati modelTabelAbonati;

    public CarteDeTelefonModel() {
        listaAbonati = new ArrayList<>();
        init();
    }

    private void init() {
        NrTelefon tel = new NrMobil("0723456789");
        Abonat a1 = new Abonat("1", "Ion", "Popescu", "1780909322231", tel);
        Abonat a2 = new Abonat("2", "Dan", "Antonescu", "1881109322231", tel);
        Abonat a3 = new Abonat("3", "Mihai", "Moraru", "1940315322231", tel);

        listaAbonati.add(a1);
        listaAbonati.add(a2);
        listaAbonati.add(a3);

        modelTabelAbonati = new ModelTabelAbonati(listaAbonati);
    }

    public void addAbonat(Abonat abonat) {
        listaAbonati.add(abonat);
        modelTabelAbonati.abonatAdded();
    }


    public void removeAbonat(Abonat abonat) {
        if(listaAbonati.contains(abonat)){
            listaAbonati.remove(abonat);
            modelTabelAbonati.abonatRemoved();
        }
    }

    public List<Abonat> getListaAbonati() {
        return listaAbonati;
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

    public ModelTabelAbonati getModelTabelAbonati() {
        return modelTabelAbonati;
    }
}
