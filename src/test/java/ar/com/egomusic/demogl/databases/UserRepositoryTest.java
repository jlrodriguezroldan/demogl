/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.databases;

import ar.com.egomusic.demogl.model.User;
import ar.com.egomusic.demogl.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

/**
 *
 * @author lemon
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepositor;

    @AfterEach
    public void cleanUp() {
        userRepositor.deleteAll();
    }

    @Test
    @Sql(statements = "insert into User (id, email, password) values('example@example.com','exa8pL2')")
    public void findByEmailIgnoreCaseReturnAUser() {

        User user = userRepositor.findByEmailIgnoreCase("example@example.com");
        Assertions.assertThat(user.getEmail()).isEqualTo("example@example.com");
        Assertions.assertThat(user.getPassword()).isEqualTo("exa8pL2");
    }

}
