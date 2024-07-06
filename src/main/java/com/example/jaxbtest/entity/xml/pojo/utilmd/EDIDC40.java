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
 *         &lt;element ref="{}TABNAM"/&gt;
 *         &lt;element ref="{}MANDT" minOccurs="0"/&gt;
 *         &lt;element ref="{}DOCNUM" minOccurs="0"/&gt;
 *         &lt;element ref="{}DOCREL" minOccurs="0"/&gt;
 *         &lt;element ref="{}STATUS" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT"/&gt;
 *         &lt;element ref="{}OUTMOD" minOccurs="0"/&gt;
 *         &lt;element ref="{}EXPRSS" minOccurs="0"/&gt;
 *         &lt;element ref="{}TEST" minOccurs="0"/&gt;
 *         &lt;element ref="{}IDOCTYP"/&gt;
 *         &lt;element ref="{}CIMTYP" minOccurs="0"/&gt;
 *         &lt;element ref="{}MESTYP"/&gt;
 *         &lt;element ref="{}MESCOD" minOccurs="0"/&gt;
 *         &lt;element ref="{}MESFCT" minOccurs="0"/&gt;
 *         &lt;element ref="{}STD" minOccurs="0"/&gt;
 *         &lt;element ref="{}STDVRS" minOccurs="0"/&gt;
 *         &lt;element ref="{}STDMES" minOccurs="0"/&gt;
 *         &lt;element ref="{}SNDPOR"/&gt;
 *         &lt;element ref="{}SNDPRT"/&gt;
 *         &lt;element ref="{}SNDPFC" minOccurs="0"/&gt;
 *         &lt;element ref="{}SNDPRN"/&gt;
 *         &lt;element ref="{}SNDSAD" minOccurs="0"/&gt;
 *         &lt;element ref="{}SNDLAD" minOccurs="0"/&gt;
 *         &lt;element ref="{}RCVPOR"/&gt;
 *         &lt;element ref="{}RCVPRT"/&gt;
 *         &lt;element ref="{}RCVPFC" minOccurs="0"/&gt;
 *         &lt;element ref="{}RCVPRN"/&gt;
 *         &lt;element ref="{}RCVSAD" minOccurs="0"/&gt;
 *         &lt;element ref="{}RCVLAD" minOccurs="0"/&gt;
 *         &lt;element ref="{}CREDAT" minOccurs="0"/&gt;
 *         &lt;element ref="{}CRETIM" minOccurs="0"/&gt;
 *         &lt;element ref="{}REFINT" minOccurs="0"/&gt;
 *         &lt;element ref="{}REFGRP" minOccurs="0"/&gt;
 *         &lt;element ref="{}REFMES" minOccurs="0"/&gt;
 *         &lt;element ref="{}ARCKEY" minOccurs="0"/&gt;
 *         &lt;element ref="{}SERIAL" minOccurs="0"/&gt;
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
    "tabnam",
    "mandt",
    "docnum",
    "docrel",
    "status",
    "direct",
    "outmod",
    "exprss",
    "test",
    "idoctyp",
    "cimtyp",
    "mestyp",
    "mescod",
    "mesfct",
    "std",
    "stdvrs",
    "stdmes",
    "sndpor",
    "sndprt",
    "sndpfc",
    "sndprn",
    "sndsad",
    "sndlad",
    "rcvpor",
    "rcvprt",
    "rcvpfc",
    "rcvprn",
    "rcvsad",
    "rcvlad",
    "credat",
    "cretim",
    "refint",
    "refgrp",
    "refmes",
    "arckey",
    "serial"
})
@XmlRootElement(name = "EDI_DC40")
public class EDIDC40 {

