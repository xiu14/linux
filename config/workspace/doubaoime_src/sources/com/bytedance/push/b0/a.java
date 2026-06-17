package com.bytedance.push.b0;

import android.util.Log;
import com.bytedance.applog.g;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static g a = new C0292a();

    /* renamed from: com.bytedance.push.b0.a$a, reason: collision with other inner class name */
    static class C0292a implements g {
        C0292a() {
        }

        @Override // com.bytedance.applog.g
        public void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
            Log.d("PushStarter", "onRemoteIdGet");
            d.b();
        }

        @Override // com.bytedance.applog.g
        public void b(String str, String str2, String str3) {
            Log.d("PushStarter", "onIdLoaded");
            d.b();
        }

        @Override // com.bytedance.applog.g
        public void c(boolean z, JSONObject jSONObject) {
            Log.d("PushStarter", "onRemoteIdGet");
        }
    }
}
