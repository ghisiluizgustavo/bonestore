package br.com.bonestore.service;

import br.com.bonestore.dto.CapDTO;
import br.com.bonestore.model.Cap;
import br.com.bonestore.repository.CapRepository;
import br.com.bonestore.util.ConverterModelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CapService {

    @Autowired
    private CapRepository capRepository;

    public ResponseEntity<List<CapDTO>> getAllCaps(){
       List<Cap> caps = this.capRepository.findAll();
        List<CapDTO> capDTOS = ConverterModelDTO.convertModelToDTO(caps);
        if(capDTOS.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(capDTOS);
    }
}
