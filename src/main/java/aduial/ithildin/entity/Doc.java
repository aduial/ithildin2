package aduial.ithildin.entity;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "DOC")
public class Doc implements Root {

    @DatabaseField(id = true)
    private Integer id;
    @DatabaseField(dataType = DataType.LONG_STRING)
    private String txt;
    @DatabaseField
    private Integer doctypeId;

    protected Doc() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }


    public Integer getDoctypeId() {
        return doctypeId;
    }

    public void setDoctypeId(Integer doctypeId) {
        this.doctypeId = doctypeId;
    }
}
