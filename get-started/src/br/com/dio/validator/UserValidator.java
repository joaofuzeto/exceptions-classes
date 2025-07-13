package br.com.dio.validator;

import br.com.dio.exception.ValidatorException;
import br.com.dio.model.UserModel;

public class UserValidator {

    private UserValidator() {

    }

    public static void verifyModel(final UserModel model) throws ValidatorException {
        if (stringIsBlank(model.getName()))
            throw new ValidatorException("informe um nome válido");
        if (model.getName().length() <=1)
            throw new ValidatorException("O nome deve ter mais que um caractere");
        if (stringIsBlank(model.getEmail()))
            throw new ValidatorException("informe um e-mail válido");
        if(!model.getEmail().contains("@") || (!model.getEmail().contains(".")))
            throw new ValidatorException("Informe um e-mail válido");
    }

    private static boolean stringIsBlank(final String value){
        return value == null || value.isBlank();
    }

}
