package bytekn.foundation.io.file;

/* loaded from: classes.dex */
public final class d {
    private final String a;
    private final f b;

    /* renamed from: c, reason: collision with root package name */
    private final f f1232c;

    /* renamed from: d, reason: collision with root package name */
    private final Double f1233d;

    /* renamed from: e, reason: collision with root package name */
    private final Double f1234e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f1235f;

    /* renamed from: g, reason: collision with root package name */
    private final FileType f1236g;

    public d(String str, f fVar, f fVar2, Double d2, Double d3, Long l, FileType fileType) {
        kotlin.s.c.l.g(str, "name");
        kotlin.s.c.l.g(fVar, "absolutePath");
        kotlin.s.c.l.g(fVar2, "canonicalPath");
        kotlin.s.c.l.g(fileType, "type");
        this.a = str;
        this.b = fVar;
        this.f1232c = fVar2;
        this.f1233d = d2;
        this.f1234e = d3;
        this.f1235f = l;
        this.f1236g = fileType;
    }

    public final f a() {
        return this.b;
    }

    public final Double b() {
        return this.f1234e;
    }

    public final Long c() {
        return this.f1235f;
    }

    public final FileType d() {
        return this.f1236g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.s.c.l.a(this.a, dVar.a) && kotlin.s.c.l.a(this.b, dVar.b) && kotlin.s.c.l.a(this.f1232c, dVar.f1232c) && kotlin.s.c.l.a(this.f1233d, dVar.f1233d) && kotlin.s.c.l.a(this.f1234e, dVar.f1234e) && kotlin.s.c.l.a(this.f1235f, dVar.f1235f) && kotlin.s.c.l.a(this.f1236g, dVar.f1236g);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        f fVar = this.b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        f fVar2 = this.f1232c;
        int hashCode3 = (hashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        Double d2 = this.f1233d;
        int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.f1234e;
        int hashCode5 = (hashCode4 + (d3 != null ? d3.hashCode() : 0)) * 31;
        Long l = this.f1235f;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        FileType fileType = this.f1236g;
        return hashCode6 + (fileType != null ? fileType.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("FileMeta(name=");
        M.append(this.a);
        M.append(", absolutePath=");
        M.append(this.b);
        M.append(", canonicalPath=");
        M.append(this.f1232c);
        M.append(", createdAt=");
        M.append(this.f1233d);
        M.append(", modifiedAt=");
        M.append(this.f1234e);
        M.append(", size=");
        M.append(this.f1235f);
        M.append(", type=");
        M.append(this.f1236g);
        M.append(")");
        return M.toString();
    }
}
