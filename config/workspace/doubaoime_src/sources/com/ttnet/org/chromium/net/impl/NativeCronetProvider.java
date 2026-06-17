package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.base.annotations.UsedByReflection;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.k;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class NativeCronetProvider extends com.ttnet.org.chromium.net.i {
    @UsedByReflection
    public NativeCronetProvider(Context context) {
        super(context);
    }

    @Override // com.ttnet.org.chromium.net.i
    public AbstractC0759g.a a(boolean z) {
        return new k.a(new B(this.a, z));
    }

    @Override // com.ttnet.org.chromium.net.i
    public String c() {
        return "App-Packaged-Cronet-Provider";
    }

    @Override // com.ttnet.org.chromium.net.i
    public String d() {
        return "107.0.5273.2";
    }

    @Override // com.ttnet.org.chromium.net.i
    public boolean e() {
        return true;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof NativeCronetProvider) && this.a.equals(((NativeCronetProvider) obj).a));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.a});
    }
}
