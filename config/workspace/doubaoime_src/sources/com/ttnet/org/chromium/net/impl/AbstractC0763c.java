package com.ttnet.org.chromium.net.impl;

import androidx.annotation.Nullable;
import com.ttnet.org.chromium.net.B;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.l;
import com.ttnet.org.chromium.net.u;
import com.ttnet.org.chromium.net.z;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.impl.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0763c extends com.ttnet.org.chromium.net.k {
    protected abstract com.ttnet.org.chromium.net.z U(z.b bVar, Executor executor, int i, List<String> list, int i2, int i3, int i4);

    protected abstract H V(String str, F.b bVar, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, @Nullable u.a aVar, int i4, long j);

    protected abstract com.ttnet.org.chromium.net.B W(B.b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z);

    protected abstract com.ttnet.org.chromium.net.B X(B.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z);

    @Override // com.ttnet.org.chromium.net.AbstractC0759g
    public z.a b(z.b bVar, Executor executor) {
        return new F(bVar, null, this);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC0759g
    public B.a d(B.b bVar, Executor executor) {
        return new G(bVar, executor, this);
    }

    @Override // com.ttnet.org.chromium.net.k
    /* renamed from: z */
    public l.a c(String str, F.b bVar, Executor executor) {
        return new I(str, bVar, executor, this);
    }
}
