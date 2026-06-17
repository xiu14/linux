package kotlin.w;

import java.util.NoSuchElementException;
import kotlin.collections.p;

/* loaded from: classes2.dex */
public final class f extends p {
    private final long a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10142c;

    /* renamed from: d, reason: collision with root package name */
    private long f10143d;

    public f(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f10142c = z;
        this.f10143d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10142c;
    }

    @Override // kotlin.collections.p
    public long nextLong() {
        long j = this.f10143d;
        if (j != this.b) {
            this.f10143d = this.a + j;
        } else {
            if (!this.f10142c) {
                throw new NoSuchElementException();
            }
            this.f10142c = false;
        }
        return j;
    }
}
