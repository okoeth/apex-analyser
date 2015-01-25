
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeWorkflowAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KnowledgeWorkflowAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PublishAsNew"/>
 *     &lt;enumeration value="Publish"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KnowledgeWorkflowAction")
@XmlEnum
public enum KnowledgeWorkflowAction {

    @XmlEnumValue("PublishAsNew")
    PUBLISH_AS_NEW("PublishAsNew"),
    @XmlEnumValue("Publish")
    PUBLISH("Publish");
    private final String value;

    KnowledgeWorkflowAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KnowledgeWorkflowAction fromValue(String v) {
        for (KnowledgeWorkflowAction c: KnowledgeWorkflowAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
