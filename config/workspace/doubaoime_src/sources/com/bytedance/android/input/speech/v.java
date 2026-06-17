package com.bytedance.android.input.speech;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v {
    private String a;
    private List<ArrayList<String>> b;

    public v(String str, List<ArrayList<String>> list) {
        kotlin.s.c.l.f(str, "textEnd");
        this.a = str;
        this.b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.s.c.l.a(this.a, vVar.a) && kotlin.s.c.l.a(this.b, vVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<ArrayList<String>> list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AsrEndAndNBestInfo(textEnd=");
        M.append(this.a);
        M.append(", nbest=");
        M.append(this.b);
        M.append(')');
        return M.toString();
    }
}
