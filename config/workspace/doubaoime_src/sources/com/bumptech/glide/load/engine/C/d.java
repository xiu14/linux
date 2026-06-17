package com.bumptech.glide.load.engine.C;

import com.bumptech.glide.load.engine.C.a;
import java.io.File;

/* loaded from: classes.dex */
public class d implements a.InterfaceC0022a {
    private final long a;
    private final b b;

    class a implements b {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.bumptech.glide.load.engine.C.d.b
        public File a() {
            return new File(this.a, this.b);
        }
    }

    public interface b {
        File a();
    }

    public d(String str, String str2, long j) {
        a aVar = new a(str, str2);
        this.a = j;
        this.b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.C.a.InterfaceC0022a
    public com.bumptech.glide.load.engine.C.a build() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.isDirectory() || a2.mkdirs()) {
            return new e(a2, this.a);
        }
        return null;
    }

    public d(b bVar, long j) {
        this.a = j;
        this.b = bVar;
    }
}
