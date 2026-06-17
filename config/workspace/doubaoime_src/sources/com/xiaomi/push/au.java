package com.xiaomi.push;

/* loaded from: classes2.dex */
public class au implements aw {
    private final String a;
    private final String b;

    public au(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.a = str;
        this.b = str2;
    }

    @Override // com.xiaomi.push.aw
    public String a() {
        return this.a;
    }

    @Override // com.xiaomi.push.aw
    public String b() {
        return this.b;
    }
}
