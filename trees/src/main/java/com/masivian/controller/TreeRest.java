package com.masivian.controller;

import com.masivian.model.CreateTreeRequest;
import com.masivian.model.GetLCARequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.masivian.service.TreeService;

import javax.validation.Valid;

@RestController()
@RequestMapping("/trees")
public class TreeRest {

    private final TreeService treeService = new TreeService();

    @PostMapping
    public ResponseEntity<Object> createTree(@RequestBody @Valid CreateTreeRequest tree){
        if(treeService.createTree(tree.getNodeElements()) != null){
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/getLowestCommonAncestor")
    public ResponseEntity<Object> getLowestCommonAncestor(@RequestBody @Valid GetLCARequest lcaRequest){
        Integer lcaValue = treeService.getlowestCommonAncestor(lcaRequest.getTreeElements(),
                                lcaRequest.getNodeValue1(), lcaRequest.getNodeValue2());

        if (lcaValue != null) {
            return new ResponseEntity<>(lcaValue, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
