package com.facebook.cache.common;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c {
    public static String a(b bVar) {
        try {
            if (!(bVar instanceof e)) {
                return c(bVar);
            }
            Objects.requireNonNull((e) bVar);
            throw null;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static List<String> b(b bVar) {
        try {
            if (bVar instanceof e) {
                Objects.requireNonNull((e) bVar);
                throw null;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(bVar.a() ? bVar.b() : c(bVar));
            return arrayList;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String c(b bVar) throws UnsupportedEncodingException {
        byte[] bytes = bVar.b().getBytes("UTF-8");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
