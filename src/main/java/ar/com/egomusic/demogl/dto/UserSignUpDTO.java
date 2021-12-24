/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.dto;

import ar.com.egomusic.demogl.customannotation.EmailConstraint;
import ar.com.egomusic.demogl.customannotation.PasswordConstraint;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Singular;

/**
 *
 * @author lemon
 */
@Data
@Builder
public class UserSignUpDTO {

    private String name;

    @EmailConstraint
    private @NonNull String email;

    @PasswordConstraint
    private @NonNull String password;

    private List<PhoneDTO> listPhones;
    
}

