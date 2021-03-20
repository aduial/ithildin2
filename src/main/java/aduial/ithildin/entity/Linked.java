package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "LINKED")
public class Linked implements Root {

  @DatabaseField(id = true)
  private Integer id;
  @DatabaseField
  private Integer linkedtypeId;
  @DatabaseField
  private Integer entryId;
  @DatabaseField
  private Integer refId;
  @DatabaseField
  private Integer toLanguageId;
  @DatabaseField
  private Integer toEntryId;
  @DatabaseField
  private Integer ordering;
  @DatabaseField
  private Integer sourceId;
  @DatabaseField
  private String mark;
  @DatabaseField
  private String source;

  protected Linked() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getLinkedtypeId() {
    return linkedtypeId;
  }

  public void setLinkedtypeId(Integer linkedtypeId) {
    this.linkedtypeId = linkedtypeId;
  }


  public Integer getEntryId() {
    return entryId;
  }

  public void setEntryId(Integer entryId) {
    this.entryId = entryId;
  }


  public Integer getRefId() {
    return refId;
  }

  public void setRefId(Integer refId) {
    this.refId = refId;
  }


  public Integer getToLanguageId() {
    return toLanguageId;
  }

  public void setToLanguageId(Integer toLanguageId) {
    this.toLanguageId = toLanguageId;
  }


  public Integer getToEntryId() {
    return toEntryId;
  }

  public void setToEntryId(Integer toEntryId) {
    this.toEntryId = toEntryId;
  }


  public Integer getOrdering() {
    return ordering;
  }

  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
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


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

}
