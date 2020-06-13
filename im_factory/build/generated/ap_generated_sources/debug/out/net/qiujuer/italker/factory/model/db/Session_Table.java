package net.qiujuer.italker.factory.model.db;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.converter.DateConverter;
import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.OperatorGroup;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty;
import com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty.TypeConverterGetter;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

/**
 * This is generated code. Please do not modify */
public final class Session_Table extends ModelAdapter<Session> {
  /**
   * Primary Key */
  public static final Property<String> id = new Property<String>(Session.class, "id");

  public static final Property<String> picture = new Property<String>(Session.class, "picture");

  public static final Property<String> title = new Property<String>(Session.class, "title");

  public static final Property<String> content = new Property<String>(Session.class, "content");

  public static final Property<Integer> receiverType = new Property<Integer>(Session.class, "receiverType");

  public static final Property<Integer> unReadCount = new Property<Integer>(Session.class, "unReadCount");

  public static final TypeConvertedProperty<Long, Date> modifyAt = new TypeConvertedProperty<Long, Date>(Session.class, "modifyAt", true,
  new TypeConvertedProperty.TypeConverterGetter() {
  @Override
  public TypeConverter getTypeConverter(Class<?> modelClass) {
    Session_Table adapter = (Session_Table) FlowManager.getInstanceAdapter(modelClass);
  return adapter.global_typeConverterDateConverter;
  }
  });

  /**
   * Foreign Key */
  public static final Property<String> message_id = new Property<String>(Session.class, "message_id");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,picture,title,content,receiverType,unReadCount,modifyAt,message_id};

  private final DateConverter global_typeConverterDateConverter;

  public Session_Table(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    global_typeConverterDateConverter = (DateConverter) holder.getTypeConverterForClass(Date.class);
  }

  @Override
  public final Class<Session> getModelClass() {
    return Session.class;
  }

  @Override
  public final String getTableName() {
    return "`Session`";
  }

  @Override
  public final Session newInstance() {
    return new Session();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`picture`":  {
        return picture;
      }
      case "`title`":  {
        return title;
      }
      case "`content`":  {
        return content;
      }
      case "`receiverType`":  {
        return receiverType;
      }
      case "`unReadCount`":  {
        return unReadCount;
      }
      case "`modifyAt`":  {
        return modifyAt;
      }
      case "`message_id`": {
        return message_id;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Session model) {
    values.put("`id`", model.getId() != null ? model.getId() : null);
    values.put("`picture`", model.getPicture() != null ? model.getPicture() : null);
    values.put("`title`", model.getTitle() != null ? model.getTitle() : null);
    values.put("`content`", model.getContent() != null ? model.getContent() : null);
    values.put("`receiverType`", model.getReceiverType());
    values.put("`unReadCount`", model.getUnReadCount());
    Long refmodifyAt = model.getModifyAt() != null ? global_typeConverterDateConverter.getDBValue(model.getModifyAt()) : null;
    values.put("`modifyAt`", refmodifyAt != null ? refmodifyAt : null);
    if (model.getMessage() != null) {
      values.put("`message_id`", model.getMessage().getId());
    } else {
      values.putNull("`message_id`");
    }
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Session model, int start) {
    statement.bindStringOrNull(1 + start, model.getId());
    statement.bindStringOrNull(2 + start, model.getPicture());
    statement.bindStringOrNull(3 + start, model.getTitle());
    statement.bindStringOrNull(4 + start, model.getContent());
    statement.bindLong(5 + start, model.getReceiverType());
    statement.bindLong(6 + start, model.getUnReadCount());
    Long refmodifyAt = model.getModifyAt() != null ? global_typeConverterDateConverter.getDBValue(model.getModifyAt()) : null;
    statement.bindNumberOrNull(7 + start, refmodifyAt);
    if (model.getMessage() != null) {
      statement.bindStringOrNull(8 + start, model.getMessage().getId());
    } else {
      statement.bindNull(8 + start);
    }
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, Session model) {
    statement.bindStringOrNull(1, model.getId());
    statement.bindStringOrNull(2, model.getPicture());
    statement.bindStringOrNull(3, model.getTitle());
    statement.bindStringOrNull(4, model.getContent());
    statement.bindLong(5, model.getReceiverType());
    statement.bindLong(6, model.getUnReadCount());
    Long refmodifyAt = model.getModifyAt() != null ? global_typeConverterDateConverter.getDBValue(model.getModifyAt()) : null;
    statement.bindNumberOrNull(7, refmodifyAt);
    if (model.getMessage() != null) {
      statement.bindStringOrNull(8, model.getMessage().getId());
    } else {
      statement.bindNull(8);
    }
    statement.bindStringOrNull(9, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, Session model) {
    statement.bindStringOrNull(1, model.getId());
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Session`(`id`,`picture`,`title`,`content`,`receiverType`,`unReadCount`,`modifyAt`,`message_id`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `Session` SET `id`=?,`picture`=?,`title`=?,`content`=?,`receiverType`=?,`unReadCount`=?,`modifyAt`=?,`message_id`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `Session` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Session`(`id` TEXT, `picture` TEXT, `title` TEXT, `content` TEXT, `receiverType` INTEGER, `unReadCount` INTEGER, `modifyAt` TEXT, `message_id` TEXT, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`message_id`) REFERENCES " + com.raizlabs.android.dbflow.config.FlowManager.getTableName(net.qiujuer.italker.factory.model.db.Message.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, Session model) {
    model.setId(cursor.getStringOrDefault("id"));
    model.setPicture(cursor.getStringOrDefault("picture"));
    model.setTitle(cursor.getStringOrDefault("title"));
    model.setContent(cursor.getStringOrDefault("content"));
    model.setReceiverType(cursor.getIntOrDefault("receiverType"));
    model.setUnReadCount(cursor.getIntOrDefault("unReadCount"));
    int index_modifyAt = cursor.getColumnIndex("modifyAt");
    if (index_modifyAt != -1 && !cursor.isNull(index_modifyAt)) {
      model.setModifyAt(global_typeConverterDateConverter.getModelValue(cursor.getLong(index_modifyAt)));
    } else {
      model.setModifyAt(global_typeConverterDateConverter.getModelValue(null));
    }
    int index_message_id_Message_Table = cursor.getColumnIndex("message_id");
    if (index_message_id_Message_Table != -1 && !cursor.isNull(index_message_id_Message_Table)) {
      model.setMessage(com.raizlabs.android.dbflow.sql.language.SQLite.select().from(net.qiujuer.italker.factory.model.db.Message.class).where()
          .and(net.qiujuer.italker.factory.model.db.Message_Table.id.eq(cursor.getString(index_message_id_Message_Table)))
          .querySingle());
    } else {
      model.setMessage(null);
    }
  }

  @Override
  public final boolean exists(Session model, DatabaseWrapper wrapper) {
    return SQLite.selectCountOf()
    .from(Session.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(Session model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
