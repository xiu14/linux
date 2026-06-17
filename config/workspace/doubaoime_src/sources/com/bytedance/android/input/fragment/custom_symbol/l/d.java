package com.bytedance.android.input.fragment.custom_symbol.l;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.huawei.hms.framework.common.ContainerUtils;
import com.prolificinteractive.materialcalendarview.r;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class d implements c {
    private ArrayList<a> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();

    private final String c() {
        return e.a.a.a.a.e(IAppGlobals.a, C0838R.string.key_custom_symbol_number_9_cache, "IAppGlobals.context.getS…om_symbol_number_9_cache)");
    }

    private final void e(String str) {
        String str2 = "NUMBER_9_CACHE-" + str;
        l.f(str2, "msg");
        IAppGlobals.a.j("[custom_symbol]", str2);
    }

    private final void f(String str) {
        String str2 = "NUMBER_9_CACHE-" + str;
        l.f(str2, "msg");
        IAppGlobals.a.e("[custom_symbol]", str2);
    }

    private final String h(ArrayList<a> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((a) it2.next()).a());
        }
        String jSONArray2 = jSONArray.toString();
        l.e(jSONArray2, "jsonArray.toString()");
        return jSONArray2;
    }

    public ArrayList<a> a() {
        return this.a;
    }

    public String b() {
        return h(this.a);
    }

    public void d() {
        Object J2;
        e.a.a.a.a.x0("%", this.b);
        e.a.a.a.a.x0("+", this.b);
        e.a.a.a.a.x0(Constants.ACCEPT_TIME_SEPARATOR_SERVER, this.b);
        e.a.a.a.a.x0("*", this.b);
        e.a.a.a.a.x0("/", this.b);
        e.a.a.a.a.x0(ContainerUtils.KEY_VALUE_DELIMITER, this.b);
        e.a.a.a.a.x0("#", this.b);
        e.a.a.a.a.x0(Constants.COLON_SEPARATOR, this.b);
        e.a.a.a.a.x0(".", this.b);
        e.a.a.a.a.x0("×", this.b);
        e.a.a.a.a.x0("@", this.b);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            e("load json Data start");
            Object g2 = SettingsConfigNext.g(c(), h(this.b));
            l.d(g2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) g2;
            if (!(str.length() == 0)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                if (length != 0) {
                    for (int i = 0; i < length; i++) {
                        Object obj = jSONArray.get(i);
                        l.d(obj, "null cannot be cast to non-null type kotlin.String");
                        this.a.add(new a((String) obj));
                    }
                }
                String str2 = "NUMBER_9_CACHE-" + ("length = " + length);
                l.f(str2, "msg");
                IAppGlobals.a.x("[custom_symbol]", str2);
            }
            SettingsConfigNext.a.m(c(), str);
            e("load json Data end cost time = " + (System.currentTimeMillis() - currentTimeMillis));
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            f(e.a.a.a.a.w("load error ", b));
        }
    }

    public void g(ArrayList<a> arrayList) {
        Object J2;
        l.f(arrayList, "customSymbolDataList");
        this.a.clear();
        this.a.addAll(arrayList);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            e("refresh disk start");
            SettingsConfigNext.a.m(c(), h(this.a));
            e("refresh disk end cost time = " + (System.currentTimeMillis() - currentTimeMillis));
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            f(e.a.a.a.a.w("refresh disk error ", b));
        }
    }
}
