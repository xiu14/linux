package e.h.a.g.b.a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private static void a(File file, HashMap<String, Object> hashMap, List<String> list) {
        boolean z;
        String name;
        if (file.getName().startsWith(".")) {
            return;
        }
        if (!com.bytedance.android.input.k.b.a.e0(list)) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (file.getAbsolutePath().startsWith(it2.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < file.getName().length(); i++) {
                sb.append("*");
            }
            name = sb.toString();
        } else {
            name = file.getName();
        }
        if (file.isFile()) {
            hashMap.put(name, Long.valueOf(file.length()));
        }
        if (file.isDirectory()) {
            HashMap hashMap2 = new HashMap();
            hashMap.put(name, hashMap2);
            for (String str : file.list()) {
                a(new File(file, str), hashMap2, list);
            }
        }
    }

    protected static void b(File file, BufferedWriter bufferedWriter, List<String> list) throws IOException {
        HashMap hashMap = new HashMap();
        bufferedWriter.write("{");
        bufferedWriter.newLine();
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            hashMap.clear();
            a(listFiles[i], hashMap, list);
            if (!hashMap.keySet().isEmpty()) {
                d(hashMap, 1, bufferedWriter);
                if (i + 1 < listFiles.length) {
                    bufferedWriter.write(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
        }
        bufferedWriter.write("}");
        bufferedWriter.flush();
    }

    public static boolean c(File file, File file2, List<String> list) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file2);
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e3) {
            e = e3;
            fileWriter = null;
        } catch (Throwable th2) {
            th = th2;
            fileWriter = null;
        }
        try {
            b(file, bufferedWriter, list);
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return true;
        } catch (IOException e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                    return false;
                }
            }
            if (fileWriter == null) {
                return false;
            }
            fileWriter.close();
            return false;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                    throw th;
                }
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
            throw th;
        }
    }

    private static void d(HashMap<String, Object> hashMap, int i, BufferedWriter bufferedWriter) throws IOException {
        int size = hashMap.keySet().size();
        int i2 = 0;
        for (String str : hashMap.keySet()) {
            Object obj = hashMap.get(str);
            i2++;
            if (obj instanceof Long) {
                for (int i3 = 0; i3 < i + 1; i3++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write(String.format("\"%s\": %d", str.replaceAll("\n", ""), Long.valueOf(((Long) obj).longValue())));
                if (i2 < size) {
                    bufferedWriter.write(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                bufferedWriter.newLine();
            } else {
                for (int i4 = 0; i4 < i; i4++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write(String.format("\"%s\": {", str.replaceAll("\n", "")));
                bufferedWriter.newLine();
                int i5 = i + 1;
                d((HashMap) obj, i5, bufferedWriter);
                for (int i6 = 0; i6 < i5; i6++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write("}");
                if (i2 < size) {
                    bufferedWriter.write(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                bufferedWriter.newLine();
            }
        }
    }
}
