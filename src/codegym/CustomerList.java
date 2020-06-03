package codegym;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static CustomerList icon;
    List<Customer>list=new ArrayList<>();
    public CustomerList(){
        List<Customer>list=new ArrayList<>();
        list.add(new Customer(1,"lực","19","Thanh Hóa"));
        list.add(new Customer(2,"long","19","Thanh Hóa"));
        list.add(new Customer(3,"linh","19","Thanh Hóa"));
        list.add(new Customer(4,"lương","19","Thanh Hóa"));
        list.add(new Customer(5,"lăng","19","Thanh Hóa"));
    }
    public static CustomerList getInstance(){
        if (icon==null){
            icon=new CustomerList();
        }
        return icon;
    }
    public List<Customer>getList(){
        return list;
    }
}
