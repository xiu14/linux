package com.bytedance.android.input.keyboard.custom_symbol;

/* loaded from: classes.dex */
public enum KeyboardCustomSymbolItemType {
    TEXT(1),
    ADD_BUTTON(2);

    public static final a Companion = new a(null);
    private final int itemTypeValue;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }
    }

    KeyboardCustomSymbolItemType(int i) {
        this.itemTypeValue = i;
    }

    public final int getItemTypeValue() {
        return this.itemTypeValue;
    }
}
