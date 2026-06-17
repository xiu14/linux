package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.common.wschannel.event.MessageAckEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class WsChannelMsg implements Parcelable {
    public static final Parcelable.Creator<WsChannelMsg> CREATOR = new a();
    public static WsChannelMsg r = new WsChannelMsg();
    private long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private int f4290c;

    /* renamed from: d, reason: collision with root package name */
    private int f4291d;

    /* renamed from: e, reason: collision with root package name */
    private List<MsgHeader> f4292e;

    /* renamed from: f, reason: collision with root package name */
    private String f4293f;

    /* renamed from: g, reason: collision with root package name */
    private String f4294g;
    private byte[] h;
    private ComponentName i;
    private int j;
    private NewMsgTimeHolder k;
    private String l;
    private boolean m;
    private MessageAckEvent.MessageState n;
    private String o;
    private String p;
    private String q;

    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new a();
        String a;
        String b;

        static class a implements Parcelable.Creator<MsgHeader> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public MsgHeader createFromParcel(Parcel parcel) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.a = parcel.readString();
                msgHeader.b = parcel.readString();
                return msgHeader;
            }

            @Override // android.os.Parcelable.Creator
            public MsgHeader[] newArray(int i) {
                return new MsgHeader[i];
            }
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public void c(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(String str) {
            this.b = str;
        }

        @NonNull
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("MsgHeader{key='");
            e.a.a.a.a.G0(M, this.a, '\'', ", value='");
            return e.a.a.a.a.H(M, this.b, '\'', '}');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }

    static class a implements Parcelable.Creator<WsChannelMsg> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public WsChannelMsg createFromParcel(Parcel parcel) {
            return new WsChannelMsg(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public WsChannelMsg[] newArray(int i) {
            return new WsChannelMsg[i];
        }
    }

    public static final class b {
        private final int a;

        /* renamed from: c, reason: collision with root package name */
        private long f4295c;

        /* renamed from: d, reason: collision with root package name */
        private int f4296d;

        /* renamed from: e, reason: collision with root package name */
        private int f4297e;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f4298f;
        private Map<String, String> b = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        private String f4299g = "";
        private String h = "";

        public b(int i) {
            this.a = i;
        }

        public b a(String str, String str2) {
            this.b.put(str, str2);
            return this;
        }

        public WsChannelMsg b() {
            if (this.a <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            }
            if (this.f4296d < 0) {
                throw new IllegalArgumentException("illegal service");
            }
            if (this.f4297e <= 0) {
                throw new IllegalArgumentException("illegal method");
            }
            if (this.f4298f == null) {
                throw new IllegalArgumentException("illegal payload");
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.a = entry.getKey();
                msgHeader.b = entry.getValue();
                arrayList.add(msgHeader);
            }
            return new WsChannelMsg(this.a, 0L, this.f4295c, this.f4296d, this.f4297e, arrayList, this.h, this.f4299g, this.f4298f, null);
        }

        public b c(long j) {
            this.f4295c = j;
            return this;
        }

        public b d(int i) {
            this.f4297e = i;
            return this;
        }

        public b e(byte[] bArr) {
            this.f4298f = bArr;
            return this;
        }

        public b f(String str) {
            this.h = str;
            return this;
        }

        public b g(String str) {
            this.f4299g = str;
            return this;
        }

        public b h(int i) {
            this.f4296d = i;
            return this;
        }
    }

    @Deprecated
    public WsChannelMsg() {
        this.n = MessageAckEvent.MessageState.Default;
    }

    public void B(List<MsgHeader> list) {
        this.f4292e = list;
    }

    public void C(String str) {
        this.p = str;
    }

    public void E(NewMsgTimeHolder newMsgTimeHolder) {
        this.k = newMsgTimeHolder;
    }

    public void F(byte[] bArr) {
        this.h = bArr;
    }

    public void J(String str) {
        this.f4293f = str;
    }

    public void K(String str) {
        this.f4294g = str;
    }

    public void L(ComponentName componentName) {
        this.i = componentName;
    }

    public void O(long j) {
        this.a = j;
    }

    public void R(String str) {
        this.q = str;
    }

    public void T(int i) {
        this.f4290c = i;
    }

    public long a() {
        return this.b;
    }

    public String b() {
        return this.o;
    }

    public int c() {
        return this.f4291d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<MsgHeader> e() {
        return this.f4292e;
    }

    public byte[] f() {
        if (this.h == null) {
            this.h = new byte[1];
        }
        return this.h;
    }

    public String g() {
        return this.f4293f;
    }

    public String i() {
        return this.f4294g;
    }

    public ComponentName j() {
        return this.i;
    }

    public long k() {
        return this.a;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.f4290c;
    }

    public MessageAckEvent.MessageState n() {
        return this.n;
    }

    @Nullable
    public String q() {
        return this.l;
    }

    public boolean t() {
        return this.m;
    }

    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("WsChannelMsg{, channelId = ");
        M.append(this.j);
        M.append(", logId=");
        M.append(this.b);
        M.append(", service=");
        M.append(this.f4290c);
        M.append(", method=");
        M.append(this.f4291d);
        M.append(", msgHeaders=");
        M.append(this.f4292e);
        M.append(", payloadEncoding='");
        e.a.a.a.a.G0(M, this.f4293f, '\'', ", payloadType='");
        e.a.a.a.a.G0(M, this.f4294g, '\'', ", payload=");
        M.append(Arrays.toString(this.h));
        M.append(", replayToComponentName=");
        M.append(this.i);
        M.append('}');
        return M.toString();
    }

    public void u(int i) {
        this.j = i;
    }

    public void v(long j) {
        this.b = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.f4290c);
        parcel.writeInt(this.f4291d);
        parcel.writeTypedList(this.f4292e);
        parcel.writeString(this.f4293f);
        parcel.writeString(this.f4294g);
        parcel.writeByteArray(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j);
        parcel.writeString(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.n.getTypeValue());
        parcel.writeParcelable(this.k, i);
        parcel.writeString(this.o);
        parcel.writeString(this.q);
        parcel.writeString(this.p);
    }

    public void y(int i) {
        this.f4291d = i;
    }

    public WsChannelMsg(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.n = MessageAckEvent.MessageState.Default;
        this.j = i;
        this.a = j;
        this.b = j2;
        this.f4290c = i2;
        this.f4291d = i3;
        this.f4292e = list;
        this.f4293f = str;
        this.f4294g = str2;
        this.h = bArr;
        this.i = null;
    }

    protected WsChannelMsg(Parcel parcel) {
        this.n = MessageAckEvent.MessageState.Default;
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.f4290c = parcel.readInt();
        this.f4291d = parcel.readInt();
        this.f4292e = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.f4293f = parcel.readString();
        this.f4294g = parcel.readString();
        this.h = parcel.createByteArray();
        this.i = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.j = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readByte() != 0;
        this.n = MessageAckEvent.MessageState.valueOf(parcel.readInt());
        this.k = (NewMsgTimeHolder) parcel.readParcelable(NewMsgTimeHolder.class.getClassLoader());
        this.o = parcel.readString();
        this.q = parcel.readString();
        this.p = parcel.readString();
    }
}
