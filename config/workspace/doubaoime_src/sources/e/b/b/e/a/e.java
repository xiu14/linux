package e.b.b.e.a;

import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public class e {
    private MappedByteBuffer a;
    private long b = 0;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private static final e a = new e();
    }

    public long a() {
        if (this.a == null) {
            try {
                File file = new File(b.e(), e.b.b.h.c.a.k().replace(".", BundleUtil.UNDERLINE_TAG).replace(Constants.COLON_SEPARATOR, Constants.ACCEPT_TIME_SEPARATOR_SERVER) + "_seq_num.txt");
                boolean exists = file.exists();
                if (!exists) {
                    file.createNewFile();
                }
                MappedByteBuffer map = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 8L);
                this.a = map;
                if (!exists) {
                    map.putLong(0, 0L);
                    return 0L;
                }
            } catch (Throwable th) {
                List<String> list = e.b.b.e.a.a.a;
                e.b.b.n.g.b.c("APM-Slardar", "prepare seq_number fail.", th);
            }
        }
        MappedByteBuffer mappedByteBuffer = this.a;
        if (mappedByteBuffer == null) {
            long j = this.b;
            this.b = 1 + j;
            return j;
        }
        long j2 = mappedByteBuffer.getLong(0) + 1;
        this.b = j2;
        this.a.putLong(0, j2);
        return this.b;
    }
}
