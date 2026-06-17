package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.ef;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class gg {

    /* renamed from: a, reason: collision with other field name */
    int f474a;

    /* renamed from: a, reason: collision with other field name */
    private ef.a f475a;

    /* renamed from: a, reason: collision with other field name */
    String f476a;

    /* renamed from: a, reason: collision with other field name */
    private short f477a;

    /* renamed from: b, reason: collision with other field name */
    private final long f478b;

    /* renamed from: b, reason: collision with other field name */
    private byte[] f479b;
    private static String b = hm.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    private static long a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static final byte[] f473a = new byte[0];

    public gg() {
        this.f477a = (short) 2;
        this.f479b = f473a;
        this.f476a = null;
        this.f478b = System.currentTimeMillis();
        this.f475a = new ef.a();
        this.f474a = 1;
    }

    public static synchronized String d() {
        String sb;
        synchronized (gg.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b);
            long j = a;
            a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m413a() {
        return this.f478b;
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m421b() {
        return this.f475a.m282d();
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m424c() {
        return this.f475a.m286f();
    }

    public String e() {
        String m284e = this.f475a.m284e();
        if ("ID_NOT_AVAILABLE".equals(m284e)) {
            return null;
        }
        if (this.f475a.g()) {
            return m284e;
        }
        String d2 = d();
        this.f475a.e(d2);
        return d2;
    }

    public String f() {
        return this.f476a;
    }

    public String g() {
        if (!this.f475a.m278b()) {
            return null;
        }
        return Long.toString(this.f475a.m272a()) + "@" + this.f475a.m274a() + "/" + this.f475a.m277b();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Blob [chid=");
        M.append(a());
        M.append("; Id=");
        M.append(com.xiaomi.push.service.as.a(e()));
        M.append("; cmd=");
        M.append(m414a());
        M.append("; type=");
        M.append((int) m416a());
        M.append("; from=");
        M.append(g());
        M.append(" ]");
        return M.toString();
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f475a.c(str);
        this.f475a.m273a();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f475a.d(str2);
    }

    public int b() {
        return this.f475a.f();
    }

    public void c(long j) {
        this.f475a.c(j);
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m422b() {
        return this.f475a.l();
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m423c() {
        return this.f475a.m272a();
    }

    public void b(long j) {
        this.f475a.b(j);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int indexOf = str.indexOf("@");
        try {
            long parseLong = Long.parseLong(str.substring(0, indexOf));
            int indexOf2 = str.indexOf("/", indexOf);
            String substring = str.substring(indexOf + 1, indexOf2);
            String substring2 = str.substring(indexOf2 + 1);
            this.f475a.a(parseLong);
            this.f475a.a(substring);
            this.f475a.b(substring2);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Blob parse user err ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public long m420b() {
        return this.f475a.m276b();
    }

    public void b(String str) {
        this.f476a = str;
    }

    gg(ef.a aVar, short s, byte[] bArr) {
        this.f477a = (short) 2;
        this.f479b = f473a;
        this.f476a = null;
        this.f478b = System.currentTimeMillis();
        this.f475a = aVar;
        this.f477a = s;
        this.f479b = bArr;
        this.f474a = 2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m414a() {
        return this.f475a.m280c();
    }

    public void a(int i) {
        this.f475a.a(i);
    }

    public int a() {
        return this.f475a.c();
    }

    public void a(String str) {
        this.f475a.e(str);
    }

    public void a(long j) {
        this.f475a.a(j);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m417a() {
        return this.f475a.j();
    }

    public void a(long j, String str, String str2) {
        if (j != 0) {
            this.f475a.a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f475a.a(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f475a.b(str2);
    }

    public int c() {
        return this.f475a.b() + 8 + this.f479b.length;
    }

    public void a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f475a.c(1);
            this.f479b = com.xiaomi.push.service.bc.a(com.xiaomi.push.service.bc.a(str, e()), bArr);
        } else {
            this.f475a.c(0);
            this.f479b = bArr;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m418a() {
        return gh.a(this, this.f479b);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m419a(String str) {
        if (this.f475a.e() == 1) {
            return gh.a(this, com.xiaomi.push.service.bc.a(com.xiaomi.push.service.bc.a(str, e()), this.f479b));
        }
        if (this.f475a.e() == 0) {
            return gh.a(this, this.f479b);
        }
        StringBuilder M = e.a.a.a.a.M("unknow cipher = ");
        M.append(this.f475a.e());
        com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        return gh.a(this, this.f479b);
    }

    @Deprecated
    public static gg a(hd hdVar, String str) {
        int i;
        gg ggVar = new gg();
        try {
            i = Integer.parseInt(hdVar.k());
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Blob parse chid err ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            i = 1;
        }
        ggVar.a(i);
        ggVar.a(hdVar.j());
        ggVar.c(hdVar.m());
        ggVar.b(hdVar.n());
        ggVar.a("XMLMSG", (String) null);
        try {
            ggVar.a(hdVar.mo469a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                ggVar.a((short) 3);
            } else {
                ggVar.a((short) 2);
                ggVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e3) {
            StringBuilder M2 = e.a.a.a.a.M("Blob setPayload err： ");
            M2.append(e3.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
        }
        return ggVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    ByteBuffer mo415a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.f477a);
        byteBuffer.putShort((short) this.f475a.a());
        byteBuffer.putInt(this.f479b.length);
        int position = byteBuffer.position();
        this.f475a.m379a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f475a.a());
        byteBuffer.position(this.f475a.a() + position);
        byteBuffer.put(this.f479b);
        return byteBuffer;
    }

    static gg a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            ef.a aVar = new ef.a();
            aVar.a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new gg(aVar, s, bArr);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("read Blob err :");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            throw new IOException("Malformed Input");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public short m416a() {
        return this.f477a;
    }

    public void a(short s) {
        this.f477a = s;
    }
}
