//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.15 at 03:59:53 PM COT 
//


package com.sinapptic.payments.wsdl.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTransactionInformationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getTransactionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransactionInformationType", propOrder = {
        "entityCode",
        "ticketId"
})
public class GetTransactionInformationType {

    @XmlElement(name = "EntityCode")
    protected String entityCode;
    @XmlElement(name = "TicketId")
    protected String ticketId;

    /**
     * Gets the value of the entityCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityCode() {
        return entityCode;
    }

    /**
     * Sets the value of the entityCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    /**
     * Gets the value of the ticketId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTicketId(String value) {
        this.ticketId = value;
    }

}
