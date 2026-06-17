package com.bytedance.frameworks.baselib.network.http.impl;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public class i implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final String f5145c = i.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f5146d = "0123456789ABCDEF".toCharArray();
    private transient f a;
    private long b = System.currentTimeMillis();

    public i(f fVar) {
        this.a = fVar;
    }

    public static i a(String str) {
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
            }
            try {
                return (i) new com.bytedance.frameworks.baselib.network.http.m.a(new ByteArrayInputStream(bArr), i.class).readObject();
            } catch (IOException e2) {
                Log.d(f5145c, "IOException in decodeCookie", e2);
            } catch (ClassNotFoundException e3) {
                Log.d(f5145c, "ClassNotFoundException in decodeCookie", e3);
            }
        }
        return null;
    }

    public static int c(String str, int i) {
        if (i != -1) {
            return i;
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        return "https".equalsIgnoreCase(str) ? 443 : -1;
    }

    public String b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            char[] cArr = new char[byteArray.length * 2];
            for (int i = 0; i < byteArray.length; i++) {
                int i2 = byteArray[i] & 255;
                int i3 = i * 2;
                char[] cArr2 = f5146d;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
            }
            return new String(cArr);
        } catch (IOException e2) {
            Log.d(f5145c, "IOException in encodeCookie", e2);
            return null;
        }
    }

    public f d() {
        return this.a;
    }

    public Long e() {
        return Long.valueOf(this.b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.a.equals(obj);
        }
        if (obj instanceof i) {
            return this.a.equals(((i) obj).a);
        }
        return false;
    }

    public boolean f() {
        long r = this.a.r();
        return r != -1 && (System.currentTimeMillis() - this.b) / 1000 > r;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
