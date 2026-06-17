package e.c.c.d;

import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collections;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: classes2.dex */
public class e<E> extends ArrayList<E> {
    private e(int i) {
        super(i);
    }

    public static <E> e<E> a(E... eArr) {
        e<E> eVar = new e<>(eArr.length);
        Collections.addAll(eVar, eArr);
        return eVar;
    }
}
