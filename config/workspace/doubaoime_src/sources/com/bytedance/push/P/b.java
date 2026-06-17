package com.bytedance.push.P;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.C;
import com.bytedance.push.C0679c;
import com.bytedance.push.g0.j;
import com.bytedance.push.interfaze.r;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    static class a implements com.ss.android.g.e.a {
        a() {
        }

        @Override // com.ss.android.g.e.a
        public void h(Context context) {
            com.ss.android.message.a.b(C0679c.a().a);
        }
    }

    /* renamed from: com.bytedance.push.P.b$b, reason: collision with other inner class name */
    static class C0289b implements com.ss.android.g.e.b {
        C0289b() {
        }

        @Override // com.ss.android.g.e.b
        public boolean b() {
            Application application = C0679c.a().a;
            if (com.ss.android.message.f.a.t(application)) {
                if (((PushOnlineSettings) h.b(C0679c.a().a, PushOnlineSettings.class)).c0()) {
                    return true;
                }
                return ((PushOnlineSettings) h.b(C0679c.a().a, PushOnlineSettings.class)).b() && j.i();
            }
            SharedPreferences sharedPreferences = application.getSharedPreferences("push_multi_process_config", 0);
            if (sharedPreferences.getBoolean("remove_auto_boot_v2", false)) {
                return true;
            }
            return sharedPreferences.getBoolean("need_control_miui_flares_v2", true) && j.i();
        }

        @Override // com.ss.android.g.e.b
        public Map<String, String> n() {
            return ((C) C.a()).c();
        }

        @Override // com.ss.android.g.e.b
        public void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
            if (C0679c.a().m != null) {
                C0679c.a().m.onEvent(context, str, str2, str3, j, j2, jSONObject);
            }
        }

        @Override // com.ss.android.g.e.b
        public void onEventV3(String str, JSONObject jSONObject) {
            if (C0679c.a().m != null) {
                C0679c.a().m.onEventV3(str, jSONObject);
            }
        }
    }

    public static void a() {
        com.ss.android.ug.bus.b.b(com.ss.android.g.e.a.class, new a());
        com.ss.android.ug.bus.b.b(com.ss.android.g.e.b.class, new C0289b());
        com.ss.android.ug.bus.b.b(com.bytedance.push.Y.a.class, new com.bytedance.push.Y.b());
        com.ss.android.ug.bus.b.b(com.bytedance.common.push.e.a.class, C0679c.a().v);
        com.ss.android.ug.bus.b.b(r.class, new com.bytedance.push.monitor.j());
    }
}
