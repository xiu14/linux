package com.bytedance.push.third;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.push.e.i;
import com.bytedance.push.g0.k;
import com.vivo.push.PushClient;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class g extends a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile g f5882d;

    /* renamed from: c, reason: collision with root package name */
    private b f5883c;

    private g(Context context) {
        com.ss.android.message.a.b((Application) context.getApplicationContext());
    }

    private int l(Context context, boolean z) {
        Object a = super.a(10);
        if (a instanceof b) {
            String isBusinessAlertDialogAvailable = ((b) a).isBusinessAlertDialogAvailable(context, z);
            com.bytedance.push.g0.f.c("PushChannelHelper", "[getCurBusinessSysAlertType]op businessAlertDialogAvailable:" + isBusinessAlertDialogAvailable);
            if (TextUtils.equals(isBusinessAlertDialogAvailable, PushClient.DEFAULT_REQUEST_ID)) {
                return 10;
            }
        }
        Object a2 = super.a(22);
        if (a2 instanceof b) {
            String isBusinessAlertDialogAvailable2 = ((b) a2).isBusinessAlertDialogAvailable(context, z);
            com.bytedance.push.g0.f.c("PushChannelHelper", "[getCurBusinessSysAlertType]honor businessAlertDialogAvailable:" + isBusinessAlertDialogAvailable2);
            if (TextUtils.equals(isBusinessAlertDialogAvailable2, PushClient.DEFAULT_REQUEST_ID)) {
                return 22;
            }
        }
        Object a3 = super.a(7);
        if (a3 instanceof b) {
            String isBusinessAlertDialogAvailable3 = ((b) a3).isBusinessAlertDialogAvailable(context, z);
            com.bytedance.push.g0.f.c("PushChannelHelper", "[getCurBusinessSysAlertType]hw businessAlertDialogAvailable:" + isBusinessAlertDialogAvailable3);
            if (TextUtils.equals(isBusinessAlertDialogAvailable3, PushClient.DEFAULT_REQUEST_ID)) {
                return 7;
            }
        }
        Object a4 = super.a(11);
        if (!(a4 instanceof b)) {
            return -1;
        }
        String isBusinessAlertDialogAvailable4 = ((b) a4).isBusinessAlertDialogAvailable(context, z);
        com.bytedance.push.g0.f.c("PushChannelHelper", "[getCurBusinessSysAlertType]vv businessAlertDialogAvailable:" + isBusinessAlertDialogAvailable4);
        return TextUtils.equals(isBusinessAlertDialogAvailable4, PushClient.DEFAULT_REQUEST_ID) ? 11 : -1;
    }

    public static g o(Context context) {
        if (f5882d == null) {
            synchronized (g.class) {
                if (f5882d == null) {
                    f5882d = new g(context);
                }
            }
        }
        return f5882d;
    }

    public static boolean p(int i) {
        if (com.bytedance.push.g0.f.d()) {
            StringBuilder M = e.a.a.a.a.M("initAllowPushSet: mAllowPushSet = ");
            M.append(a.b);
            com.bytedance.push.g0.f.c("BaseChannelHelper", M.toString());
        }
        Set<Integer> set = a.b;
        if (set.isEmpty()) {
            a.g(com.ss.android.pushmanager.setting.c.c().f(), false);
        }
        return set.contains(Integer.valueOf(i));
    }

    @Override // com.bytedance.push.third.a
    public boolean i(int i) {
        if (i == 7 || i == 10 || i == 11) {
            return true;
        }
        return (i == 1 && com.ss.android.message.f.a.w()) || i == 22 || i == 26;
    }

    public JSONArray j() {
        JSONArray jSONArray = new JSONArray();
        com.bytedance.push.g0.f.g("BaseChannelHelper", "[buildApplogHeader]");
        try {
            for (Integer num : this.a.keySet()) {
                boolean h = h(num.intValue());
                com.bytedance.push.g0.f.g("BaseChannelHelper", "[buildApplogHeader]channelId:" + num + " localSupportChannel:" + h);
                if (h) {
                    jSONArray.put(num);
                }
            }
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("BaseChannelHelper", "buildApplogHeader:  ", th);
            StringBuilder sb = new StringBuilder();
            try {
                Iterator<Integer> it2 = this.a.keySet().iterator();
                while (it2.hasNext()) {
                    sb.append(String.format(" %s ", it2.next()));
                }
            } catch (Throwable th2) {
                StringBuilder M = e.a.a.a.a.M("error when convert mPushChannelMap to str:");
                M.append(th2.getLocalizedMessage());
                sb = new StringBuilder(M.toString());
            }
            com.bytedance.push.helper.b.a(th, String.format("error when buildApplogHeader,mPushChannelMap.keySet() is %s", sb));
        }
        return jSONArray;
    }

    public Set k() {
        Map<Integer, k<d>> map = this.a;
        if (map == null) {
            return null;
        }
        return map.keySet();
    }

    public String m() {
        com.bytedance.push.g0.f.c("PushChannelHelper", "[getCurBusinessSysAlertType]");
        int l = l(com.ss.android.message.a.a(), true);
        return l != 7 ? l != 22 ? l != 10 ? l != 11 ? "unknown" : "vv" : "op" : "honor" : "hms";
    }

    public boolean n(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !"[]".equals(str)) {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return false;
                }
                if (jSONArray.optInt(0) != -9307) {
                    String jSONArray2 = j().toString();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        if (!jSONArray2.contains(jSONArray.optInt(i) + "")) {
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean q() {
        Application a = com.ss.android.message.a.a();
        c a2 = super.a(10);
        c a3 = super.a(7);
        c a4 = super.a(11);
        return (a2 != null && a2.isPushAvailable(a, 10)) || (a3 != null && a3.isPushAvailable(a, 7)) || (a4 != null && a4.isPushAvailable(a, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r0.toLowerCase().contains("huawei") != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.Integer, com.bytedance.push.third.c> r() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.third.g.r():android.util.Pair");
    }

    public void s(String str, i iVar) {
        synchronized (this) {
            com.bytedance.push.g0.f.c("PushChannelHelper", "[requestNotificationPermissionByBusinessAlert]customDialogView:" + ((Object) null) + " alertRequestParam:" + ((Object) null));
            Application a = com.ss.android.message.a.a();
            if (com.ss.android.message.f.a.d(a) == 1) {
                com.bytedance.push.g0.f.m("PushChannelHelper", "[requestNotificationPermissionByBusinessAlert]return false because notification are enabled status");
                iVar.onRequestResult(false, "notification are enabled");
                return;
            }
            int l = l(com.ss.android.message.a.a(), false);
            if (-1 == l) {
                com.bytedance.push.g0.f.m("PushChannelHelper", "[requestNotificationPermissionByBusinessAlert]return false because curBusinessSysAlertType is unknown");
                iVar.onRequestResult(false, "unknown curBusinessSysAlertType");
                return;
            }
            Object a2 = super.a(l);
            if (a2 instanceof b) {
                try {
                    b bVar = (b) a2;
                    this.f5883c = bVar;
                    bVar.requestNotificationPermission(str, l, 0, null, iVar);
                } catch (Throwable th) {
                    com.bytedance.push.g0.f.e("PushChannelHelper", "requestNotificationPermission error" + Log.getStackTraceString(th));
                    iVar.onRequestResult(false, "exception:" + th.getLocalizedMessage());
                }
            } else {
                com.bytedance.push.g0.f.m("PushChannelHelper", "[requestNotificationPermissionByBusinessAlert]invalid  pushAdapter:" + a2);
                iVar.onRequestResult(false, "invalid  pushAdapter:" + a2);
            }
        }
    }
}
