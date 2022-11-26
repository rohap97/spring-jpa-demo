package com.example.springjpademo;

import com.example.springjpademo.entity.Branch;
import com.example.springjpademo.repo.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class BranchService {

    @Autowired
    private IBranchRepo iBranchRepo;

    public Branch createBranch(Branch branch){
        iBranchRepo.save(branch);
        return branch;
    }
}
