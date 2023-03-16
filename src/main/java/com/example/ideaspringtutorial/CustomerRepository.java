package com.example.ideaspringtutorial;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
  Customer firstCustomerById(Integer id);
}
