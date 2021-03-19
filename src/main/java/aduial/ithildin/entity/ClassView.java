package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "CLASSVIEW")
public class ClassView{

  @DatabaseField
  private Integer entryId;
  @DatabaseField
  private String mark;
  @DatabaseField
  private Integer lgorder;
  @DatabaseField
  private String grammartxt;
  @DatabaseField
  private String grammartypetxt;
  @DatabaseField
  private Integer grammarid;

  protected ClassView() {}

  public Integer getEntryid() {
    return entryId;
  }

  public void setEntryid(Integer entryId) {
    this.entryId = entryId;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public Integer getLgorder() {
    return lgorder;
  }

  public void setLgorder(Integer lgorder) {
    this.lgorder = lgorder;
  }


  public String getGrammartxt() {
    return grammartxt;
  }

  public void setGrammartxt(String grammartxt) {
    this.grammartxt = grammartxt;
  }


  public String getGrammartypetxt() {
    return grammartypetxt;
  }

  public void setGrammartypetxt(String grammartypetxt) {
    this.grammartypetxt = grammartypetxt;
  }


  public Integer getGrammarid() {
    return grammarid;
  }

  public void setGrammarid(Integer grammarid) {
    this.grammarid = grammarid;
  }

}
