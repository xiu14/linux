package kotlin.w;

import java.util.NoSuchElementException;
import kotlin.collections.o;

/* loaded from: classes2.dex */
public final class c extends o {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10137c;

    /* renamed from: d, reason: collision with root package name */
    private int f10138d;

    public c(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f10137c = z;
        this.f10138d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10137c;
    }

    @Override // kotlin.collections.o
    public int nextInt() {
        int i = this.f10138d;
        if (i != this.b) {
            this.f10138d = this.a + i;
        } else {
            if (!this.f10137c) {
                throw new NoSuchElementException();
            }
            this.f10137c = false;
        }
        return i;
    }
}
