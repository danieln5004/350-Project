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
public class FindCarTableModel extends AbstractTableModel {

    private String[] columnNames = {"Select", "ID", "Make", "Model", "Year", "Size"};

    private List<Car> carsList;

    private List<Boolean> isSelected;

    public FindCarTableModel() {

        carsList = new ArrayList<>();

        carsList.add(new Car("5321", new CarSpec("Nissan", "Altima", 2012, Size.small)));
        carsList.add(new Car("4874", new CarSpec("Nissan", "Altima", 2012, Size.midsize)));
        carsList.add(new Car("1234", new CarSpec("Volks Wagen", "Passat", 2002, Size.large)));
        carsList.add(new Car("4444", new CarSpec("Mercedes", "Benz", 2000, Size.midsize)));

        isSelected = new ArrayList<>();
        isSelected.add(false);
        isSelected.add(false);
        isSelected.add(false);
        isSelected.add(false);

    }

    @Override
    public int getRowCount() {
        return carsList.size();
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
        switch (columnIndex) {
            case 0:
                return Boolean.class;
            case 4:
                return Integer.class;
            default:
                return Size.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return isSelected.get(rowIndex);
            case 1:
                return carsList.get(rowIndex).getID();
            case 2:
                return carsList.get(rowIndex).getSpec().getMake();
            case 3:
                return carsList.get(rowIndex).getSpec().getModel();
            case 4:
                return carsList.get(rowIndex).getSpec().getYear();
            default:
                return carsList.get(rowIndex).getSpec().getSize();
        }

    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (aValue instanceof Boolean) {
            isSelected.set(rowIndex, (Boolean) aValue);
        }
    }
}
