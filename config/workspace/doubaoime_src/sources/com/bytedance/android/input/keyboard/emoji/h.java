package com.bytedance.android.input.keyboard.emoji;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {
    private final String a;
    private final List<i> b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2717c;

    /* renamed from: d, reason: collision with root package name */
    private int f2718d;

    static {
        kotlin.collections.g.G("常用", "笑脸", "手势", "人物", "动物", "植物", "食物", "旅行", "活动", "物体", "符号", "旗帜", "开心", "伤心", "生气", "亲吻", "打招呼", "惊讶");
    }

    public h(String str, List<i> list) {
        kotlin.s.c.l.f(str, "name");
        kotlin.s.c.l.f(list, "itemList");
        this.a = str;
        this.b = list;
        this.f2717c = str;
        this.f2718d = -1;
    }

    public static h a(h hVar, String str, List list, int i) {
        String str2 = (i & 1) != 0 ? hVar.a : null;
        if ((i & 2) != 0) {
            list = hVar.b;
        }
        kotlin.s.c.l.f(str2, "name");
        kotlin.s.c.l.f(list, "itemList");
        return new h(str2, list);
    }

    public final int b() {
        return this.f2718d;
    }

    public final String c() {
        return this.f2717c;
    }

    public final List<i> d() {
        return this.b;
    }

    public final void e(int i) {
        this.f2718d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.s.c.l.a(this.a, hVar.a) && kotlin.s.c.l.a(this.b, hVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EmojiGroup(name=");
        M.append(this.a);
        M.append(", itemList=");
        M.append(this.b);
        M.append(')');
        return M.toString();
    }

    public /* synthetic */ h(String str, List list, int i) {
        this(str, (i & 2) != 0 ? new ArrayList() : null);
    }
}
