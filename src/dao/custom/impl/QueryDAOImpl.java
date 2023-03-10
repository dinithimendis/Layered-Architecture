package dao.custom.impl;

import dao.custom.QueryDAO;

import java.sql.SQLException;

public class QueryDAOImpl implements QueryDAO {
    public void searchOrdersByOrderID(String id) throws SQLException, ClassNotFoundException {
        String sql =
                "select orders.oid, orders.date, orders.customerId, orderDetails.itemCode, orderDetails.qty, orderDetails.unitPrice from orders inner join orderDetails on orders.oid = orderDetails.oid where orders.oid = \"OID-001\";";
    }
}
