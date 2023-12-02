package com.apicepintegration.apiintegration.resources;


import com.apicepintegration.apiintegration.model.CEPClientModel;
import com.apicepintegration.apiintegration.service.CEPClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class CEPClientResource {

    private final CEPClientService cepClientService;

    public CEPClientResource(CEPClientService cepClientService) {
        this.cepClientService = cepClientService;
    }


    @GetMapping("/{cep}")
    public ResponseEntity<CEPClientModel> getCEPSpecified(@PathVariable String cep) {
        return ResponseEntity.status(HttpStatus
                .OK).body(cepClientService.getCEPSpecified(cep));
    }

}
