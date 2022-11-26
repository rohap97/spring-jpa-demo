package com.example.springjpademo.repo;

import com.example.springjpademo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo  extends JpaRepository<Address, Integer> {
}
