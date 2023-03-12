package bo;

import dao.custom.ItemDAO;
import dao.custom.impl.ItemDAOImpl;
import model.CustomerDTO;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl {

    ItemDAO itemDAO = new ItemDAOImpl();

    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    public  boolean deleteItems(String code) throws SQLException, ClassNotFoundException{
        return itemDAO.delete(code);
    }

    public boolean saveItems(ItemDTO dto) throws SQLException, ClassNotFoundException{
        return itemDAO.save(dto);
    }

    public boolean updateItems(ItemDTO dto) throws SQLException, ClassNotFoundException{
        return itemDAO.update(dto);
    }

    public boolean exitsItems(String code) throws SQLException, ClassNotFoundException{
        return itemDAO.exist(code);
    }

    public String generateItemId() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewId();
    }
}
