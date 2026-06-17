package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.s.c.l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(String str, int i) {
        l.f(str, "name");
        Integer num = this.calledMethods.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z = (intValue & i) != 0;
        this.calledMethods.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
