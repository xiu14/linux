package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import e.a.a.a.a;
import f.e;
import f.f;
import f.g;
import f.h;
import f.o;
import f.s;
import f.t;
import f.x;
import f.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<h> BYTES;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Long> UINT64;
    private final FieldEncoding fieldEncoding;
    final Class<?> javaType;
    ProtoAdapter<List<E>> packedAdapter;
    ProtoAdapter<List<E>> repeatedAdapter;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EnumConstantNotFoundException(int r3, java.lang.Class<?> r4) {
            /*
                r2 = this;
                java.lang.String r0 = "Unknown enum tag "
                java.lang.String r1 = " for "
                java.lang.StringBuilder r0 = e.a.a.a.a.N(r0, r3, r1)
                java.lang.String r4 = r4.getCanonicalName()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4)
                r2.value = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException.<init>(int, java.lang.Class):void");
        }
    }

    private static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<K, V>> {
        final ProtoAdapter<K> keyAdapter;
        final ProtoAdapter<V> valueAdapter;

        MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, Map.Entry.class);
            this.keyAdapter = protoAdapter;
            this.valueAdapter = protoAdapter2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map.Entry<K, V> decode(ProtoReader protoReader) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map.Entry<K, V> entry) throws IOException {
            this.keyAdapter.encodeWithTag(protoWriter, 1, entry.getKey());
            this.valueAdapter.encodeWithTag(protoWriter, 2, entry.getValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map.Entry<K, V> entry) {
            return this.valueAdapter.encodedSizeWithTag(2, entry.getValue()) + this.keyAdapter.encodedSizeWithTag(1, entry.getKey());
        }
    }

    private static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {
        private final MapEntryProtoAdapter<K, V> entryAdapter;

        MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, Map.class);
            this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> decode(ProtoReader protoReader) throws IOException {
            long beginMessage = protoReader.beginMessage();
            K k = null;
            V v = null;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    break;
                }
                if (nextTag == 1) {
                    k = this.entryAdapter.keyAdapter.decode(protoReader);
                } else if (nextTag == 2) {
                    v = this.entryAdapter.valueAdapter.decode(protoReader);
                }
            }
            protoReader.endMessage(beginMessage);
            if (k == null) {
                throw new IllegalStateException("Map entry with null key");
            }
            if (v != null) {
                return Collections.singletonMap(k, v);
            }
            throw new IllegalStateException("Map entry with null value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encodeWithTag(ProtoWriter protoWriter, int i, Map<K, V> map) throws IOException {
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                this.entryAdapter.encodeWithTag(protoWriter, i, it2.next());
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSizeWithTag(int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                i2 += this.entryAdapter.encodedSizeWithTag(i, it2.next());
            }
            return i2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> redact(Map<K, V> map) {
            return Collections.emptyMap();
        }
    }

    static {
        Class<Long> cls = Long.class;
        Class<Integer> cls2 = Integer.class;
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        BOOL = new ProtoAdapter<Boolean>(fieldEncoding, Boolean.class) { // from class: com.squareup.wire.ProtoAdapter.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Boolean bool) {
                return 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader protoReader) throws IOException {
                int readVarint32 = protoReader.readVarint32();
                if (readVarint32 == 0) {
                    return Boolean.FALSE;
                }
                if (readVarint32 == 1) {
                    return Boolean.TRUE;
                }
                throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(readVarint32)));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Boolean bool) throws IOException {
                protoWriter.writeVarint32(bool.booleanValue() ? 1 : 0);
            }
        };
        INT32 = new ProtoAdapter<Integer>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeSignedVarint32(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.int32Size(num.intValue());
            }
        };
        UINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeVarint32(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.varint32Size(num.intValue());
            }
        };
        SINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(ProtoWriter.decodeZigZag32(protoReader.readVarint32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeVarint32(ProtoWriter.encodeZigZag32(num.intValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.varint32Size(ProtoWriter.encodeZigZag32(num.intValue()));
            }
        };
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        ProtoAdapter<Integer> protoAdapter = new ProtoAdapter<Integer>(fieldEncoding2, cls2) { // from class: com.squareup.wire.ProtoAdapter.5
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeFixed32(num.intValue());
            }
        };
        FIXED32 = protoAdapter;
        SFIXED32 = protoAdapter;
        INT64 = new ProtoAdapter<Long>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) throws IOException {
                protoWriter.writeVarint64(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return ProtoWriter.varint64Size(l.longValue());
            }
        };
        UINT64 = new ProtoAdapter<Long>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) throws IOException {
                protoWriter.writeVarint64(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return ProtoWriter.varint64Size(l.longValue());
            }
        };
        SINT64 = new ProtoAdapter<Long>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(ProtoWriter.decodeZigZag64(protoReader.readVarint64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) throws IOException {
                protoWriter.writeVarint64(ProtoWriter.encodeZigZag64(l.longValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return ProtoWriter.varint64Size(ProtoWriter.encodeZigZag64(l.longValue()));
            }
        };
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        ProtoAdapter<Long> protoAdapter2 = new ProtoAdapter<Long>(fieldEncoding3, cls) { // from class: com.squareup.wire.ProtoAdapter.9
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) throws IOException {
                protoWriter.writeFixed64(l.longValue());
            }
        };
        FIXED64 = protoAdapter2;
        SFIXED64 = protoAdapter2;
        FLOAT = new ProtoAdapter<Float>(fieldEncoding2, Float.class) { // from class: com.squareup.wire.ProtoAdapter.10
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Float f2) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Float decode(ProtoReader protoReader) throws IOException {
                return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Float f2) throws IOException {
                protoWriter.writeFixed32(Float.floatToIntBits(f2.floatValue()));
            }
        };
        DOUBLE = new ProtoAdapter<Double>(fieldEncoding3, Double.class) { // from class: com.squareup.wire.ProtoAdapter.11
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Double d2) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Double decode(ProtoReader protoReader) throws IOException {
                return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Double d2) throws IOException {
                protoWriter.writeFixed64(Double.doubleToLongBits(d2.doubleValue()));
            }
        };
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        STRING = new ProtoAdapter<String>(fieldEncoding4, String.class) { // from class: com.squareup.wire.ProtoAdapter.12
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String str) {
                int i;
                int length = str.length();
                l.g(str, "$receiver");
                if (!(length >= 0)) {
                    throw new IllegalArgumentException(a.l("endIndex < beginIndex: ", length, " < ", 0).toString());
                }
                if (!(length <= str.length())) {
                    StringBuilder N = a.N("endIndex > string.length: ", length, " > ");
                    N.append(str.length());
                    throw new IllegalArgumentException(N.toString().toString());
                }
                long j = 0;
                int i2 = 0;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i = 3;
                        } else {
                            int i3 = i2 + 1;
                            char charAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                            if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                j++;
                                i2 = i3;
                            } else {
                                j += 4;
                                i2 += 2;
                            }
                        }
                        j += i;
                    }
                    i2++;
                }
                return (int) j;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader protoReader) throws IOException {
                return protoReader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, String str) throws IOException {
                protoWriter.writeString(str);
            }
        };
        BYTES = new ProtoAdapter<h>(fieldEncoding4, h.class) { // from class: com.squareup.wire.ProtoAdapter.13
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(h hVar) {
                return hVar.f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public h decode(ProtoReader protoReader) throws IOException {
                return protoReader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, h hVar) throws IOException {
                protoWriter.writeBytes(hVar);
            }
        };
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.fieldEncoding = fieldEncoding;
        this.javaType = cls;
    }

    private ProtoAdapter<List<E>> createPacked() {
        FieldEncoding fieldEncoding = this.fieldEncoding;
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding != fieldEncoding2) {
            return new ProtoAdapter<List<E>>(fieldEncoding2, List.class) { // from class: com.squareup.wire.ProtoAdapter.14
                @Override // com.squareup.wire.ProtoAdapter
                public List<E> decode(ProtoReader protoReader) throws IOException {
                    return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter protoWriter, List<E> list) throws IOException {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ProtoAdapter.this.encode(protoWriter, (ProtoWriter) list.get(i));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) throws IOException {
                    if (list.isEmpty()) {
                        return;
                    }
                    super.encodeWithTag(protoWriter, i, (int) list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(List<E> list) {
                    int size = list.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        i += ProtoAdapter.this.encodedSize(list.get(i2));
                    }
                    return i;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSizeWithTag(int i, List<E> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return super.encodedSizeWithTag(i, (int) list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public List<E> redact(List<E> list) {
                    return Collections.emptyList();
                }
            };
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    private ProtoAdapter<List<E>> createRepeated() {
        return new ProtoAdapter<List<E>>(this.fieldEncoding, List.class) { // from class: com.squareup.wire.ProtoAdapter.15
            @Override // com.squareup.wire.ProtoAdapter
            public List<E> decode(ProtoReader protoReader) throws IOException {
                return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) throws IOException {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.encodeWithTag(protoWriter, i, list.get(i2));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, List<E> list) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ProtoAdapter.this.encodedSizeWithTag(i, list.get(i3));
                }
                return i2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<E> redact(List<E> list) {
                return Collections.emptyList();
            }
        };
    }

    public static <M extends Message> ProtoAdapter<M> get(M m) {
        return get(m.getClass());
    }

    public static <E extends WireEnum> RuntimeEnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return new RuntimeEnumAdapter<>(cls);
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public static <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return RuntimeMessageAdapter.create(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> createPacked = createPacked();
        this.packedAdapter = createPacked;
        return createPacked;
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> createRepeated = createRepeated();
        this.repeatedAdapter = createRepeated;
        return createRepeated;
    }

    public abstract E decode(ProtoReader protoReader) throws IOException;

    public final E decode(byte[] bArr) throws IOException {
        Preconditions.checkNotNull(bArr, "bytes == null");
        e eVar = new e();
        eVar.P(bArr);
        return decode(eVar);
    }

    public abstract void encode(ProtoWriter protoWriter, E e2) throws IOException;

    public final void encode(f fVar, E e2) throws IOException {
        Preconditions.checkNotNull(e2, "value == null");
        Preconditions.checkNotNull(fVar, "sink == null");
        encode(new ProtoWriter(fVar), (ProtoWriter) e2);
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, E e2) throws IOException {
        if (e2 == null) {
            return;
        }
        protoWriter.writeTag(i, this.fieldEncoding);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(encodedSize(e2));
        }
        encode(protoWriter, (ProtoWriter) e2);
    }

    public abstract int encodedSize(E e2);

    public int encodedSizeWithTag(int i, E e2) {
        if (e2 == null) {
            return 0;
        }
        int encodedSize = encodedSize(e2);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.varint32Size(encodedSize);
        }
        return encodedSize + ProtoWriter.tagSize(i);
    }

    public E redact(E e2) {
        return null;
    }

    public String toString(E e2) {
        return e2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    ProtoAdapter<?> withLabel(WireField.Label label) {
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            StringBuilder M = a.M("failed to access ");
            M.append(cls.getName());
            M.append("#ADAPTER");
            throw new IllegalArgumentException(M.toString(), e2);
        }
    }

    public final E decode(h hVar) throws IOException {
        Preconditions.checkNotNull(hVar, "bytes == null");
        e eVar = new e();
        eVar.N(hVar);
        return decode(eVar);
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int indexOf = str.indexOf(35);
            String substring = str.substring(0, indexOf);
            return (ProtoAdapter) Class.forName(substring).getField(str.substring(indexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
            throw new IllegalArgumentException(a.s("failed to access ", str), e2);
        }
    }

    public final byte[] encode(E e2) {
        Preconditions.checkNotNull(e2, "value == null");
        e eVar = new e();
        try {
            encode((f) eVar, (e) e2);
            return eVar.s();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final E decode(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream, "stream == null");
        z e2 = o.e(inputStream);
        l.g(e2, "$receiver");
        return decode(new t(e2));
    }

    public final void encode(OutputStream outputStream, E e2) throws IOException {
        Preconditions.checkNotNull(e2, "value == null");
        Preconditions.checkNotNull(outputStream, "stream == null");
        x c2 = o.c(outputStream);
        l.g(c2, "$receiver");
        s sVar = new s(c2);
        encode((f) sVar, (s) e2);
        sVar.n();
    }

    public final E decode(g gVar) throws IOException {
        Preconditions.checkNotNull(gVar, "source == null");
        return decode(new ProtoReader(gVar));
    }
}
