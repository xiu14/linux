package e.c.c.d;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: classes2.dex */
public class g<E> extends HashSet<E> {
    private g(Set<E> set) {
        super(set);
    }

    public static <E> g<E> a(E... eArr) {
        HashSet hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return new g<>(hashSet);
    }
}
