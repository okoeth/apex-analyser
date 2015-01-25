
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TrackedChange"/>
 *     &lt;enumeration value="UserStatus"/>
 *     &lt;enumeration value="TextPost"/>
 *     &lt;enumeration value="AdvancedTextPost"/>
 *     &lt;enumeration value="LinkPost"/>
 *     &lt;enumeration value="ContentPost"/>
 *     &lt;enumeration value="PollPost"/>
 *     &lt;enumeration value="RypplePost"/>
 *     &lt;enumeration value="ProfileSkillPost"/>
 *     &lt;enumeration value="DashboardComponentSnapshot"/>
 *     &lt;enumeration value="ApprovalPost"/>
 *     &lt;enumeration value="CaseCommentPost"/>
 *     &lt;enumeration value="ReplyPost"/>
 *     &lt;enumeration value="EmailMessageEvent"/>
 *     &lt;enumeration value="CallLogPost"/>
 *     &lt;enumeration value="ChangeStatusPost"/>
 *     &lt;enumeration value="AttachArticleEvent"/>
 *     &lt;enumeration value="MilestoneEvent"/>
 *     &lt;enumeration value="ActivityEvent"/>
 *     &lt;enumeration value="ChatTranscriptPost"/>
 *     &lt;enumeration value="CollaborationGroupCreated"/>
 *     &lt;enumeration value="CollaborationGroupUnarchived"/>
 *     &lt;enumeration value="SocialPost"/>
 *     &lt;enumeration value="QuestionPost"/>
 *     &lt;enumeration value="FacebookPost"/>
 *     &lt;enumeration value="BasicTemplateFeedItem"/>
 *     &lt;enumeration value="CreateRecordEvent"/>
 *     &lt;enumeration value="CanvasPost"/>
 *     &lt;enumeration value="AnnouncementPost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemType")
@XmlEnum
public enum FeedItemType {

    @XmlEnumValue("TrackedChange")
    TRACKED_CHANGE("TrackedChange"),
    @XmlEnumValue("UserStatus")
    USER_STATUS("UserStatus"),
    @XmlEnumValue("TextPost")
    TEXT_POST("TextPost"),
    @XmlEnumValue("AdvancedTextPost")
    ADVANCED_TEXT_POST("AdvancedTextPost"),
    @XmlEnumValue("LinkPost")
    LINK_POST("LinkPost"),
    @XmlEnumValue("ContentPost")
    CONTENT_POST("ContentPost"),
    @XmlEnumValue("PollPost")
    POLL_POST("PollPost"),
    @XmlEnumValue("RypplePost")
    RYPPLE_POST("RypplePost"),
    @XmlEnumValue("ProfileSkillPost")
    PROFILE_SKILL_POST("ProfileSkillPost"),
    @XmlEnumValue("DashboardComponentSnapshot")
    DASHBOARD_COMPONENT_SNAPSHOT("DashboardComponentSnapshot"),
    @XmlEnumValue("ApprovalPost")
    APPROVAL_POST("ApprovalPost"),
    @XmlEnumValue("CaseCommentPost")
    CASE_COMMENT_POST("CaseCommentPost"),
    @XmlEnumValue("ReplyPost")
    REPLY_POST("ReplyPost"),
    @XmlEnumValue("EmailMessageEvent")
    EMAIL_MESSAGE_EVENT("EmailMessageEvent"),
    @XmlEnumValue("CallLogPost")
    CALL_LOG_POST("CallLogPost"),
    @XmlEnumValue("ChangeStatusPost")
    CHANGE_STATUS_POST("ChangeStatusPost"),
    @XmlEnumValue("AttachArticleEvent")
    ATTACH_ARTICLE_EVENT("AttachArticleEvent"),
    @XmlEnumValue("MilestoneEvent")
    MILESTONE_EVENT("MilestoneEvent"),
    @XmlEnumValue("ActivityEvent")
    ACTIVITY_EVENT("ActivityEvent"),
    @XmlEnumValue("ChatTranscriptPost")
    CHAT_TRANSCRIPT_POST("ChatTranscriptPost"),
    @XmlEnumValue("CollaborationGroupCreated")
    COLLABORATION_GROUP_CREATED("CollaborationGroupCreated"),
    @XmlEnumValue("CollaborationGroupUnarchived")
    COLLABORATION_GROUP_UNARCHIVED("CollaborationGroupUnarchived"),
    @XmlEnumValue("SocialPost")
    SOCIAL_POST("SocialPost"),
    @XmlEnumValue("QuestionPost")
    QUESTION_POST("QuestionPost"),
    @XmlEnumValue("FacebookPost")
    FACEBOOK_POST("FacebookPost"),
    @XmlEnumValue("BasicTemplateFeedItem")
    BASIC_TEMPLATE_FEED_ITEM("BasicTemplateFeedItem"),
    @XmlEnumValue("CreateRecordEvent")
    CREATE_RECORD_EVENT("CreateRecordEvent"),
    @XmlEnumValue("CanvasPost")
    CANVAS_POST("CanvasPost"),
    @XmlEnumValue("AnnouncementPost")
    ANNOUNCEMENT_POST("AnnouncementPost");
    private final String value;

    FeedItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedItemType fromValue(String v) {
        for (FeedItemType c: FeedItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
