package com.java.agenda.controller;

import com.java.agenda.model.Abonat;
import com.java.agenda.model.CarteDeTelefonModel;
import com.java.agenda.model.NrTelefon;
import com.java.agenda.model.TipNumarTelefon;
import com.java.agenda.view.BaraMeniu;
import com.java.agenda.view.CarteDeTelefonView;
import com.java.agenda.view.PanouButoane;
import com.java.agenda.view.Reclame;
import com.java.agenda.database.MySQL;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

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



}
