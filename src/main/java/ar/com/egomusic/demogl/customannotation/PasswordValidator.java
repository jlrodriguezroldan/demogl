/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.egomusic.demogl.customannotation;

import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author sonda
 */
public class PasswordValidator implements ConstraintValidator<PasswordConstraint, String> {

    @Override
    public void initialize(PasswordConstraint password) {
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext cvc) {
        if (password != null) {
            if (password.length() > 7 && password.length() < 13) {
//                String regex = "^.*[A-Z].*$";
                String regex = "^[a-z]*[A-Z][a-z]*$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(password);
                if (matcher.matches()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
