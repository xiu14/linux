package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q extends A {

    /* renamed from: c, reason: collision with root package name */
    private static final v f10707c = v.c("application/x-www-form-urlencoded");
    private final List<String> a;
    private final List<String> b;

    public static final class a {
        private final List<String> a = new ArrayList();
        private final List<String> b = new ArrayList();

        public a a(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.a.add(t.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
            this.b.add(t.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
            return this;
        }

        public q b() {
            return new q(this.a, this.b);
        }
    }

    q(List<String> list, List<String> list2) {
        this.a = okhttp3.F.c.q(list);
        this.b = okhttp3.F.c.q(list2);
    }

    private long f(f.f fVar, boolean z) {
        f.e eVar = z ? new f.e() : fVar.b();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVar.U(38);
            }
            eVar.j0(this.a.get(i));
            eVar.U(61);
            eVar.j0(this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long I = eVar.I();
        eVar.a();
        return I;
    }

    @Override // okhttp3.A
    public long a() {
        return f(null, true);
    }

    @Override // okhttp3.A
    public v b() {
        return f10707c;
    }

    @Override // okhttp3.A
    public void e(f.f fVar) throws IOException {
        f(fVar, false);
    }
}
