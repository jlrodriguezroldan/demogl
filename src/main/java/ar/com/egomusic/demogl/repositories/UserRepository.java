/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.repositories;

import ar.com.egomusic.demogl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lemon
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByEmailIgnoreCase(String email);
    
}
