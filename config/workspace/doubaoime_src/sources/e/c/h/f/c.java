package e.c.h.f;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Objects;

/* loaded from: classes2.dex */
public class c implements com.facebook.cache.common.b {
    private final String a;
    private final com.facebook.imagepipeline.common.e b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.imagepipeline.common.f f9857c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.imagepipeline.common.c f9858d;

    /* renamed from: e, reason: collision with root package name */
    private final com.facebook.cache.common.b f9859e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9860f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9861g;
    private final Object h;

    public c(String str, com.facebook.imagepipeline.common.e eVar, com.facebook.imagepipeline.common.f fVar, com.facebook.imagepipeline.common.c cVar, com.facebook.cache.common.b bVar, String str2, Object obj) {
        Objects.requireNonNull(str);
        this.a = str;
        this.b = eVar;
        this.f9857c = fVar;
        this.f9858d = cVar;
        this.f9859e = bVar;
        this.f9860f = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        Integer valueOf2 = Integer.valueOf(eVar != null ? eVar.hashCode() : 0);
        Integer valueOf3 = Integer.valueOf(fVar.hashCode());
        int hashCode = valueOf == null ? 0 : valueOf.hashCode();
        int hashCode2 = valueOf2 == null ? 0 : valueOf2.hashCode();
        int hashCode3 = valueOf3 == null ? 0 : valueOf3.hashCode();
        int hashCode4 = cVar == null ? 0 : cVar.hashCode();
        this.f9861g = ((((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + (str2 != null ? str2.hashCode() : 0);
        this.h = obj;
        RealtimeSinceBootClock.get().now();
    }

    @Override // com.facebook.cache.common.b
    public boolean a() {
        return false;
    }

    @Override // com.facebook.cache.common.b
    public String b() {
        return this.a;
    }

    @Override // com.facebook.cache.common.b
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9861g == cVar.f9861g && this.a.equals(cVar.a) && e.c.c.d.h.h(this.b, cVar.b) && e.c.c.d.h.h(this.f9857c, cVar.f9857c) && e.c.c.d.h.h(this.f9858d, cVar.f9858d) && e.c.c.d.h.h(this.f9859e, cVar.f9859e) && e.c.c.d.h.h(this.f9860f, cVar.f9860f);
    }

    @Override // com.facebook.cache.common.b
    public int hashCode() {
        return this.f9861g;
    }

    @Override // com.facebook.cache.common.b
    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.a, this.b, this.f9857c, this.f9858d, this.f9859e, this.f9860f, Integer.valueOf(this.f9861g));
    }
}
