package com.bytedance.android.input.fragment.message.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    @SerializedName("list")
    private final ArrayList<c> a = new ArrayList<>();

    public final ArrayList<c> a() {
        return this.a;
    }

    public final String b() {
        l lVar = new l();
        lVar.d("list", new Gson().m(this.a));
        String iVar = lVar.toString();
        kotlin.s.c.l.e(iVar, "jo.toString()");
        return iVar;
    }
}
