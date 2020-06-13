package com.kunminx.puremusic;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kunminx.puremusic.databinding.ActivityMainBindingImpl;
import com.kunminx.puremusic.databinding.ActivityMainBindingLandImpl;
import com.kunminx.puremusic.databinding.AdapterLibraryBindingImpl;
import com.kunminx.puremusic.databinding.AdapterPlayItemBindingImpl;
import com.kunminx.puremusic.databinding.FragmentDrawerBindingImpl;
import com.kunminx.puremusic.databinding.FragmentLoginBindingImpl;
import com.kunminx.puremusic.databinding.FragmentMainBindingImpl;
import com.kunminx.puremusic.databinding.FragmentMainBindingLandImpl;
import com.kunminx.puremusic.databinding.FragmentPlayerBindingImpl;
import com.kunminx.puremusic.databinding.FragmentPlayerBindingLandImpl;
import com.kunminx.puremusic.databinding.FragmentSearchBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ADAPTERLIBRARY = 2;

  private static final int LAYOUT_ADAPTERPLAYITEM = 3;

  private static final int LAYOUT_FRAGMENTDRAWER = 4;

  private static final int LAYOUT_FRAGMENTLOGIN = 5;

  private static final int LAYOUT_FRAGMENTMAIN = 6;

  private static final int LAYOUT_FRAGMENTPLAYER = 7;

  private static final int LAYOUT_FRAGMENTSEARCH = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.adapter_library, LAYOUT_ADAPTERLIBRARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.adapter_play_item, LAYOUT_ADAPTERPLAYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.fragment_drawer, LAYOUT_FRAGMENTDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.fragment_player, LAYOUT_FRAGMENTPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kunminx.puremusic.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          if ("layout-land/activity_main_0".equals(tag)) {
            return new ActivityMainBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ADAPTERLIBRARY: {
          if ("layout/adapter_library_0".equals(tag)) {
            return new AdapterLibraryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for adapter_library is invalid. Received: " + tag);
        }
        case  LAYOUT_ADAPTERPLAYITEM: {
          if ("layout/adapter_play_item_0".equals(tag)) {
            return new AdapterPlayItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for adapter_play_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRAWER: {
          if ("layout/fragment_drawer_0".equals(tag)) {
            return new FragmentDrawerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_drawer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout-land/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingLandImpl(component, view);
          }
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYER: {
          if ("layout-land/fragment_player_0".equals(tag)) {
            return new FragmentPlayerBindingLandImpl(component, view);
          }
          if ("layout/fragment_player_0".equals(tag)) {
            return new FragmentPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_player is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.kunminx.architecture.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "album");
      sKeys.put(3, "click");
      sKeys.put(4, "event");
      sKeys.put(5, "info");
      sKeys.put(6, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_main_0", com.kunminx.puremusic.R.layout.activity_main);
      sKeys.put("layout-land/activity_main_0", com.kunminx.puremusic.R.layout.activity_main);
      sKeys.put("layout/adapter_library_0", com.kunminx.puremusic.R.layout.adapter_library);
      sKeys.put("layout/adapter_play_item_0", com.kunminx.puremusic.R.layout.adapter_play_item);
      sKeys.put("layout/fragment_drawer_0", com.kunminx.puremusic.R.layout.fragment_drawer);
      sKeys.put("layout/fragment_login_0", com.kunminx.puremusic.R.layout.fragment_login);
      sKeys.put("layout-land/fragment_main_0", com.kunminx.puremusic.R.layout.fragment_main);
      sKeys.put("layout/fragment_main_0", com.kunminx.puremusic.R.layout.fragment_main);
      sKeys.put("layout-land/fragment_player_0", com.kunminx.puremusic.R.layout.fragment_player);
      sKeys.put("layout/fragment_player_0", com.kunminx.puremusic.R.layout.fragment_player);
      sKeys.put("layout/fragment_search_0", com.kunminx.puremusic.R.layout.fragment_search);
    }
  }
}
