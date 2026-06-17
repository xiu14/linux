package kotlinx.coroutines.P0;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.N0.w;

/* loaded from: classes2.dex */
final class j extends w<j> {

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ AtomicReferenceArray f10197e;

    public j(long j, j jVar, int i) {
        super(j, jVar, i);
        int i2;
        i2 = i.f10196f;
        this.f10197e = new AtomicReferenceArray(i2);
    }

    @Override // kotlinx.coroutines.N0.w
    public int j() {
        int i;
        i = i.f10196f;
        return i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("SemaphoreSegment[id=");
        M.append(i());
        M.append(", hashCode=");
        M.append(hashCode());
        M.append(']');
        return M.toString();
    }
}
