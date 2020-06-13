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
public final class MemberUserModel_QueryTable extends QueryModelAdapter<MemberUserModel> {
  public static final Property<String> userId = new Property<String>(MemberUserModel.class, "userId");

  public static final Property<String> name = new Property<String>(MemberUserModel.class, "name");

  public static final Property<String> alias = new Property<String>(MemberUserModel.class, "alias");

  public static final Property<String> portrait = new Property<String>(MemberUserModel.class, "portrait");

  public MemberUserModel_QueryTable(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<MemberUserModel> getModelClass() {
    return MemberUserModel.class;
  }

  @Override
  public final MemberUserModel newInstance() {
    return new MemberUserModel();
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, MemberUserModel model) {
    model.userId = cursor.getStringOrDefault("userId");
    model.name = cursor.getStringOrDefault("name");
    model.alias = cursor.getStringOrDefault("alias");
    model.portrait = cursor.getStringOrDefault("portrait");
  }
}
