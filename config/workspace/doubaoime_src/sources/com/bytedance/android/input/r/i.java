package com.bytedance.android.input.r;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
class i implements e.h.a.d.c {
    List<String> a = null;

    i(j jVar) {
    }

    @Override // e.h.a.d.c
    public List<String> b(long j, long j2, JSONObject jSONObject) {
        if (j < j2) {
            if (!com.ss.android.c.a.n()) {
                Log.d("ALog", "ALog has not been inited");
            }
            com.ss.android.c.a.t();
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                Log.e("ALog", "InitAlog handleAlogData error:" + e2);
            }
            ArrayList arrayList = new ArrayList();
            try {
                File[] c2 = com.bytedance.android.alog.c.c(null, null, j * 1000, j2 * 1000);
                for (File file : c2) {
                    arrayList.add(file.getAbsolutePath());
                }
            } catch (Exception unused) {
            }
            this.a = arrayList;
        }
        return this.a;
    }

    @Override // e.h.a.d.d
    @NonNull
    public e.h.a.e.c c() {
        List<String> list = this.a;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        return e.h.a.e.c.a(z, z ? "" : "ALog file not get", null);
    }
}
