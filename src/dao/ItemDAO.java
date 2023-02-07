package dao;

import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;
    public boolean saveItems(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean deleteItems(String code) throws SQLException, ClassNotFoundException;
    public boolean updateItems(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean existItems(String code) throws SQLException, ClassNotFoundException;
    public String generateNewId() throws SQLException, ClassNotFoundException;

}
