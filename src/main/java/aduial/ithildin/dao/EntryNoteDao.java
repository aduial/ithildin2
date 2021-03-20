package aduial.ithildin.dao;

import aduial.ithildin.entity.EntryNoteView;
import aduial.ithildin.entity.SimpLexicon;
import aduial.ithildin.exception.SauronException;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by luthien on 20/03/2021.
 */
public class EntryNoteDao extends CommonDao {
    public EntryNoteDao() {
        super();
    }

    public List<EntryNoteView> findByEntryId(Integer entryId) throws SauronException, SQLException {
        Dao<EntryNoteView, Object> simpLexiconDao = getDao(EntryNoteView.class);
        return simpLexiconDao.queryBuilder()
                             .where()
                             .eq(SimpLexicon.LANGID_FIELD_NAME, langId)
                             .and()
                             .like(SimpLexicon.FORM_FIELD_NAME, form)
                             .query();
    }
}
