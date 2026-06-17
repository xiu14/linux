package e.b.l.t;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class a<E extends Enum> extends ProtoAdapter<E> {
    private Class<E> a;
    private Method b;

    /* renamed from: c, reason: collision with root package name */
    private Method f9664c;

    protected a(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
        this.a = cls;
        try {
            this.b = cls.getMethod("getValue", new Class[0]);
            try {
                this.f9664c = cls.getMethod("findByValue", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f9664c = cls.getMethod("fromValue", Integer.TYPE);
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private int b(E e2) {
        try {
            return ((Integer) this.b.invoke(e2, new Object[0])).intValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int encodedSize(E e2) {
        return ProtoAdapter.UINT32.encodedSize(Integer.valueOf(b(e2)));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Object decode(ProtoReader protoReader) throws IOException {
        int intValue = ProtoAdapter.UINT32.decode(protoReader).intValue();
        try {
            Enum r0 = (Enum) this.f9664c.invoke(null, Integer.valueOf(intValue));
            if (r0 != null) {
                return r0;
            }
            throw new ProtoAdapter.EnumConstantNotFoundException(intValue, this.a);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        ProtoAdapter.UINT32.encode(protoWriter, (ProtoWriter) Integer.valueOf(b((Enum) obj)));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
