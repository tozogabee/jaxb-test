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
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}EDI_DC40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}E1VDEWUNH" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}E1VDEWBGM_1" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}E1VDEWDTM" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}E1VDEWRFF_1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}E1VDEWNAD_1" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element ref="{}E1VDEWIDE_2" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}E1VDEWUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BEGIN"&gt;
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
    "edidc40",
    "e1VDEWUNH",
    "e1VDEWBGM1",
    "e1VDEWDTM",
    "e1VDEWRFF1",
    "e1VDEWNAD1",
    "e1VDEWIDE2",
    "e1VDEWUNT"
})
@XmlRootElement(name = "IDOC")
public class IDOC {

    @XmlElement(name = "EDI_DC40")
    protected List<EDIDC40> edidc40;
    @XmlElement(name = "E1VDEWUNH", required = true)
    protected List<E1VDEWUNH> e1VDEWUNH;
    @XmlElement(name = "E1VDEWBGM_1", required = true)
    protected List<E1VDEWBGM1> e1VDEWBGM1;
    @XmlElement(name = "E1VDEWDTM", required = true)
    protected List<E1VDEWDTM> e1VDEWDTM;
    @XmlElement(name = "E1VDEWRFF_1")
    protected List<E1VDEWRFF1> e1VDEWRFF1;
    @XmlElement(name = "E1VDEWNAD_1", required = true)
    protected List<E1VDEWNAD1> e1VDEWNAD1;
    @XmlElement(name = "E1VDEWIDE_2", required = true)
    protected List<E1VDEWIDE2> e1VDEWIDE2;
    @XmlElement(name = "E1VDEWUNT")
    protected List<E1VDEWUNT> e1VDEWUNT;
    @XmlAttribute(name = "BEGIN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String begin;

    /**
     * Gets the value of the edidc40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edidc40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEDIDC40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EDIDC40 }
     * 
     * 
     */
    public List<EDIDC40> getEDIDC40() {
        if (edidc40 == null) {
            edidc40 = new ArrayList<EDIDC40>();
        }
        return this.edidc40;
    }

    /**
     * Gets the value of the e1VDEWUNH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1VDEWUNH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1VDEWUNH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1VDEWUNH }
     * 
     * 
     */
    public List<E1VDEWUNH> getE1VDEWUNH() {
        if (e1VDEWUNH == null) {
            e1VDEWUNH = new ArrayList<E1VDEWUNH>();
        }
        return this.e1VDEWUNH;
    }

    /**
     * Gets the value of the e1VDEWBGM1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1VDEWBGM1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1VDEWBGM1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1VDEWBGM1 }
     * 
     * 
     */
    public List<E1VDEWBGM1> getE1VDEWBGM1() {
        if (e1VDEWBGM1 == null) {
            e1VDEWBGM1 = new ArrayList<E1VDEWBGM1>();
        }
        return this.e1VDEWBGM1;
    }

    /**
     * Gets the value of the e1VDEWDTM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1VDEWDTM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1VDEWDTM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1VDEWDTM }
     * 
     * 
     */
    public List<E1VDEWDTM> getE1VDEWDTM() {
        if (e1VDEWDTM == null) {
            e1VDEWDTM = new ArrayList<E1VDEWDTM>();
        }
        return this.e1VDEWDTM;
    }

    /**
     * Gets the value of the e1VDEWRFF1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1VDEWRFF1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1VDEWRFF1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1VDEWRFF1 }
     * 
     * 
     */
    public List<E1VDEWRFF1> getE1VDEWRFF1() {
        if (e1VDEWRFF1 == null) {
            e1VDEWRFF1 = new ArrayList<E1VDEWRFF1>();
        }
        return this.e1VDEWRFF1;
    }

    /**
     * Gets the value of the e1VDEWNAD1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1VDEWNAD1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1VDEWNAD1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1VDEWNAD1 }
     * 
     * 
     */
    public List<E1VDEWNAD1> getE1VDEWNAD1() {
        if (e1VDEWNAD1 == null) {
            e1VDEWNAD1 = new ArrayList<E1VDEWNAD1>();
        }
        return this.e1VDEWNAD1;
    }

    /**
     * Gets the value of the e1VDEWIDE2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1VDEWIDE2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1VDEWIDE2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1VDEWIDE2 }
     * 
     * 
     */
    public List<E1VDEWIDE2> getE1VDEWIDE2() {
        if (e1VDEWIDE2 == null) {
            e1VDEWIDE2 = new ArrayList<E1VDEWIDE2>();
        }
        return this.e1VDEWIDE2;
    }

    /**
     * Gets the value of the e1VDEWUNT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1VDEWUNT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1VDEWUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1VDEWUNT }
     * 
     * 
     */
    public List<E1VDEWUNT> getE1VDEWUNT() {
        if (e1VDEWUNT == null) {
            e1VDEWUNT = new ArrayList<E1VDEWUNT>();
        }
        return this.e1VDEWUNT;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGIN() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGIN(String value) {
        this.begin = value;
    }

}
