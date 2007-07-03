//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.23 at 11:22:55 PM EDT 
//


package xps.impl.document.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import xps.model.document.page.IPageResource;
import xps.model.document.page.IPageResourceDictionary;


/**
 * <p>Java class for CT_ResourceDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ResourceDictionary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}ImageBrush"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}LinearGradientBrush"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}RadialGradientBrush"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}VisualBrush"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}SolidColorBrush"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}MatrixTransform"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}PathGeometry"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}Path"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}Glyphs"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}Canvas"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://schemas.microsoft.com/xps/2005/06}AG_ResourceDictionary"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ResourceDictionary", propOrder = {
    "imageBrushOrLinearGradientBrushOrRadialGradientBrush"
})
public class CTResourceDictionary implements IPageResourceDictionary {

    @XmlElements({
        @XmlElement(name = "MatrixTransform", type = CTMatrixTransform.class),
        @XmlElement(name = "Canvas", type = CTCanvas.class),
        @XmlElement(name = "RadialGradientBrush", type = CTRadialGradientBrush.class),
        @XmlElement(name = "ImageBrush", type = CTCPImageBrush.class),
        @XmlElement(name = "Path", type = CTPath.class),
        @XmlElement(name = "PathGeometry", type = CTPathGeometry.class),
        @XmlElement(name = "VisualBrush", type = CTVisualBrush.class),
        @XmlElement(name = "LinearGradientBrush", type = CTLinearGradientBrush.class),
        @XmlElement(name = "SolidColorBrush", type = CTSolidColorBrush.class),
        @XmlElement(name = "Glyphs", type = CTGlyphs.class)
    })
    protected List<IPageResource> imageBrushOrLinearGradientBrushOrRadialGradientBrush;
    @XmlAttribute(name = "Source")
    protected String source;

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IPageResourceDictionary#getImageBrushOrLinearGradientBrushOrRadialGradientBrush()
	 */
    public List<IPageResource> getImageBrushOrLinearGradientBrushOrRadialGradientBrush() {
        if (imageBrushOrLinearGradientBrushOrRadialGradientBrush == null) {
            imageBrushOrLinearGradientBrushOrRadialGradientBrush = new ArrayList<IPageResource>();
        }
        return this.imageBrushOrLinearGradientBrushOrRadialGradientBrush;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IPageResourceDictionary#getSource()
	 */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
