package e.b.b.j;

import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class e {
    private static String a(String str) throws Exception {
        FileInputStream fileInputStream;
        Throwable th;
        File file = new File(str);
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            bufferedReader2.close();
                            String sb2 = sb.toString();
                            fileInputStream.close();
                            return sb2;
                        }
                        sb.append(readLine);
                        sb.append('\n');
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    static long b() {
        try {
            String[] split = a(String.format("/proc/%s/status", Integer.valueOf(Process.myPid()))).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = Pattern.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return Long.parseLong(matcher2.group());
                }
            }
        } catch (Exception unused) {
        }
        return -1L;
    }
}
