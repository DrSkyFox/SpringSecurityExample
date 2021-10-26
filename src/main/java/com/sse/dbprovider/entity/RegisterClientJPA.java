package com.sse.dbprovider.entity;

import lombok.*;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.server.authorization.config.ClientSettings;
import org.springframework.security.oauth2.server.authorization.config.TokenSettings;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "register_client")
public class RegisterClientJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientId;

    private Instant clientIdIssuedAt;

    private String clientSecret;

    private Instant clientSecretExpiresAt;

    private String clientName;


    private Set<ClientAuthenticationMethod> clientAuthenticationMethods;

    private Set<AuthorizationGrantType> authorizationGrantTypes;

    private Set<String> redirectUris;

    private Set<String> scopes;

    private ClientSettings clientSettings;

    private TokenSettings tokenSettings;



}
