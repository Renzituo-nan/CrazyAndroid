package com.raizlabs.android.dbflow.config;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import net.qiujuer.italker.factory.model.db.AppDatabase;
import net.qiujuer.italker.factory.model.db.GroupMember_Table;
import net.qiujuer.italker.factory.model.db.Group_Table;
import net.qiujuer.italker.factory.model.db.Message_Table;
import net.qiujuer.italker.factory.model.db.Session_Table;
import net.qiujuer.italker.factory.model.db.User_Table;
import net.qiujuer.italker.factory.model.db.view.MemberUserModel_QueryTable;
import net.qiujuer.italker.factory.model.db.view.UserSampleModel_QueryTable;

/**
 * This is generated code. Please do not modify */
public final class AppDatabaseAppDatabase_Database extends DatabaseDefinition {
  public AppDatabaseAppDatabase_Database(DatabaseHolder holder) {
    addModelAdapter(new GroupMember_Table(holder, this), holder);
    addModelAdapter(new Group_Table(holder, this), holder);
    addModelAdapter(new Message_Table(holder, this), holder);
    addModelAdapter(new Session_Table(holder, this), holder);
    addModelAdapter(new User_Table(holder, this), holder);
    addQueryModelAdapter(new MemberUserModel_QueryTable(this), holder);
    addQueryModelAdapter(new UserSampleModel_QueryTable(this), holder);
  }

  @Override
  public final Class<?> getAssociatedDatabaseClassFile() {
    return AppDatabase.class;
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean isInMemory() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 2;
  }

  @Override
  public final String getDatabaseName() {
    return "AppDatabase";
  }
}
