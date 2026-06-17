package bytekn.foundation.encryption;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public class c {
    private final kotlin.s.b.a<b> a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(kotlin.s.b.a<? extends b> aVar) {
        l.g(aVar, "create");
        this.a = aVar;
    }

    public final byte[] a(byte[] bArr) {
        l.g(bArr, RemoteMessageConst.DATA);
        b invoke = this.a.invoke();
        invoke.g(bArr, 0, bArr.length);
        return invoke.e();
    }
}
