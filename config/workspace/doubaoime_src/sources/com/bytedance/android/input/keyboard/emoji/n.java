package com.bytedance.android.input.keyboard.emoji;

import com.bytedance.android.input.environment.api.IEnvironment;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n implements q {
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2720c;

    public n() {
        StringBuilder sb = new StringBuilder();
        IEnvironment.a aVar = IEnvironment.a;
        Objects.requireNonNull(aVar);
        sb.append(aVar.l());
        sb.append("emoji_history.txt");
        this.a = sb.toString();
        this.b = "symbol/emoji.txt";
        this.f2720c = "symbol/emoji_hot.txt";
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String a() {
        return this.b;
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String b() {
        return this.a;
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String c(i iVar) {
        kotlin.s.c.l.f(iVar, "item");
        return iVar.d();
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String d() {
        return this.f2720c;
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public i e(String str) {
        kotlin.s.c.l.f(str, "text");
        return new i(1, str, 0, 4);
    }
}
