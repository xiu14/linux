package com.ss.android.c.g.d.b;

import com.ss.android.c.g.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a implements b {
    @Override // com.ss.android.c.g.b
    public String a(Object obj) {
        String str = (String) obj;
        if (str == null || str.trim().length() == 0) {
            throw new com.ss.android.c.g.a("JSON empty.");
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith("[")) {
                return new JSONArray(str).toString(4);
            }
            throw new com.ss.android.c.g.a("JSON should start with { or [, but found " + str);
        } catch (Exception e2) {
            throw new com.ss.android.c.g.a(e.a.a.a.a.s("Parse JSON error. JSON string:", str), e2);
        }
    }
}
