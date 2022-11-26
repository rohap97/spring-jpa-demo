package com.example.springjpademo.repo;

import com.example.springjpademo.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepo extends JpaRepository<Branch, Integer> {
}
