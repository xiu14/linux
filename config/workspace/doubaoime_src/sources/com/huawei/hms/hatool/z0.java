package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.message.log.PushLog;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class z0 {
    private String a;
    public l1 b;

    public z0(String str) {
        this.a = str;
        this.b = new l1(str);
        s.c().a(this.a, this.b);
    }

    private s0 b(int i) {
        if (i == 0) {
            return this.b.c();
        }
        if (i == 1) {
            return this.b.b();
        }
        if (i == 2) {
            return this.b.d();
        }
        if (i != 3) {
            return null;
        }
        return this.b.a();
    }

    private boolean c(int i) {
        String str;
        if (i != 2) {
            s0 b = b(i);
            if (b != null && !TextUtils.isEmpty(b.h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else {
            if ("_default_config_tag".equals(this.a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        v.e("hmsSdk", str);
        return false;
    }

    public void a(int i) {
        StringBuilder M = e.a.a.a.a.M("onReport. TAG: ");
        M.append(this.a);
        M.append(", TYPE: ");
        M.append(i);
        v.d("hmsSdk", M.toString());
        g0.a().a(this.a, i);
    }

    public void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        StringBuilder M = e.a.a.a.a.M("onEvent. TAG: ");
        M.append(this.a);
        M.append(", TYPE: ");
        M.append(i);
        M.append(", eventId : ");
        M.append(str);
        v.d("hmsSdk", M.toString());
        if (e1.a(str) || !c(i)) {
            StringBuilder M2 = e.a.a.a.a.M("onEvent() parameters check fail. Nothing will be recorded.TAG: ");
            M2.append(this.a);
            M2.append(", TYPE: ");
            M2.append(i);
            v.e("hmsSdk", M2.toString());
            return;
        }
        if (!e1.a(linkedHashMap)) {
            StringBuilder M3 = e.a.a.a.a.M("onEvent() parameter mapValue will be cleared.TAG: ");
            M3.append(this.a);
            M3.append(", TYPE: ");
            M3.append(i);
            v.e("hmsSdk", M3.toString());
            linkedHashMap = null;
        }
        g0.a().a(this.a, i, str, linkedHashMap);
    }

    public void a(Context context, String str, String str2) {
        StringBuilder M = e.a.a.a.a.M("onEvent(context). TAG: ");
        M.append(this.a);
        M.append(", eventId : ");
        M.append(str);
        v.d("hmsSdk", M.toString());
        if (context == null) {
            v.e("hmsSdk", "context is null in onevent ");
            return;
        }
        if (e1.a(str) || !c(0)) {
            StringBuilder M2 = e.a.a.a.a.M("onEvent() parameters check fail. Nothing will be recorded.TAG: ");
            M2.append(this.a);
            v.e("hmsSdk", M2.toString());
        } else {
            if (!e1.a(PushLog.KEY_VALUE, str2, 65536)) {
                StringBuilder M3 = e.a.a.a.a.M("onEvent() parameter VALUE is overlong, content will be cleared.TAG: ");
                M3.append(this.a);
                v.e("hmsSdk", M3.toString());
                str2 = "";
            }
            g0.a().a(this.a, context, str, str2);
        }
    }

    public void a(s0 s0Var) {
        StringBuilder M = e.a.a.a.a.M("HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : ");
        M.append(this.a);
        v.a("hmsSdk", M.toString());
        if (s0Var != null) {
            this.b.a(s0Var);
        } else {
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.b.a((s0) null);
        }
    }

    public void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        StringBuilder M = e.a.a.a.a.M("onStreamEvent. TAG: ");
        M.append(this.a);
        M.append(", TYPE: ");
        M.append(i);
        M.append(", eventId : ");
        M.append(str);
        v.d("hmsSdk", M.toString());
        if (e1.a(str) || !c(i)) {
            StringBuilder M2 = e.a.a.a.a.M("onStreamEvent() parameters check fail. Nothing will be recorded.TAG: ");
            M2.append(this.a);
            M2.append(", TYPE: ");
            M2.append(i);
            v.e("hmsSdk", M2.toString());
            return;
        }
        if (!e1.a(linkedHashMap)) {
            StringBuilder M3 = e.a.a.a.a.M("onStreamEvent() parameter mapValue will be cleared.TAG: ");
            M3.append(this.a);
            M3.append(", TYPE: ");
            M3.append(i);
            v.e("hmsSdk", M3.toString());
            linkedHashMap = null;
        }
        g0.a().b(this.a, i, str, linkedHashMap);
    }

    public void b(s0 s0Var) {
        StringBuilder M = e.a.a.a.a.M("HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: ");
        M.append(this.a);
        v.a("hmsSdk", M.toString());
        if (s0Var != null) {
            this.b.b(s0Var);
        } else {
            this.b.b(null);
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }
}
