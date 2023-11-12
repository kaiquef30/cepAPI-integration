package com.apicepintegration.apiintegration.client;

import com.apicepintegration.apiintegration.model.CEPClientModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br")
public interface ClientIntegration {

    @GetMapping(value = "/ws/{cep}/json/")
    CEPClientModel getCEPSpecified(@PathVariable("cep") String cep);

}
