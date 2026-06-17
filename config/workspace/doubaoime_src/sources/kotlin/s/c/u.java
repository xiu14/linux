package kotlin.s.c;

/* loaded from: classes2.dex */
public abstract class u extends AbstractC0783c implements kotlin.reflect.i {
    public u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.s.c.AbstractC0783c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.i getReflected() {
        return (kotlin.reflect.i) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return getOwner().equals(uVar.getOwner()) && getName().equals(uVar.getName()) && getSignature().equals(uVar.getSignature()) && l.a(getBoundReceiver(), uVar.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.i) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public String toString() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder M = e.a.a.a.a.M("property ");
        M.append(getName());
        M.append(" (Kotlin reflection is not available)");
        return M.toString();
    }

    public u(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
