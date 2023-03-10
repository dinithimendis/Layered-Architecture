package dao.custom.impl;

import dao.SQLUtil;
import dao.custom.QueryDAO;
import model.CustomDTO;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {
    public ArrayList<CustomDTO> searchOrdersByOrderID(String id) throws SQLException, ClassNotFoundException {
        String sql =
                "select orders.oid, orders.date, orders.customerId, orderDetails.itemCode, orderDetails.qty, orderDetails.unitPrice from orders inner join orderDetails on orders.oid = orderDetails.oid where orders.oid = ?;";
        ResultSet rst = SQLUtil.executeQuery(sql, id);
        ArrayList<CustomDTO> orderRecords = new ArrayList();
        while (rst.next()) {
            String oid = rst.getString(1);
            String date = rst.getString(2);
            String customerId = rst.getString(3);
            String itemCode = rst.getString(4);
            int qty = rst.getInt(5);
            BigDecimal unitPrice = rst.getBigDecimal(6);

            CustomDTO customDTO = new CustomDTO();
            customDTO.setOid(oid);
            customDTO.setOrderDate(LocalDate.now());
            customDTO.setCustomerId(customerId);
            customDTO.setItemCode(itemCode);
            customDTO.setQty(qty);
            customDTO.setUnitPrice(unitPrice);

            orderRecords.add(customDTO);
        }
        return orderRecords;
    }
}
