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
 * <p>Java class for retriesTicketIdType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="retriesTicketIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retriesTicketIdType", propOrder = {
        "ticketId",
        "tranState"
})
public class RetriesTicketIdType {

    @XmlElement(name = "TicketId")
    protected String ticketId;
    @XmlElement(name = "TranState")
    protected String tranState;

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

    /**
     * Gets the value of the tranState property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTranState() {
        return tranState;
    }

    /**
     * Sets the value of the tranState property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTranState(String value) {
        this.tranState = value;
    }

}