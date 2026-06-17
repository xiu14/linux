package com.bytedance.common.wschannel.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ss.android.message.log.PushLog;
import f.h;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Frame extends Message<Frame, a> {
    public static final String DEFAULT_LOGIDNEW = "";
    public static final String DEFAULT_MSGID = "";
    public static final String DEFAULT_PAYLOAD_ENCODING = "";
    public static final String DEFAULT_PAYLOAD_TYPE = "";
    public static final String DEFAULT_SERVERTIMING = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.article.wschannel.model.Frame$ExtendedEntry#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<b> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long logid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String logidnew;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String msgId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 8)
    public final h payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String payload_encoding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String payload_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long seqid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String serverTiming;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer service;
    public static final ProtoAdapter<Frame> ADAPTER = new c();
    public static final Long DEFAULT_SEQID = 0L;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVICE = 0;
    public static final Integer DEFAULT_METHOD = 0;
    public static final h DEFAULT_PAYLOAD = h.f10045d;

    public static final class a extends Message.Builder<Frame, a> {
        public Long a;
        public Long b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f4271c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f4272d;

        /* renamed from: e, reason: collision with root package name */
        public List<b> f4273e = Internal.newMutableList();

        /* renamed from: f, reason: collision with root package name */
        public String f4274f;

        /* renamed from: g, reason: collision with root package name */
        public String f4275g;
        public h h;
        public String i;
        public String j;
        public String k;

        @Override // com.squareup.wire.Message.Builder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Frame build() {
            Long l = this.a;
            if (l == null || this.b == null || this.f4271c == null || this.f4272d == null) {
                throw Internal.missingRequiredFields(l, "seqid", this.b, "logid", this.f4271c, "service", this.f4272d, "method");
            }
            return new Frame(this.a, this.b, this.f4271c, this.f4272d, this.f4273e, this.f4274f, this.f4275g, this.h, this.i, this.j, this.k, buildUnknownFields());
        }
    }

    public static final class b extends Message<b, a> {

        /* renamed from: c, reason: collision with root package name */
        public static final ProtoAdapter<b> f4276c = new C0185b();

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public final String a;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
        public final String b;

        public static final class a extends Message.Builder<b, a> {
            public String a;
            public String b;

            @Override // com.squareup.wire.Message.Builder
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b build() {
                String str = this.a;
                if (str == null || this.b == null) {
                    throw Internal.missingRequiredFields(str, "key", this.b, PushLog.KEY_VALUE);
                }
                return new b(this.a, this.b, buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.common.wschannel.model.Frame$b$b, reason: collision with other inner class name */
        private static final class C0185b extends ProtoAdapter<b> {
            C0185b() {
                super(FieldEncoding.LENGTH_DELIMITED, b.class);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b decode(ProtoReader protoReader) throws IOException {
                a aVar = new a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                    if (nextTag == 1) {
                        aVar.a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, b bVar) throws IOException {
                b bVar2 = bVar;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(protoWriter, 1, bVar2.a);
                protoAdapter.encodeWithTag(protoWriter, 2, bVar2.b);
                protoWriter.writeBytes(bVar2.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(b bVar) {
                b bVar2 = bVar;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return bVar2.unknownFields().f() + protoAdapter.encodedSizeWithTag(2, bVar2.b) + protoAdapter.encodedSizeWithTag(1, bVar2.a);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public b redact(b bVar) {
                b bVar2 = bVar;
                Objects.requireNonNull(bVar2);
                a aVar = new a();
                aVar.a = bVar2.a;
                aVar.b = bVar2.b;
                aVar.addUnknownFields(bVar2.unknownFields());
                aVar.clearUnknownFields();
                return aVar.build();
            }
        }

        public b(String str, String str2, h hVar) {
            super(f4276c, hVar);
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Internal.equals(unknownFields(), bVar.unknownFields()) && Internal.equals(this.a, bVar.a) && Internal.equals(this.b, bVar.b);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.a;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.b;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public a newBuilder() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(", key=");
                sb.append(this.a);
            }
            if (this.b != null) {
                sb.append(", value=");
                sb.append(this.b);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtendedEntry{");
            replace.append('}');
            return replace.toString();
        }
    }

    private static final class c extends ProtoAdapter<Frame> {
        c() {
            super(FieldEncoding.LENGTH_DELIMITED, Frame.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Frame decode(ProtoReader protoReader) throws IOException {
            a aVar = new a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
                switch (nextTag) {
                    case 1:
                        aVar.a = ProtoAdapter.UINT64.decode(protoReader);
                        break;
                    case 2:
                        aVar.b = ProtoAdapter.UINT64.decode(protoReader);
                        break;
                    case 3:
                        aVar.f4271c = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        aVar.f4272d = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        aVar.f4273e.add(b.f4276c.decode(protoReader));
                        break;
                    case 6:
                        aVar.f4274f = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        aVar.f4275g = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        aVar.h = ProtoAdapter.BYTES.decode(protoReader);
                        break;
                    case 9:
                        aVar.i = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        aVar.j = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 11:
                        aVar.k = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Frame frame) throws IOException {
            Frame frame2 = frame;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            protoAdapter.encodeWithTag(protoWriter, 1, frame2.seqid);
            protoAdapter.encodeWithTag(protoWriter, 2, frame2.logid);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, frame2.service);
            protoAdapter2.encodeWithTag(protoWriter, 4, frame2.method);
            if (frame2.headers != null) {
                b.f4276c.asRepeated().encodeWithTag(protoWriter, 5, frame2.headers);
            }
            String str = frame2.payload_encoding;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str);
            }
            String str2 = frame2.payload_type;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str2);
            }
            h hVar = frame2.payload;
            if (hVar != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, hVar);
            }
            String str3 = frame2.logidnew;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, str3);
            }
            String str4 = frame2.serverTiming;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, str4);
            }
            String str5 = frame2.msgId;
            if (str5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, str5);
            }
            protoWriter.writeBytes(frame2.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Frame frame) {
            Frame frame2 = frame;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, frame2.logid) + protoAdapter.encodedSizeWithTag(1, frame2.seqid);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int encodedSizeWithTag2 = b.f4276c.asRepeated().encodedSizeWithTag(5, frame2.headers) + protoAdapter2.encodedSizeWithTag(4, frame2.method) + protoAdapter2.encodedSizeWithTag(3, frame2.service) + encodedSizeWithTag;
            String str = frame2.payload_encoding;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str) : 0);
            String str2 = frame2.payload_type;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str2) : 0);
            h hVar = frame2.payload;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (hVar != null ? ProtoAdapter.BYTES.encodedSizeWithTag(8, hVar) : 0);
            String str3 = frame2.logidnew;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, str3) : 0);
            String str4 = frame2.serverTiming;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, str4) : 0);
            String str5 = frame2.msgId;
            return frame2.unknownFields().f() + encodedSizeWithTag7 + (str5 != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, str5) : 0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Frame redact(Frame frame) {
            a newBuilder = frame.newBuilder();
            Internal.redactElements(newBuilder.f4273e, b.f4276c);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<b> list, String str, String str2, h hVar, String str3, String str4, String str5) {
        this(l, l2, num, num2, list, str, str2, hVar, str3, str4, str5, h.f10045d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        return Internal.equals(unknownFields(), frame.unknownFields()) && Internal.equals(this.seqid, frame.seqid) && Internal.equals(this.logid, frame.logid) && Internal.equals(this.service, frame.service) && Internal.equals(this.method, frame.method) && Internal.equals(this.headers, frame.headers) && Internal.equals(this.payload_encoding, frame.payload_encoding) && Internal.equals(this.payload_type, frame.payload_type) && Internal.equals(this.payload, frame.payload) && Internal.equals(this.logidnew, frame.logidnew) && Internal.equals(this.serverTiming, frame.serverTiming) && Internal.equals(this.msgId, frame.msgId);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.seqid;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.logid;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num = this.service;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.method;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        List<b> list = this.headers;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 1)) * 37;
        String str = this.payload_encoding;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payload_type;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        h hVar = this.payload;
        int hashCode9 = (hashCode8 + (hVar != null ? hVar.hashCode() : 0)) * 37;
        String str3 = this.logidnew;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.serverTiming;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.msgId;
        int hashCode12 = hashCode11 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.seqid != null) {
            sb.append(", seqid=");
            sb.append(this.seqid);
        }
        if (this.logid != null) {
            sb.append(", logid=");
            sb.append(this.logid);
        }
        if (this.service != null) {
            sb.append(", service=");
            sb.append(this.service);
        }
        if (this.method != null) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.headers != null) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.payload_encoding != null) {
            sb.append(", payload_encoding=");
            sb.append(this.payload_encoding);
        }
        if (this.payload_type != null) {
            sb.append(", payload_type=");
            sb.append(this.payload_type);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.logidnew != null) {
            sb.append(", logidnew=");
            sb.append(this.logidnew);
        }
        if (this.serverTiming != null) {
            sb.append(", serverTiming=");
            sb.append(this.serverTiming);
        }
        if (this.msgId != null) {
            sb.append(", msgId=");
            sb.append(this.msgId);
        }
        StringBuilder replace = sb.replace(0, 2, "Frame{");
        replace.append('}');
        return replace.toString();
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<b> list, String str, String str2, h hVar, String str3, String str4, String str5, h hVar2) {
        super(ADAPTER, hVar2);
        this.seqid = l;
        this.logid = l2;
        this.service = num;
        this.method = num2;
        this.headers = Internal.immutableCopyOf("headers", list);
        this.payload_encoding = str;
        this.payload_type = str2;
        this.payload = hVar;
        this.logidnew = str3;
        this.serverTiming = str4;
        this.msgId = str5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.a = this.seqid;
        aVar.b = this.logid;
        aVar.f4271c = this.service;
        aVar.f4272d = this.method;
        aVar.f4273e = Internal.copyOf("headers", this.headers);
        aVar.f4274f = this.payload_encoding;
        aVar.f4275g = this.payload_type;
        aVar.h = this.payload;
        aVar.i = this.logidnew;
        aVar.j = this.serverTiming;
        aVar.k = this.msgId;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }
}
