package e.b.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import e.b.h.e.i;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
class b {
    static final b p;
    private static final String[] q = {"log", "m", "stdc++", "dl", "c", "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};
    private final File a;
    private final c b;

    /* renamed from: d, reason: collision with root package name */
    private final File f9547d;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f9550g;
    private List<ZipFile> j;
    private String k;
    private Map<String, String> l;
    private String[] m;
    private String n;
    private final List<ZipFile> h = new CopyOnWriteArrayList();
    private final List<ZipFile> i = new ArrayList();
    final String[] o = {"/system/lib64", "/vendor/lib64"};

    /* renamed from: e, reason: collision with root package name */
    private ApplicationInfo f9548e = e.b.h.a.a.getApplicationInfo();

    /* renamed from: f, reason: collision with root package name */
    private File f9549f = new File(this.f9548e.nativeLibraryDir);

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, a> f9546c = new HashMap();

    static class a {
        boolean a = false;

        a() {
        }

        public String toString() {
            return Boolean.toString(this.a);
        }
    }

    /* renamed from: e.b.h.b$b, reason: collision with other inner class name */
    class C0435b {
        private RandomAccessFile a;
        private FileLock b;

        /* renamed from: c, reason: collision with root package name */
        private FileChannel f9551c;

        /* renamed from: d, reason: collision with root package name */
        private File f9552d;

        C0435b(File file) {
            this.f9552d = file;
        }

        void a() {
            FileLock fileLock = this.b;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            c cVar = b.this.b;
            StringBuilder M = e.a.a.a.a.M("released lock ");
            M.append(this.f9552d.getPath());
            String sb = M.toString();
            Objects.requireNonNull(cVar);
            Log.d("librarian", sb);
            b.this.d(this.f9551c);
            b.this.d(this.a);
        }

        void b() throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f9552d, "rw");
            this.a = randomAccessFile;
            try {
                this.f9551c = randomAccessFile.getChannel();
                try {
                    c cVar = b.this.b;
                    String str = "blocking on lock " + this.f9552d.getPath();
                    Objects.requireNonNull(cVar);
                    Log.d("librarian", str);
                    this.b = this.f9551c.lock();
                    c cVar2 = b.this.b;
                    String str2 = "acquired on lock " + this.f9552d.getPath();
                    Objects.requireNonNull(cVar2);
                    Log.d("librarian", str2);
                } catch (IOException e2) {
                    b.this.d(this.f9551c);
                    throw e2;
                }
            } catch (IOException e3) {
                b.this.d(this.a);
                throw e3;
            }
        }
    }

    static {
        Context context = e.b.h.a.a;
        if (context == null) {
            throw new d("you should call init first or use loadLibraryForModule.");
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        File dir = context.getDir("librarian", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(applicationInfo.sourceDir);
        StringBuilder S = e.a.a.a.a.S("default.version", ".");
        S.append(file.lastModified() >> 8);
        File file2 = new File(dir, S.toString());
        File[] listFiles = dir.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                if (!file2.getName().equals(file3.getName())) {
                    File[] listFiles2 = file3.listFiles();
                    if (listFiles2 != null) {
                        for (File file4 : listFiles2) {
                            file4.delete();
                        }
                    }
                    file3.delete();
                }
            }
        }
        file2.mkdirs();
        if (file2.exists()) {
            p = new b(file2, new c());
        } else {
            p = null;
        }
    }

    private b(File file, c cVar) {
        this.a = file;
        this.b = cVar;
        this.f9547d = new File(file, "process.lock");
    }

    private void c() {
        if (this.f9550g) {
            return;
        }
        synchronized (this) {
            if (this.f9550g) {
                return;
            }
            i();
            HashMap hashMap = new HashMap();
            this.l = hashMap;
            hashMap.put("arm64-v8a", "arm64");
            this.l.put("armeabi-v7a", "arm");
            this.l.put("armeabi", "arm");
            String str = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                str = (String) cls.getDeclaredMethod("vmInstructionSet", new Class[0]).invoke(cls.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            } catch (Exception e2) {
                c cVar = this.b;
                d dVar = new d("reflect err", e2);
                Objects.requireNonNull(cVar);
                Log.w("librarian", "fail to process vm abi previously", dVar);
            }
            this.k = str;
            c cVar2 = this.b;
            String str2 = "vm instruction set: " + this.k;
            Objects.requireNonNull(cVar2);
            Log.d("librarian", str2);
            this.m = Build.SUPPORTED_ABIS;
            this.f9550g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            Objects.requireNonNull(this.b);
            Log.w("librarian", "failed to close resource", e2);
        }
    }

    private boolean e(File file) throws IOException {
        f(file.getName());
        StringBuilder M = e.a.a.a.a.M("lib/");
        M.append(this.n);
        M.append("/");
        M.append(file.getName());
        String sb = M.toString();
        for (ZipFile zipFile : p()) {
            ZipEntry entry = zipFile.getEntry(sb);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    q(inputStream, file);
                    c cVar = this.b;
                    String str = "get lib file " + file.getPath() + " from " + sb + " of " + zipFile.getName();
                    Objects.requireNonNull(cVar);
                    Log.d("librarian", str);
                    return true;
                } finally {
                    d(inputStream);
                }
            }
        }
        return false;
    }

    private void f(String str) {
        boolean equals;
        if (this.n != null) {
            return;
        }
        for (String str2 : this.m) {
            if (this.k == null) {
                equals = true;
            } else {
                String str3 = this.l.get(str2);
                String str4 = this.k;
                if (str3 == null) {
                    str3 = str2;
                }
                equals = str4.equals(str3);
            }
            if (equals) {
                String u = e.a.a.a.a.u("lib/", str2, "/", str);
                for (ZipFile zipFile : p()) {
                    if (zipFile != null && zipFile.getEntry(u) != null) {
                        this.n = str2;
                        Objects.requireNonNull(this.b);
                        Log.d("librarian", "ensure that abi is " + str2);
                        return;
                    }
                }
            }
        }
        StringBuilder U = e.a.a.a.a.U("can not ensure abi for ", str, ", check ");
        U.append(this.k);
        U.append(", apks ");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (ZipFile zipFile2 : p()) {
            if (zipFile2 != null) {
                String name = zipFile2.getName();
                File file = new File(name);
                sb.append(name);
                sb.append("#");
                sb.append(zipFile2.size());
                sb.append(Constants.COLON_SEPARATOR);
                sb.append(file.length());
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
        }
        sb.append("]");
        U.append(sb.toString());
        throw new d(U.toString());
    }

    private void g(File file, boolean z) {
        String name = file.getName();
        synchronized (this) {
            C0435b c0435b = new C0435b(this.f9547d);
            try {
                try {
                    c0435b.b();
                    if (!e(file)) {
                        if (!z) {
                            throw new d("fail to extract " + name);
                        }
                        Objects.requireNonNull(this.b);
                        Log.d("librarian", "may be system lib, no found " + name);
                    }
                    c0435b.a();
                } catch (IOException e2) {
                    throw new d("fail to extract " + name, e2);
                }
            } catch (Throwable th) {
                c0435b.a();
                throw th;
            }
        }
    }

    private static String h(String str) {
        return e.a.a.a.a.t("lib", str, ".so");
    }

    private void i() {
        this.h.clear();
        File file = new File(this.f9548e.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        String[] strArr = this.f9548e.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                arrayList.add(new File(str));
                Objects.requireNonNull(this.b);
                Log.d("librarian", "split source dir: " + str);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file2 = (File) it2.next();
            try {
                this.h.add(new ZipFile(file2));
            } catch (IOException e2) {
                StringBuilder M = e.a.a.a.a.M("fail to get zip file ");
                M.append(file2.getName());
                M.append(", size ");
                M.append(file2.length());
                M.append(", exists ");
                M.append(file2.exists());
                new d(M.toString(), e2).printStackTrace();
            }
        }
    }

    private void j(File file, boolean z) {
        i iVar;
        try {
            try {
                iVar = new i(file);
            } catch (Throwable th) {
                th = th;
                iVar = null;
            }
            try {
                List<String> a2 = iVar.a();
                Collections.sort(a2);
                d(iVar);
                for (String str : a2) {
                    String substring = str.substring(3, str.length() - 3);
                    String[] strArr = q;
                    int length = strArr.length;
                    boolean z2 = false;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (strArr[i].equals(substring)) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                    if (!z2) {
                        Objects.requireNonNull(this.b);
                        Log.d("librarian", "to load depended lib " + substring);
                        l(substring, z);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                d(iVar);
                throw th;
            }
        } catch (IOException e2) {
            throw new d("fail to load depended lib", e2);
        }
    }

    private boolean k(File file, String str, boolean z) {
        try {
            c cVar = this.b;
            String path = file.getPath();
            Objects.requireNonNull(cVar);
            System.load(path);
            Objects.requireNonNull(this.b);
            Log.d("librarian", "loaded the extracted lib " + str);
            return true;
        } catch (UnsatisfiedLinkError e2) {
            if (z) {
                StringBuilder M = e.a.a.a.a.M("finally fail to load ");
                M.append(file.getPath());
                throw new d(M.toString(), e2);
            }
            c cVar2 = this.b;
            StringBuilder M2 = e.a.a.a.a.M("fail to load ");
            M2.append(file.getName());
            M2.append(", out lib exists");
            String sb = M2.toString();
            Objects.requireNonNull(cVar2);
            Log.w("librarian", sb, e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m(java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.b.m(java.lang.String, boolean):void");
    }

    private void n(String str, boolean z) {
        int i = Build.VERSION.SDK_INT >= 33 ? 12 : 1;
        d dVar = null;
        d e2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                m(str, z);
                break;
            } catch (d e3) {
                e2 = e3;
                if (this.f9549f.equals(new File(e.b.h.a.a.getApplicationInfo().nativeLibraryDir))) {
                    break;
                }
                this.f9548e = e.b.h.a.a.getApplicationInfo();
                this.f9549f = new File(this.f9548e.nativeLibraryDir);
                i();
                this.j = null;
            }
        }
        dVar = e2;
        if (dVar != null) {
            throw dVar;
        }
    }

    private boolean o(String str, String str2) {
        try {
            Objects.requireNonNull(this.b);
            System.loadLibrary(str);
            Objects.requireNonNull(this.b);
            Log.d("librarian", "loaded the origin lib " + str + ", tag: " + str2);
            return true;
        } catch (UnsatisfiedLinkError e2) {
            Objects.requireNonNull(this.b);
            Log.w("librarian", "fail to load " + str + ", tag: " + str2, e2);
            d.a(e2);
            File file = new File(e.b.h.a.a.getApplicationInfo().nativeLibraryDir);
            if (this.f9549f.equals(file)) {
                return false;
            }
            StringBuilder U = e.a.a.a.a.U("System.loadLibrary(\"", str, "\") failed, because ApplicationInfo changed. nativeLibraryDir from ");
            U.append(this.f9549f.getAbsolutePath());
            U.append(" to ");
            U.append(file.getAbsolutePath());
            throw new d(U.toString(), e2);
        }
    }

    private List<ZipFile> p() {
        ArrayList arrayList;
        List<ZipFile> list = this.j;
        if (list != null) {
            return list;
        }
        synchronized (this.i) {
            arrayList = new ArrayList(this.h.size() + this.i.size());
            arrayList.addAll(this.h);
            arrayList.addAll(this.i);
        }
        this.j = arrayList;
        return arrayList;
    }

    private File q(InputStream inputStream, File file) throws IOException {
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        c cVar = this.b;
        StringBuilder M = e.a.a.a.a.M("extracting ");
        M.append(createTempFile.getPath());
        String sb = M.toString();
        Objects.requireNonNull(cVar);
        Log.d("librarian", sb);
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            if (!createTempFile.setReadOnly()) {
                throw new IOException("failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            }
            c cVar2 = this.b;
            String str = "renaming to " + file.getPath();
            Objects.requireNonNull(cVar2);
            Log.d("librarian", str);
            if (createTempFile.renameTo(file)) {
                return file;
            }
            throw new IOException("failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } finally {
            d(fileOutputStream);
            createTempFile.delete();
        }
    }

    void l(String str, boolean z) {
        synchronized (this.f9546c) {
            a aVar = this.f9546c.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f9546c.put(str, aVar);
            } else if (aVar.a) {
                return;
            }
            synchronized (aVar) {
                if (!aVar.a) {
                    n(str, z);
                    aVar.a = true;
                    return;
                }
                Objects.requireNonNull(this.b);
                Log.d("librarian", "lib was already loaded before: " + str);
            }
        }
    }
}
