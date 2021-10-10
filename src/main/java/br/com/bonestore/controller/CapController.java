package br.com.bonestore.controller;

import br.com.bonestore.controller.interfaces.CapIntSwagger;
import br.com.bonestore.dto.CapDTO;
import br.com.bonestore.service.CapService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@Api("API para gerenciamento de bonés")
@RestController
@RequestMapping("/cap")
public class CapController implements CapIntSwagger {

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
