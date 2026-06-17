package com.bytedance.memory.e;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.Serializable;

/* loaded from: classes.dex */
public class a implements Serializable {
    private boolean a;

    /* renamed from: e, reason: collision with root package name */
    private c f5375e;

    /* renamed from: f, reason: collision with root package name */
    private b f5376f;

    /* renamed from: g, reason: collision with root package name */
    private String f5377g;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f5373c = 200;

    /* renamed from: d, reason: collision with root package name */
    private int f5374d = 90;
    private int h = 1;

    /* renamed from: com.bytedance.memory.e.a$a, reason: collision with other inner class name */
    public static class C0271a implements Serializable {
        private b a;

        public a a() {
            a aVar = new a();
            aVar.a = false;
            aVar.b = false;
            aVar.f5373c = 200;
            aVar.f5374d = 90;
            aVar.h = 1;
            a.f(aVar, null);
            aVar.f5376f = this.a;
            a.h(aVar, null);
            return aVar;
        }

        public C0271a b(b bVar) {
            this.a = bVar;
            return this;
        }
    }

    public interface b {
    }

    public interface c {
        boolean a(File file, File file2);
    }

    static /* synthetic */ c f(a aVar, c cVar) {
        aVar.f5375e = null;
        return null;
    }

    static /* synthetic */ String h(a aVar, String str) {
        aVar.f5377g = null;
        return null;
    }

    public boolean i() {
        return this.b;
    }

    public b j() {
        return this.f5376f;
    }

    public String k() {
        return this.f5377g;
    }

    public int l() {
        return this.f5374d;
    }

    public int m() {
        return this.f5373c;
    }

    public int n() {
        return this.h;
    }

    public c o() {
        return this.f5375e;
    }

    public boolean p() {
        return this.a;
    }

    public void q(boolean z) {
        this.b = z;
    }

    public void r(int i) {
        this.f5374d = i;
    }

    public void s(int i) {
        this.f5373c = i;
    }

    public void t(int i) {
        this.h = i;
    }

    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MemoryWidgetConfig{ mIsDebug:");
        M.append(this.a);
        M.append(", mClientAnalyse:");
        M.append(this.b);
        M.append(", mMemoryRate:");
        M.append(this.f5374d);
        M.append(", mRunStrategy:");
        M.append(this.h);
        M.append(", mFilePath:");
        M.append(this.f5377g);
        M.append(", mShrinkConfig:");
        M.append(this.f5375e);
        M.append(", mDumpShrinkConfig:");
        M.append(this.f5376f);
        M.append(" }");
        return M.toString();
    }
}
