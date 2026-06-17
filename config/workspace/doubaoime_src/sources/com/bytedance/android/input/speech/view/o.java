package com.bytedance.android.input.speech.view;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import com.bytedance.common.wschannel.WsConstants;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    private static o f3179f;
    private int a;
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f3180c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f3181d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f3182e = "";

    public static final o e() {
        if (f3179f == null) {
            e.a.a.a.a.b0();
        }
        o oVar = f3179f;
        kotlin.s.c.l.d(oVar, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
        return oVar;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final String f() {
        return this.f3181d;
    }

    public final String g() {
        return this.f3182e;
    }

    public final String h() {
        return this.f3180c;
    }

    public final void i(int i) {
        e.a.a.a.a.j0("setEnterActionType ", i, "Asr-ViewData");
        this.a = i;
    }

    public final void j(EditorInfo editorInfo) {
        com.bytedance.android.input.r.j.i("Asr-ViewData", "setAppNameFeatureName");
        try {
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                return;
            }
            String string = bundle.getString("scene");
            this.b = editorInfo.packageName + '_' + string;
            String str = editorInfo.packageName;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            this.f3180c = str;
            if (string == null) {
                string = "";
            }
            this.f3181d = string;
            String string2 = editorInfo.extras.getString("extra");
            if (string2 != null) {
                str2 = string2;
            }
            this.f3182e = str2;
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.k("setAppNameFeatureName", WsConstants.KEY_CONNECTION_ERROR, e2);
        }
    }
}
