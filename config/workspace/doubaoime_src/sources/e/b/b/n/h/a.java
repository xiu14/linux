package e.b.b.n.h;

import android.os.Process;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class a {
    public static long a() {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                try {
                    bufferedReader2.close();
                } catch (Throwable unused) {
                }
                return parseLong;
            } catch (Throwable unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader == null) {
                    return -1L;
                }
                try {
                    bufferedReader.close();
                    return -1L;
                } catch (Throwable unused3) {
                    return -1L;
                }
            }
        } catch (Throwable unused4) {
        }
    }
}
