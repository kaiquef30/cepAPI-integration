package com.apicepintegration.apiintegration.service;


import com.apicepintegration.apiintegration.client.ClientIntegration;
import com.apicepintegration.apiintegration.model.CEPClientModel;
import com.apicepintegration.apiintegration.repository.CEPClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CEPClientService {

    private final ClientIntegration clientIntegration;

    private final CEPClientRepository cepClientRepository;


    public CEPClientService(ClientIntegration clientIntegration, CEPClientRepository cepClientRepository) {
        this.clientIntegration = clientIntegration;
        this.cepClientRepository = cepClientRepository;
    }


    public CEPClientModel getCEPSpecified(String cep) {
        CEPClientModel cepClientModel = clientIntegration.getCEPSpecified(cep);
        return cepClientRepository.save(cepClientModel);
    }

    public List<CEPClientModel> searchRegisteredZipCode(){
        return cepClientRepository.findAll();
    }

}
