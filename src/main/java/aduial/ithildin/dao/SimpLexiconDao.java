package aduial.ithildin.dao;

import aduial.ithildin.entity.SimpLexicon;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class SimpLexiconDao extends CommonDao {
    public SimpLexiconDao() {
        super();
    }

    public List<SimpLexicon> findByGlossAndLangId(String gloss, Integer langId) throws SauronException, SQLException {
        Dao<SimpLexicon, Object> simpLexiconDao = getDao(SimpLexicon.class);
        return simpLexiconDao.queryBuilder()
                      .where()
                      .eq(SimpLexicon.LANGID_FIELD_NAME, langId)
                      .and()
                      .like(SimpLexicon.GLOSS_FIELD_NAME, "%" + gloss + "%")
                      .query();
    }

    public List<SimpLexicon> findByFormAndLangId(String form, Integer langId) throws SauronException, SQLException {
        Dao<SimpLexicon, Object> simpLexiconDao = getDao(SimpLexicon.class);
        return simpLexiconDao.queryBuilder()
                             .where()
                             .eq(SimpLexicon.LANGID_FIELD_NAME, langId)
                             .and()
                             .like(SimpLexicon.FORM_FIELD_NAME, "%" + form + "%")
                             .query();
    }


}