    @XmlElement(name = "TABNAM", required = true)
    protected TABNAM tabnam;
    @XmlElement(name = "MANDT")
    protected MANDT mandt;
    @XmlElement(name = "DOCNUM")
    protected DOCNUM docnum;
    @XmlElement(name = "DOCREL")
    protected DOCREL docrel;
    @XmlElement(name = "STATUS")
    protected STATUS status;
    @XmlElement(name = "DIRECT", required = true)
    protected DIRECT direct;
    @XmlElement(name = "OUTMOD")
    protected OUTMOD outmod;
    @XmlElement(name = "EXPRSS")
    protected EXPRSS exprss;
    @XmlElement(name = "TEST")
    protected TEST test;
    @XmlElement(name = "IDOCTYP", required = true)
    protected IDOCTYP idoctyp;
    @XmlElement(name = "CIMTYP")
    protected CIMTYP cimtyp;
    @XmlElement(name = "MESTYP", required = true)
    protected MESTYP mestyp;
    @XmlElement(name = "MESCOD")
    protected MESCOD mescod;
    @XmlElement(name = "MESFCT")
    protected MESFCT mesfct;
    @XmlElement(name = "STD")
    protected STD std;
    @XmlElement(name = "STDVRS")
    protected STDVRS stdvrs;
    @XmlElement(name = "STDMES")
    protected STDMES stdmes;
    @XmlElement(name = "SNDPOR", required = true)
    protected SNDPOR sndpor;
    @XmlElement(name = "SNDPRT", required = true)
    protected SNDPRT sndprt;
    @XmlElement(name = "SNDPFC")
    protected SNDPFC sndpfc;
    @XmlElement(name = "SNDPRN", required = true)
    protected SNDPRN sndprn;
    @XmlElement(name = "SNDSAD")
    protected SNDSAD sndsad;
    @XmlElement(name = "SNDLAD")
    protected SNDLAD sndlad;
    @XmlElement(name = "RCVPOR", required = true)
    protected RCVPOR rcvpor;
    @XmlElement(name = "RCVPRT", required = true)
    protected RCVPRT rcvprt;
    @XmlElement(name = "RCVPFC")
    protected RCVPFC rcvpfc;
    @XmlElement(name = "RCVPRN", required = true)
    protected RCVPRN rcvprn;
    @XmlElement(name = "RCVSAD")
    protected RCVSAD rcvsad;
    @XmlElement(name = "RCVLAD")
    protected RCVLAD rcvlad;
    @XmlElement(name = "CREDAT")
    protected CREDAT credat;
    @XmlElement(name = "CRETIM")
    protected CRETIM cretim;
    @XmlElement(name = "REFINT")
    protected REFINT refint;
    @XmlElement(name = "REFGRP")
    protected REFGRP refgrp;
    @XmlElement(name = "REFMES")
    protected REFMES refmes;
    @XmlElement(name = "ARCKEY")
    protected ARCKEY arckey;
    @XmlElement(name = "SERIAL")
    protected SERIAL serial;
    @XmlAttribute(name = "SEGMENT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String segment;

    /**
     * Gets the value of the tabnam property.
     * 
     * @return
     *     possible object is
     *     {@link TABNAM }
     *     
     */
    public TABNAM getTABNAM() {
        return tabnam;
    }

    /**
     * Sets the value of the tabnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link TABNAM }
     *     
     */
    public void setTABNAM(TABNAM value) {
        this.tabnam = value;
    }

    /**
     * Gets the value of the mandt property.
     * 
     * @return
     *     possible object is
     *     {@link MANDT }
     *     
     */
    public MANDT getMANDT() {
        return mandt;
    }

    /**
     * Sets the value of the mandt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MANDT }
     *     
     */
    public void setMANDT(MANDT value) {
        this.mandt = value;
    }

    /**
     * Gets the value of the docnum property.
     * 
     * @return
     *     possible object is
     *     {@link DOCNUM }
     *     
     */
    public DOCNUM getDOCNUM() {
        return docnum;
    }

    /**
     * Sets the value of the docnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCNUM }
     *     
     */
    public void setDOCNUM(DOCNUM value) {
        this.docnum = value;
    }

    /**
     * Gets the value of the docrel property.
     * 
     * @return
     *     possible object is
     *     {@link DOCREL }
     *     
     */
    public DOCREL getDOCREL() {
        return docrel;
    }

    /**
     * Sets the value of the docrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCREL }
     *     
     */
    public void setDOCREL(DOCREL value) {
        this.docrel = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STATUS }
     *     
     */
    public STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUS }
     *     
     */
    public void setSTATUS(STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the direct property.
     * 
     * @return
     *     possible object is
     *     {@link DIRECT }
     *     
     */
    public DIRECT getDIRECT() {
        return direct;
    }

    /**
     * Sets the value of the direct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIRECT }
     *     
     */
    public void setDIRECT(DIRECT value) {
        this.direct = value;
    }

    /**
     * Gets the value of the outmod property.
     * 
     * @return
     *     possible object is
     *     {@link OUTMOD }
     *     
     */
    public OUTMOD getOUTMOD() {
        return outmod;
    }

    /**
     * Sets the value of the outmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTMOD }
     *     
     */
    public void setOUTMOD(OUTMOD value) {
        this.outmod = value;
    }

    /**
     * Gets the value of the exprss property.
     * 
     * @return
     *     possible object is
     *     {@link EXPRSS }
     *     
     */
    public EXPRSS getEXPRSS() {
        return exprss;
    }

    /**
     * Sets the value of the exprss property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPRSS }
     *     
     */
    public void setEXPRSS(EXPRSS value) {
        this.exprss = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link TEST }
     *     
     */
    public TEST getTEST() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEST }
     *     
     */
    public void setTEST(TEST value) {
        this.test = value;
    }

