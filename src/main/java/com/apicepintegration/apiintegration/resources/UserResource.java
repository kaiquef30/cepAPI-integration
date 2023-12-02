package com.apicepintegration.apiintegration.resources;

import com.apicepintegration.apiintegration.model.CEPClientModel;
import com.apicepintegration.apiintegration.service.CEPClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    private final CEPClientService cepClientService;


    public UserResource(CEPClientService cepClientService) {
        this.cepClientService = cepClientService;
    }

    @GetMapping("/allZip-code")
    public ResponseEntity<List<CEPClientModel>> getAllZipCodeRegistered(){
        return ResponseEntity.status(HttpStatus.OK).body(cepClientService.searchRegisteredZipCode());
    }

}
