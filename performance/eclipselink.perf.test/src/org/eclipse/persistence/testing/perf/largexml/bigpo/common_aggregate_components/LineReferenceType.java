/*
 * Copyright (c) 2014, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Martin Vojtek - 2.6.0 - initial implementation
package org.eclipse.persistence.testing.perf.largexml.bigpo.common_aggregate_components;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.testing.perf.largexml.bigpo.line_status_code.LineStatusCodeType;
import org.eclipse.persistence.testing.perf.largexml.bigpo.unspecialized_data_types.IdentifierType;


/**
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:specification:ubl:schema:xsd:CoreComponentParameters-1.0" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0" xmlns:chc="urn:oasis:names:specification:ubl:schema:xsd:ChipCode-1.0" xmlns:chn="urn:oasis:names:specification:ubl:schema:xsd:ChannelCode-1.0" xmlns:cnt="urn:oasis:names:specification:ubl:schema:xsd:CountryIdentificationCode-1.0" xmlns:cur="urn:oasis:names:specification:ubl:schema:xsd:CurrencyCode-1.0" xmlns:ero="urn:oasis:names:specification:ubl:schema:xsd:OperatorCode-1.0" xmlns:lat="urn:oasis:names:specification:ubl:schema:xsd:LatitudeDirectionCode-1.0" xmlns:lon="urn:oasis:names:specification:ubl:schema:xsd:LongitudeDirectionCode-1.0" xmlns:lstat="urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0" xmlns:pty="urn:oasis:names:specification:ubl:schema:xsd:PaymentMeansCode-1.0" xmlns:rsn="urn:oasis:names:specification:ubl:schema:xsd:AllowanceChargeReasonCode-1.0" xmlns:sdt="urn:oasis:names:specification:ubl:schema:xsd:SpecializedDatatypes-1.0" xmlns:sst="urn:oasis:names:specification:ubl:schema:xsd:SubstitutionStatusCode-1.0" xmlns:stat="urn:oasis:names:specification:ubl:schema:xsd:DocumentStatusCode-1.0" xmlns:udt="urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Line Reference. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;identifies a document line and document&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Line Reference&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 *
 *
 * <p>Java class for LineReferenceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LineReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineID" type="{urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0}IdentifierType"/>
 *         &lt;element name="LineStatusCode" type="{urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0}LineStatusCodeType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-1.0}DocumentReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineReferenceType", propOrder = {
    "lineID",
    "lineStatusCode",
    "documentReference"
})
public class LineReferenceType {

    @XmlElement(name = "LineID", required = true)
    protected IdentifierType lineID;
    @XmlElement(name = "LineStatusCode")
    protected LineStatusCodeType lineStatusCode;
    @XmlElement(name = "DocumentReference")
    protected DocumentReferenceType documentReference;

    /**
     * Gets the value of the lineID property.
     *
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *
     */
    public IdentifierType getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     *
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *
     */
    public void setLineID(IdentifierType value) {
        this.lineID = value;
    }

    /**
     * Gets the value of the lineStatusCode property.
     *
     * @return
     *     possible object is
     *     {@link LineStatusCodeType }
     *
     */
    public LineStatusCodeType getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Sets the value of the lineStatusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link LineStatusCodeType }
     *
     */
    public void setLineStatusCode(LineStatusCodeType value) {
        this.lineStatusCode = value;
    }

    /**
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:specification:ubl:schema:xsd:CoreComponentParameters-1.0" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-1.0" xmlns:chc="urn:oasis:names:specification:ubl:schema:xsd:ChipCode-1.0" xmlns:chn="urn:oasis:names:specification:ubl:schema:xsd:ChannelCode-1.0" xmlns:cnt="urn:oasis:names:specification:ubl:schema:xsd:CountryIdentificationCode-1.0" xmlns:cur="urn:oasis:names:specification:ubl:schema:xsd:CurrencyCode-1.0" xmlns:ero="urn:oasis:names:specification:ubl:schema:xsd:OperatorCode-1.0" xmlns:lat="urn:oasis:names:specification:ubl:schema:xsd:LatitudeDirectionCode-1.0" xmlns:lon="urn:oasis:names:specification:ubl:schema:xsd:LongitudeDirectionCode-1.0" xmlns:lstat="urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0" xmlns:pty="urn:oasis:names:specification:ubl:schema:xsd:PaymentMeansCode-1.0" xmlns:rsn="urn:oasis:names:specification:ubl:schema:xsd:AllowanceChargeReasonCode-1.0" xmlns:sdt="urn:oasis:names:specification:ubl:schema:xsd:SpecializedDatatypes-1.0" xmlns:sst="urn:oasis:names:specification:ubl:schema:xsd:SubstitutionStatusCode-1.0" xmlns:stat="urn:oasis:names:specification:ubl:schema:xsd:DocumentStatusCode-1.0" xmlns:udt="urn:oasis:names:specification:ubl:schema:xsd:UnspecializedDatatypes-1.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Line Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;associates the Line with a Document&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Line Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

}
