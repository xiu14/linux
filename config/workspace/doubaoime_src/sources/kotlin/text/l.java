package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.s.b.p;

/* loaded from: classes2.dex */
final class l extends kotlin.s.c.m implements p<CharSequence, Integer, kotlin.g<? extends Integer, ? extends Integer>> {
    final /* synthetic */ List<String> a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(List<String> list, boolean z) {
        super(2);
        this.a = list;
        this.b = z;
    }

    @Override // kotlin.s.b.p
    public kotlin.g<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        Object obj;
        kotlin.g gVar;
        Object obj2;
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        kotlin.s.c.l.f(charSequence2, "$this$$receiver");
        List<String> list = this.a;
        boolean z = this.b;
        if (z || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            kotlin.w.d dVar = new kotlin.w.d(intValue, charSequence2.length());
            if (charSequence2 instanceof String) {
                int a = dVar.a();
                int b = dVar.b();
                int c2 = dVar.c();
                if ((c2 > 0 && a <= b) || (c2 < 0 && b <= a)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            String str = (String) obj2;
                            if (a.z(str, 0, (String) charSequence2, a, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (a == b) {
                                break;
                            }
                            a += c2;
                        } else {
                            gVar = new kotlin.g(Integer.valueOf(a), str2);
                            break;
                        }
                    }
                }
                gVar = null;
            } else {
                int a2 = dVar.a();
                int b2 = dVar.b();
                int c3 = dVar.c();
                if ((c3 > 0 && a2 <= b2) || (c3 < 0 && b2 <= a2)) {
                    int i = a2;
                    while (true) {
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            String str3 = (String) obj;
                            if (a.A(str3, 0, charSequence2, i, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (i == b2) {
                                break;
                            }
                            i += c3;
                        } else {
                            gVar = new kotlin.g(Integer.valueOf(i), str4);
                            break;
                        }
                    }
                }
                gVar = null;
            }
        } else {
            kotlin.s.c.l.f(list, "<this>");
            kotlin.s.c.l.f(list, "<this>");
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = list.get(0);
            int q = a.q(charSequence2, str5, intValue, false, 4, null);
            if (q >= 0) {
                gVar = new kotlin.g(Integer.valueOf(q), str5);
            }
            gVar = null;
        }
        if (gVar != null) {
            return new kotlin.g<>(gVar.c(), Integer.valueOf(((String) gVar.d()).length()));
        }
        return null;
    }
}
