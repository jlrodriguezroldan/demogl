/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author lemon
 */
@Data
@Builder
public class PhoneDTO {
    
    private Long number;
    private Integer cityCode;
    private String contryCode;

}
