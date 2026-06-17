package com.bytedance.push;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.client.intelligence.IClientFeatureService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class B extends com.bytedance.common.push.c {
    public int a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    public long f5543c;

    /* renamed from: d, reason: collision with root package name */
    public long f5544d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5545e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5546f;

    /* renamed from: g, reason: collision with root package name */
    private String f5547g;
    private PushBody h;

    public B(Cursor cursor) {
        this.b = cursor.getLong(0);
        this.f5543c = cursor.getLong(1);
        this.f5544d = cursor.getLong(2);
        this.a = cursor.getInt(3);
        this.f5545e = cursor.getInt(4) == 1;
        this.f5546f = cursor.getInt(5) == 1;
        String string = cursor.getString(6);
        this.f5547g = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            this.h = new PushBody(new JSONObject(this.f5547g));
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.h = null;
        }
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "run_type", "show_push");
        add(jSONObject, "client_time", System.currentTimeMillis());
        add(jSONObject, "expire_time", this.f5544d);
        add(jSONObject, "rule_id", this.h.b);
        add(jSONObject, "rule_id64", this.h.f5569c);
        add(jSONObject, "client_feature", PushServiceManager.get().getPushExternalService().getClientFeatureService().getClientFeatureSync(IClientFeatureService.INVOKE_SCENE_PITAYA));
        return jSONObject;
    }

    public PushBody o() {
        if (this.h == null) {
            try {
                this.h = new PushBody(new JSONObject(this.f5547g));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this.h;
    }

    public B p(PushBody pushBody) {
        this.h = pushBody;
        return this;
    }

    public ContentValues q() {
        PushBody pushBody;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", Long.valueOf(this.b));
        contentValues.put("arrive_time", Long.valueOf(this.f5543c));
        contentValues.put("client_intelligence_expire_time", Long.valueOf(this.f5544d));
        contentValues.put("sender", Integer.valueOf(this.a));
        contentValues.put("handle_by_sdk", Integer.valueOf(this.f5545e ? 1 : 0));
        contentValues.put("has_been_shown", Integer.valueOf(this.f5546f ? 1 : 0));
        if (TextUtils.isEmpty(this.f5547g) && (pushBody = this.h) != null) {
            JSONObject jSONObject = pushBody.k;
            this.f5547g = jSONObject != null ? jSONObject.toString() : null;
        }
        contentValues.put("push_body", this.f5547g);
        return contentValues;
    }

    public B(int i, long j, long j2, long j3, boolean z, boolean z2, String str) {
        this.a = i;
        this.b = j;
        this.f5543c = j2;
        this.f5544d = j3;
        this.f5545e = z;
        this.f5546f = z2;
        this.f5547g = str;
    }
}
