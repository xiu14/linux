package com.bytedance.common.wschannel.app;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IWsApp extends Parcelable {
    List<Integer> A();

    int D();

    String N();

    boolean P();

    Map<String, String> d();

    int e0();

    int getAppId();

    String getDeviceId();

    String getExtra();

    int getPlatform();

    String h();

    List<String> j0();

    int l();

    int o();

    JSONObject p() throws JSONException;

    boolean r();

    String x();
}
