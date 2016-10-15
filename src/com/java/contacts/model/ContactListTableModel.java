package com.java.contacts.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

class ContactListTableModel extends AbstractTableModel {

    private List<Contact> listaAbonati;
    private String[] titluColoane = {"Id", "First Name", "Last Name", "CNP", "Phone"};

    ContactListTableModel(List<Contact> listaAbonati) {
        this.listaAbonati = listaAbonati;
    }

    @Override
    public int getRowCount() {
        return listaAbonati.size();
    }

    @Override
    public int getColumnCount() {
        return titluColoane.length;
    }

    @Override
    public String getColumnName(int column) {
        return titluColoane[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contact contact = listaAbonati.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return contact.getId();
            case 1:
                return contact.getNume();
            case 2:
                return contact.getPrenume();
            case 3:
                return contact.getCnp();
            case 4:
                return contact.getNumarTelefon();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Contact contact = listaAbonati.get(rowIndex);
        switch (columnIndex) {
            case 1:
                contact.setNume((String) aValue);
                break;
            case 2:
                contact.setPrenume((String) aValue);
                break;
            case 3:
                contact.setCnp((String) aValue);
                break;
            case 4:
                contact.setNumarTelefon(PhoneNumberType.getPhoneNumberType((String) aValue));
                break;
        }

        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 0;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return titluColoane[columnIndex].getClass();
    }
}