    /**
     * Gets the value of the idoctyp property.
     * 
     * @return
     *     possible object is
     *     {@link IDOCTYP }
     *     
     */
    public IDOCTYP getIDOCTYP() {
        return idoctyp;
    }

    /**
     * Sets the value of the idoctyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDOCTYP }
     *     
     */
    public void setIDOCTYP(IDOCTYP value) {
        this.idoctyp = value;
    }

    /**
     * Gets the value of the cimtyp property.
     * 
     * @return
     *     possible object is
     *     {@link CIMTYP }
     *     
     */
    public CIMTYP getCIMTYP() {
        return cimtyp;
    }

    /**
     * Sets the value of the cimtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIMTYP }
     *     
     */
    public void setCIMTYP(CIMTYP value) {
        this.cimtyp = value;
    }

    /**
     * Gets the value of the mestyp property.
     * 
     * @return
     *     possible object is
     *     {@link MESTYP }
     *     
     */
    public MESTYP getMESTYP() {
        return mestyp;
    }

    /**
     * Sets the value of the mestyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MESTYP }
     *     
     */
    public void setMESTYP(MESTYP value) {
        this.mestyp = value;
    }

    /**
     * Gets the value of the mescod property.
     * 
     * @return
     *     possible object is
     *     {@link MESCOD }
     *     
     */
    public MESCOD getMESCOD() {
        return mescod;
    }

    /**
     * Sets the value of the mescod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MESCOD }
     *     
     */
    public void setMESCOD(MESCOD value) {
        this.mescod = value;
    }

    /**
     * Gets the value of the mesfct property.
     * 
     * @return
     *     possible object is
     *     {@link MESFCT }
     *     
     */
    public MESFCT getMESFCT() {
        return mesfct;
    }

    /**
     * Sets the value of the mesfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MESFCT }
     *     
     */
    public void setMESFCT(MESFCT value) {
        this.mesfct = value;
    }

    /**
     * Gets the value of the std property.
     * 
     * @return
     *     possible object is
     *     {@link STD }
     *     
     */
    public STD getSTD() {
        return std;
    }

    /**
     * Sets the value of the std property.
     * 
     * @param value
     *     allowed object is
     *     {@link STD }
     *     
     */
    public void setSTD(STD value) {
        this.std = value;
    }

