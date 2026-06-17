package bytekn.foundation.io.file;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import kotlin.o;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class c {
    private static final String a;
    public static final c b = new c();

    static final class a extends m implements kotlin.s.b.a<FileType> {
        final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.s.b.a
        public FileType invoke() {
            return this.a.isDirectory() ? FileType.Directory : this.a.isFile() ? FileType.Regular : FileType.Unknown;
        }
    }

    static {
        String str = File.separator;
        kotlin.s.c.l.b(str, "File.separator");
        a = str;
    }

    private c() {
    }

    private final d a(File file) {
        FileType fileType = (FileType) new a(file).invoke();
        String name = file.getName();
        kotlin.s.c.l.b(name, "file.name");
        return new d(name, new f(file.getAbsolutePath()), new f(file.getCanonicalPath()), Double.valueOf(0.0d), Double.valueOf(file.lastModified()), Long.valueOf(file.length()), fileType);
    }

    private final boolean t(String str, String str2, kotlin.s.b.a<o> aVar) {
        String h = h(str);
        if (h != null) {
            d.a.c.b.b.a("JKL", "[Unzip][A][Start][File: " + h + ']');
        }
        File file = new File(str2);
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            kotlin.s.c.l.b(absolutePath, "dir.absolutePath");
            q(absolutePath);
        }
        ZipInputStream zipInputStream = null;
        try {
            String canonicalPath = file.getCanonicalPath();
            ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
            try {
                ZipEntry nextEntry = zipInputStream2.getNextEntry();
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    kotlin.s.c.l.b(name, "szName");
                    if (kotlin.text.a.d(name, "../", false, 2, null)) {
                        zipInputStream2.closeEntry();
                        nextEntry = zipInputStream2.getNextEntry();
                    } else {
                        File file2 = new File(file, name);
                        String canonicalPath2 = file2.getCanonicalPath();
                        kotlin.s.c.l.b(canonicalPath2, "canonicalDestPath");
                        kotlin.s.c.l.b(canonicalPath, "canonicalDirPath");
                        if (!kotlin.text.a.K(canonicalPath2, canonicalPath, false, 2, null)) {
                            throw new l("Entry is outside of the target dir: " + nextEntry.getName());
                        }
                        if (nextEntry.isDirectory()) {
                            file2.mkdirs();
                            nextEntry = zipInputStream2.getNextEntry();
                        } else {
                            File parentFile = file2.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                            } else if (file2.exists()) {
                                file2.delete();
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = zipInputStream2.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            zipInputStream2.closeEntry();
                            nextEntry = zipInputStream2.getNextEntry();
                        }
                    }
                }
                if (h != null) {
                    d.a.c.b.b.a("JKL", "[Unzip][A][End][File: " + h + "][Suc]");
                }
                try {
                    zipInputStream2.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (Exception unused) {
                zipInputStream = zipInputStream2;
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                zipInputStream = zipInputStream2;
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void u(String str, String str2) {
        String h = h(str);
        if (h != null) {
            d.a.c.b.b.a("JKL", "[Unzip][B][File: " + h + ']');
        }
        ZipFile zipFile = new ZipFile(str);
        File file = new File(str2);
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            kotlin.s.c.l.b(absolutePath, "targetDirectory.absolutePath");
            q(absolutePath);
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        kotlin.s.c.l.b(entries, "archive.entries()");
        byte[] bArr = new byte[8192];
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            kotlin.s.c.l.b(nextElement, "e.nextElement()");
            ZipEntry zipEntry = nextElement;
            File file2 = new File(file, zipEntry.getName());
            String name = zipEntry.getName();
            if ((name == null || kotlin.text.a.d(name, "../", false, 2, null)) ? false : true) {
                if (zipEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    kotlin.s.c.l.b(inputStream, "archive.getInputStream(entry)");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                    }
                    inputStream.close();
                    bufferedOutputStream.close();
                }
            }
        }
        if (h != null) {
            d.a.c.b.b.a("JKL", "[Unzip][B][End][File: " + h + "][Suc]");
        }
    }

    public final void b(h hVar) {
        kotlin.s.c.l.g(hVar, "closeable");
        try {
            hVar.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean c(f fVar) {
        String b2;
        if (fVar == null || (b2 = fVar.b()) == null) {
            return false;
        }
        return d(b2);
    }

    public final boolean d(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return new File(str).getAbsoluteFile().exists();
    }

    public final d e(f fVar) {
        String b2;
        if (fVar == null || (b2 = fVar.b()) == null) {
            return null;
        }
        kotlin.s.c.l.g(b2, DownloadConstants.PATH_KEY);
        return a(new File(b2));
    }

    public final d f(String str) {
        kotlin.s.c.l.g(str, DownloadConstants.PATH_KEY);
        return a(new File(str));
    }

    public final String g(String str) {
        if (str != null) {
            return new File(str).getName();
        }
        return null;
    }

    public final String h(String str) {
        int w;
        if (str == null || (w = kotlin.text.a.w(str, a, 0, false, 6, null)) < 0) {
            return null;
        }
        String substring = str.substring(w + 1, str.length());
        kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String i() {
        return a;
    }

    public final boolean j(String str, boolean z) {
        kotlin.s.c.l.g(str, DownloadConstants.PATH_KEY);
        File absoluteFile = new File(str).getAbsoluteFile();
        return z ? absoluteFile.mkdirs() : absoluteFile.mkdir();
    }

    public final b k(f fVar) {
        String b2;
        if (fVar == null || (b2 = fVar.b()) == null) {
            return null;
        }
        return l(b2);
    }

    public final b l(String str) {
        kotlin.s.c.l.g(str, DownloadConstants.PATH_KEY);
        FileInputStream fileInputStream = new FileInputStream(new File(str).getAbsoluteFile());
        b bVar = new b();
        kotlin.s.c.l.g(fileInputStream, "<set-?>");
        bVar.a = fileInputStream;
        return bVar;
    }

    public final e m(f fVar, boolean z) {
        String b2;
        if (fVar == null || (b2 = fVar.b()) == null) {
            return null;
        }
        return n(b2, z);
    }

    public final e n(String str, boolean z) {
        kotlin.s.c.l.g(str, DownloadConstants.PATH_KEY);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str).getAbsoluteFile(), z);
        e eVar = new e();
        kotlin.s.c.l.g(fileOutputStream, "<set-?>");
        eVar.a = fileOutputStream;
        return eVar;
    }

    public final List<d> o(String str) {
        kotlin.s.c.l.g(str, DownloadConstants.PATH_KEY);
        File[] listFiles = new File(str).getAbsoluteFile().listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            c cVar = b;
            kotlin.s.c.l.b(file, "it");
            arrayList.add(cVar.a(file));
        }
        return arrayList;
    }

    public final boolean p(f fVar) {
        String b2;
        if (fVar == null || (b2 = fVar.b()) == null) {
            return false;
        }
        return q(b2);
    }

    public final boolean q(String str) {
        kotlin.s.c.l.g(str, DownloadConstants.PATH_KEY);
        File file = new File(str);
        if (file.exists()) {
            File absoluteFile = file.getAbsoluteFile();
            kotlin.s.c.l.b(absoluteFile, "file.absoluteFile");
            if (kotlin.io.b.a(absoluteFile)) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(f fVar, f fVar2) {
        if (fVar == null || fVar2 == null) {
            return false;
        }
        if (c(fVar2)) {
            p(fVar2);
        }
        File file = new File(fVar.b());
        File file2 = new File(fVar2.b());
        if (file.exists()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public final boolean s(String str, String str2) {
        kotlin.s.c.l.g(str, "zipFilePath");
        kotlin.s.c.l.g(str2, "unzipFileFolderPath");
        try {
            u(str, str2);
            return true;
        } catch (Exception e2) {
            String h = h(str);
            if (h != null) {
                d.a.c.b bVar = d.a.c.b.b;
                StringBuilder U = e.a.a.a.a.U("[Unzip][B][File: ", h, "][");
                U.append(d.a.b.a.f(e2, 3));
                U.append(']');
                bVar.b("JKL", U.toString(), null);
            }
            try {
                return t(str, str2, null);
            } catch (Exception e3) {
                String message = e3.getMessage();
                if (message == null) {
                    message = "Unzip Failed";
                }
                throw new l(message);
            }
        }
    }
}
