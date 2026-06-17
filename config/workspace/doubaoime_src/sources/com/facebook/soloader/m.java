package com.facebook.soloader;

/* loaded from: classes2.dex */
public class m implements com.facebook.soloader.r.b {
    @Override // com.facebook.soloader.r.b
    public boolean a(String str, int i) {
        return SoLoader.j(str, ((i & 1) != 0 ? 16 : 0) | 0);
    }
}
