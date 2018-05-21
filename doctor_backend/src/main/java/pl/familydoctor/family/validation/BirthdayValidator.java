package pl.familydoctor.family.validation;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BirthdayValidator {

    public Boolean isValid(Date birthDate) {
        if (birthDate.compareTo(new Date()) <= 0) {
            return true;
        }
        return false;
    }
}
