package br.com.bonestore.controller;

import br.com.bonestore.dto.CapDTO;
import br.com.bonestore.model.Cap;
import br.com.bonestore.repository.CapRepository;
import br.com.bonestore.service.CapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.awt.print.Pageable;
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

    @GetMapping("/{id}")
    public ResponseEntity<CapDTO> getOneCap(@PathVariable Long id){
        return this.capService.getOneCap(id);
    }

    @PostMapping("/save")
    public ResponseEntity<CapDTO> postCap(@RequestBody @Valid CapDTO capDTO, UriComponentsBuilder uriBuilder){
        return this.capService.postCap(capDTO, uriBuilder);
    }
}
