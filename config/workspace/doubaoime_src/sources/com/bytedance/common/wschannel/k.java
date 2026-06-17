package com.bytedance.common.wschannel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class k {
    private static final String b = "com.bytedance.common.wschannel.k";

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"CI_StaticFieldLeak"})
    private static volatile k f4261c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4262d = 0;
    private final WsChannelMultiProcessSharedProvider.b a;

    private k(@NonNull Context context) {
        this.a = WsChannelMultiProcessSharedProvider.d(context.getApplicationContext());
    }

    public static k e(Context context) {
        if (f4261c == null) {
            synchronized (k.class) {
                if (f4261c == null) {
                    f4261c = new k(context);
                }
            }
        }
        return f4261c;
    }

    public ArrayList<Integer> a() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String d2 = this.a.d(WsConstants.KEY_AUTO_CONNECT_DISABLED, "");
        if (TextUtils.isEmpty(d2)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(d2);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            }
            if (Logger.debug()) {
                Logger.d(b, "getAutoConnectDisabledChannelIds: " + arrayList);
            }
        } catch (JSONException e2) {
            Logger.e(b, e2.getMessage());
        }
        return arrayList;
    }

    public long b() {
        return this.a.c(WsConstants.KEY_RETRY_SEND_MSG_DELAY, 0L);
    }

    public long c() {
        return this.a.c(WsConstants.KEY_IO_LIMIT, WsConstants.DEFAULT_IO_LIMIT);
    }

    public String d() {
        return this.a.d(WsConstants.KEY_WS_APPS, "");
    }

    public boolean f() {
        return this.a.b(WsConstants.KEY_FRONTIER_ENABLED, true);
    }

    public boolean g() {
        return this.a.b(WsConstants.KEY_ENABLE_OFFLINE_DETECT, false);
    }

    public boolean h() {
        return this.a.b(WsConstants.KEY_OK_IMPL_ENABLE, true);
    }

    public boolean i() {
        return this.a.b(WsConstants.KEY_ENABLE_REPORT_APP_STATE, false);
    }

    public void j(boolean z) {
        WsChannelMultiProcessSharedProvider.a a = this.a.a();
        a.b(WsConstants.KEY_ENABLE_OFFLINE_DETECT, z);
        a.a();
    }

    public void k(String str) {
        WsChannelMultiProcessSharedProvider.a a = this.a.a();
        a.c(WsConstants.KEY_WS_APPS, str);
        a.a();
    }
}
