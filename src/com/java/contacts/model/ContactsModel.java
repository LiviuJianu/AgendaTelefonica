package com.java.contacts.model;

import com.java.contacts.controller.ContactObserver;

import java.util.ArrayList;
import java.util.List;

public class ContactsModel {

    private List<ContactObserver> contactObservers = new ArrayList<>();
    private List<Contact> listaAbonati;
    private ContactsTableModel contactsTableModel;

    public ContactsModel() {
        listaAbonati = new ArrayList<>();
        init();
    }

    private void init() {
        Phone tel = new MobilePhone("0723456789");
        Contact a1 = new Contact("1", "Ion", "Popescu", "1780909322231", tel);
        Contact a2 = new Contact("2", "Dan", "Antonescu", "1881109322231", tel);
        Contact a3 = new Contact("3", "Mihai", "Moraru", "1940315322231", tel);

        listaAbonati.add(a1);
        listaAbonati.add(a2);
        listaAbonati.add(a3);

        contactsTableModel = new ContactsTableModel(listaAbonati);
    }

    public void addAbonat(Contact contact) {
        listaAbonati.add(contact);
        contactsTableModel.abonatAdded();
        notifyAbonatObservers();
    }


    public void removeAbonat(Contact contact) {
        if(listaAbonati.contains(contact)){
            listaAbonati.remove(contact);
            contactsTableModel.abonatRemoved();
            notifyAbonatObservers();
        }
    }

    public List<Contact> getListaAbonati() {
        return listaAbonati;
    }


    public void registerObserver(ContactObserver contactObserver) {
        contactObservers.add(contactObserver);
    }

    public void removeObserver(ContactObserver contactObserver) {
        if (contactObservers.contains(contactObserver)) {
            contactObservers.remove(contactObserver);
        }
    }

    private void notifyAbonatObservers() {
        for (ContactObserver contactObserver : contactObservers) {
            contactObserver.uppdateContact();
        }
    }

    public ContactsTableModel getContactsTableModel() {
        return contactsTableModel;
    }
}
