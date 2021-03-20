package aduial.ithildin.dao;

import aduial.ithildin.entity.Lexicon;
import aduial.ithildin.entity.SpeechFormView;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

/**
 * Created by luthien on 20/03/2021.
 */
public class SpeechFormDao extends CommonDao {
    public SpeechFormDao() {
        super();
    }

    public SpeechFormView findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<SpeechFormView, Object> speechFormDao = getDao(SpeechFormView.class);
        return speechFormDao.queryBuilder()
                         .where()
                         .eq(SpeechFormView.ENTRYID_FIELD_NAME, entryId)
                         .queryForFirst();
    }
}
