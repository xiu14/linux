package com.bytedance.memory.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.memory.b.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b extends BroadcastReceiver {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        long j;
        c.b("ResultReceiver onReceive", new Object[0]);
        this.a.f5363d = false;
        if (intent.hasExtra("Key_Result_Client_Memory")) {
            String stringExtra = intent.getStringExtra("Key_Result_Client_Memory");
            try {
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(new JSONObject(stringExtra).optString("memory_object"))) {
                    c.b("can upload", new Object[0]);
                    com.bytedance.feedbackerlib.a.P0("client_analyze_end");
                    long currentTimeMillis = System.currentTimeMillis();
                    j = this.a.f5362c;
                    com.bytedance.feedbackerlib.a.S0("client_analyze_time", currentTimeMillis - j);
                    com.bytedance.memory.f.a.a(stringExtra);
                }
                c.b("deleteCache", new Object[0]);
                com.bytedance.memory.heap.a.e().c();
            } catch (Exception e2) {
                c.b("deleteCache catch", new Object[0]);
                e2.printStackTrace();
            }
        }
    }
}
