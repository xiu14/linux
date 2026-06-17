package com.bytedance.android.doubaoime.u;

import com.bytedance.android.input.basic.thread.d;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements d {
    public static final b a = new b();

    private b() {
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public void a(JSONObject jSONObject) {
        l.f(jSONObject, DBDefinition.SEGMENT_INFO);
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public boolean b() {
        return false;
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public void c(JSONObject jSONObject) {
        l.f(jSONObject, DBDefinition.SEGMENT_INFO);
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public void d(JSONObject jSONObject) {
        l.f(jSONObject, DBDefinition.SEGMENT_INFO);
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public boolean e() {
        return false;
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public boolean f() {
        return false;
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public void g(JSONObject jSONObject) {
        l.f(jSONObject, DBDefinition.SEGMENT_INFO);
    }

    @Override // com.bytedance.android.input.basic.thread.d
    public boolean h() {
        return false;
    }
}
