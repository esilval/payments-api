//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.15 at 03:59:53 PM COT 
//


package com.sinapptic.payments.wsdl.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createTransactionPaymentResult" type="{http://www.avisortech.com/eCollectWebservices}createTransactionResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "createTransactionPaymentResult"
})
@XmlRootElement(name = "createTransactionPaymentResponse")
public class CreateTransactionPaymentResponse {

    protected CreateTransactionResponseType createTransactionPaymentResult;

    /**
     * Gets the value of the createTransactionPaymentResult property.
     *
     * @return possible object is
     * {@link CreateTransactionResponseType }
     */
    public CreateTransactionResponseType getCreateTransactionPaymentResult() {
        return createTransactionPaymentResult;
    }

    /**
     * Sets the value of the createTransactionPaymentResult property.
     *
     * @param value allowed object is
     *              {@link CreateTransactionResponseType }
     */
    public void setCreateTransactionPaymentResult(CreateTransactionResponseType value) {
        this.createTransactionPaymentResult = value;
    }

}
