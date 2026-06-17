package kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
final class f implements e {
    private final Matcher a;
    private final CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f10132c;

    public static final class a extends kotlin.collections.c<String> {
        a() {
        }

        @Override // kotlin.collections.a
        public int a() {
            return ((Matcher) f.c(f.this)).groupCount() + 1;
        }

        @Override // kotlin.collections.a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.c, java.util.List
        public Object get(int i) {
            String group = ((Matcher) f.c(f.this)).group(i);
            return group == null ? "" : group;
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public f(Matcher matcher, CharSequence charSequence) {
        kotlin.s.c.l.f(matcher, "matcher");
        kotlin.s.c.l.f(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
    }

    public static final MatchResult c(f fVar) {
        return fVar.a;
    }

    @Override // kotlin.text.e
    public List<String> a() {
        if (this.f10132c == null) {
            this.f10132c = new a();
        }
        List<String> list = this.f10132c;
        kotlin.s.c.l.c(list);
        return list;
    }

    @Override // kotlin.text.e
    public kotlin.w.d b() {
        Matcher matcher = this.a;
        return kotlin.w.h.i(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.e
    public e next() {
        int end = this.a.end() + (this.a.end() == this.a.start() ? 1 : 0);
        if (end > this.b.length()) {
            return null;
        }
        Matcher matcher = this.a.pattern().matcher(this.b);
        kotlin.s.c.l.e(matcher, "matcher.pattern().matcher(input)");
        CharSequence charSequence = this.b;
        if (matcher.find(end)) {
            return new f(matcher, charSequence);
        }
        return null;
    }
}
