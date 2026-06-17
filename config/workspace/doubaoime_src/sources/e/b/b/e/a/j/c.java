package e.b.b.e.a.j;

import java.io.File;
import java.io.FileFilter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private final File a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer f9398c;

    class a implements FileFilter {
        a(c cVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (name.endsWith(".log")) {
                return true;
            }
            if (name.endsWith(".txt")) {
                return false;
            }
            com.bytedance.android.input.k.b.a.t(file);
            return false;
        }
    }

    public c(long j, File file, File file2) {
        this.a = file2;
        this.b = j;
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            channel.tryLock();
            this.f9398c = channel.map(FileChannel.MapMode.READ_WRITE, 0L, 262162L);
            a();
        } catch (Throwable th) {
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.c("APM-Slardar", "create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.f9398c == null) {
            this.f9398c = ByteBuffer.allocate(262162);
        }
        g();
    }

    private void b() {
        this.f9398c.position(c() + 18);
        this.f9398c.flip();
        e.b.b.e.a.j.a b = e.b.b.e.a.j.a.b(this.f9398c);
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.a("APM-Slardar", "flush to memory success. logFile=" + b);
        }
        e.b.b.e.a.c.e().g(b);
    }

    private int c() {
        return this.f9398c.getInt(14);
    }

    private int d() {
        return this.f9398c.getInt(10);
    }

    private void g() {
        this.f9398c.clear();
        this.f9398c.putShort((short) 2082);
        this.f9398c.putLong(this.b);
        this.f9398c.putInt(0);
        this.f9398c.putInt(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    
        if (r0 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.e.a.j.c.a():void");
    }

    public synchronized String[] e() {
        File[] listFiles = e.b.b.e.a.b.a().listFiles(new a(this));
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            arrayList.add(file.getName());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public synchronized void f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (e.b.b.n.a.b()) {
            com.bytedance.apm.doctor.a.c(jSONObject);
        }
        byte[] bytes = jSONObject2.getBytes();
        int length = bytes.length + 4;
        if (length > 262144) {
            e.b.b.k.b.c(new d(this, jSONObject.optJSONObject("service"), jSONObject.optJSONObject("log_type")));
            return;
        }
        if (length > this.f9398c.remaining()) {
            a();
        }
        this.f9398c.putInt(bytes.length);
        this.f9398c.put(bytes);
        this.f9398c.putInt(10, d() + 1);
        this.f9398c.putInt(14, c() + length);
        if (e.b.b.n.a.b()) {
            String format = String.format("push success: totalCount=%s, totalBytes=%s, logItem=%s", Integer.valueOf(d()), Integer.valueOf(c()), jSONObject2);
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.a("APM-Slardar", format);
        }
        if (this.f9398c.position() >= 262134 || d() >= 256) {
            a();
        }
    }
}
