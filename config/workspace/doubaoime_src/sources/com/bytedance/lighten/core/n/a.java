package com.bytedance.lighten.core.n;

import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {

    private static class b extends HashMap<String, Object> {
        b(String str, Object obj, C0265a c0265a) {
            put(str, obj);
        }
    }

    public static Object a(View view) {
        Object obj;
        Object tag = view.getTag();
        if (!(tag instanceof b) || (obj = ((b) tag).get("DraweeHolder")) == null) {
            return null;
        }
        return obj;
    }

    public static void b(View view, Object obj) {
        Object tag = view.getTag();
        if (tag instanceof b) {
            ((b) tag).put("DraweeHolder", obj);
        } else {
            view.setTag(new b("DraweeHolder", obj, null));
        }
    }
}
