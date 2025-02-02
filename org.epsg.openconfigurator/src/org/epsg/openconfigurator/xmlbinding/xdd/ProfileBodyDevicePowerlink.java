
package org.epsg.openconfigurator.xmlbinding.xdd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProfileBody_Device_Powerlink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileBody_Device_Powerlink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ethernet-powerlink.org}ProfileBody_DataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceIdentity" type="{http://www.ethernet-powerlink.org}t_DeviceIdentity" minOccurs="0"/&gt;
 *         &lt;element name="DeviceManager" type="{http://www.ethernet-powerlink.org}t_DeviceManager" minOccurs="0"/&gt;
 *         &lt;element name="DeviceFunction" type="{http://www.ethernet-powerlink.org}t_DeviceFunction" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ApplicationProcess" type="{http://www.ethernet-powerlink.org}t_ApplicationProcess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExternalProfileHandle" type="{http://www.ethernet-powerlink.org}ProfileHandle_DataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="deviceClass"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="compact"/&gt;
 *             &lt;enumeration value="modular"/&gt;
 *             &lt;enumeration value="configurable"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileBody_Device_Powerlink", propOrder = {
    "deviceIdentity",
    "deviceManager",
    "deviceFunction",
    "applicationProcess",
    "externalProfileHandle"
})
public class ProfileBodyDevicePowerlink
    extends ProfileBodyDataType
{

    @XmlElement(name = "DeviceIdentity")
    protected TDeviceIdentity deviceIdentity;
    @XmlElement(name = "DeviceManager")
    protected TDeviceManager deviceManager;
    @XmlElement(name = "DeviceFunction", required = true)
    protected List<TDeviceFunction> deviceFunction;
    @XmlElement(name = "ApplicationProcess")
    protected List<TApplicationProcess> applicationProcess;
    @XmlElement(name = "ExternalProfileHandle")
    protected List<ProfileHandleDataType> externalProfileHandle;
    @XmlAttribute(name = "deviceClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deviceClass;

    /**
     * Gets the value of the deviceIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link TDeviceIdentity }
     *     
     */
    public TDeviceIdentity getDeviceIdentity() {
        return deviceIdentity;
    }

    /**
     * Sets the value of the deviceIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeviceIdentity }
     *     
     */
    public void setDeviceIdentity(TDeviceIdentity value) {
        this.deviceIdentity = value;
    }

    /**
     * Gets the value of the deviceManager property.
     * 
     * @return
     *     possible object is
     *     {@link TDeviceManager }
     *     
     */
    public TDeviceManager getDeviceManager() {
        return deviceManager;
    }

    /**
     * Sets the value of the deviceManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeviceManager }
     *     
     */
    public void setDeviceManager(TDeviceManager value) {
        this.deviceManager = value;
    }

    /**
     * Gets the value of the deviceFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDeviceFunction }
     * 
     * 
     */
    public List<TDeviceFunction> getDeviceFunction() {
        if (deviceFunction == null) {
            deviceFunction = new ArrayList<TDeviceFunction>();
        }
        return this.deviceFunction;
    }

    /**
     * Gets the value of the applicationProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TApplicationProcess }
     * 
     * 
     */
    public List<TApplicationProcess> getApplicationProcess() {
        if (applicationProcess == null) {
            applicationProcess = new ArrayList<TApplicationProcess>();
        }
        return this.applicationProcess;
    }

    /**
     * Gets the value of the externalProfileHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalProfileHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalProfileHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileHandleDataType }
     * 
     * 
     */
    public List<ProfileHandleDataType> getExternalProfileHandle() {
        if (externalProfileHandle == null) {
            externalProfileHandle = new ArrayList<ProfileHandleDataType>();
        }
        return this.externalProfileHandle;
    }

    /**
     * Gets the value of the deviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceClass() {
        return deviceClass;
    }

    /**
     * Sets the value of the deviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceClass(String value) {
        this.deviceClass = value;
    }

}
