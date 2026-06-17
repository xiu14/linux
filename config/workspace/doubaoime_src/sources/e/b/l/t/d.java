package e.b.l.t;

import androidx.annotation.NonNull;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import f.h;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class d {
    private static final ThreadLocal<Map<Object, Integer>> a = new ThreadLocal<>();
    private static final Map<Type, ProtoAdapter<?>> b = new ConcurrentHashMap(128);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, ProtoAdapter<?>> f9671c = new ConcurrentHashMap(8);

    /* renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<byte[]> f9672d = new a(FieldEncoding.LENGTH_DELIMITED, byte[].class);

    static class a extends ProtoAdapter<byte[]> {
        a(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public byte[] decode(ProtoReader protoReader) throws IOException {
            return protoReader.readBytes().s();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, byte[] bArr) throws IOException {
            protoWriter.writeBytes(h.l(bArr));
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(byte[] bArr) {
            return bArr.length;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.squareup.wire.ProtoAdapter<?> a(java.lang.String r13, java.lang.reflect.Type r14) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.l.t.d.a(java.lang.String, java.lang.reflect.Type):com.squareup.wire.ProtoAdapter");
    }

    @NonNull
    public static Map<Object, Integer> b() {
        ThreadLocal<Map<Object, Integer>> threadLocal = a;
        Map<Object, Integer> map = threadLocal.get();
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        threadLocal.set(hashMap);
        return hashMap;
    }

    public static ProtoAdapter<?> c(@NonNull Type type, String str, String str2) {
        ProtoAdapter<?> protoAdapter;
        Map<Type, ProtoAdapter<?>> map = b;
        ProtoAdapter<?> protoAdapter2 = map.get(type);
        if (protoAdapter2 != null) {
            return protoAdapter2;
        }
        ProtoAdapter<?> protoAdapter3 = null;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 2 && Map.class.isAssignableFrom((Class) parameterizedType.getRawType())) {
                protoAdapter3 = a(str, actualTypeArguments[0]);
                protoAdapter = a(str2, actualTypeArguments[1]);
                if (protoAdapter3 != null || protoAdapter == null) {
                    throw new RuntimeException(e.a.a.a.a.y("map field must have parameterized type , for ", type));
                }
                ProtoAdapter<?> newMapAdapter = ProtoAdapter.newMapAdapter(protoAdapter3, protoAdapter);
                map.put(type, newMapAdapter);
                return newMapAdapter;
            }
        }
        protoAdapter = null;
        if (protoAdapter3 != null) {
        }
        throw new RuntimeException(e.a.a.a.a.y("map field must have parameterized type , for ", type));
    }
}
