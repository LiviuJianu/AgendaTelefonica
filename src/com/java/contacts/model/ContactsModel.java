package com.java.contacts.model;

import com.java.contacts.controller.ContactObserver;

import java.util.ArrayList;
import java.util.List;

public class ContactsModel {

    private List<ContactObserver> contactObservers = new ArrayList<>();
    private List<Contact> contactList;
    private ContactsTableModel contactsTableModel;

    public ContactsModel() {
        contactList = new ArrayList<>();
        init();
    }

    private void init() {
        Phone tel = new MobilePhone("0723456789");
        Contact a1 = new Contact("1", "Ion", "Popescu", "1780909322231", tel);
        Contact a2 = new Contact("2", "Dan", "Antonescu", "1881109322231", tel);
        Contact a3 = new Contact("3", "Mihai", "Moraru", "1940315322231", tel);

        contactList.add(a1);
        contactList.add(a2);
        contactList.add(a3);

        contactsTableModel = new ContactsTableModel(contactList);
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
        contactsTableModel.abonatAdded();
        notifyAbonatObservers();
    }


    public void removeAbonat(Contact contact) {
        if(contactList.contains(contact)){
            contactList.remove(contact);
            contactsTableModel.abonatRemoved();
            notifyAbonatObservers();
        }
    }

    public List<Contact> getContactList() {
        return contactList;
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
