//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.06 at 02:51:29 PM CEST 
//


package com.example.jaxbtest.entity.xml.pojo.utilmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}CATEGORY"/&gt;
 *         &lt;element ref="{}CATEGORY_CODE_LIST_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}CATEGORY_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}STATUS_DESCRIPTION_CODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}STATUS_CODE_LIST_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}STATUS_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}STATUS_DESCRIPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_1_DESCRIPTION_CODE"/&gt;
 *         &lt;element ref="{}REASON_1_CODE_LIST_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_1_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_1_DESCRIPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_2_DESCRIPTION_CODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_2_CODE_LIST_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_2_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_2_DESCRIPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_3_DESCRIPTION_CODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_3_CODE_LIST_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_3_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_3_DESCRIPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_4_DESCRIPTION_CODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_4_CODE_LIST_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_4_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_4_DESCRIPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_5_DESCRIPTION_CODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_5_CODE_LIST_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_5_AGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}REASON_5_DESCRIPTION" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SEGMENT"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "category",
    "categorycodelistid",
    "categoryagency",
    "statusdescriptioncode",
    "statuscodelistid",
    "statusagency",
    "statusdescription",
    "reason1DESCRIPTIONCODE",
    "reason1CODELISTID",
    "reason1AGENCY",
    "reason1DESCRIPTION",
    "reason2DESCRIPTIONCODE",
    "reason2CODELISTID",
    "reason2AGENCY",
    "reason2DESCRIPTION",
    "reason3DESCRIPTIONCODE",
    "reason3CODELISTID",
    "reason3AGENCY",
    "reason3DESCRIPTION",
    "reason4DESCRIPTIONCODE",
    "reason4CODELISTID",
    "reason4AGENCY",
    "reason4DESCRIPTION",
    "reason5DESCRIPTIONCODE",
    "reason5CODELISTID",
    "reason5AGENCY",
    "reason5DESCRIPTION"
})
@XmlRootElement(name = "E1VDEWSTS_2")
public class E1VDEWSTS2 {

    @XmlElement(name = "CATEGORY", required = true)
    protected CATEGORY category;
    @XmlElement(name = "CATEGORY_CODE_LIST_ID")
    protected CATEGORYCODELISTID categorycodelistid;
    @XmlElement(name = "CATEGORY_AGENCY")
    protected CATEGORYAGENCY categoryagency;
    @XmlElement(name = "STATUS_DESCRIPTION_CODE")
    protected STATUSDESCRIPTIONCODE statusdescriptioncode;
    @XmlElement(name = "STATUS_CODE_LIST_ID")
    protected STATUSCODELISTID statuscodelistid;
    @XmlElement(name = "STATUS_AGENCY")
    protected STATUSAGENCY statusagency;
    @XmlElement(name = "STATUS_DESCRIPTION")
    protected STATUSDESCRIPTION statusdescription;
    @XmlElement(name = "REASON_1_DESCRIPTION_CODE", required = true)
    protected REASON1DESCRIPTIONCODE reason1DESCRIPTIONCODE;
    @XmlElement(name = "REASON_1_CODE_LIST_ID")
    protected REASON1CODELISTID reason1CODELISTID;
    @XmlElement(name = "REASON_1_AGENCY")
    protected REASON1AGENCY reason1AGENCY;
    @XmlElement(name = "REASON_1_DESCRIPTION")
    protected REASON1DESCRIPTION reason1DESCRIPTION;
    @XmlElement(name = "REASON_2_DESCRIPTION_CODE")
    protected REASON2DESCRIPTIONCODE reason2DESCRIPTIONCODE;
    @XmlElement(name = "REASON_2_CODE_LIST_ID")
    protected REASON2CODELISTID reason2CODELISTID;
    @XmlElement(name = "REASON_2_AGENCY")
    protected REASON2AGENCY reason2AGENCY;
    @XmlElement(name = "REASON_2_DESCRIPTION")
    protected REASON2DESCRIPTION reason2DESCRIPTION;
    @XmlElement(name = "REASON_3_DESCRIPTION_CODE")
    protected REASON3DESCRIPTIONCODE reason3DESCRIPTIONCODE;
    @XmlElement(name = "REASON_3_CODE_LIST_ID")
    protected REASON3CODELISTID reason3CODELISTID;
    @XmlElement(name = "REASON_3_AGENCY")
    protected REASON3AGENCY reason3AGENCY;
    @XmlElement(name = "REASON_3_DESCRIPTION")
    protected REASON3DESCRIPTION reason3DESCRIPTION;
    @XmlElement(name = "REASON_4_DESCRIPTION_CODE")
    protected REASON4DESCRIPTIONCODE reason4DESCRIPTIONCODE;
    @XmlElement(name = "REASON_4_CODE_LIST_ID")
    protected REASON4CODELISTID reason4CODELISTID;
    @XmlElement(name = "REASON_4_AGENCY")
    protected REASON4AGENCY reason4AGENCY;
    @XmlElement(name = "REASON_4_DESCRIPTION")
    protected REASON4DESCRIPTION reason4DESCRIPTION;
    @XmlElement(name = "REASON_5_DESCRIPTION_CODE")
    protected REASON5DESCRIPTIONCODE reason5DESCRIPTIONCODE;
    @XmlElement(name = "REASON_5_CODE_LIST_ID")
    protected REASON5CODELISTID reason5CODELISTID;
    @XmlElement(name = "REASON_5_AGENCY")
    protected REASON5AGENCY reason5AGENCY;
    @XmlElement(name = "REASON_5_DESCRIPTION")
    protected REASON5DESCRIPTION reason5DESCRIPTION;
    @XmlAttribute(name = "SEGMENT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String segment;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CATEGORY }
     *     
     */
    public CATEGORY getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORY }
     *     
     */
    public void setCATEGORY(CATEGORY value) {
        this.category = value;
    }

