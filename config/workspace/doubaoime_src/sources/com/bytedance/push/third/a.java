package com.bytedance.push.third;

import android.annotation.SuppressLint;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.g0.k;
import com.bytedance.push.interfaze.r;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class a {
    protected static final Set<Integer> b = new CopyOnWriteArraySet();

    @SuppressLint({"UseSparseArrays"})
    protected Map<Integer, k<d>> a = new HashMap();

    public a() {
        g gVar = (g) this;
        if (gVar.a.size() == 0) {
            if (gVar.a.size() == 0) {
                gVar.a.put(15, new f(15, "com.bytedance.push.frontier.FrontierPushAdapter", "frontierPush", new com.bytedance.push.third.i.a(com.ss.android.message.a.a())));
                gVar.a.put(21, new f(21, "com.bytedance.push.sync.SyncPushAdapter", "sync", new com.bytedance.push.third.i.a(com.ss.android.message.a.a())));
            }
            Application a = com.ss.android.message.a.a();
            gVar.a.put(1, new f(1, "com.xm.MiPushAdapter", "xm/MiPush", new com.bytedance.push.third.i.c(a)));
            gVar.a.put(6, new f(6, "com.um.UmPushAdapter", "um", new com.bytedance.push.third.i.a(a)));
            gVar.a.put(7, new f(7, "com.hw.HWPushAdapter", "hw", new com.bytedance.push.third.i.a(a)));
            gVar.a.put(8, new f(8, "com.mz.MzPushAdapter", "mz", new com.bytedance.push.third.i.c(a)));
            gVar.a.put(10, new f(10, "com.coloros.OpPushAdapter", "op", new com.bytedance.push.third.i.c(a)));
            gVar.a.put(11, new f(11, "com.vv.VvPushAdapter", "vv", new com.bytedance.push.third.i.a(a)));
            gVar.a.put(16, new f(16, "com.smt.SmtPushAdapter", "SmtPush", new com.bytedance.push.third.i.a(a)));
            gVar.a.put(5, new f(5, "com.fcm.FcmPushAdapter", "fcm", new com.bytedance.push.third.i.a(a)));
            gVar.a.put(14, new f(14, "com.adm.push.AdmPushAdapter", "amazon", new com.bytedance.push.third.i.a(com.ss.android.message.a.a())));
            gVar.a.put(22, new f(22, "com.honor.HonorPushAdapter", "honorPush", new com.bytedance.push.third.i.a(a)));
            gVar.a.put(23, new f(23, "com.um.mini.UmPushAdapter", "um_mini", new com.bytedance.push.third.i.a(a)));
            gVar.a.put(26, new f(26, "com.matrix.MatrixPushAdapter", "matrix", new com.bytedance.push.third.i.a(a)));
        }
    }

    private d b(Integer num) {
        Map<Integer, k<d>> map;
        if (num == null || (map = this.a) == null) {
            c(num, this.a);
            return null;
        }
        k<d> kVar = map.get(num);
        if (kVar != null) {
            return kVar.f(new Object[0]);
        }
        c(num, this.a);
        return null;
    }

    private void c(Integer num, Map<Integer, k<d>> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (num == null) {
                jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, "null");
            } else {
                jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, num);
            }
            if (map == null) {
                jSONObject.put("errMsg", "pushChannelMap is null");
            } else {
                jSONObject.put("errMsg", map.keySet());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        ((r) com.ss.android.ug.bus.b.a(r.class)).monitorEvent("get_channel_failed", jSONObject, null, null);
    }

    public static void g(String str, boolean z) {
        if (z) {
            com.ss.android.pushmanager.setting.c.c().e().w(str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.push.g0.f.c("", "support:" + str);
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (jSONArray == null) {
            return;
        }
        if (com.bytedance.push.g0.f.d()) {
            com.bytedance.push.g0.f.c("BaseChannelHelper", "handlerApplogConfig: jsonArray = " + jSONArray);
        }
        b.clear();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            int optInt = jSONArray.optInt(i);
            if (optInt > 0) {
                b.add(Integer.valueOf(optInt));
            }
        }
    }

    public c a(int i) {
        d b2 = b(Integer.valueOf(i));
        if (b2 == null) {
            return null;
        }
        return b2.d();
    }

    public int d(String str) {
        com.bytedance.push.g0.f.c("bdpush", "getChannelId is called:" + str);
        if (this.a == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        for (Integer num : this.a.keySet()) {
            d b2 = b(num);
            if (b2 != null && str.equals(b2.c())) {
                return num.intValue();
            }
        }
        return -1;
    }

    public b e() {
        Iterator<Integer> it2 = this.a.keySet().iterator();
        while (it2.hasNext()) {
            d b2 = b(it2.next());
            if (b2 != null) {
                Object d2 = b2.d();
                if ((d2 instanceof b) && b2.a()) {
                    return (b) d2;
                }
            }
        }
        return null;
    }

    public String f(int i) {
        d b2 = b(Integer.valueOf(i));
        return b2 != null ? b2.b() : "unknown";
    }

    public boolean h(int i) {
        d b2 = b(Integer.valueOf(i));
        com.bytedance.push.g0.f.g("BaseChannelHelper", "[isLocalSupportChannel]channelId:" + i + " iPushChannel:" + b2);
        if (b2 == null) {
            com.bytedance.push.g0.f.m("BaseChannelHelper", "[isLocalSupportChannel]channelId:" + i + " return not support because pushChannel is null");
            return false;
        }
        if (!i(i) && ((com.bytedance.push.U.a.a) ((C) C.a()).n()).t().contains(Integer.valueOf(i))) {
            com.bytedance.push.g0.f.m("BaseChannelHelper", "[isLocalSupportChannel]channelId:" + i + " return not support because needDisableChannelWhenStrictMode");
            return false;
        }
        boolean a = b2.a();
        com.bytedance.push.g0.f.m("BaseChannelHelper", "[isLocalSupportChannel]channelId:" + i + " pushChannelSupport:" + a);
        return a;
    }

    public abstract boolean i(int i);
}
