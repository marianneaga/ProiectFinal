package com.Proiect.ProiectFinal.CreateAccount;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/createaccount")
public class Registration extends VerticalLayout{

    public Registration() {
        RegistrationForm registrationForm = new RegistrationForm();
        // Center the RegistrationForm
        setHorizontalComponentAlignment(Alignment.CENTER, registrationForm);

        add(registrationForm);

        RegistrationFormBinder registrationFormBinder = new RegistrationFormBinder(registrationForm);
        registrationFormBinder.addBindingAndValidation();
    }
}
