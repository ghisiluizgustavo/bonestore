package br.com.bonestore.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.*;

@Getter
@Setter
public class CapDTO {
    @NotNull(message = "O id precisa ser preenchido")
    private Long skuId;
    @NotNull(message = "O nome precisa ser preenchido")
    @NotEmpty(message = "O nome precisa ser preenchido")
    @NotBlank(message = "O nome precisa ser preenchido")
    private String name;
    @NotNull(message = "O vendedor precisa ser preenchido")
    @NotEmpty(message = "O vendedor precisa ser preenchido")
    @NotBlank(message = "O vendedor precisa ser preenchido")
    private String seller;
    @NotNull(message = "A URL da imagem precisa ser preenchido")
    @NotEmpty(message = "A URL da imagem precisa ser preenchido")
    @NotBlank(message = "A URL da imagem precisa ser preenchido")
    private String thumbnailHd;
    @NotNull(message = "O status de estoque precisa ser preenchido")
    private Integer inStock;
}
