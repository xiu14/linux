package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.SsWsApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
class m implements f {
    private static final String b = "m";
    private final Context a;

    m(Context context) {
        this.a = context;
    }

    private boolean c(IWsApp iWsApp) {
        return iWsApp != null && iWsApp.l() > 0 && iWsApp.getAppId() > 0 && !com.bytedance.android.input.k.b.a.Y(iWsApp.x()) && iWsApp.D() > 0 && !iWsApp.j0().isEmpty() && !com.bytedance.android.input.k.b.a.Y(iWsApp.getDeviceId()) && iWsApp.e0() > 0 && !com.bytedance.android.input.k.b.a.Y(iWsApp.h()) && iWsApp.getPlatform() == 0;
    }

    @Override // com.bytedance.common.wschannel.server.f
    public Map<Integer, IWsApp> a() {
        String d2;
        JSONArray jSONArray;
        int length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            d2 = com.bytedance.common.wschannel.k.e(this.a).d();
            if (Logger.debug()) {
                Logger.d(b, "load from sp wsAppStr: " + d2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (TextUtils.isEmpty(d2) || (length = (jSONArray = new JSONArray(d2)).length()) <= 0) {
            return linkedHashMap;
        }
        ArrayList<Integer> a = com.bytedance.common.wschannel.k.e(this.a).a();
        if (Logger.debug()) {
            Logger.d(b, "load from sp disabledList: " + a);
        }
        for (int i = 0; i < length; i++) {
            SsWsApp a2 = new SsWsApp.b().a(jSONArray.optJSONObject(i));
            if (c(a2) && !a.contains(Integer.valueOf(WsChannelService.a(a2)))) {
                linkedHashMap.put(Integer.valueOf(WsChannelService.a(a2)), a2);
            }
        }
        if (Logger.debug()) {
            Logger.d(b, "loadWsChannels final wsApp: " + linkedHashMap);
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.common.wschannel.server.f
    public void b(Map<Integer, IWsApp> map) {
        if (map == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (WsChannelService.class) {
            for (Map.Entry<Integer, IWsApp> entry : map.entrySet()) {
                try {
                    if (c(entry.getValue())) {
                        jSONArray.put(entry.getValue().p());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        try {
            Logger.d(b, "save to sp : " + jSONArray.toString());
            com.bytedance.common.wschannel.k.e(this.a).k(jSONArray.toString());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
