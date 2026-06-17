package com.google.gson;

import com.google.gson.internal.x;

/* loaded from: classes2.dex */
public final class n {
    public static i a(com.google.gson.stream.a aVar) throws j, r {
        boolean A = aVar.A();
        aVar.j0(true);
        try {
            try {
                return x.d(aVar);
            } catch (OutOfMemoryError e2) {
                throw new m("Failed parsing JSON source: " + aVar + " to Json", e2);
            } catch (StackOverflowError e3) {
                throw new m("Failed parsing JSON source: " + aVar + " to Json", e3);
            }
        } finally {
            aVar.j0(A);
        }
    }
}
