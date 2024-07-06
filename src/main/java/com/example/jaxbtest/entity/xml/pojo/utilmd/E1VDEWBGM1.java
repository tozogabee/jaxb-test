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
 *         &lt;element ref="{}NAME"/&gt;
 *         &lt;element ref="{}CODELIST" minOccurs="0"/&gt;
 *         &lt;element ref="{}CODELISTAGENCY" minOccurs="0"/&gt;
 *         &lt;element ref="{}FULLNAME" minOccurs="0"/&gt;
 *         &lt;element ref="{}DOCUMENTNUMBER" minOccurs="0"/&gt;
 *         &lt;element ref="{}VERSION" minOccurs="0"/&gt;
 *         &lt;element ref="{}REVISION" minOccurs="0"/&gt;
 *         &lt;element ref="{}DOCUMENTFUNC" minOccurs="0"/&gt;
 *         &lt;element ref="{}RESPONSETYPE" minOccurs="0"/&gt;
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
    "name",
    "codelist",
    "codelistagency",
    "fullname",
    "documentnumber",
    "version",
    "revision",
    "documentfunc",
    "responsetype"
})
@XmlRootElement(name = "E1VDEWBGM_1")
public class E1VDEWBGM1 {

    @XmlElement(name = "NAME", required = true)
    protected NAME name;
    @XmlElement(name = "CODELIST")
    protected CODELIST codelist;
    @XmlElement(name = "CODELISTAGENCY")
    protected CODELISTAGENCY codelistagency;
    @XmlElement(name = "FULLNAME")
    protected FULLNAME fullname;
    @XmlElement(name = "DOCUMENTNUMBER")
    protected DOCUMENTNUMBER documentnumber;
    @XmlElement(name = "VERSION")
    protected VERSION version;
    @XmlElement(name = "REVISION")
    protected REVISION revision;
    @XmlElement(name = "DOCUMENTFUNC")
    protected DOCUMENTFUNC documentfunc;
    @XmlElement(name = "RESPONSETYPE")
    protected RESPONSETYPE responsetype;
    @XmlAttribute(name = "SEGMENT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String segment;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NAME }
     *     
     */
    public NAME getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAME }
     *     
     */
    public void setNAME(NAME value) {
        this.name = value;
    }

    /**
     * Gets the value of the codelist property.
     * 
     * @return
     *     possible object is
     *     {@link CODELIST }
     *     
     */
    public CODELIST getCODELIST() {
        return codelist;
    }

    /**
     * Sets the value of the codelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODELIST }
     *     
     */
    public void setCODELIST(CODELIST value) {
        this.codelist = value;
    }

    /**
     * Gets the value of the codelistagency property.
     * 
     * @return
     *     possible object is
     *     {@link CODELISTAGENCY }
     *     
     */
    public CODELISTAGENCY getCODELISTAGENCY() {
        return codelistagency;
    }

    /**
     * Sets the value of the codelistagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODELISTAGENCY }
     *     
     */
    public void setCODELISTAGENCY(CODELISTAGENCY value) {
        this.codelistagency = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link FULLNAME }
     *     
     */
    public FULLNAME getFULLNAME() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link FULLNAME }
     *     
     */
    public void setFULLNAME(FULLNAME value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTNUMBER }
     *     
     */
    public DOCUMENTNUMBER getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTNUMBER }
     *     
     */
    public void setDOCUMENTNUMBER(DOCUMENTNUMBER value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VERSION }
     *     
     */
    public VERSION getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERSION }
     *     
     */
    public void setVERSION(VERSION value) {
        this.version = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link REVISION }
     *     
     */
    public REVISION getREVISION() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link REVISION }
     *     
     */
    public void setREVISION(REVISION value) {
        this.revision = value;
    }

    /**
     * Gets the value of the documentfunc property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTFUNC }
     *     
     */
    public DOCUMENTFUNC getDOCUMENTFUNC() {
        return documentfunc;
    }

    /**
     * Sets the value of the documentfunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTFUNC }
     *     
     */
    public void setDOCUMENTFUNC(DOCUMENTFUNC value) {
        this.documentfunc = value;
    }

    /**
     * Gets the value of the responsetype property.
     * 
     * @return
     *     possible object is
     *     {@link RESPONSETYPE }
     *     
     */
    public RESPONSETYPE getRESPONSETYPE() {
        return responsetype;
    }

    /**
     * Sets the value of the responsetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPONSETYPE }
     *     
     */
    public void setRESPONSETYPE(RESPONSETYPE value) {
        this.responsetype = value;
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
