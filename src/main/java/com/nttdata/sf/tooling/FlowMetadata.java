
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="actionCalls" type="{urn:tooling.soap.sforce.com}FlowActionCall" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="apexPluginCalls" type="{urn:tooling.soap.sforce.com}FlowApexPluginCall" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignments" type="{urn:tooling.soap.sforce.com}FlowAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="choices" type="{urn:tooling.soap.sforce.com}FlowChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constants" type="{urn:tooling.soap.sforce.com}FlowConstant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="decisions" type="{urn:tooling.soap.sforce.com}FlowDecision" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamicChoiceSets" type="{urn:tooling.soap.sforce.com}FlowDynamicChoiceSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formulas" type="{urn:tooling.soap.sforce.com}FlowFormula" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loops" type="{urn:tooling.soap.sforce.com}FlowLoop" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processMetadataValues" type="{urn:tooling.soap.sforce.com}FlowMetadataValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processType" type="{urn:tooling.soap.sforce.com}FlowProcessType" minOccurs="0"/>
 *         &lt;element name="recordCreates" type="{urn:tooling.soap.sforce.com}FlowRecordCreate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordDeletes" type="{urn:tooling.soap.sforce.com}FlowRecordDelete" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordLookups" type="{urn:tooling.soap.sforce.com}FlowRecordLookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordUpdates" type="{urn:tooling.soap.sforce.com}FlowRecordUpdate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="screens" type="{urn:tooling.soap.sforce.com}FlowScreen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startElementReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="steps" type="{urn:tooling.soap.sforce.com}FlowStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subflows" type="{urn:tooling.soap.sforce.com}FlowSubflow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textTemplates" type="{urn:tooling.soap.sforce.com}FlowTextTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variables" type="{urn:tooling.soap.sforce.com}FlowVariable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waits" type="{urn:tooling.soap.sforce.com}FlowWait" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowMetadata", propOrder = {
    "actionCalls",
    "apexPluginCalls",
    "assignments",
    "choices",
    "constants",
    "decisions",
    "definition",
    "description",
    "dynamicChoiceSets",
    "formulas",
    "label",
    "loops",
    "processMetadataValues",
    "processType",
    "recordCreates",
    "recordDeletes",
    "recordLookups",
    "recordUpdates",
    "screens",
    "startElementReference",
    "steps",
    "subflows",
    "textTemplates",
    "variables",
    "waits"
})
public class FlowMetadata
    extends Metadata
{

    protected List<FlowActionCall> actionCalls;
    protected List<FlowApexPluginCall> apexPluginCalls;
    protected List<FlowAssignment> assignments;
    protected List<FlowChoice> choices;
    protected List<FlowConstant> constants;
    protected List<FlowDecision> decisions;
    protected String definition;
    protected String description;
    protected List<FlowDynamicChoiceSet> dynamicChoiceSets;
    protected List<FlowFormula> formulas;
    @XmlElement(required = true)
    protected String label;
    protected List<FlowLoop> loops;
    protected List<FlowMetadataValue> processMetadataValues;
    protected FlowProcessType processType;
    protected List<FlowRecordCreate> recordCreates;
    protected List<FlowRecordDelete> recordDeletes;
    protected List<FlowRecordLookup> recordLookups;
    protected List<FlowRecordUpdate> recordUpdates;
    protected List<FlowScreen> screens;
    protected String startElementReference;
    protected List<FlowStep> steps;
    protected List<FlowSubflow> subflows;
    protected List<FlowTextTemplate> textTemplates;
    protected List<FlowVariable> variables;
    protected List<FlowWait> waits;

    /**
     * Gets the value of the actionCalls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCalls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionCalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowActionCall }
     * 
     * 
     */
    public List<FlowActionCall> getActionCalls() {
        if (actionCalls == null) {
            actionCalls = new ArrayList<FlowActionCall>();
        }
        return this.actionCalls;
    }

    /**
     * Gets the value of the apexPluginCalls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apexPluginCalls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApexPluginCalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowApexPluginCall }
     * 
     * 
     */
    public List<FlowApexPluginCall> getApexPluginCalls() {
        if (apexPluginCalls == null) {
            apexPluginCalls = new ArrayList<FlowApexPluginCall>();
        }
        return this.apexPluginCalls;
    }

    /**
     * Gets the value of the assignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowAssignment }
     * 
     * 
     */
    public List<FlowAssignment> getAssignments() {
        if (assignments == null) {
            assignments = new ArrayList<FlowAssignment>();
        }
        return this.assignments;
    }

    /**
     * Gets the value of the choices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowChoice }
     * 
     * 
     */
    public List<FlowChoice> getChoices() {
        if (choices == null) {
            choices = new ArrayList<FlowChoice>();
        }
        return this.choices;
    }

    /**
     * Gets the value of the constants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowConstant }
     * 
     * 
     */
    public List<FlowConstant> getConstants() {
        if (constants == null) {
            constants = new ArrayList<FlowConstant>();
        }
        return this.constants;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowDecision }
     * 
     * 
     */
    public List<FlowDecision> getDecisions() {
        if (decisions == null) {
            decisions = new ArrayList<FlowDecision>();
        }
        return this.decisions;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dynamicChoiceSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicChoiceSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicChoiceSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowDynamicChoiceSet }
     * 
     * 
     */
    public List<FlowDynamicChoiceSet> getDynamicChoiceSets() {
        if (dynamicChoiceSets == null) {
            dynamicChoiceSets = new ArrayList<FlowDynamicChoiceSet>();
        }
        return this.dynamicChoiceSets;
    }

    /**
     * Gets the value of the formulas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formulas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowFormula }
     * 
     * 
     */
    public List<FlowFormula> getFormulas() {
        if (formulas == null) {
            formulas = new ArrayList<FlowFormula>();
        }
        return this.formulas;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the loops property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loops property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoops().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowLoop }
     * 
     * 
     */
    public List<FlowLoop> getLoops() {
        if (loops == null) {
            loops = new ArrayList<FlowLoop>();
        }
        return this.loops;
    }

    /**
     * Gets the value of the processMetadataValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processMetadataValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessMetadataValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowMetadataValue }
     * 
     * 
     */
    public List<FlowMetadataValue> getProcessMetadataValues() {
        if (processMetadataValues == null) {
            processMetadataValues = new ArrayList<FlowMetadataValue>();
        }
        return this.processMetadataValues;
    }

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowProcessType }
     *     
     */
    public FlowProcessType getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowProcessType }
     *     
     */
    public void setProcessType(FlowProcessType value) {
        this.processType = value;
    }

    /**
     * Gets the value of the recordCreates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordCreates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordCreates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordCreate }
     * 
     * 
     */
    public List<FlowRecordCreate> getRecordCreates() {
        if (recordCreates == null) {
            recordCreates = new ArrayList<FlowRecordCreate>();
        }
        return this.recordCreates;
    }

    /**
     * Gets the value of the recordDeletes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordDeletes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordDeletes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordDelete }
     * 
     * 
     */
    public List<FlowRecordDelete> getRecordDeletes() {
        if (recordDeletes == null) {
            recordDeletes = new ArrayList<FlowRecordDelete>();
        }
        return this.recordDeletes;
    }

    /**
     * Gets the value of the recordLookups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLookups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLookups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordLookup }
     * 
     * 
     */
    public List<FlowRecordLookup> getRecordLookups() {
        if (recordLookups == null) {
            recordLookups = new ArrayList<FlowRecordLookup>();
        }
        return this.recordLookups;
    }

    /**
     * Gets the value of the recordUpdates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordUpdates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordUpdates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordUpdate }
     * 
     * 
     */
    public List<FlowRecordUpdate> getRecordUpdates() {
        if (recordUpdates == null) {
            recordUpdates = new ArrayList<FlowRecordUpdate>();
        }
        return this.recordUpdates;
    }

    /**
     * Gets the value of the screens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowScreen }
     * 
     * 
     */
    public List<FlowScreen> getScreens() {
        if (screens == null) {
            screens = new ArrayList<FlowScreen>();
        }
        return this.screens;
    }

    /**
     * Gets the value of the startElementReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartElementReference() {
        return startElementReference;
    }

    /**
     * Sets the value of the startElementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartElementReference(String value) {
        this.startElementReference = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowStep }
     * 
     * 
     */
    public List<FlowStep> getSteps() {
        if (steps == null) {
            steps = new ArrayList<FlowStep>();
        }
        return this.steps;
    }

    /**
     * Gets the value of the subflows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subflows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubflows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowSubflow }
     * 
     * 
     */
    public List<FlowSubflow> getSubflows() {
        if (subflows == null) {
            subflows = new ArrayList<FlowSubflow>();
        }
        return this.subflows;
    }

    /**
     * Gets the value of the textTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowTextTemplate }
     * 
     * 
     */
    public List<FlowTextTemplate> getTextTemplates() {
        if (textTemplates == null) {
            textTemplates = new ArrayList<FlowTextTemplate>();
        }
        return this.textTemplates;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowVariable }
     * 
     * 
     */
    public List<FlowVariable> getVariables() {
        if (variables == null) {
            variables = new ArrayList<FlowVariable>();
        }
        return this.variables;
    }

    /**
     * Gets the value of the waits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowWait }
     * 
     * 
     */
    public List<FlowWait> getWaits() {
        if (waits == null) {
            waits = new ArrayList<FlowWait>();
        }
        return this.waits;
    }

}
