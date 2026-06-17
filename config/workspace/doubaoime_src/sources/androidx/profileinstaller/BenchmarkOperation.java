package androidx.profileinstaller;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
class BenchmarkOperation {

    @RequiresApi(api = 21)
    private static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @RequiresApi(api = 24)
    private static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static File getDeviceProtectedCodeCacheDir(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    private BenchmarkOperation() {
    }

    static boolean deleteFilesRecursively(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = deleteFilesRecursively(file2) && z;
        }
        return z;
    }

    static void dropShaderCache(@NonNull Context context, @NonNull ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        if (deleteFilesRecursively(Api24ContextHelper.getDeviceProtectedCodeCacheDir(context))) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }
}
