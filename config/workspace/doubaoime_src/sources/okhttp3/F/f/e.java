package okhttp3.F.f;

import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
import okhttp3.B;
import okhttp3.k;
import okhttp3.l;
import okhttp3.s;
import okhttp3.t;

/* loaded from: classes2.dex */
public final class e {
    private static final f.h a = f.h.c("\"\\");
    private static final f.h b = f.h.c("\t ,=");

    public static long a(B b2) {
        String d2 = b2.w().d(DownloadUtils.CONTENT_LENGTH);
        if (d2 != null) {
            try {
                return Long.parseLong(d2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static boolean b(B b2) {
        if (b2.N().method().equals("HEAD")) {
            return false;
        }
        int l = b2.l();
        return (((l >= 100 && l < 200) || l == 204 || l == 304) && a(b2) == -1 && !DownloadHelper.VALUE_CHUNKED.equalsIgnoreCase(b2.p(DownloadHelper.TRANSFER_ENCODING))) ? false : true;
    }

    public static int c(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void d(l lVar, t tVar, s sVar) {
        if (lVar == l.a) {
            return;
        }
        List<k> c2 = k.c(tVar, sVar);
        if (c2.isEmpty()) {
            return;
        }
        lVar.a(tVar, c2);
    }

    public static int e(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}
