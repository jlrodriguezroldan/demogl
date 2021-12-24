/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.services;

import ar.com.egomusic.demogl.dto.UserSignUpDTO;
import ar.com.egomusic.demogl.repositories.UserRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author lemon
 */
@Service
public class UserService {
    
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public void insertUserSignUpDTO(){
        UserSignUpDTO userSignUpDTO = UserSignUpDTO.builder().name("String").build();
        
    }
    
}
