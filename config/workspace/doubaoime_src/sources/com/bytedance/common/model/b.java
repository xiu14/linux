package com.bytedance.common.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.bytedance.common.push.c {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f4147c;

    /* renamed from: d, reason: collision with root package name */
    private String f4148d;

    /* renamed from: e, reason: collision with root package name */
    private List f4149e;

    /* renamed from: f, reason: collision with root package name */
    private String f4150f;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.f4147c = str3;
        this.f4148d = str4;
        this.f4150f = str5;
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str4);
            int length = jSONObject.length();
            this.f4149e = new ArrayList();
            for (int i = 0; i < length; i++) {
                this.f4149e.add(jSONObject.getString(i + ""));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public String getMethodName() {
        return this.f4147c;
    }

    public String n() {
        return this.f4148d;
    }

    public String o() {
        return this.f4150f;
    }

    public List p() {
        return this.f4149e;
    }

    public String q() {
        return this.a;
    }

    public String r() {
        return this.b;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MethodCallRecord{originProcessSuffix='");
        e.a.a.a.a.G0(M, this.a, '\'', ", targetProcessSuffix='");
        e.a.a.a.a.G0(M, this.b, '\'', ", methodName='");
        e.a.a.a.a.G0(M, this.f4147c, '\'', ", args='");
        e.a.a.a.a.G0(M, this.f4148d, '\'', ", id='");
        return e.a.a.a.a.H(M, this.f4150f, '\'', '}');
    }

    public b(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.f4147c = str3;
        this.f4149e = list;
        if (list == null) {
            this.f4148d = new JSONObject().toString();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < list.size(); i++) {
            add(jSONObject, i + "", list.get(i).toString());
        }
        this.f4148d = jSONObject.toString();
    }
}
