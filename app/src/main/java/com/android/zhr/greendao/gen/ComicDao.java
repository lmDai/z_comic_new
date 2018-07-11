package com.android.zhr.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.android.zhhr.db.utils.StringConverter;
import java.util.List;

import com.android.zhhr.data.entity.Comic;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COMIC".
*/
public class ComicDao extends AbstractDao<Comic, Long> {

    public static final String TABLENAME = "COMIC";

    /**
     * Properties of entity Comic.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Cover = new Property(2, String.class, "cover", false, "COVER");
        public final static Property Author = new Property(3, String.class, "author", false, "AUTHOR");
        public final static Property Chapters = new Property(4, String.class, "chapters", false, "CHAPTERS");
        public final static Property Chapters_url = new Property(5, String.class, "chapters_url", false, "CHAPTERS_URL");
        public final static Property Tags = new Property(6, String.class, "tags", false, "TAGS");
        public final static Property Collections = new Property(7, String.class, "collections", false, "COLLECTIONS");
        public final static Property Describe = new Property(8, String.class, "describe", false, "DESCRIBE");
        public final static Property Point = new Property(9, String.class, "point", false, "POINT");
        public final static Property Popularity = new Property(10, String.class, "popularity", false, "POPULARITY");
        public final static Property Topics = new Property(11, String.class, "topics", false, "TOPICS");
        public final static Property Updates = new Property(12, String.class, "updates", false, "UPDATES");
        public final static Property Status = new Property(13, String.class, "status", false, "STATUS");
        public final static Property ReadType = new Property(14, int.class, "readType", false, "READ_TYPE");
        public final static Property CurrentChapter = new Property(15, int.class, "currentChapter", false, "CURRENT_CHAPTER");
        public final static Property CollectTime = new Property(16, long.class, "collectTime", false, "COLLECT_TIME");
        public final static Property ClickTime = new Property(17, long.class, "clickTime", false, "CLICK_TIME");
        public final static Property DownloadTime = new Property(18, long.class, "downloadTime", false, "DOWNLOAD_TIME");
        public final static Property IsCollected = new Property(19, boolean.class, "isCollected", false, "IS_COLLECTED");
        public final static Property StateInte = new Property(20, int.class, "stateInte", false, "STATE_INTE");
        public final static Property Current_page = new Property(21, int.class, "current_page", false, "CURRENT_PAGE");
        public final static Property Current_page_all = new Property(22, int.class, "current_page_all", false, "CURRENT_PAGE_ALL");
        public final static Property Download_num = new Property(23, int.class, "download_num", false, "DOWNLOAD_NUM");
        public final static Property Download_num_finish = new Property(24, int.class, "download_num_finish", false, "DOWNLOAD_NUM_FINISH");
        public final static Property From = new Property(25, int.class, "from", false, "FROM");
    };

    private final StringConverter chaptersConverter = new StringConverter();
    private final StringConverter chapters_urlConverter = new StringConverter();
    private final StringConverter tagsConverter = new StringConverter();

    public ComicDao(DaoConfig config) {
        super(config);
    }
    
    public ComicDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COMIC\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"COVER\" TEXT," + // 2: cover
                "\"AUTHOR\" TEXT," + // 3: author
                "\"CHAPTERS\" TEXT," + // 4: chapters
                "\"CHAPTERS_URL\" TEXT," + // 5: chapters_url
                "\"TAGS\" TEXT," + // 6: tags
                "\"COLLECTIONS\" TEXT," + // 7: collections
                "\"DESCRIBE\" TEXT," + // 8: describe
                "\"POINT\" TEXT," + // 9: point
                "\"POPULARITY\" TEXT," + // 10: popularity
                "\"TOPICS\" TEXT," + // 11: topics
                "\"UPDATES\" TEXT," + // 12: updates
                "\"STATUS\" TEXT," + // 13: status
                "\"READ_TYPE\" INTEGER NOT NULL ," + // 14: readType
                "\"CURRENT_CHAPTER\" INTEGER NOT NULL ," + // 15: currentChapter
                "\"COLLECT_TIME\" INTEGER NOT NULL ," + // 16: collectTime
                "\"CLICK_TIME\" INTEGER NOT NULL ," + // 17: clickTime
                "\"DOWNLOAD_TIME\" INTEGER NOT NULL ," + // 18: downloadTime
                "\"IS_COLLECTED\" INTEGER NOT NULL ," + // 19: isCollected
                "\"STATE_INTE\" INTEGER NOT NULL ," + // 20: stateInte
                "\"CURRENT_PAGE\" INTEGER NOT NULL ," + // 21: current_page
                "\"CURRENT_PAGE_ALL\" INTEGER NOT NULL ," + // 22: current_page_all
                "\"DOWNLOAD_NUM\" INTEGER NOT NULL ," + // 23: download_num
                "\"DOWNLOAD_NUM_FINISH\" INTEGER NOT NULL ," + // 24: download_num_finish
                "\"FROM\" INTEGER NOT NULL );"); // 25: from
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COMIC\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Comic entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String cover = entity.getCover();
        if (cover != null) {
            stmt.bindString(3, cover);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        List chapters = entity.getChapters();
        if (chapters != null) {
            stmt.bindString(5, chaptersConverter.convertToDatabaseValue(chapters));
        }
 
        List chapters_url = entity.getChapters_url();
        if (chapters_url != null) {
            stmt.bindString(6, chapters_urlConverter.convertToDatabaseValue(chapters_url));
        }
 
        List tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(7, tagsConverter.convertToDatabaseValue(tags));
        }
 
        String collections = entity.getCollections();
        if (collections != null) {
            stmt.bindString(8, collections);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(9, describe);
        }
 
        String point = entity.getPoint();
        if (point != null) {
            stmt.bindString(10, point);
        }
 
        String popularity = entity.getPopularity();
        if (popularity != null) {
            stmt.bindString(11, popularity);
        }
 
        String topics = entity.getTopics();
        if (topics != null) {
            stmt.bindString(12, topics);
        }
 
        String updates = entity.getUpdates();
        if (updates != null) {
            stmt.bindString(13, updates);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(14, status);
        }
        stmt.bindLong(15, entity.getReadType());
        stmt.bindLong(16, entity.getCurrentChapter());
        stmt.bindLong(17, entity.getCollectTime());
        stmt.bindLong(18, entity.getClickTime());
        stmt.bindLong(19, entity.getDownloadTime());
        stmt.bindLong(20, entity.getIsCollected() ? 1L: 0L);
        stmt.bindLong(21, entity.getStateInte());
        stmt.bindLong(22, entity.getCurrent_page());
        stmt.bindLong(23, entity.getCurrent_page_all());
        stmt.bindLong(24, entity.getDownload_num());
        stmt.bindLong(25, entity.getDownload_num_finish());
        stmt.bindLong(26, entity.getFrom());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Comic entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String cover = entity.getCover();
        if (cover != null) {
            stmt.bindString(3, cover);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        List chapters = entity.getChapters();
        if (chapters != null) {
            stmt.bindString(5, chaptersConverter.convertToDatabaseValue(chapters));
        }
 
        List chapters_url = entity.getChapters_url();
        if (chapters_url != null) {
            stmt.bindString(6, chapters_urlConverter.convertToDatabaseValue(chapters_url));
        }
 
        List tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(7, tagsConverter.convertToDatabaseValue(tags));
        }
 
        String collections = entity.getCollections();
        if (collections != null) {
            stmt.bindString(8, collections);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(9, describe);
        }
 
        String point = entity.getPoint();
        if (point != null) {
            stmt.bindString(10, point);
        }
 
        String popularity = entity.getPopularity();
        if (popularity != null) {
            stmt.bindString(11, popularity);
        }
 
        String topics = entity.getTopics();
        if (topics != null) {
            stmt.bindString(12, topics);
        }
 
        String updates = entity.getUpdates();
        if (updates != null) {
            stmt.bindString(13, updates);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(14, status);
        }
        stmt.bindLong(15, entity.getReadType());
        stmt.bindLong(16, entity.getCurrentChapter());
        stmt.bindLong(17, entity.getCollectTime());
        stmt.bindLong(18, entity.getClickTime());
        stmt.bindLong(19, entity.getDownloadTime());
        stmt.bindLong(20, entity.getIsCollected() ? 1L: 0L);
        stmt.bindLong(21, entity.getStateInte());
        stmt.bindLong(22, entity.getCurrent_page());
        stmt.bindLong(23, entity.getCurrent_page_all());
        stmt.bindLong(24, entity.getDownload_num());
        stmt.bindLong(25, entity.getDownload_num_finish());
        stmt.bindLong(26, entity.getFrom());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public Comic readEntity(Cursor cursor, int offset) {
        Comic entity = new Comic( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // cover
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : chaptersConverter.convertToEntityProperty(cursor.getString(offset + 4)), // chapters
            cursor.isNull(offset + 5) ? null : chapters_urlConverter.convertToEntityProperty(cursor.getString(offset + 5)), // chapters_url
            cursor.isNull(offset + 6) ? null : tagsConverter.convertToEntityProperty(cursor.getString(offset + 6)), // tags
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // collections
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // describe
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // point
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // popularity
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // topics
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // updates
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // status
            cursor.getInt(offset + 14), // readType
            cursor.getInt(offset + 15), // currentChapter
            cursor.getLong(offset + 16), // collectTime
            cursor.getLong(offset + 17), // clickTime
            cursor.getLong(offset + 18), // downloadTime
            cursor.getShort(offset + 19) != 0, // isCollected
            cursor.getInt(offset + 20), // stateInte
            cursor.getInt(offset + 21), // current_page
            cursor.getInt(offset + 22), // current_page_all
            cursor.getInt(offset + 23), // download_num
            cursor.getInt(offset + 24), // download_num_finish
            cursor.getInt(offset + 25) // from
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Comic entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCover(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setChapters(cursor.isNull(offset + 4) ? null : chaptersConverter.convertToEntityProperty(cursor.getString(offset + 4)));
        entity.setChapters_url(cursor.isNull(offset + 5) ? null : chapters_urlConverter.convertToEntityProperty(cursor.getString(offset + 5)));
        entity.setTags(cursor.isNull(offset + 6) ? null : tagsConverter.convertToEntityProperty(cursor.getString(offset + 6)));
        entity.setCollections(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDescribe(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPoint(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setPopularity(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTopics(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setUpdates(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setStatus(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setReadType(cursor.getInt(offset + 14));
        entity.setCurrentChapter(cursor.getInt(offset + 15));
        entity.setCollectTime(cursor.getLong(offset + 16));
        entity.setClickTime(cursor.getLong(offset + 17));
        entity.setDownloadTime(cursor.getLong(offset + 18));
        entity.setIsCollected(cursor.getShort(offset + 19) != 0);
        entity.setStateInte(cursor.getInt(offset + 20));
        entity.setCurrent_page(cursor.getInt(offset + 21));
        entity.setCurrent_page_all(cursor.getInt(offset + 22));
        entity.setDownload_num(cursor.getInt(offset + 23));
        entity.setDownload_num_finish(cursor.getInt(offset + 24));
        entity.setFrom(cursor.getInt(offset + 25));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Comic entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Comic entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