    /**
     * Gets the value of the stdvrs property.
     * 
     * @return
     *     possible object is
     *     {@link STDVRS }
     *     
     */
    public STDVRS getSTDVRS() {
        return stdvrs;
    }

    /**
     * Sets the value of the stdvrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDVRS }
     *     
     */
    public void setSTDVRS(STDVRS value) {
        this.stdvrs = value;
    }

    /**
     * Gets the value of the stdmes property.
     * 
     * @return
     *     possible object is
     *     {@link STDMES }
     *     
     */
    public STDMES getSTDMES() {
        return stdmes;
    }

    /**
     * Sets the value of the stdmes property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDMES }
     *     
     */
    public void setSTDMES(STDMES value) {
        this.stdmes = value;
    }

    /**
     * Gets the value of the sndpor property.
     * 
     * @return
     *     possible object is
     *     {@link SNDPOR }
     *     
     */
    public SNDPOR getSNDPOR() {
        return sndpor;
    }

    /**
     * Sets the value of the sndpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNDPOR }
     *     
     */
    public void setSNDPOR(SNDPOR value) {
        this.sndpor = value;
    }

    /**
     * Gets the value of the sndprt property.
     * 
     * @return
     *     possible object is
     *     {@link SNDPRT }
     *     
     */
    public SNDPRT getSNDPRT() {
        return sndprt;
    }

    /**
     * Sets the value of the sndprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNDPRT }
     *     
     */
    public void setSNDPRT(SNDPRT value) {
        this.sndprt = value;
    }

    /**
     * Gets the value of the sndpfc property.
     * 
     * @return
     *     possible object is
     *     {@link SNDPFC }
     *     
     */
    public SNDPFC getSNDPFC() {
        return sndpfc;
    }

    /**
     * Sets the value of the sndpfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNDPFC }
     *     
     */
    public void setSNDPFC(SNDPFC value) {
        this.sndpfc = value;
    }

    /**
     * Gets the value of the sndprn property.
     * 
     * @return
     *     possible object is
     *     {@link SNDPRN }
     *     
     */
    public SNDPRN getSNDPRN() {
        return sndprn;
    }

    /**
     * Sets the value of the sndprn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNDPRN }
     *     
     */
    public void setSNDPRN(SNDPRN value) {
        this.sndprn = value;
    }

    /**
     * Gets the value of the sndsad property.
     * 
     * @return
     *     possible object is
     *     {@link SNDSAD }
     *     
     */
    public SNDSAD getSNDSAD() {
        return sndsad;
    }

    /**
     * Sets the value of the sndsad property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNDSAD }
     *     
     */
    public void setSNDSAD(SNDSAD value) {
        this.sndsad = value;
    }

    /**
     * Gets the value of the sndlad property.
     * 
     * @return
     *     possible object is
     *     {@link SNDLAD }
     *     
     */
    public SNDLAD getSNDLAD() {
        return sndlad;
    }

    /**
     * Sets the value of the sndlad property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNDLAD }
     *     
     */
    public void setSNDLAD(SNDLAD value) {
        this.sndlad = value;
    }

    /**
     * Gets the value of the rcvpor property.
     * 
     * @return
     *     possible object is
     *     {@link RCVPOR }
     *     
     */
    public RCVPOR getRCVPOR() {
        return rcvpor;
    }

    /**
     * Sets the value of the rcvpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCVPOR }
     *     
     */
    public void setRCVPOR(RCVPOR value) {
        this.rcvpor = value;
    }

    /**
     * Gets the value of the rcvprt property.
     * 
     * @return
     *     possible object is
     *     {@link RCVPRT }
     *     
     */
    public RCVPRT getRCVPRT() {
        return rcvprt;
    }

    /**
     * Sets the value of the rcvprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCVPRT }
     *     
     */
    public void setRCVPRT(RCVPRT value) {
        this.rcvprt = value;
    }

