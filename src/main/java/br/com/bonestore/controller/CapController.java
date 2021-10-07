package br.com.bonestore.controller;

import br.com.bonestore.model.Cap;
import br.com.bonestore.repository.CapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cap")
public class CapController {

    @Autowired
    private CapRepository capRepository;

    @GetMapping("/all")
    public List<Cap> getAllCaps(){
        return this.capRepository.findAll();
    }
}
