package com.bytedance.android.input.keyboard.gif.list_layout.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class h {

    @SerializedName("list")
    private final List<d> a;

    public final List<d> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && l.a(this.a, ((h) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EmoticonsWordVersionList(wordDataList=");
        M.append(this.a);
        M.append(')');
        return M.toString();
    }
}
