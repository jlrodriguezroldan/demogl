/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.model;

import ar.com.egomusic.demogl.customannotation.EmailConstraint;
import ar.com.egomusic.demogl.customannotation.PasswordConstraint;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

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
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    @EmailConstraint
    private String email;

    @Column(name = "password")
    @PasswordConstraint
    private String password;

    @Column(name = "created")
    @CreationTimestamp
    private LocalDateTime created;

    @Column(name = "lastlogin")
    @UpdateTimestamp
    private LocalDateTime lastLogin;

    @Column(name = "token")
    private String token;

    @Column(name = "active", columnDefinition = "boolean default true")
    private Boolean isActive;

    @OneToMany
    private List<Phone> listPhones;

}
