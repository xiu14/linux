package com.bytedance.android.input.keyboard.custom_symbol;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class h {
    private final String a;
    private final KeyboardCustomSymbolItemType b;

    public h(String str, KeyboardCustomSymbolItemType keyboardCustomSymbolItemType) {
        l.f(str, "text");
        l.f(keyboardCustomSymbolItemType, "itemType");
        this.a = str;
        this.b = keyboardCustomSymbolItemType;
    }

    public final KeyboardCustomSymbolItemType a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.a, hVar.a) && this.b == hVar.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("KeyboardCustomSymbolItemData(text=");
        M.append(this.a);
        M.append(", itemType=");
        M.append(this.b);
        M.append(')');
        return M.toString();
    }
}
