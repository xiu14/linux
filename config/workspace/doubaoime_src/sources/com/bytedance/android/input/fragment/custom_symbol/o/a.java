package com.bytedance.android.input.fragment.custom_symbol.o;

import com.bytedance.android.input.basic.applog.api.IAppLog;
import java.util.ArrayList;
import kotlin.collections.g;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    private static final void a(JSONObject jSONObject, String str, ArrayList<com.bytedance.android.input.fragment.custom_symbol.l.a> arrayList, int i) {
        if (arrayList != null) {
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    g.b0();
                    throw null;
                }
                com.bytedance.android.input.fragment.custom_symbol.l.a aVar = (com.bytedance.android.input.fragment.custom_symbol.l.a) obj;
                if ((aVar.a().length() > 0) && i3 <= i) {
                    jSONObject.putOpt(str + '_' + i3, aVar.a());
                }
                i2 = i3;
            }
        }
    }

    public static final void b() {
        f("key_write");
    }

    public static final void c() {
        f("nine_number");
    }

    public static final void d() {
        f("nine_pinyin");
    }

    public static final void e(boolean z, boolean z2, ArrayList<com.bytedance.android.input.fragment.custom_symbol.l.a> arrayList, ArrayList<com.bytedance.android.input.fragment.custom_symbol.l.a> arrayList2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("pinyin_is_change", Boolean.valueOf(z));
        jSONObject.putOpt("number_is_change", Boolean.valueOf(z2));
        jSONObject.putOpt("pinyin_count", Integer.valueOf(arrayList != null ? arrayList.size() : 0));
        jSONObject.putOpt("number_count", Integer.valueOf(arrayList2 != null ? arrayList2.size() : 0));
        a(jSONObject, "pinyin", arrayList, 5);
        a(jSONObject, "number", arrayList2, 5);
        IAppLog.a.t("nine_symboldiv_done", jSONObject);
    }

    private static final void f(String str) {
        e.a.a.a.a.q0("options", str, IAppLog.a, "nine_symboldiv_click");
    }

    public static final void g() {
        f("settings_nine_number");
    }

    public static final void h() {
        f("settings_nine_pinyin");
    }
}
