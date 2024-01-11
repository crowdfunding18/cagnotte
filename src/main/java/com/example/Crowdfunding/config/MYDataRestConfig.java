package com.example.Crowdfunding.config;

import com.example.Crowdfunding.entities.Cagnotte;
import com.example.Crowdfunding.entities.Catégorie;
import com.example.Crowdfunding.entities.Paiement;
import com.example.Crowdfunding.entities.Utilisateur;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MYDataRestConfig   implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);

        HttpMethod[] theUnsuppotedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        // disable Http methods for PUT, POST, DELETE

        config.getExposureConfiguration()
                .forDomainType(Utilisateur.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions));

        config.getExposureConfiguration()
                .forDomainType(Cagnotte.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions))

                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions));

        // disable Http methods for PUT, POST, DELETE
        config.getExposureConfiguration()
                .forDomainType(Catégorie.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions));


        config.getExposureConfiguration()
                .forDomainType(Paiement.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions));



    }

}
