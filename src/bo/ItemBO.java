package bo;

import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;
    public  boolean deleteItems(String code) throws SQLException, ClassNotFoundException;
    public boolean saveItems(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean updateItems(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean exitsItems(String code) throws SQLException, ClassNotFoundException;
    public String generateItemId() throws SQLException, ClassNotFoundException;

}
