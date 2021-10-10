package br.com.bonestore.service;

import br.com.bonestore.dto.CapDTO;
import br.com.bonestore.model.Cap;
import br.com.bonestore.repository.CapRepository;
import br.com.bonestore.util.ConverterDtoModel;
import br.com.bonestore.util.ConverterModelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import javax.swing.text.html.Option;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class CapService {

    @Autowired
    private CapRepository capRepository;

    public ResponseEntity<List<CapDTO>> getAllCaps(){
       List<Cap> caps = this.capRepository.findAll();
        List<CapDTO> capDTOS = ConverterModelDTO.convertListModelToDTO(caps);
        if(capDTOS.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(capDTOS);
    }

    public ResponseEntity<CapDTO> getOneCap(Long id){
        Optional<Cap> optionalCap = this.capRepository.findById(id);
        if(optionalCap.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        CapDTO capDTO = ConverterModelDTO.convertModelToDTO(optionalCap.get());
        return ResponseEntity.ok(capDTO);
    }

    public ResponseEntity<CapDTO> postCap(CapDTO capDTO, UriComponentsBuilder uriComponentsBuilder){
        if (capDTO == null){
            return ResponseEntity.badRequest().build();
        }
        Cap capSave = this.capRepository.save(ConverterDtoModel.convertDTOToModel(capDTO));
        URI uri = uriComponentsBuilder.path("/cap/{id}").buildAndExpand(capSave.getSkuId()).toUri();
        return ResponseEntity.created(uri).body(ConverterModelDTO.convertModelToDTO(capSave));
    }
}
