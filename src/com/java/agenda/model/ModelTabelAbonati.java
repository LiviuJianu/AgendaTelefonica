package com.java.agenda.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liviu on 29/09/16.
 */
public class ModelTabelAbonati extends AbstractTableModel {

    private List<Abonat> listaAbonati;
    private String[] titluColoane = {"Id", "Nume", "Prenume", "CNP", "Telefon"};

    public ModelTabelAbonati(List<Abonat> listaAbonati) {
        this.listaAbonati = listaAbonati;
    }

    public void addAbonat(Abonat abonat) {
        listaAbonati.add(abonat);
        fireTableDataChanged();
    }

    public void removeAbonat(Abonat abonat) {
        if (listaAbonati.contains(abonat)) {
            listaAbonati.remove(abonat);
        }
        fireTableDataChanged();
    }

    public List<Abonat> getAbonati() {
        return new ArrayList<>(listaAbonati);
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
        Abonat abonat = listaAbonati.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return abonat.getId();
            case 1:
                return abonat.getNume();
            case 2:
                return abonat.getPrenume();
            case 3:
                return abonat.getCnp();
            case 4:
                return abonat.getNumarTelefon();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Abonat abonat = listaAbonati.get(rowIndex);
        switch (columnIndex) {
            case 0:
                throw new RuntimeException("ID Not Editable");
            case 1:
                abonat.setNume((String) aValue);
                break;
            case 2:
                abonat.setPrenume((String) aValue);
                break;
            case 3:
                abonat.setCnp((String) aValue);
                break;
            case 4:
                abonat.setNumarTelefon(new NrMobil((String) aValue));
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
