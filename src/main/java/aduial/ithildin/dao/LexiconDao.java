package aduial.ithildin.dao;

import aduial.ithildin.entity.Lexicon;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class LexiconDao extends CommonDao {
    public LexiconDao() {
        super();
    }

    public Lexicon findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<Lexicon, Object> lexiconDao = getDao(Lexicon.class);
        return lexiconDao.queryBuilder()
                             .where()
                             .eq(Lexicon.ENTRYID_FIELD_NAME, entryId)
                             .queryForFirst();
    }
}
