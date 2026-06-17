package kotlin.s.c;

/* loaded from: classes2.dex */
public class j extends AbstractC0783c implements i, kotlin.reflect.e {
    private final int arity;
    private final int flags;

    public j(int i) {
        this(i, AbstractC0783c.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.s.c.AbstractC0783c
    protected kotlin.reflect.b computeReflected() {
        A.a(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && l.a(getBoundReceiver(), jVar.getBoundReceiver()) && l.a(getOwner(), jVar.getOwner());
        }
        if (obj instanceof kotlin.reflect.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.s.c.i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.s.c.AbstractC0783c, kotlin.reflect.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder M = e.a.a.a.a.M("function ");
        M.append(getName());
        M.append(" (Kotlin reflection is not available)");
        return M.toString();
    }

    public j(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.s.c.AbstractC0783c
    public kotlin.reflect.e getReflected() {
        return (kotlin.reflect.e) super.getReflected();
    }

    public j(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