    /**
     * Gets the value of the categorycodelistid property.
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYCODELISTID }
     *     
     */
    public CATEGORYCODELISTID getCATEGORYCODELISTID() {
        return categorycodelistid;
    }

    /**
     * Sets the value of the categorycodelistid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYCODELISTID }
     *     
     */
    public void setCATEGORYCODELISTID(CATEGORYCODELISTID value) {
        this.categorycodelistid = value;
    }

    /**
     * Gets the value of the categoryagency property.
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYAGENCY }
     *     
     */
    public CATEGORYAGENCY getCATEGORYAGENCY() {
        return categoryagency;
    }

    /**
     * Sets the value of the categoryagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYAGENCY }
     *     
     */
    public void setCATEGORYAGENCY(CATEGORYAGENCY value) {
        this.categoryagency = value;
    }

    /**
     * Gets the value of the statusdescriptioncode property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSDESCRIPTIONCODE }
     *     
     */
    public STATUSDESCRIPTIONCODE getSTATUSDESCRIPTIONCODE() {
        return statusdescriptioncode;
    }

    /**
     * Sets the value of the statusdescriptioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSDESCRIPTIONCODE }
     *     
     */
    public void setSTATUSDESCRIPTIONCODE(STATUSDESCRIPTIONCODE value) {
        this.statusdescriptioncode = value;
    }

    /**
     * Gets the value of the statuscodelistid property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSCODELISTID }
     *     
     */
    public STATUSCODELISTID getSTATUSCODELISTID() {
        return statuscodelistid;
    }

    /**
     * Sets the value of the statuscodelistid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSCODELISTID }
     *     
     */
    public void setSTATUSCODELISTID(STATUSCODELISTID value) {
        this.statuscodelistid = value;
    }

    /**
     * Gets the value of the statusagency property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSAGENCY }
     *     
     */
    public STATUSAGENCY getSTATUSAGENCY() {
        return statusagency;
    }

    /**
     * Sets the value of the statusagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSAGENCY }
     *     
     */
    public void setSTATUSAGENCY(STATUSAGENCY value) {
        this.statusagency = value;
    }

    /**
     * Gets the value of the statusdescription property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSDESCRIPTION }
     *     
     */
    public STATUSDESCRIPTION getSTATUSDESCRIPTION() {
        return statusdescription;
    }

    /**
     * Sets the value of the statusdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSDESCRIPTION }
     *     
     */
    public void setSTATUSDESCRIPTION(STATUSDESCRIPTION value) {
        this.statusdescription = value;
    }

    /**
     * Gets the value of the reason1DESCRIPTIONCODE property.
     * 
     * @return
     *     possible object is
     *     {@link REASON1DESCRIPTIONCODE }
     *     
     */
    public REASON1DESCRIPTIONCODE getREASON1DESCRIPTIONCODE() {
        return reason1DESCRIPTIONCODE;
    }

    /**
     * Sets the value of the reason1DESCRIPTIONCODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON1DESCRIPTIONCODE }
     *     
     */
    public void setREASON1DESCRIPTIONCODE(REASON1DESCRIPTIONCODE value) {
        this.reason1DESCRIPTIONCODE = value;
    }

    /**
     * Gets the value of the reason1CODELISTID property.
     * 
     * @return
     *     possible object is
     *     {@link REASON1CODELISTID }
     *     
     */
    public REASON1CODELISTID getREASON1CODELISTID() {
        return reason1CODELISTID;
    }

    /**
     * Sets the value of the reason1CODELISTID property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON1CODELISTID }
     *     
     */
    public void setREASON1CODELISTID(REASON1CODELISTID value) {
        this.reason1CODELISTID = value;
    }

