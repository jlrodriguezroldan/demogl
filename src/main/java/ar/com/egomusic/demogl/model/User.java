/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author sonda
 */
@Entity
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    String id;
    @Column(name = "name")
    String name;
    @Column(name = "email")
    @Email(message = "Email should be valid")
    String email;
    @Column(name = "password")
    
    String password;
    @OneToMany
    List<Phone> listPhones;

}
