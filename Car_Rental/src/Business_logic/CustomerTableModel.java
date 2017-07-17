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

    private List<Customer> CustomersList;

    public CustomerTableModel() {
        CustomersList = new ArrayList<>();
        CustomersList.add(new Customer("Samir James", "816-878-1111", "6102 NE Antioch Rd"));
        CustomersList.add(new Customer("Kim Sam", "816-847-888", "7123 Main Street"));
        CustomersList.add(new Customer("Mehmet Scholl", "816-444-2387", "12 Rockhil Rd"));

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

