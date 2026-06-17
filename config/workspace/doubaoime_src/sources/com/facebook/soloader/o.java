package com.facebook.soloader;

import android.os.StrictMode;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class o {
    public abstract int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException;

    protected void b(int i) throws IOException {
    }

    public String toString() {
        return getClass().getName();
    }
}
