package e.i.b.b.a;

import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: kotlin-style lambda group */
/* loaded from: classes2.dex */
public final class a<T> extends m implements l<c<T>, o> {
    public static final a b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f9969c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f9970d = new a(2);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i) {
        super(1);
        this.a = i;
    }

    @Override // kotlin.s.b.l
    public final o invoke(Object obj) {
        int i = this.a;
        if (i == 0) {
            kotlin.s.c.l.f((c) obj, "it");
            return o.a;
        }
        if (i == 1) {
            kotlin.s.c.l.f((c) obj, "it");
            return o.a;
        }
        if (i != 2) {
            throw null;
        }
        kotlin.s.c.l.f((c) obj, "it");
        return o.a;
    }
}
