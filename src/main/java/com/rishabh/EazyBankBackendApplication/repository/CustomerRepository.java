package com.rishabh.EazyBankBackendApplication.repository;

import com.rishabh.EazyBankBackendApplication.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
