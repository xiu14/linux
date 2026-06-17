package com.bytedance.push.monitor.l;

import android.database.Cursor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class b extends com.bytedance.common.push.c {
    public long a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f5744c;

    /* renamed from: d, reason: collision with root package name */
    public String f5745d;

    /* renamed from: e, reason: collision with root package name */
    public String f5746e;

    public b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.b = str;
        if (jSONObject != null) {
            this.f5744c = jSONObject.toString();
        }
        if (jSONObject2 != null) {
            this.f5745d = jSONObject2.toString();
        }
        if (jSONObject3 != null) {
            this.f5746e = jSONObject3.toString();
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("{id=");
        M.append(this.a);
        M.append(", serviceName='");
        e.a.a.a.a.G0(M, this.b, '\'', ", category='");
        e.a.a.a.a.G0(M, this.f5744c, '\'', ", metric='");
        e.a.a.a.a.G0(M, this.f5745d, '\'', ", extra='");
        return e.a.a.a.a.H(M, this.f5746e, '\'', '}');
    }

    public b(Cursor cursor) {
        this.a = cursor.getLong(0);
        this.b = cursor.getString(1);
        this.f5744c = cursor.getString(2);
        this.f5745d = cursor.getString(3);
        this.f5746e = cursor.getString(4);
    }
}
