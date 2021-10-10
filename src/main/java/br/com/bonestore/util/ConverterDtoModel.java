package br.com.bonestore.util;

import br.com.bonestore.dto.CapDTO;
import br.com.bonestore.model.Cap;

public class ConverterDtoModel {

    public static Cap convertDTOToModel(CapDTO capDTO){
        Cap cap = new Cap();
        cap.setName(capDTO.getName());
        cap.setSeller(capDTO.getSeller());
        cap.setThumbnailHd(capDTO.getThumbnailHd());
        cap.setSkuId(capDTO.getSkuId());
        cap.setInStock(capDTO.getInStock());
        return cap;
    }
}
