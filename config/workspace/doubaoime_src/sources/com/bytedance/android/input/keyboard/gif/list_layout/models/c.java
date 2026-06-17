package com.bytedance.android.input.keyboard.gif.list_layout.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    @SerializedName("list")
    private final ArrayList<b> a = new ArrayList<>();

    @SerializedName("total")
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("use_emojis")
    private final boolean f2749c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("score")
    private final double f2750d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("hit_words")
    private final boolean f2751e;

    public final ArrayList<b> a() {
        return this.a;
    }
}
