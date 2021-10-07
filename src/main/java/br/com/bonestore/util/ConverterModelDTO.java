package br.com.bonestore.util;

import br.com.bonestore.dto.CapDTO;
import br.com.bonestore.model.Cap;

import java.util.ArrayList;
import java.util.List;

public class ConverterModelDTO {

    public static List<CapDTO> convertModelToDTO(List<Cap> caps){
        List<CapDTO> capDTOS = new ArrayList<>();
        caps.forEach(cap -> {
            CapDTO capDTO = new CapDTO();
            capDTO.setName(cap.getName());
            capDTO.setSeller(cap.getSeller());
            capDTO.setThumbnailHd(cap.getThumbnailHd());
            capDTO.setSkuId(cap.getSkuId());
            capDTO.setInStock(cap.getInStock());
            capDTOS.add(capDTO);
        });
        return capDTOS;
    }
}
