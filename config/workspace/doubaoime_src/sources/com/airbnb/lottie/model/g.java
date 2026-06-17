package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class g {
    private final String a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1339c;

    public g(String str, float f2, float f3) {
        this.a = str;
        this.f1339c = f3;
        this.b = f2;
    }

    public boolean a(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.a.endsWith("\r")) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