    /**
     * Gets the value of the reason1AGENCY property.
     * 
     * @return
     *     possible object is
     *     {@link REASON1AGENCY }
     *     
     */
    public REASON1AGENCY getREASON1AGENCY() {
        return reason1AGENCY;
    }

    /**
     * Sets the value of the reason1AGENCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON1AGENCY }
     *     
     */
    public void setREASON1AGENCY(REASON1AGENCY value) {
        this.reason1AGENCY = value;
    }

    /**
     * Gets the value of the reason1DESCRIPTION property.
     * 
     * @return
     *     possible object is
     *     {@link REASON1DESCRIPTION }
     *     
     */
    public REASON1DESCRIPTION getREASON1DESCRIPTION() {
        return reason1DESCRIPTION;
    }

    /**
     * Sets the value of the reason1DESCRIPTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON1DESCRIPTION }
     *     
     */
    public void setREASON1DESCRIPTION(REASON1DESCRIPTION value) {
        this.reason1DESCRIPTION = value;
    }

    /**
     * Gets the value of the reason2DESCRIPTIONCODE property.
     * 
     * @return
     *     possible object is
     *     {@link REASON2DESCRIPTIONCODE }
     *     
     */
    public REASON2DESCRIPTIONCODE getREASON2DESCRIPTIONCODE() {
        return reason2DESCRIPTIONCODE;
    }

    /**
     * Sets the value of the reason2DESCRIPTIONCODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON2DESCRIPTIONCODE }
     *     
     */
    public void setREASON2DESCRIPTIONCODE(REASON2DESCRIPTIONCODE value) {
        this.reason2DESCRIPTIONCODE = value;
    }

    /**
     * Gets the value of the reason2CODELISTID property.
     * 
     * @return
     *     possible object is
     *     {@link REASON2CODELISTID }
     *     
     */
    public REASON2CODELISTID getREASON2CODELISTID() {
        return reason2CODELISTID;
    }

    /**
     * Sets the value of the reason2CODELISTID property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON2CODELISTID }
     *     
     */
    public void setREASON2CODELISTID(REASON2CODELISTID value) {
        this.reason2CODELISTID = value;
    }

    /**
     * Gets the value of the reason2AGENCY property.
     * 
     * @return
     *     possible object is
     *     {@link REASON2AGENCY }
     *     
     */
    public REASON2AGENCY getREASON2AGENCY() {
        return reason2AGENCY;
    }

    /**
     * Sets the value of the reason2AGENCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON2AGENCY }
     *     
     */
    public void setREASON2AGENCY(REASON2AGENCY value) {
        this.reason2AGENCY = value;
    }

    /**
     * Gets the value of the reason2DESCRIPTION property.
     * 
     * @return
     *     possible object is
     *     {@link REASON2DESCRIPTION }
     *     
     */
    public REASON2DESCRIPTION getREASON2DESCRIPTION() {
        return reason2DESCRIPTION;
    }

    /**
     * Sets the value of the reason2DESCRIPTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON2DESCRIPTION }
     *     
     */
    public void setREASON2DESCRIPTION(REASON2DESCRIPTION value) {
        this.reason2DESCRIPTION = value;
    }

    /**
     * Gets the value of the reason3DESCRIPTIONCODE property.
     * 
     * @return
     *     possible object is
     *     {@link REASON3DESCRIPTIONCODE }
     *     
     */
    public REASON3DESCRIPTIONCODE getREASON3DESCRIPTIONCODE() {
        return reason3DESCRIPTIONCODE;
    }

    /**
     * Sets the value of the reason3DESCRIPTIONCODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON3DESCRIPTIONCODE }
     *     
     */
    public void setREASON3DESCRIPTIONCODE(REASON3DESCRIPTIONCODE value) {
        this.reason3DESCRIPTIONCODE = value;
    }

    /**
     * Gets the value of the reason3CODELISTID property.
     * 
     * @return
     *     possible object is
     *     {@link REASON3CODELISTID }
     *     
     */
    public REASON3CODELISTID getREASON3CODELISTID() {
        return reason3CODELISTID;
    }

    /**
     * Sets the value of the reason3CODELISTID property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON3CODELISTID }
     *     
     */
    public void setREASON3CODELISTID(REASON3CODELISTID value) {
        this.reason3CODELISTID = value;
    }

    /**
     * Gets the value of the reason3AGENCY property.
     * 
     * @return
     *     possible object is
     *     {@link REASON3AGENCY }
     *     
     */
    public REASON3AGENCY getREASON3AGENCY() {
        return reason3AGENCY;
    }

    /**
     * Sets the value of the reason3AGENCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON3AGENCY }
     *     
     */
    public void setREASON3AGENCY(REASON3AGENCY value) {
        this.reason3AGENCY = value;
    }

