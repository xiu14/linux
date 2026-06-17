package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.bdinstall.m0.m;
import com.ss.android.message.log.PushLog;

/* loaded from: classes.dex */
final class i implements m {
    private com.bytedance.bdinstall.util.p<Boolean> a = new a(this);

    class a extends com.bytedance.bdinstall.util.p<Boolean> {
        a(i iVar) {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Boolean a(Object[] objArr) {
            try {
                PackageManager packageManager = ((Context) objArr[0]).getPackageManager();
                if (packageManager != null) {
                    return Boolean.valueOf(packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null);
                }
            } catch (Exception unused) {
            }
            return Boolean.FALSE;
        }
    }

    i() {
    }

    @Override // com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        Cursor cursor;
        String string;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            if (cursor == null) {
                return null;
            }
            try {
                m.a aVar = new m.a();
                if (!cursor.isClosed()) {
                    cursor.moveToFirst();
                    int columnIndex = cursor.getColumnIndex(PushLog.KEY_VALUE);
                    if (columnIndex >= 0) {
                        string = cursor.getString(columnIndex);
                        aVar.a = string;
                        cursor.close();
                        return aVar;
                    }
                }
                string = null;
                aVar.a = string;
                cursor.close();
                return aVar;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        return this.a.b(context).booleanValue();
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Meizu";
    }
}
