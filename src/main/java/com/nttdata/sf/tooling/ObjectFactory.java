
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nttdata.sf.tooling package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvalidFieldFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidFieldFault");
    private final static QName _MalformedSearchFault_QNAME = new QName("urn:tooling.soap.sforce.com", "MalformedSearchFault");
    private final static QName _MalformedQueryFault_QNAME = new QName("urn:tooling.soap.sforce.com", "MalformedQueryFault");
    private final static QName _InvalidIdFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidIdFault");
    private final static QName _InvalidSObjectFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidSObjectFault");
    private final static QName _ApiFault_QNAME = new QName("urn:tooling.soap.sforce.com", "ApiFault");
    private final static QName _InvalidNewPasswordFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidNewPasswordFault");
    private final static QName _InvalidQueryLocatorFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidQueryLocatorFault");
    private final static QName _LoginFault_QNAME = new QName("urn:tooling.soap.sforce.com", "LoginFault");
    private final static QName _ApiQueryFault_QNAME = new QName("urn:tooling.soap.sforce.com", "ApiQueryFault");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("urn:tooling.soap.sforce.com", "UnexpectedErrorFault");
    private final static QName _MenuItemSortOrder_QNAME = new QName("urn:tooling.soap.sforce.com", "SortOrder");
    private final static QName _MenuItemMenuType_QNAME = new QName("urn:tooling.soap.sforce.com", "MenuType");
    private final static QName _MenuItemTheme_QNAME = new QName("urn:tooling.soap.sforce.com", "Theme");
    private final static QName _MenuItemActive_QNAME = new QName("urn:tooling.soap.sforce.com", "Active");
    private final static QName _MenuItemColor_QNAME = new QName("urn:tooling.soap.sforce.com", "Color");
    private final static QName _MenuItemLabel_QNAME = new QName("urn:tooling.soap.sforce.com", "Label");
    private final static QName _MenuItemAppId_QNAME = new QName("urn:tooling.soap.sforce.com", "AppId");
    private final static QName _MenuItemIconUrl_QNAME = new QName("urn:tooling.soap.sforce.com", "IconUrl");
    private final static QName _ApexTriggerIsValid_QNAME = new QName("urn:tooling.soap.sforce.com", "IsValid");
    private final static QName _ApexTriggerFullName_QNAME = new QName("urn:tooling.soap.sforce.com", "FullName");
    private final static QName _ApexTriggerSystemModstamp_QNAME = new QName("urn:tooling.soap.sforce.com", "SystemModstamp");
    private final static QName _ApexTriggerUsageAfterInsert_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterInsert");
    private final static QName _ApexTriggerLengthWithoutComments_QNAME = new QName("urn:tooling.soap.sforce.com", "LengthWithoutComments");
    private final static QName _ApexTriggerUsageBeforeInsert_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageBeforeInsert");
    private final static QName _ApexTriggerUsageAfterUpdate_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterUpdate");
    private final static QName _ApexTriggerTableEnumOrId_QNAME = new QName("urn:tooling.soap.sforce.com", "TableEnumOrId");
    private final static QName _ApexTriggerLastModifiedBy_QNAME = new QName("urn:tooling.soap.sforce.com", "LastModifiedBy");
    private final static QName _ApexTriggerLastModifiedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastModifiedDate");
    private final static QName _ApexTriggerUsageAfterUndelete_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterUndelete");
    private final static QName _ApexTriggerCreatedById_QNAME = new QName("urn:tooling.soap.sforce.com", "CreatedById");
    private final static QName _ApexTriggerName_QNAME = new QName("urn:tooling.soap.sforce.com", "Name");
    private final static QName _ApexTriggerNamespacePrefix_QNAME = new QName("urn:tooling.soap.sforce.com", "NamespacePrefix");
    private final static QName _ApexTriggerStatus_QNAME = new QName("urn:tooling.soap.sforce.com", "Status");
    private final static QName _ApexTriggerUsageIsBulk_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageIsBulk");
    private final static QName _ApexTriggerBodyCrc_QNAME = new QName("urn:tooling.soap.sforce.com", "BodyCrc");
    private final static QName _ApexTriggerMetadata_QNAME = new QName("urn:tooling.soap.sforce.com", "Metadata");
    private final static QName _ApexTriggerUsageBeforeDelete_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageBeforeDelete");
    private final static QName _ApexTriggerCreatedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "CreatedDate");
    private final static QName _ApexTriggerCreatedBy_QNAME = new QName("urn:tooling.soap.sforce.com", "CreatedBy");
    private final static QName _ApexTriggerLastModifiedById_QNAME = new QName("urn:tooling.soap.sforce.com", "LastModifiedById");
    private final static QName _ApexTriggerUsageBeforeUpdate_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageBeforeUpdate");
    private final static QName _ApexTriggerBody_QNAME = new QName("urn:tooling.soap.sforce.com", "Body");
    private final static QName _ApexTriggerApiVersion_QNAME = new QName("urn:tooling.soap.sforce.com", "ApiVersion");
    private final static QName _ApexTriggerUsageAfterDelete_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterDelete");
    private final static QName _CompactLayoutItemInfoFieldDefinition_QNAME = new QName("urn:tooling.soap.sforce.com", "FieldDefinition");
    private final static QName _CompactLayoutItemInfoDurableId_QNAME = new QName("urn:tooling.soap.sforce.com", "DurableId");
    private final static QName _CompactLayoutItemInfoCompactLayoutInfo_QNAME = new QName("urn:tooling.soap.sforce.com", "CompactLayoutInfo");
    private final static QName _CompactLayoutItemInfoCompactLayoutInfoId_QNAME = new QName("urn:tooling.soap.sforce.com", "CompactLayoutInfoId");
    private final static QName _CompactLayoutItemInfoFieldDefinitionId_QNAME = new QName("urn:tooling.soap.sforce.com", "FieldDefinitionId");
    private final static QName _CompactLayoutSobjectType_QNAME = new QName("urn:tooling.soap.sforce.com", "SobjectType");
    private final static QName _CompactLayoutDeveloperName_QNAME = new QName("urn:tooling.soap.sforce.com", "DeveloperName");
    private final static QName _IDEPerspectiveUser_QNAME = new QName("urn:tooling.soap.sforce.com", "User");
    private final static QName _IDEPerspectiveContent_QNAME = new QName("urn:tooling.soap.sforce.com", "Content");
    private final static QName _IDEPerspectiveUserId_QNAME = new QName("urn:tooling.soap.sforce.com", "UserId");
    private final static QName _IDEPerspectiveIsDeleted_QNAME = new QName("urn:tooling.soap.sforce.com", "IsDeleted");
    private final static QName _FlowElementReferenceOrValueNumberValue_QNAME = new QName("urn:tooling.soap.sforce.com", "numberValue");
    private final static QName _FlowElementReferenceOrValueBooleanValue_QNAME = new QName("urn:tooling.soap.sforce.com", "booleanValue");
    private final static QName _ApexCodeCoverageApexClassOrTrigger_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClassOrTrigger");
    private final static QName _ApexCodeCoverageCoverage_QNAME = new QName("urn:tooling.soap.sforce.com", "Coverage");
    private final static QName _ApexCodeCoverageApexTestClass_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexTestClass");
    private final static QName _ApexCodeCoverageApexTestClassId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexTestClassId");
    private final static QName _ApexCodeCoverageTestMethodName_QNAME = new QName("urn:tooling.soap.sforce.com", "TestMethodName");
    private final static QName _ApexCodeCoverageApexClassOrTriggerId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClassOrTriggerId");
    private final static QName _ApexCodeCoverageNumLinesCovered_QNAME = new QName("urn:tooling.soap.sforce.com", "NumLinesCovered");
    private final static QName _ApexCodeCoverageNumLinesUncovered_QNAME = new QName("urn:tooling.soap.sforce.com", "NumLinesUncovered");
    private final static QName _ApexClassSymbolTable_QNAME = new QName("urn:tooling.soap.sforce.com", "SymbolTable");
    private final static QName _ValidationRuleDescription_QNAME = new QName("urn:tooling.soap.sforce.com", "Description");
    private final static QName _ValidationRuleValidationName_QNAME = new QName("urn:tooling.soap.sforce.com", "ValidationName");
    private final static QName _WorkflowFieldUpdateMemberMetadataContainerId_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainerId");
    private final static QName _WorkflowFieldUpdateMemberContentEntity_QNAME = new QName("urn:tooling.soap.sforce.com", "ContentEntity");
    private final static QName _WorkflowFieldUpdateMemberContentEntityId_QNAME = new QName("urn:tooling.soap.sforce.com", "ContentEntityId");
    private final static QName _WorkflowFieldUpdateMemberMetadataContainer_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainer");
    private final static QName _WorkflowFieldUpdateMemberLastSyncDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastSyncDate");
    private final static QName _CompactLayoutInfoIsDefault_QNAME = new QName("urn:tooling.soap.sforce.com", "IsDefault");
    private final static QName _CompactLayoutInfoEntityDefinitionId_QNAME = new QName("urn:tooling.soap.sforce.com", "EntityDefinitionId");
    private final static QName _CompactLayoutInfoItems_QNAME = new QName("urn:tooling.soap.sforce.com", "Items");
    private final static QName _CompactLayoutInfoEntityDefinition_QNAME = new QName("urn:tooling.soap.sforce.com", "EntityDefinition");
    private final static QName _ApexCodeCoverageAggregateCoverageLastModifiedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "CoverageLastModifiedDate");
    private final static QName _ContainerAsyncRequestState_QNAME = new QName("urn:tooling.soap.sforce.com", "State");
    private final static QName _ContainerAsyncRequestIsCheckOnly_QNAME = new QName("urn:tooling.soap.sforce.com", "IsCheckOnly");
    private final static QName _ContainerAsyncRequestIsRunTests_QNAME = new QName("urn:tooling.soap.sforce.com", "IsRunTests");
    private final static QName _ContainerAsyncRequestErrorMsg_QNAME = new QName("urn:tooling.soap.sforce.com", "ErrorMsg");
    private final static QName _ContainerAsyncRequestMetadataContainerMemberId_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainerMemberId");
    private final static QName _ContainerAsyncRequestMetadataContainerMember_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainerMember");
    private final static QName _ContainerAsyncRequestDeployDetails_QNAME = new QName("urn:tooling.soap.sforce.com", "DeployDetails");
    private final static QName _WorkflowFieldUpdateSourceTableEnumOrId_QNAME = new QName("urn:tooling.soap.sforce.com", "SourceTableEnumOrId");
    private final static QName _WorkflowFieldUpdateLiteralValue_QNAME = new QName("urn:tooling.soap.sforce.com", "LiteralValue");
    private final static QName _WorkflowFieldUpdateLookupValueId_QNAME = new QName("urn:tooling.soap.sforce.com", "LookupValueId");
    private final static QName _EmailTemplateSubject_QNAME = new QName("urn:tooling.soap.sforce.com", "Subject");
    private final static QName _UserPreferenceValue_QNAME = new QName("urn:tooling.soap.sforce.com", "Value");
    private final static QName _UserPreferencePreference_QNAME = new QName("urn:tooling.soap.sforce.com", "Preference");
    private final static QName _ApexLogApplication_QNAME = new QName("urn:tooling.soap.sforce.com", "Application");
    private final static QName _ApexLogOperation_QNAME = new QName("urn:tooling.soap.sforce.com", "Operation");
    private final static QName _ApexLogDurationMilliseconds_QNAME = new QName("urn:tooling.soap.sforce.com", "DurationMilliseconds");
    private final static QName _ApexLogLogUserId_QNAME = new QName("urn:tooling.soap.sforce.com", "LogUserId");
    private final static QName _ApexLogLogUser_QNAME = new QName("urn:tooling.soap.sforce.com", "LogUser");
    private final static QName _ApexLogLogLength_QNAME = new QName("urn:tooling.soap.sforce.com", "LogLength");
    private final static QName _ApexLogRequest_QNAME = new QName("urn:tooling.soap.sforce.com", "Request");
    private final static QName _ApexLogStartTime_QNAME = new QName("urn:tooling.soap.sforce.com", "StartTime");
    private final static QName _ApexLogLocation_QNAME = new QName("urn:tooling.soap.sforce.com", "Location");
    private final static QName _ApexOrgWideCoveragePercentCovered_QNAME = new QName("urn:tooling.soap.sforce.com", "PercentCovered");
    private final static QName _ApexTestResultQueueItemId_QNAME = new QName("urn:tooling.soap.sforce.com", "QueueItemId");
    private final static QName _ApexTestResultMethodName_QNAME = new QName("urn:tooling.soap.sforce.com", "MethodName");
    private final static QName _ApexTestResultQueueItem_QNAME = new QName("urn:tooling.soap.sforce.com", "QueueItem");
    private final static QName _ApexTestResultStackTrace_QNAME = new QName("urn:tooling.soap.sforce.com", "StackTrace");
    private final static QName _ApexTestResultApexClass_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClass");
    private final static QName _ApexTestResultTestTimestamp_QNAME = new QName("urn:tooling.soap.sforce.com", "TestTimestamp");
    private final static QName _ApexTestResultMessage_QNAME = new QName("urn:tooling.soap.sforce.com", "Message");
    private final static QName _ApexTestResultApexLogId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexLogId");
    private final static QName _ApexTestResultApexClassId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClassId");
    private final static QName _ApexTestResultAsyncApexJob_QNAME = new QName("urn:tooling.soap.sforce.com", "AsyncApexJob");
    private final static QName _ApexTestResultAsyncApexJobId_QNAME = new QName("urn:tooling.soap.sforce.com", "AsyncApexJobId");
    private final static QName _ApexTestResultOutcome_QNAME = new QName("urn:tooling.soap.sforce.com", "Outcome");
    private final static QName _ApexTestResultApexLog_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexLog");
    private final static QName _CustomObjectExternalDataSource_QNAME = new QName("urn:tooling.soap.sforce.com", "ExternalDataSource");
    private final static QName _CustomObjectCustomHelpId_QNAME = new QName("urn:tooling.soap.sforce.com", "CustomHelpId");
    private final static QName _CustomObjectExternalRepository_QNAME = new QName("urn:tooling.soap.sforce.com", "ExternalRepository");
    private final static QName _CustomObjectExternalName_QNAME = new QName("urn:tooling.soap.sforce.com", "ExternalName");
    private final static QName _CustomObjectSharingModel_QNAME = new QName("urn:tooling.soap.sforce.com", "SharingModel");
    private final static QName _CustomObjectExternalDataSourceId_QNAME = new QName("urn:tooling.soap.sforce.com", "ExternalDataSourceId");
    private final static QName _CustomObjectLanguage_QNAME = new QName("urn:tooling.soap.sforce.com", "Language");
    private final static QName _QuickActionListItemQuickActionDefinition_QNAME = new QName("urn:tooling.soap.sforce.com", "QuickActionDefinition");
    private final static QName _QuickActionListItemQuickActionList_QNAME = new QName("urn:tooling.soap.sforce.com", "QuickActionList");
    private final static QName _QuickActionListItemQuickActionListId_QNAME = new QName("urn:tooling.soap.sforce.com", "QuickActionListId");
    private final static QName _AuraDefinitionAuraDefinitionBundleId_QNAME = new QName("urn:tooling.soap.sforce.com", "AuraDefinitionBundleId");
    private final static QName _AuraDefinitionSource_QNAME = new QName("urn:tooling.soap.sforce.com", "Source");
    private final static QName _AuraDefinitionDefType_QNAME = new QName("urn:tooling.soap.sforce.com", "DefType");
    private final static QName _AuraDefinitionFormat_QNAME = new QName("urn:tooling.soap.sforce.com", "Format");
    private final static QName _AuraDefinitionAuraDefinitionBundle_QNAME = new QName("urn:tooling.soap.sforce.com", "AuraDefinitionBundle");
    private final static QName _StaticResourceCacheControl_QNAME = new QName("urn:tooling.soap.sforce.com", "CacheControl");
    private final static QName _StaticResourceContentType_QNAME = new QName("urn:tooling.soap.sforce.com", "ContentType");
    private final static QName _StaticResourceBodyLength_QNAME = new QName("urn:tooling.soap.sforce.com", "BodyLength");
    private final static QName _CustomFieldPrecision_QNAME = new QName("urn:tooling.soap.sforce.com", "Precision");
    private final static QName _CustomFieldLength_QNAME = new QName("urn:tooling.soap.sforce.com", "Length");
    private final static QName _CustomFieldScale_QNAME = new QName("urn:tooling.soap.sforce.com", "Scale");
    private final static QName _CustomFieldMaskChar_QNAME = new QName("urn:tooling.soap.sforce.com", "MaskChar");
    private final static QName _CustomFieldInlineHelpText_QNAME = new QName("urn:tooling.soap.sforce.com", "InlineHelpText");
    private final static QName _CustomFieldSummaryOperation_QNAME = new QName("urn:tooling.soap.sforce.com", "SummaryOperation");
    private final static QName _CustomFieldRelationshipLabel_QNAME = new QName("urn:tooling.soap.sforce.com", "RelationshipLabel");
    private final static QName _CustomFieldMaskType_QNAME = new QName("urn:tooling.soap.sforce.com", "MaskType");
    private final static QName _CustomFieldDefaultValue_QNAME = new QName("urn:tooling.soap.sforce.com", "DefaultValue");
    private final static QName _QuickActionDefinitionTargetRecordType_QNAME = new QName("urn:tooling.soap.sforce.com", "TargetRecordType");
    private final static QName _QuickActionDefinitionStandardLabel_QNAME = new QName("urn:tooling.soap.sforce.com", "StandardLabel");
    private final static QName _QuickActionDefinitionIcon_QNAME = new QName("urn:tooling.soap.sforce.com", "Icon");
    private final static QName _QuickActionDefinitionTargetField_QNAME = new QName("urn:tooling.soap.sforce.com", "TargetField");
    private final static QName _QuickActionDefinitionWidth_QNAME = new QName("urn:tooling.soap.sforce.com", "Width");
    private final static QName _QuickActionDefinitionType_QNAME = new QName("urn:tooling.soap.sforce.com", "Type");
    private final static QName _QuickActionDefinitionIconId_QNAME = new QName("urn:tooling.soap.sforce.com", "IconId");
    private final static QName _QuickActionDefinitionTargetRecordTypeId_QNAME = new QName("urn:tooling.soap.sforce.com", "TargetRecordTypeId");
    private final static QName _QuickActionDefinitionTargetSobjectType_QNAME = new QName("urn:tooling.soap.sforce.com", "TargetSobjectType");
    private final static QName _QuickActionDefinitionMasterLabel_QNAME = new QName("urn:tooling.soap.sforce.com", "MasterLabel");
    private final static QName _QuickActionDefinitionHeight_QNAME = new QName("urn:tooling.soap.sforce.com", "Height");
    private final static QName _ApexTestQueueItemExtendedStatus_QNAME = new QName("urn:tooling.soap.sforce.com", "ExtendedStatus");
    private final static QName _ApexTestQueueItemParentJobId_QNAME = new QName("urn:tooling.soap.sforce.com", "ParentJobId");
    private final static QName _WorkflowOutboundMessageIntegrationUserId_QNAME = new QName("urn:tooling.soap.sforce.com", "IntegrationUserId");
    private final static QName _FieldDefinitionIsCompactLayoutable_QNAME = new QName("urn:tooling.soap.sforce.com", "IsCompactLayoutable");
    private final static QName _FieldDefinitionIsWorkflowFilterable_QNAME = new QName("urn:tooling.soap.sforce.com", "IsWorkflowFilterable");
    private final static QName _FieldDefinitionCompactLayoutItems_QNAME = new QName("urn:tooling.soap.sforce.com", "CompactLayoutItems");
    private final static QName _FieldDefinitionWorkflowFieldUpdates_QNAME = new QName("urn:tooling.soap.sforce.com", "WorkflowFieldUpdates");
    private final static QName _FieldDefinitionQualifiedApiName_QNAME = new QName("urn:tooling.soap.sforce.com", "QualifiedApiName");
    private final static QName _QuickActionListItems_QNAME = new QName("urn:tooling.soap.sforce.com", "items");
    private final static QName _QuickActionListLayout_QNAME = new QName("urn:tooling.soap.sforce.com", "Layout");
    private final static QName _QuickActionListLayoutId_QNAME = new QName("urn:tooling.soap.sforce.com", "LayoutId");
    private final static QName _ProfileUsers_QNAME = new QName("urn:tooling.soap.sforce.com", "Users");
    private final static QName _ProfileProfileLayouts_QNAME = new QName("urn:tooling.soap.sforce.com", "ProfileLayouts");
    private final static QName _ProfileUserLicenseId_QNAME = new QName("urn:tooling.soap.sforce.com", "UserLicenseId");
    private final static QName _EntityDefinitionDefaultCompactLayoutId_QNAME = new QName("urn:tooling.soap.sforce.com", "DefaultCompactLayoutId");
    private final static QName _EntityDefinitionIsWorkflowEnabled_QNAME = new QName("urn:tooling.soap.sforce.com", "IsWorkflowEnabled");
    private final static QName _EntityDefinitionWorkflowAlerts_QNAME = new QName("urn:tooling.soap.sforce.com", "WorkflowAlerts");
    private final static QName _EntityDefinitionDefaultCompactLayout_QNAME = new QName("urn:tooling.soap.sforce.com", "DefaultCompactLayout");
    private final static QName _EntityDefinitionIsCustomizable_QNAME = new QName("urn:tooling.soap.sforce.com", "IsCustomizable");
    private final static QName _EntityDefinitionWorkflowOutboundMessages_QNAME = new QName("urn:tooling.soap.sforce.com", "WorkflowOutboundMessages");
    private final static QName _EntityDefinitionIsApexTriggerable_QNAME = new QName("urn:tooling.soap.sforce.com", "IsApexTriggerable");
    private final static QName _EntityDefinitionFields_QNAME = new QName("urn:tooling.soap.sforce.com", "Fields");
    private final static QName _EntityDefinitionCustomFields_QNAME = new QName("urn:tooling.soap.sforce.com", "CustomFields");
    private final static QName _EntityDefinitionWorkflowTasks_QNAME = new QName("urn:tooling.soap.sforce.com", "WorkflowTasks");
    private final static QName _EntityDefinitionPluralLabel_QNAME = new QName("urn:tooling.soap.sforce.com", "PluralLabel");
    private final static QName _EntityDefinitionCompactLayouts_QNAME = new QName("urn:tooling.soap.sforce.com", "CompactLayouts");
    private final static QName _EntityDefinitionRecordTypes_QNAME = new QName("urn:tooling.soap.sforce.com", "RecordTypes");
    private final static QName _UserUsername_QNAME = new QName("urn:tooling.soap.sforce.com", "Username");
    private final static QName _UserDelegatedUsers_QNAME = new QName("urn:tooling.soap.sforce.com", "DelegatedUsers");
    private final static QName _UserUserPreferences_QNAME = new QName("urn:tooling.soap.sforce.com", "UserPreferences");
    private final static QName _UserWorkspaceId_QNAME = new QName("urn:tooling.soap.sforce.com", "WorkspaceId");
    private final static QName _UserManagedUsers_QNAME = new QName("urn:tooling.soap.sforce.com", "ManagedUsers");
    private final static QName _ApexExecutionOverlayResultOverlayResultLength_QNAME = new QName("urn:tooling.soap.sforce.com", "OverlayResultLength");
    private final static QName _ApexExecutionOverlayResultLine_QNAME = new QName("urn:tooling.soap.sforce.com", "Line");
    private final static QName _ApexExecutionOverlayResultClassName_QNAME = new QName("urn:tooling.soap.sforce.com", "ClassName");
    private final static QName _ApexExecutionOverlayResultNamespace_QNAME = new QName("urn:tooling.soap.sforce.com", "Namespace");
    private final static QName _ApexExecutionOverlayResultRequestedBy_QNAME = new QName("urn:tooling.soap.sforce.com", "RequestedBy");
    private final static QName _ApexExecutionOverlayResultRequestedById_QNAME = new QName("urn:tooling.soap.sforce.com", "RequestedById");
    private final static QName _ApexExecutionOverlayResultHeapDump_QNAME = new QName("urn:tooling.soap.sforce.com", "HeapDump");
    private final static QName _ApexExecutionOverlayResultActionScript_QNAME = new QName("urn:tooling.soap.sforce.com", "ActionScript");
    private final static QName _ApexExecutionOverlayResultIteration_QNAME = new QName("urn:tooling.soap.sforce.com", "Iteration");
    private final static QName _ApexExecutionOverlayResultExpirationDate_QNAME = new QName("urn:tooling.soap.sforce.com", "ExpirationDate");
    private final static QName _ApexExecutionOverlayResultIsDumpingHeap_QNAME = new QName("urn:tooling.soap.sforce.com", "IsDumpingHeap");
    private final static QName _ApexExecutionOverlayResultSOQLResult_QNAME = new QName("urn:tooling.soap.sforce.com", "SOQLResult");
    private final static QName _ApexExecutionOverlayResultApexResult_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexResult");
    private final static QName _ApexExecutionOverlayResultActionScriptType_QNAME = new QName("urn:tooling.soap.sforce.com", "ActionScriptType");
    private final static QName _RecordTypeBusinessProcessId_QNAME = new QName("urn:tooling.soap.sforce.com", "BusinessProcessId");
    private final static QName _ApexExecutionOverlayActionExecutableEntity_QNAME = new QName("urn:tooling.soap.sforce.com", "ExecutableEntity");
    private final static QName _ApexExecutionOverlayActionScope_QNAME = new QName("urn:tooling.soap.sforce.com", "Scope");
    private final static QName _ApexExecutionOverlayActionScopeId_QNAME = new QName("urn:tooling.soap.sforce.com", "ScopeId");
    private final static QName _ApexExecutionOverlayActionExecutableEntityId_QNAME = new QName("urn:tooling.soap.sforce.com", "ExecutableEntityId");
    private final static QName _ApexPageControllerType_QNAME = new QName("urn:tooling.soap.sforce.com", "ControllerType");
    private final static QName _ApexPageIsConfirmationTokenRequired_QNAME = new QName("urn:tooling.soap.sforce.com", "IsConfirmationTokenRequired");
    private final static QName _ApexPageControllerKey_QNAME = new QName("urn:tooling.soap.sforce.com", "ControllerKey");
    private final static QName _ApexPageIsAvailableInTouch_QNAME = new QName("urn:tooling.soap.sforce.com", "IsAvailableInTouch");
    private final static QName _ApexPageMarkup_QNAME = new QName("urn:tooling.soap.sforce.com", "Markup");
    private final static QName _NameAlias_QNAME = new QName("urn:tooling.soap.sforce.com", "Alias");
    private final static QName _NameEmail_QNAME = new QName("urn:tooling.soap.sforce.com", "Email");
    private final static QName _NameIsActive_QNAME = new QName("urn:tooling.soap.sforce.com", "IsActive");
    private final static QName _NameLastViewedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastViewedDate");
    private final static QName _NameFirstName_QNAME = new QName("urn:tooling.soap.sforce.com", "FirstName");
    private final static QName _NameRecordTypeId_QNAME = new QName("urn:tooling.soap.sforce.com", "RecordTypeId");
    private final static QName _NamePhone_QNAME = new QName("urn:tooling.soap.sforce.com", "Phone");
    private final static QName _NameUserRoleId_QNAME = new QName("urn:tooling.soap.sforce.com", "UserRoleId");
    private final static QName _NameLastReferencedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastReferencedDate");
    private final static QName _NameRecordType_QNAME = new QName("urn:tooling.soap.sforce.com", "RecordType");
    private final static QName _NameTitle_QNAME = new QName("urn:tooling.soap.sforce.com", "Title");
    private final static QName _NameLastName_QNAME = new QName("urn:tooling.soap.sforce.com", "LastName");
    private final static QName _NameProfileId_QNAME = new QName("urn:tooling.soap.sforce.com", "ProfileId");
    private final static QName _NameProfile_QNAME = new QName("urn:tooling.soap.sforce.com", "Profile");
    private final static QName _TraceFlagTracedEntityId_QNAME = new QName("urn:tooling.soap.sforce.com", "TracedEntityId");
    private final static QName _TraceFlagApexCode_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexCode");
    private final static QName _TraceFlagSystem_QNAME = new QName("urn:tooling.soap.sforce.com", "System");
    private final static QName _TraceFlagCallout_QNAME = new QName("urn:tooling.soap.sforce.com", "Callout");
    private final static QName _TraceFlagDatabase_QNAME = new QName("urn:tooling.soap.sforce.com", "Database");
    private final static QName _TraceFlagWorkflow_QNAME = new QName("urn:tooling.soap.sforce.com", "Workflow");
    private final static QName _TraceFlagVisualforce_QNAME = new QName("urn:tooling.soap.sforce.com", "Visualforce");
    private final static QName _TraceFlagValidation_QNAME = new QName("urn:tooling.soap.sforce.com", "Validation");
    private final static QName _TraceFlagApexProfiling_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexProfiling");
    private final static QName _TraceFlagTracedEntity_QNAME = new QName("urn:tooling.soap.sforce.com", "TracedEntity");
    private final static QName _AsyncApexJobNumberOfErrors_QNAME = new QName("urn:tooling.soap.sforce.com", "NumberOfErrors");
    private final static QName _AsyncApexJobJobType_QNAME = new QName("urn:tooling.soap.sforce.com", "JobType");
    private final static QName _AsyncApexJobCompletedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "CompletedDate");
    private final static QName _AsyncApexJobJobItemsProcessed_QNAME = new QName("urn:tooling.soap.sforce.com", "JobItemsProcessed");
    private final static QName _AsyncApexJobLastProcessed_QNAME = new QName("urn:tooling.soap.sforce.com", "LastProcessed");
    private final static QName _AsyncApexJobTotalJobItems_QNAME = new QName("urn:tooling.soap.sforce.com", "TotalJobItems");
    private final static QName _AsyncApexJobLastProcessedOffset_QNAME = new QName("urn:tooling.soap.sforce.com", "LastProcessedOffset");
    private final static QName _AggregateExpressionResultColumnMetadataDisplayName_QNAME = new QName("urn:tooling.soap.sforce.com", "displayName");
    private final static QName _WorkflowAlertSenderType_QNAME = new QName("urn:tooling.soap.sforce.com", "SenderType");
    private final static QName _WorkflowAlertTemplateId_QNAME = new QName("urn:tooling.soap.sforce.com", "TemplateId");
    private final static QName _WorkflowAlertCcEmails_QNAME = new QName("urn:tooling.soap.sforce.com", "CcEmails");
    private final static QName _LayoutShowSubmitAndAttachButton_QNAME = new QName("urn:tooling.soap.sforce.com", "ShowSubmitAndAttachButton");
    private final static QName _WorkflowTaskPriority_QNAME = new QName("urn:tooling.soap.sforce.com", "Priority");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nttdata.sf.tooling
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpsertResponse }
     * 
     */
    public UpsertResponse createUpsertResponse() {
        return new UpsertResponse();
    }

    /**
     * Create an instance of {@link UpsertResult }
     * 
     */
    public UpsertResult createUpsertResult() {
        return new UpsertResult();
    }

    /**
     * Create an instance of {@link Upsert }
     * 
     */
    public Upsert createUpsert() {
        return new Upsert();
    }

    /**
     * Create an instance of {@link SObject }
     * 
     */
    public SObject createSObject() {
        return new SObject();
    }

    /**
     * Create an instance of {@link DescribeSObjectResponse }
     * 
     */
    public DescribeSObjectResponse createDescribeSObjectResponse() {
        return new DescribeSObjectResponse();
    }

    /**
     * Create an instance of {@link DescribeSObjectResult }
     * 
     */
    public DescribeSObjectResult createDescribeSObjectResult() {
        return new DescribeSObjectResult();
    }

    /**
     * Create an instance of {@link ExecuteAnonymous }
     * 
     */
    public ExecuteAnonymous createExecuteAnonymous() {
        return new ExecuteAnonymous();
    }

    /**
     * Create an instance of {@link GetUpdatedResponse }
     * 
     */
    public GetUpdatedResponse createGetUpdatedResponse() {
        return new GetUpdatedResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedResult }
     * 
     */
    public GetUpdatedResult createGetUpdatedResult() {
        return new GetUpdatedResult();
    }

    /**
     * Create an instance of {@link QueryAllResponse }
     * 
     */
    public QueryAllResponse createQueryAllResponse() {
        return new QueryAllResponse();
    }

    /**
     * Create an instance of {@link QueryResult }
     * 
     */
    public QueryResult createQueryResult() {
        return new QueryResult();
    }

    /**
     * Create an instance of {@link QueryMore }
     * 
     */
    public QueryMore createQueryMore() {
        return new QueryMore();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link SaveResult }
     * 
     */
    public SaveResult createSaveResult() {
        return new SaveResult();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link PackageVersionHeader }
     * 
     */
    public PackageVersionHeader createPackageVersionHeader() {
        return new PackageVersionHeader();
    }

    /**
     * Create an instance of {@link PackageVersion }
     * 
     */
    public PackageVersion createPackageVersion() {
        return new PackageVersion();
    }

    /**
     * Create an instance of {@link DescribeGlobalResponse }
     * 
     */
    public DescribeGlobalResponse createDescribeGlobalResponse() {
        return new DescribeGlobalResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalResult }
     * 
     */
    public DescribeGlobalResult createDescribeGlobalResult() {
        return new DescribeGlobalResult();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link DebuggingHeader }
     * 
     */
    public DebuggingHeader createDebuggingHeader() {
        return new DebuggingHeader();
    }

    /**
     * Create an instance of {@link LogInfo }
     * 
     */
    public LogInfo createLogInfo() {
        return new LogInfo();
    }

    /**
     * Create an instance of {@link RunTestsResponse }
     * 
     */
    public RunTestsResponse createRunTestsResponse() {
        return new RunTestsResponse();
    }

    /**
     * Create an instance of {@link RunTestsResult }
     * 
     */
    public RunTestsResult createRunTestsResult() {
        return new RunTestsResult();
    }

    /**
     * Create an instance of {@link DebuggingInfo }
     * 
     */
    public DebuggingInfo createDebuggingInfo() {
        return new DebuggingInfo();
    }

    /**
     * Create an instance of {@link QueryMoreResponse }
     * 
     */
    public QueryMoreResponse createQueryMoreResponse() {
        return new QueryMoreResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResult }
     * 
     */
    public GetUserInfoResult createGetUserInfoResult() {
        return new GetUserInfoResult();
    }

    /**
     * Create an instance of {@link GetDeleted }
     * 
     */
    public GetDeleted createGetDeleted() {
        return new GetDeleted();
    }

    /**
     * Create an instance of {@link ApiQueryFault }
     * 
     */
    public ApiQueryFault createApiQueryFault() {
        return new ApiQueryFault();
    }

    /**
     * Create an instance of {@link ExecuteAnonymousResponse }
     * 
     */
    public ExecuteAnonymousResponse createExecuteAnonymousResponse() {
        return new ExecuteAnonymousResponse();
    }

    /**
     * Create an instance of {@link ExecuteAnonymousResult }
     * 
     */
    public ExecuteAnonymousResult createExecuteAnonymousResult() {
        return new ExecuteAnonymousResult();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActions }
     * 
     */
    public DescribeWorkitemActions createDescribeWorkitemActions() {
        return new DescribeWorkitemActions();
    }

    /**
     * Create an instance of {@link RunTestsAsynchronous }
     * 
     */
    public RunTestsAsynchronous createRunTestsAsynchronous() {
        return new RunTestsAsynchronous();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link AllowFieldTruncationHeader }
     * 
     */
    public AllowFieldTruncationHeader createAllowFieldTruncationHeader() {
        return new AllowFieldTruncationHeader();
    }

    /**
     * Create an instance of {@link DisableFeedTrackingHeader }
     * 
     */
    public DisableFeedTrackingHeader createDisableFeedTrackingHeader() {
        return new DisableFeedTrackingHeader();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link GetServerTimestampResponse }
     * 
     */
    public GetServerTimestampResponse createGetServerTimestampResponse() {
        return new GetServerTimestampResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestampResult }
     * 
     */
    public GetServerTimestampResult createGetServerTimestampResult() {
        return new GetServerTimestampResult();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResponse }
     * 
     */
    public InvalidateSessionsResponse createInvalidateSessionsResponse() {
        return new InvalidateSessionsResponse();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResult }
     * 
     */
    public InvalidateSessionsResult createInvalidateSessionsResult() {
        return new InvalidateSessionsResult();
    }

    /**
     * Create an instance of {@link DescribeValueTypeResponse }
     * 
     */
    public DescribeValueTypeResponse createDescribeValueTypeResponse() {
        return new DescribeValueTypeResponse();
    }

    /**
     * Create an instance of {@link DescribeValueTypeResult }
     * 
     */
    public DescribeValueTypeResult createDescribeValueTypeResult() {
        return new DescribeValueTypeResult();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link QueryAll }
     * 
     */
    public QueryAll createQueryAll() {
        return new QueryAll();
    }

    /**
     * Create an instance of {@link GetUpdated }
     * 
     */
    public GetUpdated createGetUpdated() {
        return new GetUpdated();
    }

    /**
     * Create an instance of {@link DescribeSObjects }
     * 
     */
    public DescribeSObjects createDescribeSObjects() {
        return new DescribeSObjects();
    }

    /**
     * Create an instance of {@link DescribeSObject }
     * 
     */
    public DescribeSObject createDescribeSObject() {
        return new DescribeSObject();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActionsResponse }
     * 
     */
    public DescribeWorkitemActionsResponse createDescribeWorkitemActionsResponse() {
        return new DescribeWorkitemActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActionResult }
     * 
     */
    public DescribeWorkitemActionResult createDescribeWorkitemActionResult() {
        return new DescribeWorkitemActionResult();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link CallOptions }
     * 
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link SetPassword }
     * 
     */
    public SetPassword createSetPassword() {
        return new SetPassword();
    }

    /**
     * Create an instance of {@link MetadataWarningsHeader }
     * 
     */
    public MetadataWarningsHeader createMetadataWarningsHeader() {
        return new MetadataWarningsHeader();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestamp }
     * 
     */
    public GetServerTimestamp createGetServerTimestamp() {
        return new GetServerTimestamp();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link InvalidateSessions }
     * 
     */
    public InvalidateSessions createInvalidateSessions() {
        return new InvalidateSessions();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteResult }
     * 
     */
    public DeleteResult createDeleteResult() {
        return new DeleteResult();
    }

    /**
     * Create an instance of {@link DescribeValueType }
     * 
     */
    public DescribeValueType createDescribeValueType() {
        return new DescribeValueType();
    }

    /**
     * Create an instance of {@link RunTestsAsynchronousResponse }
     * 
     */
    public RunTestsAsynchronousResponse createRunTestsAsynchronousResponse() {
        return new RunTestsAsynchronousResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link SetPasswordResponse }
     * 
     */
    public SetPasswordResponse createSetPasswordResponse() {
        return new SetPasswordResponse();
    }

    /**
     * Create an instance of {@link SetPasswordResult }
     * 
     */
    public SetPasswordResult createSetPasswordResult() {
        return new SetPasswordResult();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link GetDeletedResponse }
     * 
     */
    public GetDeletedResponse createGetDeletedResponse() {
        return new GetDeletedResponse();
    }

    /**
     * Create an instance of {@link GetDeletedResult }
     * 
     */
    public GetDeletedResult createGetDeletedResult() {
        return new GetDeletedResult();
    }

    /**
     * Create an instance of {@link DescribeGlobal }
     * 
     */
    public DescribeGlobal createDescribeGlobal() {
        return new DescribeGlobal();
    }

    /**
     * Create an instance of {@link RunTests }
     * 
     */
    public RunTests createRunTests() {
        return new RunTests();
    }

    /**
     * Create an instance of {@link RunTestsRequest }
     * 
     */
    public RunTestsRequest createRunTestsRequest() {
        return new RunTestsRequest();
    }

    /**
     * Create an instance of {@link DescribeSObjectsResponse }
     * 
     */
    public DescribeSObjectsResponse createDescribeSObjectsResponse() {
        return new DescribeSObjectsResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link WorkflowRule }
     * 
     */
    public WorkflowRule createWorkflowRule() {
        return new WorkflowRule();
    }

    /**
     * Create an instance of {@link WorkflowFlowAction }
     * 
     */
    public WorkflowFlowAction createWorkflowFlowAction() {
        return new WorkflowFlowAction();
    }

    /**
     * Create an instance of {@link CustomObjectMetadata }
     * 
     */
    public CustomObjectMetadata createCustomObjectMetadata() {
        return new CustomObjectMetadata();
    }

    /**
     * Create an instance of {@link MetadataContainerMember }
     * 
     */
    public MetadataContainerMember createMetadataContainerMember() {
        return new MetadataContainerMember();
    }

    /**
     * Create an instance of {@link FlowApexPluginCall }
     * 
     */
    public FlowApexPluginCall createFlowApexPluginCall() {
        return new FlowApexPluginCall();
    }

    /**
     * Create an instance of {@link CodeCoverageWarning }
     * 
     */
    public CodeCoverageWarning createCodeCoverageWarning() {
        return new CodeCoverageWarning();
    }

    /**
     * Create an instance of {@link FlowInputValidationRule }
     * 
     */
    public FlowInputValidationRule createFlowInputValidationRule() {
        return new FlowInputValidationRule();
    }

    /**
     * Create an instance of {@link TraceFlag }
     * 
     */
    public TraceFlag createTraceFlag() {
        return new TraceFlag();
    }

    /**
     * Create an instance of {@link IDEPerspective }
     * 
     */
    public IDEPerspective createIDEPerspective() {
        return new IDEPerspective();
    }

    /**
     * Create an instance of {@link FlowFormula }
     * 
     */
    public FlowFormula createFlowFormula() {
        return new FlowFormula();
    }

    /**
     * Create an instance of {@link EscalationRules }
     * 
     */
    public EscalationRules createEscalationRules() {
        return new EscalationRules();
    }

    /**
     * Create an instance of {@link AttributeDefinition }
     * 
     */
    public AttributeDefinition createAttributeDefinition() {
        return new AttributeDefinition();
    }

    /**
     * Create an instance of {@link BooleanValue }
     * 
     */
    public BooleanValue createBooleanValue() {
        return new BooleanValue();
    }

    /**
     * Create an instance of {@link PrimaryTabComponents }
     * 
     */
    public PrimaryTabComponents createPrimaryTabComponents() {
        return new PrimaryTabComponents();
    }

    /**
     * Create an instance of {@link WorkflowEmailRecipient }
     * 
     */
    public WorkflowEmailRecipient createWorkflowEmailRecipient() {
        return new WorkflowEmailRecipient();
    }

    /**
     * Create an instance of {@link LoginFault }
     * 
     */
    public LoginFault createLoginFault() {
        return new LoginFault();
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link HeapDump }
     * 
     */
    public HeapDump createHeapDump() {
        return new HeapDump();
    }

    /**
     * Create an instance of {@link FilterItem }
     * 
     */
    public FilterItem createFilterItem() {
        return new FilterItem();
    }

    /**
     * Create an instance of {@link QuickActionListMetadata }
     * 
     */
    public QuickActionListMetadata createQuickActionListMetadata() {
        return new QuickActionListMetadata();
    }

    /**
     * Create an instance of {@link QueryResultMetadata }
     * 
     */
    public QueryResultMetadata createQueryResultMetadata() {
        return new QueryResultMetadata();
    }

    /**
     * Create an instance of {@link WorkflowFlowActionParameter }
     * 
     */
    public WorkflowFlowActionParameter createWorkflowFlowActionParameter() {
        return new WorkflowFlowActionParameter();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link WorkflowTaskMetadata }
     * 
     */
    public WorkflowTaskMetadata createWorkflowTaskMetadata() {
        return new WorkflowTaskMetadata();
    }

    /**
     * Create an instance of {@link StateValue }
     * 
     */
    public StateValue createStateValue() {
        return new StateValue();
    }

    /**
     * Create an instance of {@link ApexExecutionOverlayAction }
     * 
     */
    public ApexExecutionOverlayAction createApexExecutionOverlayAction() {
        return new ApexExecutionOverlayAction();
    }

    /**
     * Create an instance of {@link NumberValue }
     * 
     */
    public NumberValue createNumberValue() {
        return new NumberValue();
    }

    /**
     * Create an instance of {@link Layout }
     * 
     */
    public Layout createLayout() {
        return new Layout();
    }

    /**
     * Create an instance of {@link ApexOrgWideCoverage }
     * 
     */
    public ApexOrgWideCoverage createApexOrgWideCoverage() {
        return new ApexOrgWideCoverage();
    }

    /**
     * Create an instance of {@link FlowElement }
     * 
     */
    public FlowElement createFlowElement() {
        return new FlowElement();
    }

    /**
     * Create an instance of {@link FlowInputFieldAssignment }
     * 
     */
    public FlowInputFieldAssignment createFlowInputFieldAssignment() {
        return new FlowInputFieldAssignment();
    }

    /**
     * Create an instance of {@link ChildRelationship }
     * 
     */
    public ChildRelationship createChildRelationship() {
        return new ChildRelationship();
    }

    /**
     * Create an instance of {@link FlowLoop }
     * 
     */
    public FlowLoop createFlowLoop() {
        return new FlowLoop();
    }

    /**
     * Create an instance of {@link FlowActionCallInputParameter }
     * 
     */
    public FlowActionCallInputParameter createFlowActionCallInputParameter() {
        return new FlowActionCallInputParameter();
    }

    /**
     * Create an instance of {@link ApexLog }
     * 
     */
    public ApexLog createApexLog() {
        return new ApexLog();
    }

    /**
     * Create an instance of {@link FlowRecordUpdate }
     * 
     */
    public FlowRecordUpdate createFlowRecordUpdate() {
        return new FlowRecordUpdate();
    }

    /**
     * Create an instance of {@link FlowRule }
     * 
     */
    public FlowRule createFlowRule() {
        return new FlowRule();
    }

    /**
     * Create an instance of {@link LookupFilter }
     * 
     */
    public LookupFilter createLookupFilter() {
        return new LookupFilter();
    }

    /**
     * Create an instance of {@link DeployMessage }
     * 
     */
    public DeployMessage createDeployMessage() {
        return new DeployMessage();
    }

    /**
     * Create an instance of {@link FlowSubflowInputAssignment }
     * 
     */
    public FlowSubflowInputAssignment createFlowSubflowInputAssignment() {
        return new FlowSubflowInputAssignment();
    }

    /**
     * Create an instance of {@link MalformedQueryFault }
     * 
     */
    public MalformedQueryFault createMalformedQueryFault() {
        return new MalformedQueryFault();
    }

    /**
     * Create an instance of {@link RecordTypeMetadata }
     * 
     */
    public RecordTypeMetadata createRecordTypeMetadata() {
        return new RecordTypeMetadata();
    }

    /**
     * Create an instance of {@link CodeCoverageResult }
     * 
     */
    public CodeCoverageResult createCodeCoverageResult() {
        return new CodeCoverageResult();
    }

    /**
     * Create an instance of {@link ApexComponent }
     * 
     */
    public ApexComponent createApexComponent() {
        return new ApexComponent();
    }

    /**
     * Create an instance of {@link WorkflowKnowledgePublish }
     * 
     */
    public WorkflowKnowledgePublish createWorkflowKnowledgePublish() {
        return new WorkflowKnowledgePublish();
    }

    /**
     * Create an instance of {@link InvalidQueryLocatorFault }
     * 
     */
    public InvalidQueryLocatorFault createInvalidQueryLocatorFault() {
        return new InvalidQueryLocatorFault();
    }

    /**
     * Create an instance of {@link FlowWait }
     * 
     */
    public FlowWait createFlowWait() {
        return new FlowWait();
    }

    /**
     * Create an instance of {@link FlexiPage }
     * 
     */
    public FlexiPage createFlexiPage() {
        return new FlexiPage();
    }

    /**
     * Create an instance of {@link Workflow }
     * 
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of {@link RecordTypePicklistValue }
     * 
     */
    public RecordTypePicklistValue createRecordTypePicklistValue() {
        return new RecordTypePicklistValue();
    }

    /**
     * Create an instance of {@link ExternalMethod }
     * 
     */
    public ExternalMethod createExternalMethod() {
        return new ExternalMethod();
    }

    /**
     * Create an instance of {@link SOQLResult }
     * 
     */
    public SOQLResult createSOQLResult() {
        return new SOQLResult();
    }

    /**
     * Create an instance of {@link FlowChoice }
     * 
     */
    public FlowChoice createFlowChoice() {
        return new FlowChoice();
    }

    /**
     * Create an instance of {@link DataPipelineMetadata }
     * 
     */
    public DataPipelineMetadata createDataPipelineMetadata() {
        return new DataPipelineMetadata();
    }

    /**
     * Create an instance of {@link ProfileExternalDataSourceAccess }
     * 
     */
    public ProfileExternalDataSourceAccess createProfileExternalDataSourceAccess() {
        return new ProfileExternalDataSourceAccess();
    }

    /**
     * Create an instance of {@link FeedLayoutComponent }
     * 
     */
    public FeedLayoutComponent createFeedLayoutComponent() {
        return new FeedLayoutComponent();
    }

    /**
     * Create an instance of {@link ApexClassMetadata }
     * 
     */
    public ApexClassMetadata createApexClassMetadata() {
        return new ApexClassMetadata();
    }

    /**
     * Create an instance of {@link FlowStep }
     * 
     */
    public FlowStep createFlowStep() {
        return new FlowStep();
    }

    /**
     * Create an instance of {@link WorkflowActionReference }
     * 
     */
    public WorkflowActionReference createWorkflowActionReference() {
        return new WorkflowActionReference();
    }

    /**
     * Create an instance of {@link FlowApexPluginCallInputParameter }
     * 
     */
    public FlowApexPluginCallInputParameter createFlowApexPluginCallInputParameter() {
        return new FlowApexPluginCallInputParameter();
    }

    /**
     * Create an instance of {@link ProfileObjectPermissions }
     * 
     */
    public ProfileObjectPermissions createProfileObjectPermissions() {
        return new ProfileObjectPermissions();
    }

    /**
     * Create an instance of {@link QuickActionListItemMetadata }
     * 
     */
    public QuickActionListItemMetadata createQuickActionListItemMetadata() {
        return new QuickActionListItemMetadata();
    }

    /**
     * Create an instance of {@link WorkflowTimeTrigger }
     * 
     */
    public WorkflowTimeTrigger createWorkflowTimeTrigger() {
        return new WorkflowTimeTrigger();
    }

    /**
     * Create an instance of {@link QuickActionList }
     * 
     */
    public QuickActionList createQuickActionList() {
        return new QuickActionList();
    }

    /**
     * Create an instance of {@link WorkflowOutboundMessageMetadata }
     * 
     */
    public WorkflowOutboundMessageMetadata createWorkflowOutboundMessageMetadata() {
        return new WorkflowOutboundMessageMetadata();
    }

    /**
     * Create an instance of {@link RelatedList }
     * 
     */
    public RelatedList createRelatedList() {
        return new RelatedList();
    }

    /**
     * Create an instance of {@link LayoutMetadata }
     * 
     */
    public LayoutMetadata createLayoutMetadata() {
        return new LayoutMetadata();
    }

    /**
     * Create an instance of {@link FlowActionCallOutputParameter }
     * 
     */
    public FlowActionCallOutputParameter createFlowActionCallOutputParameter() {
        return new FlowActionCallOutputParameter();
    }

    /**
     * Create an instance of {@link IDEWorkspace }
     * 
     */
    public IDEWorkspace createIDEWorkspace() {
        return new IDEWorkspace();
    }

    /**
     * Create an instance of {@link ApexComponentMember }
     * 
     */
    public ApexComponentMember createApexComponentMember() {
        return new ApexComponentMember();
    }

    /**
     * Create an instance of {@link LayoutColumn }
     * 
     */
    public LayoutColumn createLayoutColumn() {
        return new LayoutColumn();
    }

    /**
     * Create an instance of {@link WorkflowOutboundMessage }
     * 
     */
    public WorkflowOutboundMessage createWorkflowOutboundMessage() {
        return new WorkflowOutboundMessage();
    }

    /**
     * Create an instance of {@link ContainerAsyncRequest }
     * 
     */
    public ContainerAsyncRequest createContainerAsyncRequest() {
        return new ContainerAsyncRequest();
    }

    /**
     * Create an instance of {@link RunTestSuccess }
     * 
     */
    public RunTestSuccess createRunTestSuccess() {
        return new RunTestSuccess();
    }

    /**
     * Create an instance of {@link RelatedContentItem }
     * 
     */
    public RelatedContentItem createRelatedContentItem() {
        return new RelatedContentItem();
    }

    /**
     * Create an instance of {@link FeedLayout }
     * 
     */
    public FeedLayout createFeedLayout() {
        return new FeedLayout();
    }

    /**
     * Create an instance of {@link PackageVersionMetadata }
     * 
     */
    public PackageVersionMetadata createPackageVersionMetadata() {
        return new PackageVersionMetadata();
    }

    /**
     * Create an instance of {@link AggregateQueryResultColumnMetadata }
     * 
     */
    public AggregateQueryResultColumnMetadata createAggregateQueryResultColumnMetadata() {
        return new AggregateQueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link ValidationRuleMetadata }
     * 
     */
    public ValidationRuleMetadata createValidationRuleMetadata() {
        return new ValidationRuleMetadata();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link WorkflowTask }
     * 
     */
    public WorkflowTask createWorkflowTask() {
        return new WorkflowTask();
    }

    /**
     * Create an instance of {@link FilteredLookupInfo }
     * 
     */
    public FilteredLookupInfo createFilteredLookupInfo() {
        return new FilteredLookupInfo();
    }

    /**
     * Create an instance of {@link EscalationAction }
     * 
     */
    public EscalationAction createEscalationAction() {
        return new EscalationAction();
    }

    /**
     * Create an instance of {@link FlowOutputFieldAssignment }
     * 
     */
    public FlowOutputFieldAssignment createFlowOutputFieldAssignment() {
        return new FlowOutputFieldAssignment();
    }

    /**
     * Create an instance of {@link EmailTemplateMetadata }
     * 
     */
    public EmailTemplateMetadata createEmailTemplateMetadata() {
        return new EmailTemplateMetadata();
    }

    /**
     * Create an instance of {@link InvalidNewPasswordFault }
     * 
     */
    public InvalidNewPasswordFault createInvalidNewPasswordFault() {
        return new InvalidNewPasswordFault();
    }

    /**
     * Create an instance of {@link EmailTemplate }
     * 
     */
    public EmailTemplate createEmailTemplate() {
        return new EmailTemplate();
    }

    /**
     * Create an instance of {@link ApexTriggerMetadata }
     * 
     */
    public ApexTriggerMetadata createApexTriggerMetadata() {
        return new ApexTriggerMetadata();
    }

    /**
     * Create an instance of {@link MalformedSearchFault }
     * 
     */
    public MalformedSearchFault createMalformedSearchFault() {
        return new MalformedSearchFault();
    }

    /**
     * Create an instance of {@link AssignmentRule }
     * 
     */
    public AssignmentRule createAssignmentRule() {
        return new AssignmentRule();
    }

    /**
     * Create an instance of {@link AutoResponseRule }
     * 
     */
    public AutoResponseRule createAutoResponseRule() {
        return new AutoResponseRule();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link InvalidIdFault }
     * 
     */
    public InvalidIdFault createInvalidIdFault() {
        return new InvalidIdFault();
    }

    /**
     * Create an instance of {@link FieldDefinition }
     * 
     */
    public FieldDefinition createFieldDefinition() {
        return new FieldDefinition();
    }

    /**
     * Create an instance of {@link ReportChartComponentLayoutItem }
     * 
     */
    public ReportChartComponentLayoutItem createReportChartComponentLayoutItem() {
        return new ReportChartComponentLayoutItem();
    }

    /**
     * Create an instance of {@link FlowWaitEventOutputParameter }
     * 
     */
    public FlowWaitEventOutputParameter createFlowWaitEventOutputParameter() {
        return new FlowWaitEventOutputParameter();
    }

    /**
     * Create an instance of {@link FlowSubflowOutputAssignment }
     * 
     */
    public FlowSubflowOutputAssignment createFlowSubflowOutputAssignment() {
        return new FlowSubflowOutputAssignment();
    }

    /**
     * Create an instance of {@link ApexResult }
     * 
     */
    public ApexResult createApexResult() {
        return new ApexResult();
    }

    /**
     * Create an instance of {@link FlowRecordCreate }
     * 
     */
    public FlowRecordCreate createFlowRecordCreate() {
        return new FlowRecordCreate();
    }

    /**
     * Create an instance of {@link ProfileMetadata }
     * 
     */
    public ProfileMetadata createProfileMetadata() {
        return new ProfileMetadata();
    }

    /**
     * Create an instance of {@link PicklistEntry }
     * 
     */
    public PicklistEntry createPicklistEntry() {
        return new PicklistEntry();
    }

    /**
     * Create an instance of {@link ProfileLayout }
     * 
     */
    public ProfileLayout createProfileLayout() {
        return new ProfileLayout();
    }

    /**
     * Create an instance of {@link WorkflowAlertMetadata }
     * 
     */
    public WorkflowAlertMetadata createWorkflowAlertMetadata() {
        return new WorkflowAlertMetadata();
    }

    /**
     * Create an instance of {@link FlowActionCall }
     * 
     */
    public FlowActionCall createFlowActionCall() {
        return new FlowActionCall();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link NamedLayoutInfo }
     * 
     */
    public NamedLayoutInfo createNamedLayoutInfo() {
        return new NamedLayoutInfo();
    }

    /**
     * Create an instance of {@link QuickActionDefinition }
     * 
     */
    public QuickActionDefinition createQuickActionDefinition() {
        return new QuickActionDefinition();
    }

    /**
     * Create an instance of {@link UserPreference }
     * 
     */
    public UserPreference createUserPreference() {
        return new UserPreference();
    }

    /**
     * Create an instance of {@link WorkflowFieldUpdateMetadata }
     * 
     */
    public WorkflowFieldUpdateMetadata createWorkflowFieldUpdateMetadata() {
        return new WorkflowFieldUpdateMetadata();
    }

    /**
     * Create an instance of {@link FeedLayoutFilter }
     * 
     */
    public FeedLayoutFilter createFeedLayoutFilter() {
        return new FeedLayoutFilter();
    }

    /**
     * Create an instance of {@link FlowTextTemplate }
     * 
     */
    public FlowTextTemplate createFlowTextTemplate() {
        return new FlowTextTemplate();
    }

    /**
     * Create an instance of {@link RelatedListItem }
     * 
     */
    public RelatedListItem createRelatedListItem() {
        return new RelatedListItem();
    }

    /**
     * Create an instance of {@link FlowNode }
     * 
     */
    public FlowNode createFlowNode() {
        return new FlowNode();
    }

    /**
     * Create an instance of {@link FlowConnector }
     * 
     */
    public FlowConnector createFlowConnector() {
        return new FlowConnector();
    }

    /**
     * Create an instance of {@link FlowRecordLookup }
     * 
     */
    public FlowRecordLookup createFlowRecordLookup() {
        return new FlowRecordLookup();
    }

    /**
     * Create an instance of {@link ProfileApexClassAccess }
     * 
     */
    public ProfileApexClassAccess createProfileApexClassAccess() {
        return new ProfileApexClassAccess();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link MenuItem }
     * 
     */
    public MenuItem createMenuItem() {
        return new MenuItem();
    }

    /**
     * Create an instance of {@link ComponentInstanceProperty }
     * 
     */
    public ComponentInstanceProperty createComponentInstanceProperty() {
        return new ComponentInstanceProperty();
    }

    /**
     * Create an instance of {@link FlowRecordDelete }
     * 
     */
    public FlowRecordDelete createFlowRecordDelete() {
        return new FlowRecordDelete();
    }

    /**
     * Create an instance of {@link FlowDecision }
     * 
     */
    public FlowDecision createFlowDecision() {
        return new FlowDecision();
    }

    /**
     * Create an instance of {@link AuraDefinition }
     * 
     */
    public AuraDefinition createAuraDefinition() {
        return new AuraDefinition();
    }

    /**
     * Create an instance of {@link SymbolTable }
     * 
     */
    public SymbolTable createSymbolTable() {
        return new SymbolTable();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link QuickActionListItem }
     * 
     */
    public QuickActionListItem createQuickActionListItem() {
        return new QuickActionListItem();
    }

    /**
     * Create an instance of {@link FlowWaitEvent }
     * 
     */
    public FlowWaitEvent createFlowWaitEvent() {
        return new FlowWaitEvent();
    }

    /**
     * Create an instance of {@link FlowApexPluginCallOutputParameter }
     * 
     */
    public FlowApexPluginCallOutputParameter createFlowApexPluginCallOutputParameter() {
        return new FlowApexPluginCallOutputParameter();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Method }
     * 
     */
    public Method createMethod() {
        return new Method();
    }

    /**
     * Create an instance of {@link CustomConsoleComponents }
     * 
     */
    public CustomConsoleComponents createCustomConsoleComponents() {
        return new CustomConsoleComponents();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link RunTestFailure }
     * 
     */
    public RunTestFailure createRunTestFailure() {
        return new RunTestFailure();
    }

    /**
     * Create an instance of {@link DeployDetails }
     * 
     */
    public DeployDetails createDeployDetails() {
        return new DeployDetails();
    }

    /**
     * Create an instance of {@link FlowRecordFilter }
     * 
     */
    public FlowRecordFilter createFlowRecordFilter() {
        return new FlowRecordFilter();
    }

    /**
     * Create an instance of {@link SetValue }
     * 
     */
    public SetValue createSetValue() {
        return new SetValue();
    }

    /**
     * Create an instance of {@link SubtabComponents }
     * 
     */
    public SubtabComponents createSubtabComponents() {
        return new SubtabComponents();
    }

    /**
     * Create an instance of {@link FlowScreen }
     * 
     */
    public FlowScreen createFlowScreen() {
        return new FlowScreen();
    }

    /**
     * Create an instance of {@link ListValue }
     * 
     */
    public ListValue createListValue() {
        return new ListValue();
    }

    /**
     * Create an instance of {@link WorkflowAlert }
     * 
     */
    public WorkflowAlert createWorkflowAlert() {
        return new WorkflowAlert();
    }

    /**
     * Create an instance of {@link Coverage }
     * 
     */
    public Coverage createCoverage() {
        return new Coverage();
    }

    /**
     * Create an instance of {@link Picklist }
     * 
     */
    public Picklist createPicklist() {
        return new Picklist();
    }

    /**
     * Create an instance of {@link ExternalConstructor }
     * 
     */
    public ExternalConstructor createExternalConstructor() {
        return new ExternalConstructor();
    }

    /**
     * Create an instance of {@link SummaryLayoutItem }
     * 
     */
    public SummaryLayoutItem createSummaryLayoutItem() {
        return new SummaryLayoutItem();
    }

    /**
     * Create an instance of {@link LayoutSection }
     * 
     */
    public LayoutSection createLayoutSection() {
        return new LayoutSection();
    }

    /**
     * Create an instance of {@link EntityDefinition }
     * 
     */
    public EntityDefinition createEntityDefinition() {
        return new EntityDefinition();
    }

    /**
     * Create an instance of {@link ApexClassMember }
     * 
     */
    public ApexClassMember createApexClassMember() {
        return new ApexClassMember();
    }

    /**
     * Create an instance of {@link ApexPageMember }
     * 
     */
    public ApexPageMember createApexPageMember() {
        return new ApexPageMember();
    }

    /**
     * Create an instance of {@link ValidationRule }
     * 
     */
    public ValidationRule createValidationRule() {
        return new ValidationRule();
    }

    /**
     * Create an instance of {@link QueryResultColumnMetadata }
     * 
     */
    public QueryResultColumnMetadata createQueryResultColumnMetadata() {
        return new QueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link FlowWaitEventInputParameter }
     * 
     */
    public FlowWaitEventInputParameter createFlowWaitEventInputParameter() {
        return new FlowWaitEventInputParameter();
    }

    /**
     * Create an instance of {@link AuraDefinitionBundle }
     * 
     */
    public AuraDefinitionBundle createAuraDefinitionBundle() {
        return new AuraDefinitionBundle();
    }

    /**
     * Create an instance of {@link RecordTypeInfo }
     * 
     */
    public RecordTypeInfo createRecordTypeInfo() {
        return new RecordTypeInfo();
    }

    /**
     * Create an instance of {@link ApexPage }
     * 
     */
    public ApexPage createApexPage() {
        return new ApexPage();
    }

    /**
     * Create an instance of {@link RelatedContent }
     * 
     */
    public RelatedContent createRelatedContent() {
        return new RelatedContent();
    }

    /**
     * Create an instance of {@link FlowMetadataValue }
     * 
     */
    public FlowMetadataValue createFlowMetadataValue() {
        return new FlowMetadataValue();
    }

    /**
     * Create an instance of {@link ValueTypeField }
     * 
     */
    public ValueTypeField createValueTypeField() {
        return new ValueTypeField();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link FlowSubflow }
     * 
     */
    public FlowSubflow createFlowSubflow() {
        return new FlowSubflow();
    }

    /**
     * Create an instance of {@link FlowScreenField }
     * 
     */
    public FlowScreenField createFlowScreenField() {
        return new FlowScreenField();
    }

    /**
     * Create an instance of {@link AssignmentRules }
     * 
     */
    public AssignmentRules createAssignmentRules() {
        return new AssignmentRules();
    }

    /**
     * Create an instance of {@link PrimitiveQueryResultColumnMetadata }
     * 
     */
    public PrimitiveQueryResultColumnMetadata createPrimitiveQueryResultColumnMetadata() {
        return new PrimitiveQueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link ComponentInstance }
     * 
     */
    public ComponentInstance createComponentInstance() {
        return new ComponentInstance();
    }

    /**
     * Create an instance of {@link EscalationRule }
     * 
     */
    public EscalationRule createEscalationRule() {
        return new EscalationRule();
    }

    /**
     * Create an instance of {@link AggregateExpressionResultColumnMetadata }
     * 
     */
    public AggregateExpressionResultColumnMetadata createAggregateExpressionResultColumnMetadata() {
        return new AggregateExpressionResultColumnMetadata();
    }

    /**
     * Create an instance of {@link SidebarComponent }
     * 
     */
    public SidebarComponent createSidebarComponent() {
        return new SidebarComponent();
    }

    /**
     * Create an instance of {@link SummaryLayout }
     * 
     */
    public SummaryLayout createSummaryLayout() {
        return new SummaryLayout();
    }

    /**
     * Create an instance of {@link FlowCondition }
     * 
     */
    public FlowCondition createFlowCondition() {
        return new FlowCondition();
    }

    /**
     * Create an instance of {@link FlowAssignment }
     * 
     */
    public FlowAssignment createFlowAssignment() {
        return new FlowAssignment();
    }

    /**
     * Create an instance of {@link ProfileApplicationVisibility }
     * 
     */
    public ProfileApplicationVisibility createProfileApplicationVisibility() {
        return new ProfileApplicationVisibility();
    }

    /**
     * Create an instance of {@link FlowElementReferenceOrValue }
     * 
     */
    public FlowElementReferenceOrValue createFlowElementReferenceOrValue() {
        return new FlowElementReferenceOrValue();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFault }
     * 
     */
    public UnexpectedErrorFault createUnexpectedErrorFault() {
        return new UnexpectedErrorFault();
    }

    /**
     * Create an instance of {@link HeapAddress }
     * 
     */
    public HeapAddress createHeapAddress() {
        return new HeapAddress();
    }

    /**
     * Create an instance of {@link ProfileTabVisibility }
     * 
     */
    public ProfileTabVisibility createProfileTabVisibility() {
        return new ProfileTabVisibility();
    }

    /**
     * Create an instance of {@link CompactLayoutInfo }
     * 
     */
    public CompactLayoutInfo createCompactLayoutInfo() {
        return new CompactLayoutInfo();
    }

    /**
     * Create an instance of {@link ActionOverride }
     * 
     */
    public ActionOverride createActionOverride() {
        return new ActionOverride();
    }

    /**
     * Create an instance of {@link ApexTestResult }
     * 
     */
    public ApexTestResult createApexTestResult() {
        return new ApexTestResult();
    }

    /**
     * Create an instance of {@link ApexTestQueueItem }
     * 
     */
    public ApexTestQueueItem createApexTestQueueItem() {
        return new ApexTestQueueItem();
    }

    /**
     * Create an instance of {@link ApexCodeCoverageAggregate }
     * 
     */
    public ApexCodeCoverageAggregate createApexCodeCoverageAggregate() {
        return new ApexCodeCoverageAggregate();
    }

    /**
     * Create an instance of {@link WorkflowAction }
     * 
     */
    public WorkflowAction createWorkflowAction() {
        return new WorkflowAction();
    }

    /**
     * Create an instance of {@link StringValue }
     * 
     */
    public StringValue createStringValue() {
        return new StringValue();
    }

    /**
     * Create an instance of {@link ExternalSymbol }
     * 
     */
    public ExternalSymbol createExternalSymbol() {
        return new ExternalSymbol();
    }

    /**
     * Create an instance of {@link AsyncApexJob }
     * 
     */
    public AsyncApexJob createAsyncApexJob() {
        return new AsyncApexJob();
    }

    /**
     * Create an instance of {@link CustomObject }
     * 
     */
    public CustomObject createCustomObject() {
        return new CustomObject();
    }

    /**
     * Create an instance of {@link ApexTrigger }
     * 
     */
    public ApexTrigger createApexTrigger() {
        return new ApexTrigger();
    }

    /**
     * Create an instance of {@link FlowAssignmentItem }
     * 
     */
    public FlowAssignmentItem createFlowAssignmentItem() {
        return new FlowAssignmentItem();
    }

    /**
     * Create an instance of {@link Constructor }
     * 
     */
    public Constructor createConstructor() {
        return new Constructor();
    }

    /**
     * Create an instance of {@link WorkflowFieldUpdateMember }
     * 
     */
    public WorkflowFieldUpdateMember createWorkflowFieldUpdateMember() {
        return new WorkflowFieldUpdateMember();
    }

    /**
     * Create an instance of {@link PicklistValue }
     * 
     */
    public PicklistValue createPicklistValue() {
        return new PicklistValue();
    }

    /**
     * Create an instance of {@link FlexiPageRegion }
     * 
     */
    public FlexiPageRegion createFlexiPageRegion() {
        return new FlexiPageRegion();
    }

    /**
     * Create an instance of {@link WorkflowSend }
     * 
     */
    public WorkflowSend createWorkflowSend() {
        return new WorkflowSend();
    }

    /**
     * Create an instance of {@link TypeExtent }
     * 
     */
    public TypeExtent createTypeExtent() {
        return new TypeExtent();
    }

    /**
     * Create an instance of {@link ProfileLoginIpRange }
     * 
     */
    public ProfileLoginIpRange createProfileLoginIpRange() {
        return new ProfileLoginIpRange();
    }

    /**
     * Create an instance of {@link AllowedWorkitemAction }
     * 
     */
    public AllowedWorkitemAction createAllowedWorkitemAction() {
        return new AllowedWorkitemAction();
    }

    /**
     * Create an instance of {@link RuleEntry }
     * 
     */
    public RuleEntry createRuleEntry() {
        return new RuleEntry();
    }

    /**
     * Create an instance of {@link ApexComponentMetadata }
     * 
     */
    public ApexComponentMetadata createApexComponentMetadata() {
        return new ApexComponentMetadata();
    }

    /**
     * Create an instance of {@link WorkflowFieldUpdate }
     * 
     */
    public WorkflowFieldUpdate createWorkflowFieldUpdate() {
        return new WorkflowFieldUpdate();
    }

    /**
     * Create an instance of {@link FlowChoiceUserInput }
     * 
     */
    public FlowChoiceUserInput createFlowChoiceUserInput() {
        return new FlowChoiceUserInput();
    }

    /**
     * Create an instance of {@link DeletedRecord }
     * 
     */
    public DeletedRecord createDeletedRecord() {
        return new DeletedRecord();
    }

    /**
     * Create an instance of {@link FlowMetadata }
     * 
     */
    public FlowMetadata createFlowMetadata() {
        return new FlowMetadata();
    }

    /**
     * Create an instance of {@link ApexCodeCoverage }
     * 
     */
    public ApexCodeCoverage createApexCodeCoverage() {
        return new ApexCodeCoverage();
    }

    /**
     * Create an instance of {@link ComplexQueryResultColumnMetadata }
     * 
     */
    public ComplexQueryResultColumnMetadata createComplexQueryResultColumnMetadata() {
        return new ComplexQueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link ApexPageMetadata }
     * 
     */
    public ApexPageMetadata createApexPageMetadata() {
        return new ApexPageMetadata();
    }

    /**
     * Create an instance of {@link FlowBaseElement }
     * 
     */
    public FlowBaseElement createFlowBaseElement() {
        return new FlowBaseElement();
    }

    /**
     * Create an instance of {@link WorkflowRuleMetadata }
     * 
     */
    public WorkflowRuleMetadata createWorkflowRuleMetadata() {
        return new WorkflowRuleMetadata();
    }

    /**
     * Create an instance of {@link FlowConstant }
     * 
     */
    public FlowConstant createFlowConstant() {
        return new FlowConstant();
    }

    /**
     * Create an instance of {@link ProfileRecordTypeVisibility }
     * 
     */
    public ProfileRecordTypeVisibility createProfileRecordTypeVisibility() {
        return new ProfileRecordTypeVisibility();
    }

    /**
     * Create an instance of {@link StaticResource }
     * 
     */
    public StaticResource createStaticResource() {
        return new StaticResource();
    }

    /**
     * Create an instance of {@link ProfileFieldLevelSecurity }
     * 
     */
    public ProfileFieldLevelSecurity createProfileFieldLevelSecurity() {
        return new ProfileFieldLevelSecurity();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link CompactLayout }
     * 
     */
    public CompactLayout createCompactLayout() {
        return new CompactLayout();
    }

    /**
     * Create an instance of {@link CompactLayoutMetadata }
     * 
     */
    public CompactLayoutMetadata createCompactLayoutMetadata() {
        return new CompactLayoutMetadata();
    }

    /**
     * Create an instance of {@link MiniLayout }
     * 
     */
    public MiniLayout createMiniLayout() {
        return new MiniLayout();
    }

    /**
     * Create an instance of {@link FlowVariable }
     * 
     */
    public FlowVariable createFlowVariable() {
        return new FlowVariable();
    }

    /**
     * Create an instance of {@link VisibilitySymbol }
     * 
     */
    public VisibilitySymbol createVisibilitySymbol() {
        return new VisibilitySymbol();
    }

    /**
     * Create an instance of {@link ProfileLoginHours }
     * 
     */
    public ProfileLoginHours createProfileLoginHours() {
        return new ProfileLoginHours();
    }

    /**
     * Create an instance of {@link CodeLocation }
     * 
     */
    public CodeLocation createCodeLocation() {
        return new CodeLocation();
    }

    /**
     * Create an instance of {@link ProfileUserPermission }
     * 
     */
    public ProfileUserPermission createProfileUserPermission() {
        return new ProfileUserPermission();
    }

    /**
     * Create an instance of {@link FlowDynamicChoiceSet }
     * 
     */
    public FlowDynamicChoiceSet createFlowDynamicChoiceSet() {
        return new FlowDynamicChoiceSet();
    }

    /**
     * Create an instance of {@link InvalidSObjectFault }
     * 
     */
    public InvalidSObjectFault createInvalidSObjectFault() {
        return new InvalidSObjectFault();
    }

    /**
     * Create an instance of {@link DescribeGlobalSObjectResult }
     * 
     */
    public DescribeGlobalSObjectResult createDescribeGlobalSObjectResult() {
        return new DescribeGlobalSObjectResult();
    }

    /**
     * Create an instance of {@link FlexiPageMetadata }
     * 
     */
    public FlexiPageMetadata createFlexiPageMetadata() {
        return new FlexiPageMetadata();
    }

    /**
     * Create an instance of {@link InvalidFieldFault }
     * 
     */
    public InvalidFieldFault createInvalidFieldFault() {
        return new InvalidFieldFault();
    }

    /**
     * Create an instance of {@link MapValue }
     * 
     */
    public MapValue createMapValue() {
        return new MapValue();
    }

    /**
     * Create an instance of {@link ApexClass }
     * 
     */
    public ApexClass createApexClass() {
        return new ApexClass();
    }

    /**
     * Create an instance of {@link ApexExecutionOverlayResult }
     * 
     */
    public ApexExecutionOverlayResult createApexExecutionOverlayResult() {
        return new ApexExecutionOverlayResult();
    }

    /**
     * Create an instance of {@link Container }
     * 
     */
    public Container createContainer() {
        return new Container();
    }

    /**
     * Create an instance of {@link CustomFieldMetadata }
     * 
     */
    public CustomFieldMetadata createCustomFieldMetadata() {
        return new CustomFieldMetadata();
    }

    /**
     * Create an instance of {@link AutoResponseRules }
     * 
     */
    public AutoResponseRules createAutoResponseRules() {
        return new AutoResponseRules();
    }

    /**
     * Create an instance of {@link MetadataContainer }
     * 
     */
    public MetadataContainer createMetadataContainer() {
        return new MetadataContainer();
    }

    /**
     * Create an instance of {@link LayoutItem }
     * 
     */
    public LayoutItem createLayoutItem() {
        return new LayoutItem();
    }

    /**
     * Create an instance of {@link ProfileApexPageAccess }
     * 
     */
    public ProfileApexPageAccess createProfileApexPageAccess() {
        return new ProfileApexPageAccess();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link ExternalReference }
     * 
     */
    public ExternalReference createExternalReference() {
        return new ExternalReference();
    }

    /**
     * Create an instance of {@link CompactLayoutItemInfo }
     * 
     */
    public CompactLayoutItemInfo createCompactLayoutItemInfo() {
        return new CompactLayoutItemInfo();
    }

    /**
     * Create an instance of {@link ApexTriggerMember }
     * 
     */
    public ApexTriggerMember createApexTriggerMember() {
        return new ApexTriggerMember();
    }

    /**
     * Create an instance of {@link ProfileCustomPermissions }
     * 
     */
    public ProfileCustomPermissions createProfileCustomPermissions() {
        return new ProfileCustomPermissions();
    }

    /**
     * Create an instance of {@link WorkflowRuleMember }
     * 
     */
    public WorkflowRuleMember createWorkflowRuleMember() {
        return new WorkflowRuleMember();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidFieldFault")
    public JAXBElement<Object> createInvalidFieldFault(Object value) {
        return new JAXBElement<Object>(_InvalidFieldFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MalformedSearchFault")
    public JAXBElement<Object> createMalformedSearchFault(Object value) {
        return new JAXBElement<Object>(_MalformedSearchFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MalformedQueryFault")
    public JAXBElement<Object> createMalformedQueryFault(Object value) {
        return new JAXBElement<Object>(_MalformedQueryFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidIdFault")
    public JAXBElement<Object> createInvalidIdFault(Object value) {
        return new JAXBElement<Object>(_InvalidIdFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidSObjectFault")
    public JAXBElement<Object> createInvalidSObjectFault(Object value) {
        return new JAXBElement<Object>(_InvalidSObjectFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidNewPasswordFault")
    public JAXBElement<Object> createInvalidNewPasswordFault(Object value) {
        return new JAXBElement<Object>(_InvalidNewPasswordFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidQueryLocatorFault")
    public JAXBElement<Object> createInvalidQueryLocatorFault(Object value) {
        return new JAXBElement<Object>(_InvalidQueryLocatorFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LoginFault")
    public JAXBElement<Object> createLoginFault(Object value) {
        return new JAXBElement<Object>(_LoginFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiQueryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiQueryFault")
    public JAXBElement<ApiQueryFault> createApiQueryFault(ApiQueryFault value) {
        return new JAXBElement<ApiQueryFault>(_ApiQueryFault_QNAME, ApiQueryFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UnexpectedErrorFault")
    public JAXBElement<Object> createUnexpectedErrorFault(Object value) {
        return new JAXBElement<Object>(_UnexpectedErrorFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SortOrder", scope = MenuItem.class)
    public JAXBElement<Integer> createMenuItemSortOrder(Integer value) {
        return new JAXBElement<Integer>(_MenuItemSortOrder_QNAME, Integer.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MenuType", scope = MenuItem.class)
    public JAXBElement<String> createMenuItemMenuType(String value) {
        return new JAXBElement<String>(_MenuItemMenuType_QNAME, String.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Theme", scope = MenuItem.class)
    public JAXBElement<String> createMenuItemTheme(String value) {
        return new JAXBElement<String>(_MenuItemTheme_QNAME, String.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Active", scope = MenuItem.class)
    public JAXBElement<Boolean> createMenuItemActive(Boolean value) {
        return new JAXBElement<Boolean>(_MenuItemActive_QNAME, Boolean.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Color", scope = MenuItem.class)
    public JAXBElement<String> createMenuItemColor(String value) {
        return new JAXBElement<String>(_MenuItemColor_QNAME, String.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Label", scope = MenuItem.class)
    public JAXBElement<String> createMenuItemLabel(String value) {
        return new JAXBElement<String>(_MenuItemLabel_QNAME, String.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "AppId", scope = MenuItem.class)
    public JAXBElement<String> createMenuItemAppId(String value) {
        return new JAXBElement<String>(_MenuItemAppId_QNAME, String.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IconUrl", scope = MenuItem.class)
    public JAXBElement<String> createMenuItemIconUrl(String value) {
        return new JAXBElement<String>(_MenuItemIconUrl_QNAME, String.class, MenuItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsValid", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerIsValid(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerIsValid_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTrigger.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterInsert", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterInsert(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterInsert_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LengthWithoutComments", scope = ApexTrigger.class)
    public JAXBElement<Integer> createApexTriggerLengthWithoutComments(Integer value) {
        return new JAXBElement<Integer>(_ApexTriggerLengthWithoutComments_QNAME, Integer.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageBeforeInsert", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageBeforeInsert(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageBeforeInsert_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterUpdate", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterUpdate(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterUpdate_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexTrigger.class)
    public JAXBElement<User> createApexTriggerLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexTrigger.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterUndelete", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterUndelete(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterUndelete_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageIsBulk", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageIsBulk(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageIsBulk_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "BodyCrc", scope = ApexTrigger.class)
    public JAXBElement<Double> createApexTriggerBodyCrc(Double value) {
        return new JAXBElement<Double>(_ApexTriggerBodyCrc_QNAME, Double.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexTriggerMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexTrigger.class)
    public JAXBElement<ApexTriggerMetadata> createApexTriggerMetadata(ApexTriggerMetadata value) {
        return new JAXBElement<ApexTriggerMetadata>(_ApexTriggerMetadata_QNAME, ApexTriggerMetadata.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageBeforeDelete", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageBeforeDelete(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageBeforeDelete_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexTrigger.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexTrigger.class)
    public JAXBElement<User> createApexTriggerCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageBeforeUpdate", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageBeforeUpdate(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageBeforeUpdate_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerBody(String value) {
        return new JAXBElement<String>(_ApexTriggerBody_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexTrigger.class)
    public JAXBElement<Double> createApexTriggerApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexTriggerApiVersion_QNAME, Double.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterDelete", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterDelete(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterDelete_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SortOrder", scope = CompactLayoutItemInfo.class)
    public JAXBElement<Integer> createCompactLayoutItemInfoSortOrder(Integer value) {
        return new JAXBElement<Integer>(_MenuItemSortOrder_QNAME, Integer.class, CompactLayoutItemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FieldDefinition", scope = CompactLayoutItemInfo.class)
    public JAXBElement<FieldDefinition> createCompactLayoutItemInfoFieldDefinition(FieldDefinition value) {
        return new JAXBElement<FieldDefinition>(_CompactLayoutItemInfoFieldDefinition_QNAME, FieldDefinition.class, CompactLayoutItemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DurableId", scope = CompactLayoutItemInfo.class)
    public JAXBElement<String> createCompactLayoutItemInfoDurableId(String value) {
        return new JAXBElement<String>(_CompactLayoutItemInfoDurableId_QNAME, String.class, CompactLayoutItemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompactLayoutInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CompactLayoutInfo", scope = CompactLayoutItemInfo.class)
    public JAXBElement<CompactLayoutInfo> createCompactLayoutItemInfoCompactLayoutInfo(CompactLayoutInfo value) {
        return new JAXBElement<CompactLayoutInfo>(_CompactLayoutItemInfoCompactLayoutInfo_QNAME, CompactLayoutInfo.class, CompactLayoutItemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CompactLayoutInfoId", scope = CompactLayoutItemInfo.class)
    public JAXBElement<String> createCompactLayoutItemInfoCompactLayoutInfoId(String value) {
        return new JAXBElement<String>(_CompactLayoutItemInfoCompactLayoutInfoId_QNAME, String.class, CompactLayoutItemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FieldDefinitionId", scope = CompactLayoutItemInfo.class)
    public JAXBElement<String> createCompactLayoutItemInfoFieldDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutItemInfoFieldDefinitionId_QNAME, String.class, CompactLayoutItemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowRuleMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowRule.class)
    public JAXBElement<WorkflowRuleMetadata> createWorkflowRuleMetadata(WorkflowRuleMetadata value) {
        return new JAXBElement<WorkflowRuleMetadata>(_ApexTriggerMetadata_QNAME, WorkflowRuleMetadata.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = WorkflowRule.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowRuleCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowRule.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowRuleLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = CompactLayout.class)
    public JAXBElement<String> createCompactLayoutFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, CompactLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = CompactLayout.class)
    public JAXBElement<String> createCompactLayoutNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, CompactLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SobjectType", scope = CompactLayout.class)
    public JAXBElement<String> createCompactLayoutSobjectType(String value) {
        return new JAXBElement<String>(_CompactLayoutSobjectType_QNAME, String.class, CompactLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompactLayoutMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = CompactLayout.class)
    public JAXBElement<CompactLayoutMetadata> createCompactLayoutMetadata(CompactLayoutMetadata value) {
        return new JAXBElement<CompactLayoutMetadata>(_ApexTriggerMetadata_QNAME, CompactLayoutMetadata.class, CompactLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = CompactLayout.class)
    public JAXBElement<XMLGregorianCalendar> createCompactLayoutCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, CompactLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = CompactLayout.class)
    public JAXBElement<XMLGregorianCalendar> createCompactLayoutLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, CompactLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = CompactLayout.class)
    public JAXBElement<String> createCompactLayoutDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, CompactLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = IDEPerspective.class)
    public JAXBElement<XMLGregorianCalendar> createIDEPerspectiveSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "User", scope = IDEPerspective.class)
    public JAXBElement<User> createIDEPerspectiveUser(User value) {
        return new JAXBElement<User>(_IDEPerspectiveUser_QNAME, User.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveUserId(String value) {
        return new JAXBElement<String>(_IDEPerspectiveUserId_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = IDEPerspective.class)
    public JAXBElement<User> createIDEPerspectiveLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = IDEPerspective.class)
    public JAXBElement<XMLGregorianCalendar> createIDEPerspectiveCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = IDEPerspective.class)
    public JAXBElement<User> createIDEPerspectiveCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = IDEPerspective.class)
    public JAXBElement<XMLGregorianCalendar> createIDEPerspectiveLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = IDEPerspective.class)
    public JAXBElement<Boolean> createIDEPerspectiveIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "numberValue", scope = FlowElementReferenceOrValue.class)
    public JAXBElement<Double> createFlowElementReferenceOrValueNumberValue(Double value) {
        return new JAXBElement<Double>(_FlowElementReferenceOrValueNumberValue_QNAME, Double.class, FlowElementReferenceOrValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "booleanValue", scope = FlowElementReferenceOrValue.class)
    public JAXBElement<Boolean> createFlowElementReferenceOrValueBooleanValue(Boolean value) {
        return new JAXBElement<Boolean>(_FlowElementReferenceOrValueBooleanValue_QNAME, Boolean.class, FlowElementReferenceOrValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexCodeCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTrigger", scope = ApexCodeCoverage.class)
    public JAXBElement<SObject> createApexCodeCoverageApexClassOrTrigger(SObject value) {
        return new JAXBElement<SObject>(_ApexCodeCoverageApexClassOrTrigger_QNAME, SObject.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coverage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Coverage", scope = ApexCodeCoverage.class)
    public JAXBElement<Coverage> createApexCodeCoverageCoverage(Coverage value) {
        return new JAXBElement<Coverage>(_ApexCodeCoverageCoverage_QNAME, Coverage.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexTestClass", scope = ApexCodeCoverage.class)
    public JAXBElement<ApexClass> createApexCodeCoverageApexTestClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_ApexCodeCoverageApexTestClass_QNAME, ApexClass.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexTestClassId", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageApexTestClassId(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageApexTestClassId_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TestMethodName", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageTestMethodName(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageTestMethodName_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexCodeCoverage.class)
    public JAXBElement<User> createApexCodeCoverageCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexCodeCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexCodeCoverage.class)
    public JAXBElement<Boolean> createApexCodeCoverageIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTriggerId", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageApexClassOrTriggerId(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageApexClassOrTriggerId_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesCovered", scope = ApexCodeCoverage.class)
    public JAXBElement<Integer> createApexCodeCoverageNumLinesCovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesCovered_QNAME, Integer.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesUncovered", scope = ApexCodeCoverage.class)
    public JAXBElement<Integer> createApexCodeCoverageNumLinesUncovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesUncovered_QNAME, Integer.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexCodeCoverage.class)
    public JAXBElement<User> createApexCodeCoverageLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexCodeCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexClass.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ApexClass.class)
    public JAXBElement<String> createApexClassFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsValid", scope = ApexClass.class)
    public JAXBElement<Boolean> createApexClassIsValid(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerIsValid_QNAME, Boolean.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexClass.class)
    public JAXBElement<String> createApexClassCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexClass.class)
    public JAXBElement<String> createApexClassName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexClass.class)
    public JAXBElement<String> createApexClassStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexClass.class)
    public JAXBElement<String> createApexClassNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LengthWithoutComments", scope = ApexClass.class)
    public JAXBElement<Integer> createApexClassLengthWithoutComments(Integer value) {
        return new JAXBElement<Integer>(_ApexTriggerLengthWithoutComments_QNAME, Integer.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "BodyCrc", scope = ApexClass.class)
    public JAXBElement<Double> createApexClassBodyCrc(Double value) {
        return new JAXBElement<Double>(_ApexTriggerBodyCrc_QNAME, Double.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClassMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexClass.class)
    public JAXBElement<ApexClassMetadata> createApexClassMetadata(ApexClassMetadata value) {
        return new JAXBElement<ApexClassMetadata>(_ApexTriggerMetadata_QNAME, ApexClassMetadata.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SymbolTable", scope = ApexClass.class)
    public JAXBElement<SymbolTable> createApexClassSymbolTable(SymbolTable value) {
        return new JAXBElement<SymbolTable>(_ApexClassSymbolTable_QNAME, SymbolTable.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexClass.class)
    public JAXBElement<User> createApexClassCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexClass.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexClass.class)
    public JAXBElement<String> createApexClassLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexClass.class)
    public JAXBElement<String> createApexClassBody(String value) {
        return new JAXBElement<String>(_ApexTriggerBody_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexClass.class)
    public JAXBElement<Double> createApexClassApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexTriggerApiVersion_QNAME, Double.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexClass.class)
    public JAXBElement<User> createApexClassLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexClass.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ValidationName", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleValidationName(String value) {
        return new JAXBElement<String>(_ValidationRuleValidationName_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationRuleMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ValidationRule.class)
    public JAXBElement<ValidationRuleMetadata> createValidationRuleMetadata(ValidationRuleMetadata value) {
        return new JAXBElement<ValidationRuleMetadata>(_ApexTriggerMetadata_QNAME, ValidationRuleMetadata.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ValidationRule.class)
    public JAXBElement<XMLGregorianCalendar> createValidationRuleCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ValidationRule.class)
    public JAXBElement<XMLGregorianCalendar> createValidationRuleLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowFieldUpdateMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<String> createWorkflowFieldUpdateMemberFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<String> createWorkflowFieldUpdateMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<String> createWorkflowFieldUpdateMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<String> createWorkflowFieldUpdateMemberContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowFieldUpdateMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<WorkflowFieldUpdateMetadata> createWorkflowFieldUpdateMemberMetadata(WorkflowFieldUpdateMetadata value) {
        return new JAXBElement<WorkflowFieldUpdateMetadata>(_ApexTriggerMetadata_QNAME, WorkflowFieldUpdateMetadata.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowFieldUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<WorkflowFieldUpdate> createWorkflowFieldUpdateMemberContentEntity(WorkflowFieldUpdate value) {
        return new JAXBElement<WorkflowFieldUpdate>(_WorkflowFieldUpdateMemberContentEntity_QNAME, WorkflowFieldUpdate.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<User> createWorkflowFieldUpdateMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowFieldUpdateMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<Boolean> createWorkflowFieldUpdateMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<String> createWorkflowFieldUpdateMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<String> createWorkflowFieldUpdateMemberContentEntityId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberContentEntityId_QNAME, String.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<User> createWorkflowFieldUpdateMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<MetadataContainer> createWorkflowFieldUpdateMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowFieldUpdateMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowFieldUpdateMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowFieldUpdateMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowFieldUpdateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = IDEWorkspace.class)
    public JAXBElement<XMLGregorianCalendar> createIDEWorkspaceSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "User", scope = IDEWorkspace.class)
    public JAXBElement<User> createIDEWorkspaceUser(User value) {
        return new JAXBElement<User>(_IDEPerspectiveUser_QNAME, User.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceUserId(String value) {
        return new JAXBElement<String>(_IDEPerspectiveUserId_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = IDEWorkspace.class)
    public JAXBElement<User> createIDEWorkspaceLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = IDEWorkspace.class)
    public JAXBElement<XMLGregorianCalendar> createIDEWorkspaceCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = IDEWorkspace.class)
    public JAXBElement<User> createIDEWorkspaceCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = IDEWorkspace.class)
    public JAXBElement<XMLGregorianCalendar> createIDEWorkspaceLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = IDEWorkspace.class)
    public JAXBElement<Boolean> createIDEWorkspaceIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDefault", scope = CompactLayoutInfo.class)
    public JAXBElement<Boolean> createCompactLayoutInfoIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CompactLayoutInfoIsDefault_QNAME, Boolean.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = CompactLayoutInfo.class)
    public JAXBElement<String> createCompactLayoutInfoFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DurableId", scope = CompactLayoutInfo.class)
    public JAXBElement<String> createCompactLayoutInfoDurableId(String value) {
        return new JAXBElement<String>(_CompactLayoutItemInfoDurableId_QNAME, String.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = CompactLayoutInfo.class)
    public JAXBElement<String> createCompactLayoutInfoEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Items", scope = CompactLayoutInfo.class)
    public JAXBElement<QueryResult> createCompactLayoutInfoItems(QueryResult value) {
        return new JAXBElement<QueryResult>(_CompactLayoutInfoItems_QNAME, QueryResult.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = CompactLayoutInfo.class)
    public JAXBElement<String> createCompactLayoutInfoNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = CompactLayoutInfo.class)
    public JAXBElement<EntityDefinition> createCompactLayoutInfoEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Label", scope = CompactLayoutInfo.class)
    public JAXBElement<String> createCompactLayoutInfoLabel(String value) {
        return new JAXBElement<String>(_MenuItemLabel_QNAME, String.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompactLayoutMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = CompactLayoutInfo.class)
    public JAXBElement<CompactLayoutMetadata> createCompactLayoutInfoMetadata(CompactLayoutMetadata value) {
        return new JAXBElement<CompactLayoutMetadata>(_ApexTriggerMetadata_QNAME, CompactLayoutMetadata.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = CompactLayoutInfo.class)
    public JAXBElement<String> createCompactLayoutInfoDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, CompactLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTrigger", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<SObject> createApexCodeCoverageAggregateApexClassOrTrigger(SObject value) {
        return new JAXBElement<SObject>(_ApexCodeCoverageApexClassOrTrigger_QNAME, SObject.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<String> createApexCodeCoverageAggregateCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coverage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Coverage", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Coverage> createApexCodeCoverageAggregateCoverage(Coverage value) {
        return new JAXBElement<Coverage>(_ApexCodeCoverageCoverage_QNAME, Coverage.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CoverageLastModifiedDate", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateCoverageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexCodeCoverageAggregateCoverageLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<User> createApexCodeCoverageAggregateCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Boolean> createApexCodeCoverageAggregateIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTriggerId", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<String> createApexCodeCoverageAggregateApexClassOrTriggerId(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageApexClassOrTriggerId_QNAME, String.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<String> createApexCodeCoverageAggregateLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesCovered", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Integer> createApexCodeCoverageAggregateNumLinesCovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesCovered_QNAME, Integer.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesUncovered", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Integer> createApexCodeCoverageAggregateNumLinesUncovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesUncovered_QNAME, Integer.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<User> createApexCodeCoverageAggregateLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ContainerAsyncRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContainerAsyncRequestSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "State", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestState(String value) {
        return new JAXBElement<String>(_ContainerAsyncRequestState_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsCheckOnly", scope = ContainerAsyncRequest.class)
    public JAXBElement<Boolean> createContainerAsyncRequestIsCheckOnly(Boolean value) {
        return new JAXBElement<Boolean>(_ContainerAsyncRequestIsCheckOnly_QNAME, Boolean.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsRunTests", scope = ContainerAsyncRequest.class)
    public JAXBElement<Boolean> createContainerAsyncRequestIsRunTests(Boolean value) {
        return new JAXBElement<Boolean>(_ContainerAsyncRequestIsRunTests_QNAME, Boolean.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ErrorMsg", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestErrorMsg(String value) {
        return new JAXBElement<String>(_ContainerAsyncRequestErrorMsg_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerMemberId", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestMetadataContainerMemberId(String value) {
        return new JAXBElement<String>(_ContainerAsyncRequestMetadataContainerMemberId_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ContainerAsyncRequest.class)
    public JAXBElement<User> createContainerAsyncRequestCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ContainerAsyncRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContainerAsyncRequestCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ContainerAsyncRequest.class)
    public JAXBElement<Boolean> createContainerAsyncRequestIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainerMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerMember", scope = ContainerAsyncRequest.class)
    public JAXBElement<MetadataContainerMember> createContainerAsyncRequestMetadataContainerMember(MetadataContainerMember value) {
        return new JAXBElement<MetadataContainerMember>(_ContainerAsyncRequestMetadataContainerMember_QNAME, MetadataContainerMember.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeployDetails", scope = ContainerAsyncRequest.class)
    public JAXBElement<DeployDetails> createContainerAsyncRequestDeployDetails(DeployDetails value) {
        return new JAXBElement<DeployDetails>(_ContainerAsyncRequestDeployDetails_QNAME, DeployDetails.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ContainerAsyncRequest.class)
    public JAXBElement<User> createContainerAsyncRequestLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ContainerAsyncRequest.class)
    public JAXBElement<MetadataContainer> createContainerAsyncRequestMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ContainerAsyncRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContainerAsyncRequestLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FieldDefinition", scope = WorkflowFieldUpdate.class)
    public JAXBElement<FieldDefinition> createWorkflowFieldUpdateFieldDefinition(FieldDefinition value) {
        return new JAXBElement<FieldDefinition>(_CompactLayoutItemInfoFieldDefinition_QNAME, FieldDefinition.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SourceTableEnumOrId", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateSourceTableEnumOrId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateSourceTableEnumOrId_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FieldDefinitionId", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateFieldDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutItemInfoFieldDefinitionId_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LiteralValue", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateLiteralValue(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateLiteralValue_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = WorkflowFieldUpdate.class)
    public JAXBElement<EntityDefinition> createWorkflowFieldUpdateEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LookupValueId", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateLookupValueId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateLookupValueId_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowFieldUpdateMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowFieldUpdate.class)
    public JAXBElement<WorkflowFieldUpdateMetadata> createWorkflowFieldUpdateMetadata(WorkflowFieldUpdateMetadata value) {
        return new JAXBElement<WorkflowFieldUpdateMetadata>(_ApexTriggerMetadata_QNAME, WorkflowFieldUpdateMetadata.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = WorkflowFieldUpdate.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowFieldUpdateCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowFieldUpdate.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowFieldUpdateLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = EmailTemplate.class)
    public JAXBElement<String> createEmailTemplateFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Subject", scope = EmailTemplate.class)
    public JAXBElement<String> createEmailTemplateSubject(String value) {
        return new JAXBElement<String>(_EmailTemplateSubject_QNAME, String.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = EmailTemplate.class)
    public JAXBElement<String> createEmailTemplateDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = EmailTemplate.class)
    public JAXBElement<String> createEmailTemplateName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = EmailTemplate.class)
    public JAXBElement<String> createEmailTemplateNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = EmailTemplate.class)
    public JAXBElement<Double> createEmailTemplateApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexTriggerApiVersion_QNAME, Double.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailTemplateMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = EmailTemplate.class)
    public JAXBElement<EmailTemplateMetadata> createEmailTemplateMetadata(EmailTemplateMetadata value) {
        return new JAXBElement<EmailTemplateMetadata>(_ApexTriggerMetadata_QNAME, EmailTemplateMetadata.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = EmailTemplate.class)
    public JAXBElement<XMLGregorianCalendar> createEmailTemplateCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = EmailTemplate.class)
    public JAXBElement<XMLGregorianCalendar> createEmailTemplateLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, EmailTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = MetadataContainerMember.class)
    public JAXBElement<String> createMetadataContainerMemberFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = MetadataContainerMember.class)
    public JAXBElement<String> createMetadataContainerMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = MetadataContainerMember.class)
    public JAXBElement<String> createMetadataContainerMemberContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = MetadataContainerMember.class)
    public JAXBElement<String> createMetadataContainerMemberContentEntityId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberContentEntityId_QNAME, String.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = MetadataContainerMember.class)
    public JAXBElement<SObject> createMetadataContainerMemberContentEntity(SObject value) {
        return new JAXBElement<SObject>(_WorkflowFieldUpdateMemberContentEntity_QNAME, SObject.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = MetadataContainerMember.class)
    public JAXBElement<MetadataContainer> createMetadataContainerMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = MetadataContainerMember.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = UserPreference.class)
    public JAXBElement<XMLGregorianCalendar> createUserPreferenceSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Value", scope = UserPreference.class)
    public JAXBElement<String> createUserPreferenceValue(String value) {
        return new JAXBElement<String>(_UserPreferenceValue_QNAME, String.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = UserPreference.class)
    public JAXBElement<String> createUserPreferenceUserId(String value) {
        return new JAXBElement<String>(_IDEPerspectiveUserId_QNAME, String.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Preference", scope = UserPreference.class)
    public JAXBElement<String> createUserPreferencePreference(String value) {
        return new JAXBElement<String>(_UserPreferencePreference_QNAME, String.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexLog.class)
    public JAXBElement<XMLGregorianCalendar> createApexLogSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Application", scope = ApexLog.class)
    public JAXBElement<String> createApexLogApplication(String value) {
        return new JAXBElement<String>(_ApexLogApplication_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Operation", scope = ApexLog.class)
    public JAXBElement<String> createApexLogOperation(String value) {
        return new JAXBElement<String>(_ApexLogOperation_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DurationMilliseconds", scope = ApexLog.class)
    public JAXBElement<Integer> createApexLogDurationMilliseconds(Integer value) {
        return new JAXBElement<Integer>(_ApexLogDurationMilliseconds_QNAME, Integer.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LogUserId", scope = ApexLog.class)
    public JAXBElement<String> createApexLogLogUserId(String value) {
        return new JAXBElement<String>(_ApexLogLogUserId_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexLog.class)
    public JAXBElement<String> createApexLogStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LogUser", scope = ApexLog.class)
    public JAXBElement<SObject> createApexLogLogUser(SObject value) {
        return new JAXBElement<SObject>(_ApexLogLogUser_QNAME, SObject.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LogLength", scope = ApexLog.class)
    public JAXBElement<Integer> createApexLogLogLength(Integer value) {
        return new JAXBElement<Integer>(_ApexLogLogLength_QNAME, Integer.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Request", scope = ApexLog.class)
    public JAXBElement<String> createApexLogRequest(String value) {
        return new JAXBElement<String>(_ApexLogRequest_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "StartTime", scope = ApexLog.class)
    public JAXBElement<XMLGregorianCalendar> createApexLogStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexLogStartTime_QNAME, XMLGregorianCalendar.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Location", scope = ApexLog.class)
    public JAXBElement<String> createApexLogLocation(String value) {
        return new JAXBElement<String>(_ApexLogLocation_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexLog.class)
    public JAXBElement<XMLGregorianCalendar> createApexLogLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexOrgWideCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexOrgWideCoverageSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexOrgWideCoverage.class)
    public JAXBElement<String> createApexOrgWideCoverageCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexOrgWideCoverage.class)
    public JAXBElement<String> createApexOrgWideCoverageLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "PercentCovered", scope = ApexOrgWideCoverage.class)
    public JAXBElement<Integer> createApexOrgWideCoveragePercentCovered(Integer value) {
        return new JAXBElement<Integer>(_ApexOrgWideCoveragePercentCovered_QNAME, Integer.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexOrgWideCoverage.class)
    public JAXBElement<User> createApexOrgWideCoverageLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexOrgWideCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexOrgWideCoverageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexOrgWideCoverage.class)
    public JAXBElement<User> createApexOrgWideCoverageCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexOrgWideCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexOrgWideCoverageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexOrgWideCoverage.class)
    public JAXBElement<Boolean> createApexOrgWideCoverageIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTestResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestResultSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QueueItemId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultQueueItemId(String value) {
        return new JAXBElement<String>(_ApexTestResultQueueItemId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MethodName", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultMethodName(String value) {
        return new JAXBElement<String>(_ApexTestResultMethodName_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexTestQueueItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QueueItem", scope = ApexTestResult.class)
    public JAXBElement<ApexTestQueueItem> createApexTestResultQueueItem(ApexTestQueueItem value) {
        return new JAXBElement<ApexTestQueueItem>(_ApexTestResultQueueItem_QNAME, ApexTestQueueItem.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "StackTrace", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultStackTrace(String value) {
        return new JAXBElement<String>(_ApexTestResultStackTrace_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClass", scope = ApexTestResult.class)
    public JAXBElement<ApexClass> createApexTestResultApexClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_ApexTestResultApexClass_QNAME, ApexClass.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TestTimestamp", scope = ApexTestResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestResultTestTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTestResultTestTimestamp_QNAME, XMLGregorianCalendar.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Message", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultMessage(String value) {
        return new JAXBElement<String>(_ApexTestResultMessage_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexLogId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultApexLogId(String value) {
        return new JAXBElement<String>(_ApexTestResultApexLogId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultApexClassId(String value) {
        return new JAXBElement<String>(_ApexTestResultApexClassId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncApexJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "AsyncApexJob", scope = ApexTestResult.class)
    public JAXBElement<AsyncApexJob> createApexTestResultAsyncApexJob(AsyncApexJob value) {
        return new JAXBElement<AsyncApexJob>(_ApexTestResultAsyncApexJob_QNAME, AsyncApexJob.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "AsyncApexJobId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultAsyncApexJobId(String value) {
        return new JAXBElement<String>(_ApexTestResultAsyncApexJobId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Outcome", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultOutcome(String value) {
        return new JAXBElement<String>(_ApexTestResultOutcome_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexLog", scope = ApexTestResult.class)
    public JAXBElement<ApexLog> createApexTestResultApexLog(ApexLog value) {
        return new JAXBElement<ApexLog>(_ApexTestResultApexLog_QNAME, ApexLog.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExternalDataSource", scope = CustomObject.class)
    public JAXBElement<SObject> createCustomObjectExternalDataSource(SObject value) {
        return new JAXBElement<SObject>(_CustomObjectExternalDataSource_QNAME, SObject.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CustomHelpId", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectCustomHelpId(String value) {
        return new JAXBElement<String>(_CustomObjectCustomHelpId_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExternalRepository", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectExternalRepository(String value) {
        return new JAXBElement<String>(_CustomObjectExternalRepository_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExternalName", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectExternalName(String value) {
        return new JAXBElement<String>(_CustomObjectExternalName_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SharingModel", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectSharingModel(String value) {
        return new JAXBElement<String>(_CustomObjectSharingModel_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExternalDataSourceId", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectExternalDataSourceId(String value) {
        return new JAXBElement<String>(_CustomObjectExternalDataSourceId_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Language", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectLanguage(String value) {
        return new JAXBElement<String>(_CustomObjectLanguage_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = CustomObject.class)
    public JAXBElement<XMLGregorianCalendar> createCustomObjectCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = CustomObject.class)
    public JAXBElement<XMLGregorianCalendar> createCustomObjectLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = QuickActionListItem.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionListItemSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SortOrder", scope = QuickActionListItem.class)
    public JAXBElement<Integer> createQuickActionListItemSortOrder(Integer value) {
        return new JAXBElement<Integer>(_MenuItemSortOrder_QNAME, Integer.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = QuickActionListItem.class)
    public JAXBElement<String> createQuickActionListItemCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = QuickActionListItem.class)
    public JAXBElement<String> createQuickActionListItemLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QuickActionDefinition", scope = QuickActionListItem.class)
    public JAXBElement<String> createQuickActionListItemQuickActionDefinition(String value) {
        return new JAXBElement<String>(_QuickActionListItemQuickActionDefinition_QNAME, String.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuickActionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QuickActionList", scope = QuickActionListItem.class)
    public JAXBElement<QuickActionList> createQuickActionListItemQuickActionList(QuickActionList value) {
        return new JAXBElement<QuickActionList>(_QuickActionListItemQuickActionList_QNAME, QuickActionList.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = QuickActionListItem.class)
    public JAXBElement<User> createQuickActionListItemLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = QuickActionListItem.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionListItemCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = QuickActionListItem.class)
    public JAXBElement<User> createQuickActionListItemCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QuickActionListId", scope = QuickActionListItem.class)
    public JAXBElement<String> createQuickActionListItemQuickActionListId(String value) {
        return new JAXBElement<String>(_QuickActionListItemQuickActionListId_QNAME, String.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = QuickActionListItem.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionListItemLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = QuickActionListItem.class)
    public JAXBElement<Boolean> createQuickActionListItemIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, QuickActionListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexPageMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexPageMember.class)
    public JAXBElement<ApexPageMetadata> createApexPageMemberMetadata(ApexPageMetadata value) {
        return new JAXBElement<ApexPageMetadata>(_ApexTriggerMetadata_QNAME, ApexPageMetadata.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexPageMember.class)
    public JAXBElement<ApexPage> createApexPageMemberContentEntity(ApexPage value) {
        return new JAXBElement<ApexPage>(_WorkflowFieldUpdateMemberContentEntity_QNAME, ApexPage.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexPageMember.class)
    public JAXBElement<User> createApexPageMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexPageMember.class)
    public JAXBElement<Boolean> createApexPageMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberBody(String value) {
        return new JAXBElement<String>(_ApexTriggerBody_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberContentEntityId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberContentEntityId_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexPageMember.class)
    public JAXBElement<User> createApexPageMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexPageMember.class)
    public JAXBElement<MetadataContainer> createApexPageMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = AuraDefinition.class)
    public JAXBElement<XMLGregorianCalendar> createAuraDefinitionSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = AuraDefinition.class)
    public JAXBElement<String> createAuraDefinitionCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "AuraDefinitionBundleId", scope = AuraDefinition.class)
    public JAXBElement<String> createAuraDefinitionAuraDefinitionBundleId(String value) {
        return new JAXBElement<String>(_AuraDefinitionAuraDefinitionBundleId_QNAME, String.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Source", scope = AuraDefinition.class)
    public JAXBElement<String> createAuraDefinitionSource(String value) {
        return new JAXBElement<String>(_AuraDefinitionSource_QNAME, String.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = AuraDefinition.class)
    public JAXBElement<User> createAuraDefinitionCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = AuraDefinition.class)
    public JAXBElement<XMLGregorianCalendar> createAuraDefinitionCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = AuraDefinition.class)
    public JAXBElement<Boolean> createAuraDefinitionIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DefType", scope = AuraDefinition.class)
    public JAXBElement<String> createAuraDefinitionDefType(String value) {
        return new JAXBElement<String>(_AuraDefinitionDefType_QNAME, String.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = AuraDefinition.class)
    public JAXBElement<String> createAuraDefinitionLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Format", scope = AuraDefinition.class)
    public JAXBElement<String> createAuraDefinitionFormat(String value) {
        return new JAXBElement<String>(_AuraDefinitionFormat_QNAME, String.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = AuraDefinition.class)
    public JAXBElement<User> createAuraDefinitionLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuraDefinitionBundle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "AuraDefinitionBundle", scope = AuraDefinition.class)
    public JAXBElement<AuraDefinitionBundle> createAuraDefinitionAuraDefinitionBundle(AuraDefinitionBundle value) {
        return new JAXBElement<AuraDefinitionBundle>(_AuraDefinitionAuraDefinitionBundle_QNAME, AuraDefinitionBundle.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = AuraDefinition.class)
    public JAXBElement<XMLGregorianCalendar> createAuraDefinitionLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, AuraDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexComponentMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexComponentMember.class)
    public JAXBElement<ApexComponentMetadata> createApexComponentMemberMetadata(ApexComponentMetadata value) {
        return new JAXBElement<ApexComponentMetadata>(_ApexTriggerMetadata_QNAME, ApexComponentMetadata.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexComponentMember.class)
    public JAXBElement<ApexComponent> createApexComponentMemberContentEntity(ApexComponent value) {
        return new JAXBElement<ApexComponent>(_WorkflowFieldUpdateMemberContentEntity_QNAME, ApexComponent.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexComponentMember.class)
    public JAXBElement<User> createApexComponentMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexComponentMember.class)
    public JAXBElement<Boolean> createApexComponentMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberBody(String value) {
        return new JAXBElement<String>(_ApexTriggerBody_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberContentEntityId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberContentEntityId_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexComponentMember.class)
    public JAXBElement<User> createApexComponentMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexComponentMember.class)
    public JAXBElement<MetadataContainer> createApexComponentMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = StaticResource.class)
    public JAXBElement<XMLGregorianCalendar> createStaticResourceSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CacheControl", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceCacheControl(String value) {
        return new JAXBElement<String>(_StaticResourceCacheControl_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentType", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceContentType(String value) {
        return new JAXBElement<String>(_StaticResourceContentType_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "BodyLength", scope = StaticResource.class)
    public JAXBElement<Integer> createStaticResourceBodyLength(Integer value) {
        return new JAXBElement<Integer>(_StaticResourceBodyLength_QNAME, Integer.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = StaticResource.class)
    public JAXBElement<User> createStaticResourceCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = StaticResource.class)
    public JAXBElement<XMLGregorianCalendar> createStaticResourceCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = StaticResource.class)
    public JAXBElement<byte[]> createStaticResourceBody(byte[] value) {
        return new JAXBElement<byte[]>(_ApexTriggerBody_QNAME, byte[].class, StaticResource.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = StaticResource.class)
    public JAXBElement<User> createStaticResourceLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = StaticResource.class)
    public JAXBElement<XMLGregorianCalendar> createStaticResourceLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Precision", scope = CustomField.class)
    public JAXBElement<Integer> createCustomFieldPrecision(Integer value) {
        return new JAXBElement<Integer>(_CustomFieldPrecision_QNAME, Integer.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Length", scope = CustomField.class)
    public JAXBElement<Integer> createCustomFieldLength(Integer value) {
        return new JAXBElement<Integer>(_CustomFieldLength_QNAME, Integer.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = CustomField.class)
    public JAXBElement<EntityDefinition> createCustomFieldEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Scale", scope = CustomField.class)
    public JAXBElement<Integer> createCustomFieldScale(Integer value) {
        return new JAXBElement<Integer>(_CustomFieldScale_QNAME, Integer.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFieldMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = CustomField.class)
    public JAXBElement<CustomFieldMetadata> createCustomFieldMetadata(CustomFieldMetadata value) {
        return new JAXBElement<CustomFieldMetadata>(_ApexTriggerMetadata_QNAME, CustomFieldMetadata.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = CustomField.class)
    public JAXBElement<XMLGregorianCalendar> createCustomFieldCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MaskChar", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldMaskChar(String value) {
        return new JAXBElement<String>(_CustomFieldMaskChar_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InlineHelpText", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldInlineHelpText(String value) {
        return new JAXBElement<String>(_CustomFieldInlineHelpText_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SummaryOperation", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldSummaryOperation(String value) {
        return new JAXBElement<String>(_CustomFieldSummaryOperation_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RelationshipLabel", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldRelationshipLabel(String value) {
        return new JAXBElement<String>(_CustomFieldRelationshipLabel_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MaskType", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldMaskType(String value) {
        return new JAXBElement<String>(_CustomFieldMaskType_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DefaultValue", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldDefaultValue(String value) {
        return new JAXBElement<String>(_CustomFieldDefaultValue_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = CustomField.class)
    public JAXBElement<XMLGregorianCalendar> createCustomFieldLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = QuickActionDefinition.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionDefinitionSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TargetRecordType", scope = QuickActionDefinition.class)
    public JAXBElement<RecordType> createQuickActionDefinitionTargetRecordType(RecordType value) {
        return new JAXBElement<RecordType>(_QuickActionDefinitionTargetRecordType_QNAME, RecordType.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "StandardLabel", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionStandardLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionStandardLabel_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Icon", scope = QuickActionDefinition.class)
    public JAXBElement<StaticResource> createQuickActionDefinitionIcon(StaticResource value) {
        return new JAXBElement<StaticResource>(_QuickActionDefinitionIcon_QNAME, StaticResource.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TargetField", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionTargetField(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionTargetField_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SobjectType", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionSobjectType(String value) {
        return new JAXBElement<String>(_CompactLayoutSobjectType_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Label", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionLabel(String value) {
        return new JAXBElement<String>(_MenuItemLabel_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Language", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionLanguage(String value) {
        return new JAXBElement<String>(_CustomObjectLanguage_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Width", scope = QuickActionDefinition.class)
    public JAXBElement<Integer> createQuickActionDefinitionWidth(Integer value) {
        return new JAXBElement<Integer>(_QuickActionDefinitionWidth_QNAME, Integer.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = QuickActionDefinition.class)
    public JAXBElement<User> createQuickActionDefinitionCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = QuickActionDefinition.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionDefinitionCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = QuickActionDefinition.class)
    public JAXBElement<Boolean> createQuickActionDefinitionIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Type", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionType(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionType_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IconId", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionIconId(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionIconId_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TargetRecordTypeId", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionTargetRecordTypeId(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionTargetRecordTypeId_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TargetSobjectType", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionTargetSobjectType(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionTargetSobjectType_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = QuickActionDefinition.class)
    public JAXBElement<User> createQuickActionDefinitionLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = QuickActionDefinition.class)
    public JAXBElement<String> createQuickActionDefinitionMasterLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionMasterLabel_QNAME, String.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = QuickActionDefinition.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionDefinitionLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Height", scope = QuickActionDefinition.class)
    public JAXBElement<Integer> createQuickActionDefinitionHeight(Integer value) {
        return new JAXBElement<Integer>(_QuickActionDefinitionHeight_QNAME, Integer.class, QuickActionDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTestQueueItem.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestQueueItemSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExtendedStatus", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemExtendedStatus(String value) {
        return new JAXBElement<String>(_ApexTestQueueItemExtendedStatus_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ParentJobId", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemParentJobId(String value) {
        return new JAXBElement<String>(_ApexTestQueueItemParentJobId_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassId", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemApexClassId(String value) {
        return new JAXBElement<String>(_ApexTestResultApexClassId_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClass", scope = ApexTestQueueItem.class)
    public JAXBElement<ApexClass> createApexTestQueueItemApexClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_ApexTestResultApexClass_QNAME, ApexClass.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexTestQueueItem.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestQueueItemCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexTestQueueItem.class)
    public JAXBElement<User> createApexTestQueueItemCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IntegrationUserId", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageIntegrationUserId(String value) {
        return new JAXBElement<String>(_WorkflowOutboundMessageIntegrationUserId_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = WorkflowOutboundMessage.class)
    public JAXBElement<Double> createWorkflowOutboundMessageApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexTriggerApiVersion_QNAME, Double.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = WorkflowOutboundMessage.class)
    public JAXBElement<EntityDefinition> createWorkflowOutboundMessageEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowOutboundMessageMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowOutboundMessage.class)
    public JAXBElement<WorkflowOutboundMessageMetadata> createWorkflowOutboundMessageMetadata(WorkflowOutboundMessageMetadata value) {
        return new JAXBElement<WorkflowOutboundMessageMetadata>(_ApexTriggerMetadata_QNAME, WorkflowOutboundMessageMetadata.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = WorkflowOutboundMessage.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowOutboundMessageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowOutboundMessage.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowOutboundMessageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClassMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexClassMember.class)
    public JAXBElement<ApexClassMetadata> createApexClassMemberMetadata(ApexClassMetadata value) {
        return new JAXBElement<ApexClassMetadata>(_ApexTriggerMetadata_QNAME, ApexClassMetadata.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexClassMember.class)
    public JAXBElement<ApexClass> createApexClassMemberContentEntity(ApexClass value) {
        return new JAXBElement<ApexClass>(_WorkflowFieldUpdateMemberContentEntity_QNAME, ApexClass.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SymbolTable", scope = ApexClassMember.class)
    public JAXBElement<SymbolTable> createApexClassMemberSymbolTable(SymbolTable value) {
        return new JAXBElement<SymbolTable>(_ApexClassSymbolTable_QNAME, SymbolTable.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexClassMember.class)
    public JAXBElement<User> createApexClassMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexClassMember.class)
    public JAXBElement<Boolean> createApexClassMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberBody(String value) {
        return new JAXBElement<String>(_ApexTriggerBody_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberContentEntityId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberContentEntityId_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexClassMember.class)
    public JAXBElement<User> createApexClassMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexClassMember.class)
    public JAXBElement<MetadataContainer> createApexClassMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DurableId", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionDurableId(String value) {
        return new JAXBElement<String>(_CompactLayoutItemInfoDurableId_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsCompactLayoutable", scope = FieldDefinition.class)
    public JAXBElement<Boolean> createFieldDefinitionIsCompactLayoutable(Boolean value) {
        return new JAXBElement<Boolean>(_FieldDefinitionIsCompactLayoutable_QNAME, Boolean.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsWorkflowFilterable", scope = FieldDefinition.class)
    public JAXBElement<Boolean> createFieldDefinitionIsWorkflowFilterable(Boolean value) {
        return new JAXBElement<Boolean>(_FieldDefinitionIsWorkflowFilterable_QNAME, Boolean.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CompactLayoutItems", scope = FieldDefinition.class)
    public JAXBElement<QueryResult> createFieldDefinitionCompactLayoutItems(QueryResult value) {
        return new JAXBElement<QueryResult>(_FieldDefinitionCompactLayoutItems_QNAME, QueryResult.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "WorkflowFieldUpdates", scope = FieldDefinition.class)
    public JAXBElement<QueryResult> createFieldDefinitionWorkflowFieldUpdates(QueryResult value) {
        return new JAXBElement<QueryResult>(_FieldDefinitionWorkflowFieldUpdates_QNAME, QueryResult.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = FieldDefinition.class)
    public JAXBElement<EntityDefinition> createFieldDefinitionEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Label", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionLabel(String value) {
        return new JAXBElement<String>(_MenuItemLabel_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFieldMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = FieldDefinition.class)
    public JAXBElement<CustomFieldMetadata> createFieldDefinitionMetadata(CustomFieldMetadata value) {
        return new JAXBElement<CustomFieldMetadata>(_ApexTriggerMetadata_QNAME, CustomFieldMetadata.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QualifiedApiName", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionQualifiedApiName(String value) {
        return new JAXBElement<String>(_FieldDefinitionQualifiedApiName_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionMasterLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionMasterLabel_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = FieldDefinition.class)
    public JAXBElement<String> createFieldDefinitionDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, FieldDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = QuickActionList.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionListSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = QuickActionList.class)
    public JAXBElement<String> createQuickActionListCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = QuickActionList.class)
    public JAXBElement<String> createQuickActionListLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "items", scope = QuickActionList.class)
    public JAXBElement<QueryResult> createQuickActionListItems(QueryResult value) {
        return new JAXBElement<QueryResult>(_QuickActionListItems_QNAME, QueryResult.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Layout", scope = QuickActionList.class)
    public JAXBElement<SObject> createQuickActionListLayout(SObject value) {
        return new JAXBElement<SObject>(_QuickActionListLayout_QNAME, SObject.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LayoutId", scope = QuickActionList.class)
    public JAXBElement<String> createQuickActionListLayoutId(String value) {
        return new JAXBElement<String>(_QuickActionListLayoutId_QNAME, String.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = QuickActionList.class)
    public JAXBElement<User> createQuickActionListLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = QuickActionList.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionListCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = QuickActionList.class)
    public JAXBElement<User> createQuickActionListCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = QuickActionList.class)
    public JAXBElement<XMLGregorianCalendar> createQuickActionListLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = QuickActionList.class)
    public JAXBElement<Boolean> createQuickActionListIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, QuickActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = Profile.class)
    public JAXBElement<String> createProfileFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = Profile.class)
    public JAXBElement<String> createProfileDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = Profile.class)
    public JAXBElement<String> createProfileName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Users", scope = Profile.class)
    public JAXBElement<QueryResult> createProfileUsers(QueryResult value) {
        return new JAXBElement<QueryResult>(_ProfileUsers_QNAME, QueryResult.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ProfileLayouts", scope = Profile.class)
    public JAXBElement<QueryResult> createProfileProfileLayouts(QueryResult value) {
        return new JAXBElement<QueryResult>(_ProfileProfileLayouts_QNAME, QueryResult.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = Profile.class)
    public JAXBElement<ProfileMetadata> createProfileMetadata(ProfileMetadata value) {
        return new JAXBElement<ProfileMetadata>(_ApexTriggerMetadata_QNAME, ProfileMetadata.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserLicenseId", scope = Profile.class)
    public JAXBElement<String> createProfileUserLicenseId(String value) {
        return new JAXBElement<String>(_ProfileUserLicenseId_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = Profile.class)
    public JAXBElement<XMLGregorianCalendar> createProfileCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = Profile.class)
    public JAXBElement<XMLGregorianCalendar> createProfileLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DefaultCompactLayoutId", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionDefaultCompactLayoutId(String value) {
        return new JAXBElement<String>(_EntityDefinitionDefaultCompactLayoutId_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DurableId", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionDurableId(String value) {
        return new JAXBElement<String>(_CompactLayoutItemInfoDurableId_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsWorkflowEnabled", scope = EntityDefinition.class)
    public JAXBElement<Boolean> createEntityDefinitionIsWorkflowEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EntityDefinitionIsWorkflowEnabled_QNAME, Boolean.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "WorkflowAlerts", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionWorkflowAlerts(QueryResult value) {
        return new JAXBElement<QueryResult>(_EntityDefinitionWorkflowAlerts_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Label", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionLabel(String value) {
        return new JAXBElement<String>(_MenuItemLabel_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomObjectMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = EntityDefinition.class)
    public JAXBElement<CustomObjectMetadata> createEntityDefinitionMetadata(CustomObjectMetadata value) {
        return new JAXBElement<CustomObjectMetadata>(_ApexTriggerMetadata_QNAME, CustomObjectMetadata.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QualifiedApiName", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionQualifiedApiName(String value) {
        return new JAXBElement<String>(_FieldDefinitionQualifiedApiName_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompactLayoutInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DefaultCompactLayout", scope = EntityDefinition.class)
    public JAXBElement<CompactLayoutInfo> createEntityDefinitionDefaultCompactLayout(CompactLayoutInfo value) {
        return new JAXBElement<CompactLayoutInfo>(_EntityDefinitionDefaultCompactLayout_QNAME, CompactLayoutInfo.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsCustomizable", scope = EntityDefinition.class)
    public JAXBElement<Boolean> createEntityDefinitionIsCustomizable(Boolean value) {
        return new JAXBElement<Boolean>(_EntityDefinitionIsCustomizable_QNAME, Boolean.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "WorkflowOutboundMessages", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionWorkflowOutboundMessages(QueryResult value) {
        return new JAXBElement<QueryResult>(_EntityDefinitionWorkflowOutboundMessages_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsApexTriggerable", scope = EntityDefinition.class)
    public JAXBElement<Boolean> createEntityDefinitionIsApexTriggerable(Boolean value) {
        return new JAXBElement<Boolean>(_EntityDefinitionIsApexTriggerable_QNAME, Boolean.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Fields", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionFields(QueryResult value) {
        return new JAXBElement<QueryResult>(_EntityDefinitionFields_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsCompactLayoutable", scope = EntityDefinition.class)
    public JAXBElement<Boolean> createEntityDefinitionIsCompactLayoutable(Boolean value) {
        return new JAXBElement<Boolean>(_FieldDefinitionIsCompactLayoutable_QNAME, Boolean.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CustomFields", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionCustomFields(QueryResult value) {
        return new JAXBElement<QueryResult>(_EntityDefinitionCustomFields_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "WorkflowFieldUpdates", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionWorkflowFieldUpdates(QueryResult value) {
        return new JAXBElement<QueryResult>(_FieldDefinitionWorkflowFieldUpdates_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "WorkflowTasks", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionWorkflowTasks(QueryResult value) {
        return new JAXBElement<QueryResult>(_EntityDefinitionWorkflowTasks_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "PluralLabel", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionPluralLabel(String value) {
        return new JAXBElement<String>(_EntityDefinitionPluralLabel_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CompactLayouts", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionCompactLayouts(QueryResult value) {
        return new JAXBElement<QueryResult>(_EntityDefinitionCompactLayouts_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RecordTypes", scope = EntityDefinition.class)
    public JAXBElement<QueryResult> createEntityDefinitionRecordTypes(QueryResult value) {
        return new JAXBElement<QueryResult>(_EntityDefinitionRecordTypes_QNAME, QueryResult.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = EntityDefinition.class)
    public JAXBElement<String> createEntityDefinitionMasterLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionMasterLabel_QNAME, String.class, EntityDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = MetadataContainer.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = MetadataContainer.class)
    public JAXBElement<String> createMetadataContainerCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = MetadataContainer.class)
    public JAXBElement<String> createMetadataContainerLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = MetadataContainer.class)
    public JAXBElement<String> createMetadataContainerName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = MetadataContainer.class)
    public JAXBElement<User> createMetadataContainerLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = MetadataContainer.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = MetadataContainer.class)
    public JAXBElement<User> createMetadataContainerCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = MetadataContainer.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = MetadataContainer.class)
    public JAXBElement<Boolean> createMetadataContainerIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Username", scope = User.class)
    public JAXBElement<String> createUserUsername(String value) {
        return new JAXBElement<String>(_UserUsername_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DelegatedUsers", scope = User.class)
    public JAXBElement<QueryResult> createUserDelegatedUsers(QueryResult value) {
        return new JAXBElement<QueryResult>(_UserDelegatedUsers_QNAME, QueryResult.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserPreferences", scope = User.class)
    public JAXBElement<QueryResult> createUserUserPreferences(QueryResult value) {
        return new JAXBElement<QueryResult>(_UserUserPreferences_QNAME, QueryResult.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "WorkspaceId", scope = User.class)
    public JAXBElement<String> createUserWorkspaceId(String value) {
        return new JAXBElement<String>(_UserWorkspaceId_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ManagedUsers", scope = User.class)
    public JAXBElement<QueryResult> createUserManagedUsers(QueryResult value) {
        return new JAXBElement<QueryResult>(_UserManagedUsers_QNAME, QueryResult.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexTriggerMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexTriggerMember.class)
    public JAXBElement<ApexTriggerMetadata> createApexTriggerMemberMetadata(ApexTriggerMetadata value) {
        return new JAXBElement<ApexTriggerMetadata>(_ApexTriggerMetadata_QNAME, ApexTriggerMetadata.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexTrigger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexTriggerMember.class)
    public JAXBElement<ApexTrigger> createApexTriggerMemberContentEntity(ApexTrigger value) {
        return new JAXBElement<ApexTrigger>(_WorkflowFieldUpdateMemberContentEntity_QNAME, ApexTrigger.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SymbolTable", scope = ApexTriggerMember.class)
    public JAXBElement<SymbolTable> createApexTriggerMemberSymbolTable(SymbolTable value) {
        return new JAXBElement<SymbolTable>(_ApexClassSymbolTable_QNAME, SymbolTable.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexTriggerMember.class)
    public JAXBElement<User> createApexTriggerMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexTriggerMember.class)
    public JAXBElement<Boolean> createApexTriggerMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberBody(String value) {
        return new JAXBElement<String>(_ApexTriggerBody_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberContentEntityId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberContentEntityId_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexTriggerMember.class)
    public JAXBElement<User> createApexTriggerMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexTriggerMember.class)
    public JAXBElement<MetadataContainer> createApexTriggerMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = AuraDefinitionBundle.class)
    public JAXBElement<XMLGregorianCalendar> createAuraDefinitionBundleSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = AuraDefinitionBundle.class)
    public JAXBElement<String> createAuraDefinitionBundleCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = AuraDefinitionBundle.class)
    public JAXBElement<String> createAuraDefinitionBundleLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = AuraDefinitionBundle.class)
    public JAXBElement<String> createAuraDefinitionBundleDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = AuraDefinitionBundle.class)
    public JAXBElement<String> createAuraDefinitionBundleNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = AuraDefinitionBundle.class)
    public JAXBElement<Double> createAuraDefinitionBundleApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexTriggerApiVersion_QNAME, Double.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Language", scope = AuraDefinitionBundle.class)
    public JAXBElement<String> createAuraDefinitionBundleLanguage(String value) {
        return new JAXBElement<String>(_CustomObjectLanguage_QNAME, String.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = AuraDefinitionBundle.class)
    public JAXBElement<User> createAuraDefinitionBundleLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = AuraDefinitionBundle.class)
    public JAXBElement<XMLGregorianCalendar> createAuraDefinitionBundleCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = AuraDefinitionBundle.class)
    public JAXBElement<User> createAuraDefinitionBundleCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = AuraDefinitionBundle.class)
    public JAXBElement<String> createAuraDefinitionBundleMasterLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionMasterLabel_QNAME, String.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = AuraDefinitionBundle.class)
    public JAXBElement<XMLGregorianCalendar> createAuraDefinitionBundleLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = AuraDefinitionBundle.class)
    public JAXBElement<Boolean> createAuraDefinitionBundleIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = AuraDefinitionBundle.class)
    public JAXBElement<String> createAuraDefinitionBundleDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, AuraDefinitionBundle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "OverlayResultLength", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Integer> createApexExecutionOverlayResultOverlayResultLength(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayResultOverlayResultLength_QNAME, Integer.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Line", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Integer> createApexExecutionOverlayResultLine(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayResultLine_QNAME, Integer.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ClassName", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultClassName(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultClassName_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<User> createApexExecutionOverlayResultCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Namespace", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultNamespace(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultNamespace_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Boolean> createApexExecutionOverlayResultIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RequestedBy", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<User> createApexExecutionOverlayResultRequestedBy(User value) {
        return new JAXBElement<User>(_ApexExecutionOverlayResultRequestedBy_QNAME, User.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RequestedById", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultRequestedById(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultRequestedById_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeapDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "HeapDump", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<HeapDump> createApexExecutionOverlayResultHeapDump(HeapDump value) {
        return new JAXBElement<HeapDump>(_ApexExecutionOverlayResultHeapDump_QNAME, HeapDump.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScript", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultActionScript(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultActionScript_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Iteration", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Integer> createApexExecutionOverlayResultIteration(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayResultIteration_QNAME, Integer.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "User", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<SObject> createApexExecutionOverlayResultUser(SObject value) {
        return new JAXBElement<SObject>(_IDEPerspectiveUser_QNAME, SObject.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExpirationDate", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexExecutionOverlayResultExpirationDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDumpingHeap", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Boolean> createApexExecutionOverlayResultIsDumpingHeap(Boolean value) {
        return new JAXBElement<Boolean>(_ApexExecutionOverlayResultIsDumpingHeap_QNAME, Boolean.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOQLResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SOQLResult", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<SOQLResult> createApexExecutionOverlayResultSOQLResult(SOQLResult value) {
        return new JAXBElement<SOQLResult>(_ApexExecutionOverlayResultSOQLResult_QNAME, SOQLResult.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultUserId(String value) {
        return new JAXBElement<String>(_IDEPerspectiveUserId_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<User> createApexExecutionOverlayResultLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexResult", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<ApexResult> createApexExecutionOverlayResultApexResult(ApexResult value) {
        return new JAXBElement<ApexResult>(_ApexExecutionOverlayResultApexResult_QNAME, ApexResult.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScriptType", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultActionScriptType(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultActionScriptType_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Type", scope = FlexiPage.class)
    public JAXBElement<String> createFlexiPageType(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionType_QNAME, String.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = FlexiPage.class)
    public JAXBElement<String> createFlexiPageFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = FlexiPage.class)
    public JAXBElement<String> createFlexiPageDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = FlexiPage.class)
    public JAXBElement<String> createFlexiPageNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlexiPageMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = FlexiPage.class)
    public JAXBElement<FlexiPageMetadata> createFlexiPageMetadata(FlexiPageMetadata value) {
        return new JAXBElement<FlexiPageMetadata>(_ApexTriggerMetadata_QNAME, FlexiPageMetadata.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = FlexiPage.class)
    public JAXBElement<XMLGregorianCalendar> createFlexiPageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = FlexiPage.class)
    public JAXBElement<String> createFlexiPageMasterLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionMasterLabel_QNAME, String.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = FlexiPage.class)
    public JAXBElement<XMLGregorianCalendar> createFlexiPageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = FlexiPage.class)
    public JAXBElement<String> createFlexiPageDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, FlexiPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = RecordType.class)
    public JAXBElement<String> createRecordTypeFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = RecordType.class)
    public JAXBElement<String> createRecordTypeEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = RecordType.class)
    public JAXBElement<String> createRecordTypeDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = RecordType.class)
    public JAXBElement<String> createRecordTypeName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = RecordType.class)
    public JAXBElement<String> createRecordTypeNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = RecordType.class)
    public JAXBElement<EntityDefinition> createRecordTypeEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SobjectType", scope = RecordType.class)
    public JAXBElement<String> createRecordTypeSobjectType(String value) {
        return new JAXBElement<String>(_CompactLayoutSobjectType_QNAME, String.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordTypeMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = RecordType.class)
    public JAXBElement<RecordTypeMetadata> createRecordTypeMetadata(RecordTypeMetadata value) {
        return new JAXBElement<RecordTypeMetadata>(_ApexTriggerMetadata_QNAME, RecordTypeMetadata.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "BusinessProcessId", scope = RecordType.class)
    public JAXBElement<String> createRecordTypeBusinessProcessId(String value) {
        return new JAXBElement<String>(_RecordTypeBusinessProcessId_QNAME, String.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = RecordType.class)
    public JAXBElement<XMLGregorianCalendar> createRecordTypeCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = RecordType.class)
    public JAXBElement<XMLGregorianCalendar> createRecordTypeLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, RecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExecutableEntity", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<SObject> createApexExecutionOverlayActionExecutableEntity(SObject value) {
        return new JAXBElement<SObject>(_ApexExecutionOverlayActionExecutableEntity_QNAME, SObject.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Scope", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<User> createApexExecutionOverlayActionScope(User value) {
        return new JAXBElement<User>(_ApexExecutionOverlayActionScope_QNAME, User.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Line", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Integer> createApexExecutionOverlayActionLine(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayResultLine_QNAME, Integer.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<User> createApexExecutionOverlayActionCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Boolean> createApexExecutionOverlayActionIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScript", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionActionScript(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultActionScript_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Iteration", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Integer> createApexExecutionOverlayActionIteration(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayResultIteration_QNAME, Integer.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExpirationDate", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexExecutionOverlayResultExpirationDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ScopeId", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionScopeId(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionScopeId_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExecutableEntityId", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionExecutableEntityId(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionExecutableEntityId_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDumpingHeap", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Boolean> createApexExecutionOverlayActionIsDumpingHeap(Boolean value) {
        return new JAXBElement<Boolean>(_ApexExecutionOverlayResultIsDumpingHeap_QNAME, Boolean.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<User> createApexExecutionOverlayActionLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScriptType", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionActionScriptType(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultActionScriptType_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexPage.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexPage.class)
    public JAXBElement<String> createApexPageCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerType", scope = ApexPage.class)
    public JAXBElement<String> createApexPageControllerType(String value) {
        return new JAXBElement<String>(_ApexPageControllerType_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexPage.class)
    public JAXBElement<String> createApexPageName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexPage.class)
    public JAXBElement<String> createApexPageNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsConfirmationTokenRequired", scope = ApexPage.class)
    public JAXBElement<Boolean> createApexPageIsConfirmationTokenRequired(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageIsConfirmationTokenRequired_QNAME, Boolean.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexPage.class)
    public JAXBElement<User> createApexPageCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexPage.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerKey", scope = ApexPage.class)
    public JAXBElement<String> createApexPageControllerKey(String value) {
        return new JAXBElement<String>(_ApexPageControllerKey_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsAvailableInTouch", scope = ApexPage.class)
    public JAXBElement<Boolean> createApexPageIsAvailableInTouch(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageIsAvailableInTouch_QNAME, Boolean.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexPage.class)
    public JAXBElement<String> createApexPageLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = ApexPage.class)
    public JAXBElement<String> createApexPageDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexPage.class)
    public JAXBElement<Double> createApexPageApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexTriggerApiVersion_QNAME, Double.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexPage.class)
    public JAXBElement<User> createApexPageLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = ApexPage.class)
    public JAXBElement<String> createApexPageMasterLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionMasterLabel_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Markup", scope = ApexPage.class)
    public JAXBElement<String> createApexPageMarkup(String value) {
        return new JAXBElement<String>(_ApexPageMarkup_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexPage.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Username", scope = Name.class)
    public JAXBElement<String> createNameUsername(String value) {
        return new JAXBElement<String>(_UserUsername_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Alias", scope = Name.class)
    public JAXBElement<String> createNameAlias(String value) {
        return new JAXBElement<String>(_NameAlias_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Email", scope = Name.class)
    public JAXBElement<String> createNameEmail(String value) {
        return new JAXBElement<String>(_NameEmail_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsActive", scope = Name.class)
    public JAXBElement<Boolean> createNameIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_NameIsActive_QNAME, Boolean.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastViewedDate", scope = Name.class)
    public JAXBElement<XMLGregorianCalendar> createNameLastViewedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NameLastViewedDate_QNAME, XMLGregorianCalendar.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = Name.class)
    public JAXBElement<String> createNameName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FirstName", scope = Name.class)
    public JAXBElement<String> createNameFirstName(String value) {
        return new JAXBElement<String>(_NameFirstName_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Type", scope = Name.class)
    public JAXBElement<String> createNameType(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionType_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RecordTypeId", scope = Name.class)
    public JAXBElement<String> createNameRecordTypeId(String value) {
        return new JAXBElement<String>(_NameRecordTypeId_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Phone", scope = Name.class)
    public JAXBElement<String> createNamePhone(String value) {
        return new JAXBElement<String>(_NamePhone_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserRoleId", scope = Name.class)
    public JAXBElement<String> createNameUserRoleId(String value) {
        return new JAXBElement<String>(_NameUserRoleId_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastReferencedDate", scope = Name.class)
    public JAXBElement<XMLGregorianCalendar> createNameLastReferencedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NameLastReferencedDate_QNAME, XMLGregorianCalendar.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RecordType", scope = Name.class)
    public JAXBElement<RecordType> createNameRecordType(RecordType value) {
        return new JAXBElement<RecordType>(_NameRecordType_QNAME, RecordType.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Title", scope = Name.class)
    public JAXBElement<String> createNameTitle(String value) {
        return new JAXBElement<String>(_NameTitle_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastName", scope = Name.class)
    public JAXBElement<String> createNameLastName(String value) {
        return new JAXBElement<String>(_NameLastName_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ProfileId", scope = Name.class)
    public JAXBElement<String> createNameProfileId(String value) {
        return new JAXBElement<String>(_NameProfileId_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Profile", scope = Name.class)
    public JAXBElement<Profile> createNameProfile(Profile value) {
        return new JAXBElement<Profile>(_NameProfile_QNAME, Profile.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TracedEntityId", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagTracedEntityId(String value) {
        return new JAXBElement<String>(_TraceFlagTracedEntityId_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexCode", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagApexCode(String value) {
        return new JAXBElement<String>(_TraceFlagApexCode_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Scope", scope = TraceFlag.class)
    public JAXBElement<User> createTraceFlagScope(User value) {
        return new JAXBElement<User>(_ApexExecutionOverlayActionScope_QNAME, User.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "System", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagSystem(String value) {
        return new JAXBElement<String>(_TraceFlagSystem_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = TraceFlag.class)
    public JAXBElement<User> createTraceFlagCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Callout", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagCallout(String value) {
        return new JAXBElement<String>(_TraceFlagCallout_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = TraceFlag.class)
    public JAXBElement<Boolean> createTraceFlagIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Database", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagDatabase(String value) {
        return new JAXBElement<String>(_TraceFlagDatabase_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Workflow", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagWorkflow(String value) {
        return new JAXBElement<String>(_TraceFlagWorkflow_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Visualforce", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagVisualforce(String value) {
        return new JAXBElement<String>(_TraceFlagVisualforce_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExpirationDate", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexExecutionOverlayResultExpirationDate_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Validation", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagValidation(String value) {
        return new JAXBElement<String>(_TraceFlagValidation_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ScopeId", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagScopeId(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionScopeId_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexProfiling", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagApexProfiling(String value) {
        return new JAXBElement<String>(_TraceFlagApexProfiling_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TracedEntity", scope = TraceFlag.class)
    public JAXBElement<SObject> createTraceFlagTracedEntity(SObject value) {
        return new JAXBElement<SObject>(_TraceFlagTracedEntity_QNAME, SObject.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = TraceFlag.class)
    public JAXBElement<User> createTraceFlagLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExtendedStatus", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobExtendedStatus(String value) {
        return new JAXBElement<String>(_ApexTestQueueItemExtendedStatus_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MethodName", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobMethodName(String value) {
        return new JAXBElement<String>(_ApexTestResultMethodName_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumberOfErrors", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobNumberOfErrors(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobNumberOfErrors_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "JobType", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobJobType(String value) {
        return new JAXBElement<String>(_AsyncApexJobJobType_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CompletedDate", scope = AsyncApexJob.class)
    public JAXBElement<XMLGregorianCalendar> createAsyncApexJobCompletedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AsyncApexJobCompletedDate_QNAME, XMLGregorianCalendar.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClass", scope = AsyncApexJob.class)
    public JAXBElement<ApexClass> createAsyncApexJobApexClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_ApexTestResultApexClass_QNAME, ApexClass.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "JobItemsProcessed", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobJobItemsProcessed(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobJobItemsProcessed_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = AsyncApexJob.class)
    public JAXBElement<User> createAsyncApexJobCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = AsyncApexJob.class)
    public JAXBElement<XMLGregorianCalendar> createAsyncApexJobCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastProcessed", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobLastProcessed(String value) {
        return new JAXBElement<String>(_AsyncApexJobLastProcessed_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ParentJobId", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobParentJobId(String value) {
        return new JAXBElement<String>(_ApexTestQueueItemParentJobId_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassId", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobApexClassId(String value) {
        return new JAXBElement<String>(_ApexTestResultApexClassId_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TotalJobItems", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobTotalJobItems(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobTotalJobItems_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastProcessedOffset", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobLastProcessedOffset(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobLastProcessedOffset_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "displayName", scope = AggregateExpressionResultColumnMetadata.class)
    public JAXBElement<String> createAggregateExpressionResultColumnMetadataDisplayName(String value) {
        return new JAXBElement<String>(_AggregateExpressionResultColumnMetadataDisplayName_QNAME, String.class, AggregateExpressionResultColumnMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = WorkflowAlert.class)
    public JAXBElement<EntityDefinition> createWorkflowAlertEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowAlertMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowAlert.class)
    public JAXBElement<WorkflowAlertMetadata> createWorkflowAlertMetadata(WorkflowAlertMetadata value) {
        return new JAXBElement<WorkflowAlertMetadata>(_ApexTriggerMetadata_QNAME, WorkflowAlertMetadata.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = WorkflowAlert.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowAlertCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertDeveloperName(String value) {
        return new JAXBElement<String>(_CompactLayoutDeveloperName_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SenderType", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertSenderType(String value) {
        return new JAXBElement<String>(_WorkflowAlertSenderType_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TemplateId", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertTemplateId(String value) {
        return new JAXBElement<String>(_WorkflowAlertTemplateId_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CcEmails", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertCcEmails(String value) {
        return new JAXBElement<String>(_WorkflowAlertCcEmails_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowAlert.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowAlertLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = Layout.class)
    public JAXBElement<String> createLayoutFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = Layout.class)
    public JAXBElement<String> createLayoutName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = Layout.class)
    public JAXBElement<String> createLayoutTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ShowSubmitAndAttachButton", scope = Layout.class)
    public JAXBElement<Boolean> createLayoutShowSubmitAndAttachButton(Boolean value) {
        return new JAXBElement<Boolean>(_LayoutShowSubmitAndAttachButton_QNAME, Boolean.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = Layout.class)
    public JAXBElement<String> createLayoutNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoutMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = Layout.class)
    public JAXBElement<LayoutMetadata> createLayoutMetadata(LayoutMetadata value) {
        return new JAXBElement<LayoutMetadata>(_ApexTriggerMetadata_QNAME, LayoutMetadata.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = Layout.class)
    public JAXBElement<XMLGregorianCalendar> createLayoutCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = Layout.class)
    public JAXBElement<XMLGregorianCalendar> createLayoutLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, Layout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = WorkflowRuleMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowRuleMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowRuleMember.class)
    public JAXBElement<String> createWorkflowRuleMemberFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = WorkflowRuleMember.class)
    public JAXBElement<String> createWorkflowRuleMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = WorkflowRuleMember.class)
    public JAXBElement<String> createWorkflowRuleMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberMetadataContainerId_QNAME, String.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = WorkflowRuleMember.class)
    public JAXBElement<String> createWorkflowRuleMemberContent(String value) {
        return new JAXBElement<String>(_IDEPerspectiveContent_QNAME, String.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowRuleMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowRuleMember.class)
    public JAXBElement<WorkflowRuleMetadata> createWorkflowRuleMemberMetadata(WorkflowRuleMetadata value) {
        return new JAXBElement<WorkflowRuleMetadata>(_ApexTriggerMetadata_QNAME, WorkflowRuleMetadata.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = WorkflowRuleMember.class)
    public JAXBElement<WorkflowRule> createWorkflowRuleMemberContentEntity(WorkflowRule value) {
        return new JAXBElement<WorkflowRule>(_WorkflowFieldUpdateMemberContentEntity_QNAME, WorkflowRule.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = WorkflowRuleMember.class)
    public JAXBElement<User> createWorkflowRuleMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = WorkflowRuleMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowRuleMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = WorkflowRuleMember.class)
    public JAXBElement<Boolean> createWorkflowRuleMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_IDEPerspectiveIsDeleted_QNAME, Boolean.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = WorkflowRuleMember.class)
    public JAXBElement<String> createWorkflowRuleMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = WorkflowRuleMember.class)
    public JAXBElement<String> createWorkflowRuleMemberContentEntityId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateMemberContentEntityId_QNAME, String.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = WorkflowRuleMember.class)
    public JAXBElement<User> createWorkflowRuleMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = WorkflowRuleMember.class)
    public JAXBElement<MetadataContainer> createWorkflowRuleMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_WorkflowFieldUpdateMemberMetadataContainer_QNAME, MetadataContainer.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = WorkflowRuleMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowRuleMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowRuleMember.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowRuleMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowRuleMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ProfileLayout.class)
    public JAXBElement<XMLGregorianCalendar> createProfileLayoutSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ProfileLayout.class)
    public JAXBElement<String> createProfileLayoutCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Layout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Layout", scope = ProfileLayout.class)
    public JAXBElement<Layout> createProfileLayoutLayout(Layout value) {
        return new JAXBElement<Layout>(_QuickActionListLayout_QNAME, Layout.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ProfileLayout.class)
    public JAXBElement<User> createProfileLayoutCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ProfileLayout.class)
    public JAXBElement<XMLGregorianCalendar> createProfileLayoutCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ProfileLayout.class)
    public JAXBElement<String> createProfileLayoutLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RecordTypeId", scope = ProfileLayout.class)
    public JAXBElement<String> createProfileLayoutRecordTypeId(String value) {
        return new JAXBElement<String>(_NameRecordTypeId_QNAME, String.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = ProfileLayout.class)
    public JAXBElement<String> createProfileLayoutTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RecordType", scope = ProfileLayout.class)
    public JAXBElement<RecordType> createProfileLayoutRecordType(RecordType value) {
        return new JAXBElement<RecordType>(_NameRecordType_QNAME, RecordType.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LayoutId", scope = ProfileLayout.class)
    public JAXBElement<String> createProfileLayoutLayoutId(String value) {
        return new JAXBElement<String>(_QuickActionListLayoutId_QNAME, String.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ProfileLayout.class)
    public JAXBElement<User> createProfileLayoutLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ProfileId", scope = ProfileLayout.class)
    public JAXBElement<String> createProfileLayoutProfileId(String value) {
        return new JAXBElement<String>(_NameProfileId_QNAME, String.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ProfileLayout.class)
    public JAXBElement<XMLGregorianCalendar> createProfileLayoutLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Profile", scope = ProfileLayout.class)
    public JAXBElement<Profile> createProfileLayoutProfile(Profile value) {
        return new JAXBElement<Profile>(_NameProfile_QNAME, Profile.class, ProfileLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskFullName(String value) {
        return new JAXBElement<String>(_ApexTriggerFullName_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Subject", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskSubject(String value) {
        return new JAXBElement<String>(_EmailTemplateSubject_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinitionId", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskEntityDefinitionId(String value) {
        return new JAXBElement<String>(_CompactLayoutInfoEntityDefinitionId_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskTableEnumOrId(String value) {
        return new JAXBElement<String>(_ApexTriggerTableEnumOrId_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Priority", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskPriority(String value) {
        return new JAXBElement<String>(_WorkflowTaskPriority_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "EntityDefinition", scope = WorkflowTask.class)
    public JAXBElement<EntityDefinition> createWorkflowTaskEntityDefinition(EntityDefinition value) {
        return new JAXBElement<EntityDefinition>(_CompactLayoutInfoEntityDefinition_QNAME, EntityDefinition.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowTaskMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowTask.class)
    public JAXBElement<WorkflowTaskMetadata> createWorkflowTaskMetadata(WorkflowTaskMetadata value) {
        return new JAXBElement<WorkflowTaskMetadata>(_ApexTriggerMetadata_QNAME, WorkflowTaskMetadata.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = WorkflowTask.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowTaskCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowTask.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowTaskLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexComponent.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentCreatedById(String value) {
        return new JAXBElement<String>(_ApexTriggerCreatedById_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerKey", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentControllerKey(String value) {
        return new JAXBElement<String>(_ApexPageControllerKey_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexTriggerLastModifiedById_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerType", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentControllerType(String value) {
        return new JAXBElement<String>(_ApexPageControllerType_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentDescription(String value) {
        return new JAXBElement<String>(_ValidationRuleDescription_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentName(String value) {
        return new JAXBElement<String>(_ApexTriggerName_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentNamespacePrefix(String value) {
        return new JAXBElement<String>(_ApexTriggerNamespacePrefix_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexComponent.class)
    public JAXBElement<Double> createApexComponentApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexTriggerApiVersion_QNAME, Double.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexComponent.class)
    public JAXBElement<User> createApexComponentLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerLastModifiedBy_QNAME, User.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexComponent.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerCreatedDate_QNAME, XMLGregorianCalendar.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexComponent.class)
    public JAXBElement<User> createApexComponentCreatedBy(User value) {
        return new JAXBElement<User>(_ApexTriggerCreatedBy_QNAME, User.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentMasterLabel(String value) {
        return new JAXBElement<String>(_QuickActionDefinitionMasterLabel_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Markup", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentMarkup(String value) {
        return new JAXBElement<String>(_ApexPageMarkup_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexComponent.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTriggerLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexComponent.class, value);
    }

}
