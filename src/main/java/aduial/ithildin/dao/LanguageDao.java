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

    public List<Language> getSearchLanguages (Integer id, Integer idIsNot, Integer parentId ) throws SauronException, SQLException {
        Dao<Language, Integer>          langDao      = getDao(Language.class);
        return langDao.queryBuilder()
                      .where()
                      .eq(Language.ID_FIELD_NAME, id)
                      .and()
                      .ne(Language.ID_FIELD_NAME, idIsNot)
                      .and()
                      .isNotNull(Language.PARENTID_FIELD_NAME)
                      .and()
                      .ne(Language.PARENTID_FIELD_NAME, parentId)
                .query();
    }
}
