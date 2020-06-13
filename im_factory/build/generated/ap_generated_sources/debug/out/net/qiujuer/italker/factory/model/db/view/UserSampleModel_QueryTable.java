package net.qiujuer.italker.factory.model.db.view;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.structure.QueryModelAdapter;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class UserSampleModel_QueryTable extends QueryModelAdapter<UserSampleModel> {
  public static final Property<String> id = new Property<String>(UserSampleModel.class, "id");

  public static final Property<String> name = new Property<String>(UserSampleModel.class, "name");

  public static final Property<String> portrait = new Property<String>(UserSampleModel.class, "portrait");

  public UserSampleModel_QueryTable(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<UserSampleModel> getModelClass() {
    return UserSampleModel.class;
  }

  @Override
  public final UserSampleModel newInstance() {
    return new UserSampleModel();
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, UserSampleModel model) {
    model.id = cursor.getStringOrDefault("id");
    model.name = cursor.getStringOrDefault("name");
    model.portrait = cursor.getStringOrDefault("portrait");
  }
}
