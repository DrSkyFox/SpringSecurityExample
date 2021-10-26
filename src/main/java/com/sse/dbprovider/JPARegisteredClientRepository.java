package com.sse.dbprovider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;

public class JPARegisteredClientRepository implements RegisteredClientRepository {

    private static JpaRepository<RegisteredClient, Long> jpaRepository;


    @Override
    public void save(RegisteredClient registeredClient) {
        jpaRepository.save(registeredClient);
    }

    @Override
    public RegisteredClient findById(String id) {
        return null;
    }

    @Override
    public RegisteredClient findByClientId(String clientId) {
        return null;
    }
}
