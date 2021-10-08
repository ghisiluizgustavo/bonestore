package br.com.bonestore.controller;

import br.com.bonestore.dto.CapDTO;
import br.com.bonestore.model.Cap;
import br.com.bonestore.repository.CapRepository;
import br.com.bonestore.service.CapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cap")
public class CapController {

    @Autowired
    private CapService capService;

    @GetMapping("/all")
    public ResponseEntity<List<CapDTO>> getAllCaps(){
        return this.capService.getAllCaps();
    }
}
