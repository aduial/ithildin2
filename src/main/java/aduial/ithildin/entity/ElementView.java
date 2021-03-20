package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "ELEMENTVIEW")
public class ElementView implements Root {

  @DatabaseField
  private Integer entryidfrom;
  @DatabaseField
  private Integer entryidto;
  @DatabaseField
  private Integer refidfrom;
  @DatabaseField
  private Integer refidto;
  @DatabaseField
  private String languageto;
  @DatabaseField
  private String formtxt;
  @DatabaseField
  private String grammartxt;
  @DatabaseField
  private String sourcename;
  @DatabaseField
  private String sourceprefix;
  @DatabaseField
  private String sourcestring;
  @DatabaseField
  private String sourcetypetxt;

  protected ElementView() {}

  public Integer getEntryidfrom() {
    return entryidfrom;
  }

  public void setEntryidfrom(Integer entryidfrom) {
    this.entryidfrom = entryidfrom;
  }


  public Integer getEntryidto() {
    return entryidto;
  }

  public void setEntryidto(Integer entryidto) {
    this.entryidto = entryidto;
  }


  public Integer getRefidfrom() {
    return refidfrom;
  }

  public void setRefidfrom(Integer refidfrom) {
    this.refidfrom = refidfrom;
  }


  public Integer getRefidto() {
    return refidto;
  }

  public void setRefidto(Integer refidto) {
    this.refidto = refidto;
  }


  public String getLanguageto() {
    return languageto;
  }

  public void setLanguageto(String languageto) {
    this.languageto = languageto;
  }


  public String getFormtxt() {
    return formtxt;
  }

  public void setFormtxt(String formtxt) {
    this.formtxt = formtxt;
  }


  public String getGrammartxt() {
    return grammartxt;
  }

  public void setGrammartxt(String grammartxt) {
    this.grammartxt = grammartxt;
  }


  public String getSourcename() {
    return sourcename;
  }

  public void setSourcename(String sourcename) {
    this.sourcename = sourcename;
  }


  public String getSourceprefix() {
    return sourceprefix;
  }

  public void setSourceprefix(String sourceprefix) {
    this.sourceprefix = sourceprefix;
  }


  public String getSourcestring() {
    return sourcestring;
  }

  public void setSourcestring(String sourcestring) {
    this.sourcestring = sourcestring;
  }


  public String getSourcetypetxt() {
    return sourcetypetxt;
  }

  public void setSourcetypetxt(String sourcetypetxt) {
    this.sourcetypetxt = sourcetypetxt;
  }

}
