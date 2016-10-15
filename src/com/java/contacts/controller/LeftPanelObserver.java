package com.java.contacts.controller;


import com.java.contacts.model.Contact;

public interface LeftPanelObserver {

    void selectedContactDidChanged(Contact aContact);
}
