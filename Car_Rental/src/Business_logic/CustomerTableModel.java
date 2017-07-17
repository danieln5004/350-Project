/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_logic;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author shado
 */
public class CustomerTableModel extends AbstractTableModel {

    private String[] columnNames = {"Name", "Telephone", "Address"};

    private List<Customer> CustomersList = new ArrayList();

    public CustomerTableModel(List<Customer> customers) {
        
        this.CustomersList = customers;

    }
    
    @Override
    public int getRowCount() {
        return CustomersList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
                return CustomersList.get(rowIndex).getName();
        }
        
        if (columnIndex == 1) {
                return CustomersList.get(rowIndex).getPhone();
        }
        
        return CustomersList.get(rowIndex).getAddress();
    }
 
    
    public Customer getCustomer(int rowIndex) {
        return CustomersList.get(rowIndex);
    }
}

