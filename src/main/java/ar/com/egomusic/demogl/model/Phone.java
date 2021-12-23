/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.model;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author sonda
 */
@Entity
@Data
@Builder
public class Phone {
    @Id
    @Column(name = "idPhone")
    Integer id;
    @Column(name = "number")
    Long number;
    @Column(name = "citycode")
    Integer cityCode;
    @Column(name = "contrycode")
    String contryCode;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "fk_idUser")
    private User user;
}
