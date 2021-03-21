package aduial.ithildin.dao;

import aduial.ithildin.entity.Language;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class LanguageDao extends CommonDao {

    public LanguageDao() {
        super();
    }

    public List<Language> getSearchLanguages (Integer idBelow, Integer idNot, Integer parentNot ) throws SauronException, SQLException {
        Dao<Language, Integer>          langDao      = getDao(Language.class);
        return langDao.queryBuilder()
                      .where()
                      .lt(Language.ID_FIELD_NAME, idBelow)
                      .and()
                      .ne(Language.ID_FIELD_NAME, idNot)
                      .and()
                      .isNotNull(Language.PARENTID_FIELD_NAME)
                      .and()
                      .ne(Language.PARENTID_FIELD_NAME, parentNot)
                .query();
    }
}
