package com.ss.android.c.g.f;

import com.ss.android.c.g.b;

/* loaded from: classes2.dex */
public class a implements b {
    @Override // com.ss.android.c.g.b
    public String a(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(((Thread) obj).getName());
        return stringBuffer.toString();
    }
}
