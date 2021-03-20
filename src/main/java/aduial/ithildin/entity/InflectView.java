package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "INFLECTVIEW")
public class InflectView implements Root {

  @DatabaseField
  private Integer entryidfrom;
  @DatabaseField
  private Integer refidfrom;
  @DatabaseField
  private String formtxt;
  @DatabaseField
  private Integer lgorder;
  @DatabaseField
  private String inflection;
  @DatabaseField
  private String inflecttypetxt;

  protected InflectView() {}

  public Integer getEntryidfrom() {
    return entryidfrom;
  }

  public void setEntryidfrom(Integer entryidfrom) {
    this.entryidfrom = entryidfrom;
  }


  public Integer getRefidfrom() {
    return refidfrom;
  }

  public void setRefidfrom(Integer refidfrom) {
    this.refidfrom = refidfrom;
  }


  public String getFormtxt() {
    return formtxt;
  }

  public void setFormtxt(String formtxt) {
    this.formtxt = formtxt;
  }


  public Integer getLgorder() {
    return lgorder;
  }

  public void setLgorder(Integer lgorder) {
    this.lgorder = lgorder;
  }


  public String getInflection() {
    return inflection;
  }

  public void setInflection(String inflection) {
    this.inflection = inflection;
  }


  public String getInflecttypetxt() {
    return inflecttypetxt;
  }

  public void setInflecttypetxt(String inflecttypetxt) {
    this.inflecttypetxt = inflecttypetxt;
  }

}
