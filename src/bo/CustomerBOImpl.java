package bo;

import dao.custom.CustomerDAO;
import dao.custom.impl.CustomerDAOImpl;
import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImpl();

    @Override
    public ArrayList<CustomerDTO>  getAllCustomers() throws SQLException, ClassNotFoundException {
       return customerDAO.getAll();
    }

    @Override
    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException{
       return customerDAO.save(dto);
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException{
        return customerDAO.update(dto);
    }

    @Override
    public boolean exitsCustomer(String id) throws SQLException, ClassNotFoundException{
        return customerDAO.exist(id);
    }

    @Override
    public  boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException{
        return customerDAO.delete(id);
    }

    @Override
    public String generateCustomerId() throws SQLException, ClassNotFoundException {
        return customerDAO.generateNewId();
    }

}