    /**
     * Gets the value of the rcvpfc property.
     * 
     * @return
     *     possible object is
     *     {@link RCVPFC }
     *     
     */
    public RCVPFC getRCVPFC() {
        return rcvpfc;
    }

    /**
     * Sets the value of the rcvpfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCVPFC }
     *     
     */
    public void setRCVPFC(RCVPFC value) {
        this.rcvpfc = value;
    }

    /**
     * Gets the value of the rcvprn property.
     * 
     * @return
     *     possible object is
     *     {@link RCVPRN }
     *     
     */
    public RCVPRN getRCVPRN() {
        return rcvprn;
    }

    /**
     * Sets the value of the rcvprn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCVPRN }
     *     
     */
    public void setRCVPRN(RCVPRN value) {
        this.rcvprn = value;
    }

    /**
     * Gets the value of the rcvsad property.
     * 
     * @return
     *     possible object is
     *     {@link RCVSAD }
     *     
     */
    public RCVSAD getRCVSAD() {
        return rcvsad;
    }

    /**
     * Sets the value of the rcvsad property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCVSAD }
     *     
     */
    public void setRCVSAD(RCVSAD value) {
        this.rcvsad = value;
    }

    /**
     * Gets the value of the rcvlad property.
     * 
     * @return
     *     possible object is
     *     {@link RCVLAD }
     *     
     */
    public RCVLAD getRCVLAD() {
        return rcvlad;
    }

    /**
     * Sets the value of the rcvlad property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCVLAD }
     *     
     */
    public void setRCVLAD(RCVLAD value) {
        this.rcvlad = value;
    }

    /**
     * Gets the value of the credat property.
     * 
     * @return
     *     possible object is
     *     {@link CREDAT }
     *     
     */
    public CREDAT getCREDAT() {
        return credat;
    }

    /**
     * Sets the value of the credat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDAT }
     *     
     */
    public void setCREDAT(CREDAT value) {
        this.credat = value;
    }

    /**
     * Gets the value of the cretim property.
     * 
     * @return
     *     possible object is
     *     {@link CRETIM }
     *     
     */
    public CRETIM getCRETIM() {
        return cretim;
    }

    /**
     * Sets the value of the cretim property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRETIM }
     *     
     */
    public void setCRETIM(CRETIM value) {
        this.cretim = value;
    }

    /**
     * Gets the value of the refint property.
     * 
     * @return
     *     possible object is
     *     {@link REFINT }
     *     
     */
    public REFINT getREFINT() {
        return refint;
    }

    /**
     * Sets the value of the refint property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFINT }
     *     
     */
    public void setREFINT(REFINT value) {
        this.refint = value;
    }

    /**
     * Gets the value of the refgrp property.
     * 
     * @return
     *     possible object is
     *     {@link REFGRP }
     *     
     */
    public REFGRP getREFGRP() {
        return refgrp;
    }

    /**
     * Sets the value of the refgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFGRP }
     *     
     */
    public void setREFGRP(REFGRP value) {
        this.refgrp = value;
    }

    /**
     * Gets the value of the refmes property.
     * 
     * @return
     *     possible object is
     *     {@link REFMES }
     *     
     */
    public REFMES getREFMES() {
        return refmes;
    }

    /**
     * Sets the value of the refmes property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFMES }
     *     
     */
    public void setREFMES(REFMES value) {
        this.refmes = value;
    }

    /**
     * Gets the value of the arckey property.
     * 
     * @return
     *     possible object is
     *     {@link ARCKEY }
     *     
     */
    public ARCKEY getARCKEY() {
        return arckey;
    }

    /**
     * Sets the value of the arckey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARCKEY }
     *     
     */
    public void setARCKEY(ARCKEY value) {
        this.arckey = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link SERIAL }
     *     
     */
    public SERIAL getSERIAL() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERIAL }
     *     
     */
    public void setSERIAL(SERIAL value) {
        this.serial = value;
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