package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.ef;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
public class gj {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private gn f486a;

    /* renamed from: a, reason: collision with other field name */
    private OutputStream f487a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f490a;
    private int b;

    /* renamed from: a, reason: collision with other field name */
    ByteBuffer f488a = ByteBuffer.allocate(2048);

    /* renamed from: b, reason: collision with other field name */
    private ByteBuffer f491b = ByteBuffer.allocate(4);

    /* renamed from: a, reason: collision with other field name */
    private Adler32 f489a = new Adler32();

    gj(OutputStream outputStream, gn gnVar) {
        this.f487a = new BufferedOutputStream(outputStream);
        this.f486a = gnVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.a = timeZone.getRawOffset() / 3600000;
        this.b = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(gg ggVar) {
        int c2 = ggVar.c();
        if (c2 > 32768) {
            StringBuilder O = e.a.a.a.a.O("Blob size=", c2, " should be less than ", 32768, " Drop blob chid=");
            O.append(ggVar.a());
            O.append(" id=");
            O.append(ggVar.e());
            com.xiaomi.channel.commonutils.logger.c.m15a(O.toString());
            return 0;
        }
        this.f488a.clear();
        int i = c2 + 8 + 4;
        if (i > this.f488a.capacity() || this.f488a.capacity() > 4096) {
            this.f488a = ByteBuffer.allocate(i);
        }
        this.f488a.putShort((short) -15618);
        this.f488a.putShort((short) 5);
        this.f488a.putInt(c2);
        int position = this.f488a.position();
        this.f488a = ggVar.mo415a(this.f488a);
        if (!"CONN".equals(ggVar.m414a())) {
            if (this.f490a == null) {
                this.f490a = this.f486a.m432a();
            }
            com.xiaomi.push.service.bc.a(this.f490a, this.f488a.array(), true, position, c2);
        }
        this.f489a.reset();
        this.f489a.update(this.f488a.array(), 0, this.f488a.position());
        this.f491b.putInt(0, (int) this.f489a.getValue());
        this.f487a.write(this.f488a.array(), 0, this.f488a.position());
        this.f487a.write(this.f491b.array(), 0, 4);
        this.f487a.flush();
        int position2 = this.f488a.position() + 4;
        StringBuilder M = e.a.a.a.a.M("[Slim] Wrote {cmd=");
        M.append(ggVar.m414a());
        M.append(";chid=");
        M.append(ggVar.a());
        M.append(";len=");
        M.append(position2);
        M.append("}");
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        er.a().m358a();
        return position2;
    }

    public void b() {
        gg ggVar = new gg();
        ggVar.a("CLOSE", (String) null);
        a(ggVar);
        this.f487a.close();
    }

    public void a() {
        ef.e eVar = new ef.e();
        eVar.a(106);
        eVar.a(l.a());
        eVar.b(t.m842a());
        eVar.c(com.xiaomi.push.service.bi.m780a());
        eVar.b(com.xiaomi.push.service.f.a());
        eVar.d(this.f486a.m440b());
        eVar.e(this.f486a.mo438a());
        eVar.f(Locale.getDefault().toString());
        int i = Build.VERSION.SDK_INT;
        eVar.c(i);
        eVar.d(k.b(this.f486a.a()));
        eVar.f(h.a(this.f486a.a()));
        byte[] mo447a = this.f486a.m437a().mo447a();
        if (mo447a != null) {
            eVar.a(ef.b.a(mo447a));
        }
        gg ggVar = new gg();
        ggVar.a(0);
        ggVar.a("CONN", (String) null);
        ggVar.a(0L, "xiaomi.com", null);
        ggVar.a(eVar.m380a(), (String) null);
        a(ggVar);
        com.xiaomi.channel.commonutils.logger.c.m15a("[slim] open conn: andver=" + i + " sdk=" + com.xiaomi.push.service.f.a() + " tz=" + this.a + Constants.COLON_SEPARATOR + this.b + " Model=" + l.a() + " os=" + k.e());
    }
}
