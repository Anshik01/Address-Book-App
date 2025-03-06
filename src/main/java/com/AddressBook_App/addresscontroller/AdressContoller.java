package com.AddressBook_App.addresscontroller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdressContoller {

    @GetMapping("/get")
    public String getAddressBook() {
        return "addressBook";
    }

}