    /**
     * Gets the value of the reason3DESCRIPTION property.
     * 
     * @return
     *     possible object is
     *     {@link REASON3DESCRIPTION }
     *     
     */
    public REASON3DESCRIPTION getREASON3DESCRIPTION() {
        return reason3DESCRIPTION;
    }

    /**
     * Sets the value of the reason3DESCRIPTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON3DESCRIPTION }
     *     
     */
    public void setREASON3DESCRIPTION(REASON3DESCRIPTION value) {
        this.reason3DESCRIPTION = value;
    }

    /**
     * Gets the value of the reason4DESCRIPTIONCODE property.
     * 
     * @return
     *     possible object is
     *     {@link REASON4DESCRIPTIONCODE }
     *     
     */
    public REASON4DESCRIPTIONCODE getREASON4DESCRIPTIONCODE() {
        return reason4DESCRIPTIONCODE;
    }

    /**
     * Sets the value of the reason4DESCRIPTIONCODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON4DESCRIPTIONCODE }
     *     
     */
    public void setREASON4DESCRIPTIONCODE(REASON4DESCRIPTIONCODE value) {
        this.reason4DESCRIPTIONCODE = value;
    }

    /**
     * Gets the value of the reason4CODELISTID property.
     * 
     * @return
     *     possible object is
     *     {@link REASON4CODELISTID }
     *     
     */
    public REASON4CODELISTID getREASON4CODELISTID() {
        return reason4CODELISTID;
    }

    /**
     * Sets the value of the reason4CODELISTID property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON4CODELISTID }
     *     
     */
    public void setREASON4CODELISTID(REASON4CODELISTID value) {
        this.reason4CODELISTID = value;
    }

    /**
     * Gets the value of the reason4AGENCY property.
     * 
     * @return
     *     possible object is
     *     {@link REASON4AGENCY }
     *     
     */
    public REASON4AGENCY getREASON4AGENCY() {
        return reason4AGENCY;
    }

    /**
     * Sets the value of the reason4AGENCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON4AGENCY }
     *     
     */
    public void setREASON4AGENCY(REASON4AGENCY value) {
        this.reason4AGENCY = value;
    }

    /**
     * Gets the value of the reason4DESCRIPTION property.
     * 
     * @return
     *     possible object is
     *     {@link REASON4DESCRIPTION }
     *     
     */
    public REASON4DESCRIPTION getREASON4DESCRIPTION() {
        return reason4DESCRIPTION;
    }

    /**
     * Sets the value of the reason4DESCRIPTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON4DESCRIPTION }
     *     
     */
    public void setREASON4DESCRIPTION(REASON4DESCRIPTION value) {
        this.reason4DESCRIPTION = value;
    }

    /**
     * Gets the value of the reason5DESCRIPTIONCODE property.
     * 
     * @return
     *     possible object is
     *     {@link REASON5DESCRIPTIONCODE }
     *     
     */
    public REASON5DESCRIPTIONCODE getREASON5DESCRIPTIONCODE() {
        return reason5DESCRIPTIONCODE;
    }

    /**
     * Sets the value of the reason5DESCRIPTIONCODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON5DESCRIPTIONCODE }
     *     
     */
    public void setREASON5DESCRIPTIONCODE(REASON5DESCRIPTIONCODE value) {
        this.reason5DESCRIPTIONCODE = value;
    }

    /**
     * Gets the value of the reason5CODELISTID property.
     * 
     * @return
     *     possible object is
     *     {@link REASON5CODELISTID }
     *     
     */
    public REASON5CODELISTID getREASON5CODELISTID() {
        return reason5CODELISTID;
    }

    /**
     * Sets the value of the reason5CODELISTID property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON5CODELISTID }
     *     
     */
    public void setREASON5CODELISTID(REASON5CODELISTID value) {
        this.reason5CODELISTID = value;
    }

    /**
     * Gets the value of the reason5AGENCY property.
     * 
     * @return
     *     possible object is
     *     {@link REASON5AGENCY }
     *     
     */
    public REASON5AGENCY getREASON5AGENCY() {
        return reason5AGENCY;
    }

    /**
     * Sets the value of the reason5AGENCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON5AGENCY }
     *     
     */
    public void setREASON5AGENCY(REASON5AGENCY value) {
        this.reason5AGENCY = value;
    }

    /**
     * Gets the value of the reason5DESCRIPTION property.
     * 
     * @return
     *     possible object is
     *     {@link REASON5DESCRIPTION }
     *     
     */
    public REASON5DESCRIPTION getREASON5DESCRIPTION() {
        return reason5DESCRIPTION;
    }

    /**
     * Sets the value of the reason5DESCRIPTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASON5DESCRIPTION }
     *     
     */
    public void setREASON5DESCRIPTION(REASON5DESCRIPTION value) {
        this.reason5DESCRIPTION = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENT() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENT(String value) {
        this.segment = value;
    }

}
