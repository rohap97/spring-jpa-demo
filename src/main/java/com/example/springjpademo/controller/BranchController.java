package com.example.springjpademo.controller;

import com.example.springjpademo.entity.Branch;
import com.example.springjpademo.repo.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private IBranchRepo iBranchRepo;


    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranchbyId(@PathVariable Integer id){
        Branch branch = iBranchRepo.findById(id).get();
        return ResponseEntity.ok(branch);
    }

//    @PostMapping
//    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) throws URISyntaxException {
//        branch = createBranch(branch);
//        URI uri = new URI("/branch/" + branch.getId());
//        R
//    }
}
