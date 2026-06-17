package com.vivo.push.i;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a {
    private static String[] a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test"};
    private ArrayList<String> b;

    /* renamed from: com.vivo.push.i.a$a, reason: collision with other inner class name */
    private static class C0404a {
        private static a a = new a(0);
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C0404a.a;
    }

    public final boolean b() {
        ArrayList<String> arrayList = this.b;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }

    private a() {
        this.b = null;
        this.b = new ArrayList<>();
    }
}
