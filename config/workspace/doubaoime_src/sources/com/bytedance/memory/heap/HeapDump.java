package com.bytedance.memory.heap;

import java.io.File;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class HeapDump implements Serializable {
    public boolean computeRetainedHeapSize;
    public long currentTime;
    public final long gcDurationMs;
    public final long heapDumpDurationMs;
    public File heapDumpFile;
    public long heapDumpFileSize;
    public boolean isDebug;
    public String referenceClassName;
    public final String referenceKey;
    public final String referenceName;
    public String shrinkFilePath;
    public final long watchDurationMs;

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        String f5387c;
        long j;
        File b = null;

        /* renamed from: d, reason: collision with root package name */
        String f5388d = null;
        boolean a = true;

        /* renamed from: e, reason: collision with root package name */
        String f5389e = "";

        /* renamed from: f, reason: collision with root package name */
        long f5390f = 0;

        /* renamed from: g, reason: collision with root package name */
        long f5391g = 0;
        long h = 0;
        boolean i = true;

        b() {
        }

        public HeapDump a() {
            com.bytedance.feedbackerlib.a.j(this.b, "heapDumpFile");
            return new HeapDump(this);
        }

        public b b(long j) {
            this.j = j;
            return this;
        }

        public b c(boolean z) {
            this.a = z;
            return this;
        }

        public b d(long j) {
            this.f5391g = j;
            return this;
        }

        public b e(long j) {
            this.h = j;
            return this;
        }

        public b f(File file) {
            com.bytedance.feedbackerlib.a.j(file, "heapDumpFile");
            this.b = file;
            return this;
        }
    }

    public static b newBuilder() {
        return new b();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M(" heapDumpFilePath ");
        M.append(this.heapDumpFile.getPath());
        M.append("\n");
        M.append(" heapDumpFileSize ");
        M.append(this.heapDumpFile.length());
        M.append("\n");
        M.append(" referenceName ");
        e.a.a.a.a.K0(M, this.referenceName, "\n", " isDebug ");
        M.append(this.isDebug);
        M.append("\n");
        M.append(" currentTime ");
        M.append(this.currentTime);
        M.append("\n");
        M.append(" watchDurationMs ");
        M.append(this.watchDurationMs);
        M.append("ms\n");
        M.append(" gcDurationMs ");
        M.append(this.gcDurationMs);
        M.append("ms\n");
        M.append(" shrinkFilePath ");
        e.a.a.a.a.K0(M, this.shrinkFilePath, "\n", " heapDumpDurationMs ");
        return e.a.a.a.a.F(M, this.heapDumpDurationMs, "ms\n");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HeapDump(java.io.File r2, java.lang.String r3, java.lang.String r4, long r5, long r7, long r9, boolean r11) {
        /*
            r1 = this;
            com.bytedance.memory.heap.HeapDump$b r0 = new com.bytedance.memory.heap.HeapDump$b
            r0.<init>()
            r0.f(r2)
            java.lang.String r2 = "referenceKey"
            com.bytedance.feedbackerlib.a.j(r3, r2)
            r0.f5388d = r3
            java.lang.String r2 = "referenceName"
            com.bytedance.feedbackerlib.a.j(r4, r2)
            r0.f5389e = r4
            r0.a = r11
            r2 = 1
            r0.i = r2
            r0.f5390f = r5
            r0.f5391g = r7
            r0.h = r9
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.heap.HeapDump.<init>(java.io.File, java.lang.String, java.lang.String, long, long, long, boolean):void");
    }

    private HeapDump(b bVar) {
        this.isDebug = true;
        this.computeRetainedHeapSize = true;
        this.isDebug = bVar.a;
        this.currentTime = bVar.j;
        this.heapDumpFile = bVar.b;
        this.referenceKey = bVar.f5388d;
        this.referenceName = bVar.f5389e;
        this.computeRetainedHeapSize = bVar.i;
        this.watchDurationMs = bVar.f5390f;
        this.shrinkFilePath = bVar.f5387c;
        this.gcDurationMs = bVar.f5391g;
        this.heapDumpDurationMs = bVar.h;
    }
}
