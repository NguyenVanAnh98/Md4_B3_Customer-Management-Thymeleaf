package com.example.customermanagementthymeleaf.service;

import com.example.customermanagementthymeleaf.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static final Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Văn Ánh", "ak@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Nhat Huy", "NH@codegym.vn", "Hai Phong"));
        customers.put(3, new Customer(3, "Le Duc", "LD@codegym.vn", "Sai Gon"));
        customers.put(4, new Customer(4, "Phuoc Quy", "PQ@codegym.vn", "Beijing"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "NewYork"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findByID(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
