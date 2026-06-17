package e.b.o.a.d;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class a {
    private static String a;
    private static List<e> b;

    /* renamed from: c, reason: collision with root package name */
    private static List<Integer> f9745c;

    /* renamed from: e.b.o.a.d.a$a, reason: collision with other inner class name */
    static class C0446a implements FilenameFilter {
        C0446a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return Pattern.matches("policy[0-9]", str);
        }
    }

    static class b implements Comparator<File> {
        b() {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    static class c implements e.b.o.a.d.c {
        final /* synthetic */ List a;

        c(List list) {
            this.a = list;
        }

        @Override // e.b.o.a.d.c
        public boolean a(String str) {
            if (str.isEmpty()) {
                return true;
            }
            for (String str2 : str.split(" ")) {
                this.a.add(Long.valueOf(Long.parseLong(str2)));
            }
            return true;
        }
    }

    static class d implements e.b.o.a.d.c {
        final /* synthetic */ List a;

        d(List list) {
            this.a = list;
        }

        @Override // e.b.o.a.d.c
        public boolean a(String str) {
            if (str.isEmpty()) {
                return true;
            }
            for (String str2 : str.split(" ")) {
                this.a.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            return true;
        }
    }

    public static class e {
        private String a;
        private List<Integer> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private List<Long> f9746c = new ArrayList();

        public e(String str) {
            this.a = str;
        }

        public List<Integer> a() {
            return this.b;
        }

        public void b(List<Integer> list) {
            this.b = list;
        }

        public void c(List<Long> list) {
            this.f9746c = list;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("CpuClusterInfo{name='");
            e.a.a.a.a.G0(M, this.a, '\'', ", affectedCpuList=");
            M.append(this.b);
            M.append(", freqList=");
            M.append(this.f9746c);
            M.append('}');
            return M.toString();
        }
    }

    public static synchronized List<Integer> a() {
        synchronized (a.class) {
            List<Integer> list = f9745c;
            if (list != null) {
                return list;
            }
            List<e> b2 = b();
            ArrayList arrayList = new ArrayList();
            Iterator<e> it2 = b2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().a().size()));
            }
            f9745c = arrayList;
            return arrayList;
        }
    }

    public static synchronized List<e> b() {
        synchronized (a.class) {
            List<e> list = b;
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles(new C0446a());
            if (listFiles != null && listFiles.length > 0) {
                Arrays.sort(listFiles, new b());
                for (File file : listFiles) {
                    e eVar = new e(file.getName());
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    com.bytedance.feedbackerlib.a.x0(file.getAbsolutePath() + "/scaling_available_frequencies", new c(arrayList2));
                    com.bytedance.feedbackerlib.a.x0(file.getAbsolutePath() + "/affected_cpus", new d(arrayList3));
                    eVar.c(arrayList2);
                    eVar.b(arrayList3);
                    arrayList.add(eVar);
                }
            }
            b = arrayList;
            return arrayList;
        }
    }

    public static String c() {
        String str = a;
        if (str != null) {
            return str;
        }
        String a2 = e.b.o.a.d.d.a("ro.board.platform", "");
        a = a2;
        return a2;
    }
}
