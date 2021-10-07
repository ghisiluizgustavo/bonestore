package br.com.bonestore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.net.URL;

@Entity
@Getter
@Setter
public class Cap {

    @Id
    private Long skuId;
    private String name;
    private String seller;
    private URL thumbnailHd;
    private Integer inStock;
}
