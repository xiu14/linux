package kotlin.s.c;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* renamed from: kotlin.s.c.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0783c implements kotlin.reflect.b, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient kotlin.reflect.b reflected;
    private final String signature;

    /* renamed from: kotlin.s.c.c$a */
    private static class a implements Serializable {
        private static final a a = new a();

        private a() {
        }
    }

    public AbstractC0783c() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public kotlin.reflect.b compute() {
        kotlin.reflect.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        kotlin.reflect.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract kotlin.reflect.b computeReflected();

    @Override // kotlin.reflect.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public kotlin.reflect.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? A.c(cls) : A.b(cls);
    }

    @Override // kotlin.reflect.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected kotlin.reflect.b getReflected() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new kotlin.s.a();
    }

    @Override // kotlin.reflect.b
    public kotlin.reflect.j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.b
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC0783c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC0783c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
