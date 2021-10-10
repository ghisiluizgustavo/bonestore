package br.com.bonestore.controller.interfaces;

import br.com.bonestore.dto.CapDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public interface CapIntSwagger {

    @ApiOperation("Requisição que retorna todos os bonés")
    ResponseEntity<List<CapDTO>> getAllCaps();

    @ApiOperation("Requisição que retorna o boné selecionado")
    ResponseEntity<CapDTO> getOneCap(Long id);

    @ApiOperation("Requisição que salva um boné na base de dados")
    ResponseEntity<CapDTO> postCap(CapDTO capDTO, UriComponentsBuilder uriBuilder);
}
