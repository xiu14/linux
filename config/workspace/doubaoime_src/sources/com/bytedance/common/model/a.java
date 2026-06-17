package com.bytedance.common.model;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.bytedance.common.push.c {
    private String a;
    private Boolean b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f4144c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f4145d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f4146e;

    public a() {
        Boolean bool = Boolean.FALSE;
        JSONObject jSONObject = new JSONObject();
        this.a = "";
        this.b = bool;
        this.f4144c = bool;
        this.f4145d = bool;
        this.f4146e = jSONObject;
    }

    public JSONObject n() {
        return this.f4146e;
    }

    public String o() {
        return this.a;
    }

    public Boolean p() {
        return this.f4145d;
    }

    public Boolean q() {
        return this.b;
    }

    public Boolean r() {
        return this.f4144c;
    }
}
