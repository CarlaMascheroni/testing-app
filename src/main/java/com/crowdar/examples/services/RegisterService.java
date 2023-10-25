package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.RegisterConstants;
import org.springframework.util.Assert;

import java.util.Random;

public class RegisterService extends MobileActionManager {

    public static void registerUser(String email, String name, String lastName, String phone, String pass, String file){
        Random random = new Random();
        String emailAut = email.replace("@", random.nextInt(1,99) + "@");
        String phoneAut = phone.replace(phone, phone + random.nextInt(1,99));
        waitClickable(RegisterConstants.EMAIL_INPUT);
        click(RegisterConstants.EMAIL_INPUT);
        click(RegisterConstants.EMAIL_INPUT);
        setInput(RegisterConstants.EMAIL_INPUT, emailAut);
        waitClickable(RegisterConstants.NAME_INPUT);
        click(RegisterConstants.NAME_INPUT);
        setInput(RegisterConstants.NAME_INPUT, name);
        click(RegisterConstants.LASTNAME_INPUT);
        setInput(RegisterConstants.LASTNAME_INPUT, lastName);
        click(RegisterConstants.PHONE_INPUT);
        setInput(RegisterConstants.PHONE_INPUT, phoneAut);
        click(RegisterConstants.PASS_INPUT);
        setInput(RegisterConstants.PASS_INPUT, pass);
        click(RegisterConstants.CONFIRMPASS_INPUT);
        setInput(RegisterConstants.CONFIRMPASS_INPUT, pass);

        click(RegisterConstants.BUTTON_AVATAR);
        click(RegisterConstants.BUTTON_GALERY);
        click(RegisterConstants.SEARCH_IMAGE);
        setInput(RegisterConstants.SEARCH_IMAGE_INPUT, file);
        click(RegisterConstants.SELECT_IMAGE);

        click(RegisterConstants.BUTTON_REGISTER);

    }

    public static void verifyUserRegister(){
        waitClickable(RegisterConstants.ICON_USER);
        Assert.isTrue(isPresent(RegisterConstants.ICON_USER));
    }
}
