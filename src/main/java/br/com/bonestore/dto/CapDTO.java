package br.com.bonestore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;

@Getter
@Setter
public class CapDTO {
    private Long skuId;
    private String name;
    private String seller;
    private URL thumbnailHd;
    private Integer inStock;
}
