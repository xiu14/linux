package com.xiaomi.push;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class gm extends gg {
    public gm() {
        a("PING", (String) null);
        a("0");
        a(0);
    }

    @Override // com.xiaomi.push.gg
    /* renamed from: a */
    ByteBuffer mo415a(ByteBuffer byteBuffer) {
        return m418a().length == 0 ? byteBuffer : super.mo415a(byteBuffer);
    }

    @Override // com.xiaomi.push.gg
    public int c() {
        if (m418a().length == 0) {
            return 0;
        }
        return super.c();
    }
}
