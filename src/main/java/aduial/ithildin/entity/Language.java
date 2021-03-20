package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "LANGUAGE")
public class Language implements Root {

  public static final String ID_FIELD_NAME = "ID";
  public static final String PARENTID_FIELD_NAME = "PARENT_ID";

  @DatabaseField(id = true, columnName = ID_FIELD_NAME)
  private Integer id;
  @DatabaseField
  private String name;
  @DatabaseField
  private String mnemonic;
  @DatabaseField(columnName = PARENTID_FIELD_NAME)
  private Integer parentId;

  protected Language() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMnemonic() {
    return mnemonic;
  }

  public void setMnemonic(String mnemonic) {
    this.mnemonic = mnemonic;
  }


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

}
