package kotlin.r.h.a;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.message.log.PushLog;
import java.io.Serializable;
import java.lang.reflect.Field;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class a implements kotlin.r.d<Object>, d, Serializable {
    private final kotlin.r.d<Object> completion;

    public a(kotlin.r.d<Object> dVar) {
        this.completion = dVar;
    }

    public kotlin.r.d<o> create(kotlin.r.d<?> dVar) {
        l.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.r.h.a.d
    public d getCallerFrame() {
        kotlin.r.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final kotlin.r.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        l.f(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField(PushLog.KEY_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? eVar.l()[i] : -1;
        String a = f.a.a(this);
        if (a == null) {
            str = eVar.c();
        } else {
            str = a + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i2);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.r.d
    public final void resumeWith(Object obj) {
        kotlin.r.d dVar = this;
        while (true) {
            l.f(dVar, TypedValues.AttributesType.S_FRAME);
            a aVar = (a) dVar;
            kotlin.r.d dVar2 = aVar.completion;
            l.c(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = r.J(th);
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        M.append(stackTraceElement);
        return M.toString();
    }

    public kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        l.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
