package e.b.l.t;

import com.bytedance.rpc.annotation.RpcFieldTag;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b<M> extends ProtoAdapter<M> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9665c = 0;
    private final Class<M> a;
    private final Map<Integer, c<M>> b;

    b(Class<M> cls, Map<Integer, c<M>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.a = cls;
        this.b = map;
    }

    M a() {
        try {
            return this.a.newInstance();
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InstantiationException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader protoReader) throws IOException {
        int nextTag;
        M a = a();
        long beginMessage = protoReader.beginMessage();
        int nextTag2 = protoReader.nextTag();
        while (nextTag2 != -1) {
            c<M> cVar = this.b.get(Integer.valueOf(nextTag2));
            if (cVar != null) {
                try {
                    if (cVar.c()) {
                        ProtoAdapter<?> f2 = cVar.f();
                        List list = (List) cVar.b(a);
                        if (list == null) {
                            list = new ArrayList();
                            cVar.e(a, list);
                        }
                        do {
                            list.add(f2.decode(protoReader));
                            nextTag = protoReader.nextTag();
                            if (nextTag == -1) {
                                break;
                            }
                        } while (nextTag == nextTag2);
                    } else if (cVar.d()) {
                        ProtoAdapter<Object> a2 = cVar.a();
                        Map map = (Map) cVar.b(a);
                        if (map == null) {
                            map = new LinkedHashMap();
                            cVar.e(a, map);
                        }
                        do {
                            map.putAll((Map) a2.decode(protoReader));
                            nextTag = protoReader.nextTag();
                            if (nextTag == -1) {
                                break;
                            }
                        } while (nextTag == nextTag2);
                    } else {
                        cVar.e(a, cVar.f().decode(protoReader));
                    }
                    nextTag2 = nextTag;
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    if (com.bytedance.rpc.log.b.f()) {
                        com.bytedance.rpc.log.b.j(String.format("cant decode enum field %s with value %s", FieldEncoding.VARINT, Long.valueOf(e2.value)));
                    }
                }
            } else {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                Object decode = peekFieldEncoding.rawProtoAdapter().decode(protoReader);
                if (com.bytedance.rpc.log.b.f()) {
                    com.bytedance.rpc.log.b.j(String.format("cant decode field %s with value %s", peekFieldEncoding, decode));
                }
            }
            nextTag2 = protoReader.nextTag();
        }
        protoReader.endMessage(beginMessage);
        return a;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, M m) throws IOException {
        for (c<M> cVar : this.b.values()) {
            Object b = cVar.b(m);
            if (b != null) {
                cVar.a().encodeWithTag(protoWriter, cVar.f9666c, b);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M m) {
        Map<Object, Integer> b = d.b();
        Integer num = b.get(m);
        if (num != null) {
            return num.intValue();
        }
        int i = 0;
        for (c<M> cVar : this.b.values()) {
            Object b2 = cVar.b(m);
            if (b2 != null) {
                i = cVar.a().encodedSizeWithTag(cVar.f9666c, b2) + i;
            }
        }
        b.put(m, Integer.valueOf(i));
        return i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).a == this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M m) {
        List list;
        M a = a();
        for (c<M> cVar : this.b.values()) {
            boolean z = cVar.f9667d;
            if (z && cVar.a == RpcFieldTag.Tag.REQUIRED) {
                throw new UnsupportedOperationException(String.format("Field '%s' in %s is required and cannot be redacted.", cVar.b, this.a.getName()));
            }
            if (z || !cVar.c()) {
                Object b = cVar.b(a);
                if (b != null) {
                    cVar.e(a, cVar.a().redact(b));
                }
            } else if (cVar.c() && (list = (List) cVar.b(a)) != null) {
                Internal.redactElements(list, cVar.f());
            }
        }
        return a;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (c<M> cVar : this.b.values()) {
            Object b = cVar.b(m);
            if (b != null) {
                sb.append(", ");
                sb.append(cVar.b);
                sb.append('=');
                if (cVar.f9667d) {
                    b = "██";
                }
                sb.append(b);
            }
        }
        sb.replace(0, 2, this.a.getSimpleName() + '{');
        sb.append('}');
        return sb.toString();
    }
}
