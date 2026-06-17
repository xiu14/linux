package com.bytedance.bdinstall.k0;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d {
    boolean a;
    boolean b;

    /* renamed from: c, reason: collision with root package name */
    boolean f4018c;

    /* renamed from: d, reason: collision with root package name */
    boolean f4019d;

    d(boolean z, boolean z2) {
        this.b = z;
        this.f4018c = z2;
        this.f4019d = false;
    }

    protected abstract boolean a(JSONObject jSONObject) throws JSONException, SecurityException;

    public void b(JSONObject jSONObject) {
    }

    d(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.f4018c = z2;
        this.f4019d = z3;
    }
}
