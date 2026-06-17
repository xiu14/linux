package e.b.l.t;

import com.bytedance.rpc.annotation.RpcFieldTag;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes2.dex */
class c<M> {
    public final RpcFieldTag.Tag a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9666c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9667d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9668e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9669f;

    /* renamed from: g, reason: collision with root package name */
    private final Field f9670g;
    private final Type h;
    private final boolean i;
    private ProtoAdapter<?> j;
    private ProtoAdapter<Object> k;

    c(WireField wireField, Field field) {
        WireField.Label label = wireField.label();
        this.a = WireField.Label.REQUIRED == label ? RpcFieldTag.Tag.REQUIRED : WireField.Label.OPTIONAL == label ? RpcFieldTag.Tag.OPTIONAL : WireField.Label.REPEATED == label ? RpcFieldTag.Tag.REPEATED : WireField.Label.PACKED == label ? RpcFieldTag.Tag.PACKED : WireField.Label.ONE_OF == label ? RpcFieldTag.Tag.ONE_OF : RpcFieldTag.Tag.OPTIONAL;
        this.b = field.getName();
        this.f9666c = wireField.tag();
        String keyAdapter = wireField.keyAdapter();
        this.f9668e = keyAdapter;
        this.f9669f = wireField.adapter();
        this.f9667d = wireField.redacted();
        this.f9670g = field;
        boolean z = true;
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        this.h = field.getGenericType();
        if (keyAdapter.isEmpty() && !Map.class.isAssignableFrom(field.getType())) {
            z = false;
        }
        this.i = z;
    }

    ProtoAdapter<Object> a() {
        ProtoAdapter<Object> protoAdapter = this.k;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (this.i) {
            ProtoAdapter<?> c2 = d.c(this.h, this.f9668e, this.f9669f);
            this.k = c2;
            return c2;
        }
        ProtoAdapter<?> f2 = f();
        RpcFieldTag.Tag tag = this.a;
        if (tag == RpcFieldTag.Tag.PACKED) {
            f2 = f2.asPacked();
        } else if (tag == RpcFieldTag.Tag.REPEATED) {
            f2 = f2.asRepeated();
        }
        this.k = f2;
        return f2;
    }

    Object b(M m) {
        try {
            return this.f9670g.get(m);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    boolean c() {
        RpcFieldTag.Tag tag = this.a;
        return tag == RpcFieldTag.Tag.REPEATED || tag == RpcFieldTag.Tag.PACKED;
    }

    boolean d() {
        return this.i;
    }

    void e(M m, Object obj) {
        try {
            this.f9670g.set(m, obj);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    ProtoAdapter<?> f() {
        Type type = this.h;
        ProtoAdapter<?> protoAdapter = this.j;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> a = d.a(this.f9669f, type);
        this.j = a;
        return a;
    }

    c(RpcFieldTag rpcFieldTag, Field field) {
        this.a = rpcFieldTag.tag();
        this.b = field.getName();
        this.f9666c = rpcFieldTag.id();
        this.f9668e = "";
        this.f9669f = "";
        this.f9667d = false;
        this.f9670g = field;
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        this.h = field.getGenericType();
        this.i = Map.class.isAssignableFrom(field.getType());
    }
}
