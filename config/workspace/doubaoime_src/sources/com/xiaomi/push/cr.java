package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;

/* loaded from: classes2.dex */
public final class cr {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private String f195a;

    public cr(String str, int i) {
        this.f195a = str;
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        if (this.a <= 0) {
            return this.f195a;
        }
        return this.f195a + Constants.COLON_SEPARATOR + this.a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m175a() {
        return this.f195a;
    }

    public static cr a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(Constants.COLON_SEPARATOR);
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
            str = substring;
        }
        return new cr(str, i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static InetSocketAddress m174a(String str, int i) {
        cr a = a(str, i);
        return new InetSocketAddress(a.m175a(), a.a());
    }
}
