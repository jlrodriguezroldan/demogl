/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.dto;

import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author lemon
 */
@Data
public class UserFirstLoginDTO {

    private String id;
    private LocalDateTime created;
    private LocalDateTime lastLogin;
    private String token;
    private Boolean isActive;

}
