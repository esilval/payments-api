package com.sinapptic.payments.configuration;

import com.sinapptic.payments.wsdl.client.CreateTransactionClient;
import com.sinapptic.payments.wsdl.client.GetTransactionInformationClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ECollectPaymentConfig {

    @Value("${payments.default-url}")
    private String defaultUrl;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.sinapptic.payments.wsdl.generated");
        return jaxb2Marshaller;
    }

    @Bean
    public CreateTransactionClient createTransactionClient() {
        CreateTransactionClient createTransactionClient = new CreateTransactionClient();
        createTransactionClient.setDefaultUri(defaultUrl);
        createTransactionClient.setMarshaller(marshaller());
        createTransactionClient.setUnmarshaller(marshaller());
        return createTransactionClient;
    }

    @Bean
    public GetTransactionInformationClient getTransactionInformationClient() {
        GetTransactionInformationClient getTransactionInformationClient = new GetTransactionInformationClient();
        getTransactionInformationClient.setDefaultUri(defaultUrl);
        getTransactionInformationClient.setMarshaller(marshaller());
        getTransactionInformationClient.setUnmarshaller(marshaller());
        return getTransactionInformationClient;
    }

}
