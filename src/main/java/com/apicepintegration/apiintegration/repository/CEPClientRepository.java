package com.apicepintegration.apiintegration.repository;


import com.apicepintegration.apiintegration.model.CEPClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CEPClientRepository extends JpaRepository<CEPClientModel, UUID> {

}
