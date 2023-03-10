package dao.custom;

import java.sql.SQLException;

public interface QueryDAO {
    void searchOrdersByOrderID(String id) throws SQLException, ClassNotFoundException;
}
