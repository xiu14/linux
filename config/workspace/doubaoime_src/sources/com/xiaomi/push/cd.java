package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.cj;

/* loaded from: classes2.dex */
public class cd extends cf {
    public cd(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    public static cd a(Context context, String str, int i) {
        com.xiaomi.channel.commonutils.logger.c.b("delete  messages when db size is too bigger");
        String m162a = cj.a(context).m162a(str);
        if (TextUtils.isEmpty(m162a)) {
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("rowDataId in (select ");
        M.append("rowDataId from " + m162a);
        M.append(" order by createTimeStamp asc");
        M.append(" limit ?)");
        return new cd(str, M.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    private void a(long j) {
        String[] strArr = ((cj.d) this).f186a;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        strArr[0] = String.valueOf(j);
    }

    @Override // com.xiaomi.push.cj.a
    public void a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a = cn.a(m164a());
            long j = cb.f168a;
            if (a > j) {
                long j2 = (long) ((((a - j) * 1.2d) / j) * longValue);
                a(j2);
                ca a2 = ca.a(context);
                StringBuilder Q = e.a.a.a.a.Q("begin delete ", j2, "noUpload messages , because db size is ");
                Q.append(a);
                Q.append("B");
                a2.a(Q.toString());
                super.a(context, obj);
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.b("db size is suitable");
        }
    }
}
