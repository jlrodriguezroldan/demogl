/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author lemon
 */
@Getter
@Setter
@NoArgsConstructor
public class UserLoginDTO extends UserFirstLoginDTO{
    
    private String id;
    private String name;
    private String email;
    private String password;
    private List<PhoneDTO> listPhoneDTOs;
    
    
}
