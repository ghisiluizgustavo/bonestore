package br.com.bonestore.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class TokenDTO {

    private String type;
    private String token;

    public TokenDTO(String type, String token) {
        this.type = type;
        this.token = token;
    }
}

