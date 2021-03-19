package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "REF")
public class Ref {

  @DatabaseField(id = true)
  private Integer id;
  @DatabaseField
  private Integer entryId;
  @DatabaseField
  private Integer formId;
  @DatabaseField
  private Integer glossId;
  @DatabaseField
  private Integer languageId;
  @DatabaseField
  private Integer sourceId;
  @DatabaseField
  private String mark;
  @DatabaseField
  private Integer ruleFromformId;
  @DatabaseField
  private Integer ruleRlformId;
  @DatabaseField
  private Integer ruleRuleformId;
  @DatabaseField
  private Integer ordering;
  @DatabaseField
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
