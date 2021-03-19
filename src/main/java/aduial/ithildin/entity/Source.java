package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "SOURCE")
public class Source {

  @DatabaseField(id = true)
  private Integer id;
  @DatabaseField
  private String name;
  @DatabaseField
  private String prefix;
  @DatabaseField
  private Integer sourcetypeId;

  protected Source() {}

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


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public Integer getSourcetypeId() {
    return sourcetypeId;
  }

  public void setSourcetypeId(Integer sourcetypeId) {
    this.sourcetypeId = sourcetypeId;
  }

}
