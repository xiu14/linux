package com.bytedance.retrofit2.mime;

import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class j extends f {
    public j(String str) {
        try {
            super("text/plain; charset=UTF-8", str.getBytes("UTF-8"), new String[0]);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.bytedance.retrofit2.mime.f
    public String toString() {
        try {
            return "TypedString[" + new String(k(), "UTF-8") + "]";
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("Must be able to decode UTF-8");
        }
    }
}
