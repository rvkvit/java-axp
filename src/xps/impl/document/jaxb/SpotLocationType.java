//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.23 at 11:22:55 PM EDT 
//


package xps.impl.document.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpotLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpotLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PageURI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="StartX" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="StartY" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpotLocationType", namespace = "http://schemas.microsoft.com/xps/2005/06/signature-definitions")
public class SpotLocationType {

    @XmlAttribute(name = "PageURI", required = true)
    protected String pageURI;
    @XmlAttribute(name = "StartX", required = true)
    protected double startX;
    @XmlAttribute(name = "StartY", required = true)
    protected double startY;

    /**
     * Gets the value of the pageURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageURI() {
        return pageURI;
    }

    /**
     * Sets the value of the pageURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageURI(String value) {
        this.pageURI = value;
    }

    /**
     * Gets the value of the startX property.
     * 
     */
    public double getStartX() {
        return startX;
    }

    /**
     * Sets the value of the startX property.
     * 
     */
    public void setStartX(double value) {
        this.startX = value;
    }

    /**
     * Gets the value of the startY property.
     * 
     */
    public double getStartY() {
        return startY;
    }

    /**
     * Sets the value of the startY property.
     * 
     */
    public void setStartY(double value) {
        this.startY = value;
    }

}
