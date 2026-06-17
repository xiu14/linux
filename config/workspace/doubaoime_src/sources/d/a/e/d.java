package d.a.e;

import java.util.NoSuchElementException;
import kotlin.s.c.l;
import kotlin.text.i;
import kotlin.x.d;

/* loaded from: classes.dex */
public final class d {
    public static final int a(String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        kotlin.x.e c2 = i.c(new i(str2), str, 0, 2);
        if (!((d.a) c2.iterator()).hasNext()) {
            return -1;
        }
        l.f(c2, "<this>");
        d.a aVar = (d.a) c2.iterator();
        if (!aVar.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = aVar.next();
        while (aVar.hasNext()) {
            next = aVar.next();
        }
        return ((kotlin.text.e) next).b().a();
    }
}
