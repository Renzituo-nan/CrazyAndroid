package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import net.qiujuer.italker.push.IMLaunchActivity;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class ARouter$$Group$$CrazyIM implements IRouteGroup {
  @Override
  public void loadInto(Map<String, RouteMeta> atlas) {
    atlas.put("/CrazyIM/LaunchActivity", RouteMeta.build(RouteType.ACTIVITY, IMLaunchActivity.class, "/crazyim/launchactivity", "crazyim", null, -1, -2147483648));
  }
}
