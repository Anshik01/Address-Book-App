package com.AddressBook_App.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class AddressService {

    public ResponseEntity<String> getAddressBook() {
        return new ResponseEntity<>("address book", HttpStatus.OK);
    }

    public ResponseEntity<String> getAddressByID(@PathVariable long id){
        return new ResponseEntity<>("address book", HttpStatus.OK);
    }

    public ResponseEntity<String> postAddress(@RequestBody String address){
        return new ResponseEntity<>("address book", HttpStatus.OK);
    }

    public ResponseEntity<String> putAddress(@PathVariable long id,
                                             @RequestBody String address){
        return new ResponseEntity<>("address book", HttpStatus.OK);
    }

    public ResponseEntity<String> DeleteAddress(@PathVariable long id){
        return new ResponseEntity<>("address book", HttpStatus.OK);
    }
}
