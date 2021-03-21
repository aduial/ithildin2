package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "REF")
public class Ref implements Root {

  public static final String ENTRYID_FIELD_NAME = "ENTRY_ID";
  public static final String FORMID_FIELD_NAME = "FORM_ID";
  public static final String GLOSSID_FIELD_NAME = "GLOSS_ID";
  public static final String LANGUAGEID_FIELD_NAME = "LANGUAGE_ID";
  public static final String SOURCEID_FIELD_NAME = "SOURCE_ID";
  public static final String RULEFROMFORMID_FIELD_NAME = "RULE_FROMFORM_ID";
  public static final String RULERLFORMID_FIELD_NAME = "RULE_RLFORM_ID";
  public static final String RULERULEFORMID_FIELD_NAME = "RULE_RULEFORM_ID";
  public static final String ENTRYTYPEID_FIELD_NAME = "ENTRYTYPE_ID";

  @DatabaseField(id = true)
  private Integer id;
  @DatabaseField(columnName = ENTRYID_FIELD_NAME)
  private Integer entryId;
  @DatabaseField(columnName = FORMID_FIELD_NAME)
  private Integer formId;
  @DatabaseField(columnName = GLOSSID_FIELD_NAME)
  private Integer glossId;
  @DatabaseField(columnName = LANGUAGEID_FIELD_NAME)
  private Integer languageId;
  @DatabaseField(columnName = SOURCEID_FIELD_NAME)
  private Integer sourceId;
  @DatabaseField
  private String mark;
  @DatabaseField(columnName = RULEFROMFORMID_FIELD_NAME)
  private Integer ruleFromformId;
  @DatabaseField(columnName = RULERLFORMID_FIELD_NAME)
  private Integer ruleRlformId;
  @DatabaseField(columnName = RULERULEFORMID_FIELD_NAME)
  private Integer ruleRuleformId;
  @DatabaseField
  private Integer ordering;
  @DatabaseField(columnName = ENTRYTYPEID_FIELD_NAME)
  private Integer entrytypeId;
  @DatabaseField
  private String source;

  protected Ref() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getEntryId() {
    return entryId;
  }

  public void setEntryId(Integer entryId) {
    this.entryId = entryId;
  }


  public Integer getFormId() {
    return formId;
  }

  public void setFormId(Integer formId) {
    this.formId = formId;
  }


  public Integer getGlossId() {
    return glossId;
  }

  public void setGlossId(Integer glossId) {
    this.glossId = glossId;
  }


  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }


  public Integer getSourceId() {
    return sourceId;
  }

  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public Integer getRuleFromformId() {
    return ruleFromformId;
  }

  public void setRuleFromformId(Integer ruleFromformId) {
    this.ruleFromformId = ruleFromformId;
  }


  public Integer getRuleRlformId() {
    return ruleRlformId;
  }

  public void setRuleRlformId(Integer ruleRlformId) {
    this.ruleRlformId = ruleRlformId;
  }


  public Integer getRuleRuleformId() {
    return ruleRuleformId;
  }

  public void setRuleRuleformId(Integer ruleRuleformId) {
    this.ruleRuleformId = ruleRuleformId;
  }


  public Integer getOrdering() {
    return ordering;
  }

  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }


  public Integer getEntrytypeId() {
    return entrytypeId;
  }

  public void setEntrytypeId(Integer entrytypeId) {
    this.entrytypeId = entrytypeId;
  }


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

}
