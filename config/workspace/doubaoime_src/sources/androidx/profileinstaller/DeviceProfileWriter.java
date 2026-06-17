package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class DeviceProfileWriter {

    @NonNull
    private final String mApkName;

    @NonNull
    private final AssetManager mAssetManager;

    @NonNull
    private final File mCurProfile;

    @NonNull
    private final ProfileInstaller.DiagnosticsCallback mDiagnostics;

    @NonNull
    private final Executor mExecutor;

    @Nullable
    private DexProfileData[] mProfile;

    @NonNull
    private final String mProfileMetaSourceLocation;

    @NonNull
    private final String mProfileSourceLocation;

    @Nullable
    private byte[] mTranscodedProfile;
    private boolean mDeviceSupportsAotProfile = false;

    @Nullable
    private final byte[] mDesiredVersion = desiredVersion();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = str;
        this.mProfileSourceLocation = str2;
        this.mProfileMetaSourceLocation = str3;
        this.mCurProfile = file;
    }

    @Nullable
    private DeviceProfileWriter addMetadata(DexProfileData[] dexProfileDataArr, byte[] bArr) {
        InputStream openStreamFromAssets;
        try {
            openStreamFromAssets = openStreamFromAssets(this.mAssetManager, this.mProfileMetaSourceLocation);
        } catch (FileNotFoundException e2) {
            this.mDiagnostics.onResultReceived(9, e2);
        } catch (IOException e3) {
            this.mDiagnostics.onResultReceived(7, e3);
        } catch (IllegalStateException e4) {
            this.mProfile = null;
            this.mDiagnostics.onResultReceived(8, e4);
        }
        if (openStreamFromAssets == null) {
            if (openStreamFromAssets != null) {
                openStreamFromAssets.close();
            }
            return null;
        }
        try {
            this.mProfile = ProfileTranscoder.readMeta(openStreamFromAssets, ProfileTranscoder.readHeader(openStreamFromAssets, ProfileTranscoder.MAGIC_PROFM), bArr, dexProfileDataArr);
            openStreamFromAssets.close();
            return this;
        } catch (Throwable th) {
            try {
                openStreamFromAssets.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if (!this.mDeviceSupportsAotProfile) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @Nullable
    private static byte[] desiredVersion() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return null;
        }
        switch (i) {
        }
        return null;
    }

    @Nullable
    private InputStream getProfileInputStream(AssetManager assetManager) {
        try {
            return openStreamFromAssets(assetManager, this.mProfileSourceLocation);
        } catch (FileNotFoundException e2) {
            this.mDiagnostics.onResultReceived(6, e2);
            return null;
        } catch (IOException e3) {
            this.mDiagnostics.onResultReceived(7, e3);
            return null;
        }
    }

    @Nullable
    private InputStream openStreamFromAssets(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.mDiagnostics.onDiagnosticReceived(5, null);
            return null;
        }
    }

    @Nullable
    private DexProfileData[] readProfileInternal(InputStream inputStream) {
        try {
        } catch (IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
        }
        try {
            try {
                DexProfileData[] readProfile = ProfileTranscoder.readProfile(inputStream, ProfileTranscoder.readHeader(inputStream, ProfileTranscoder.MAGIC_PROF), this.mApkName);
                try {
                    inputStream.close();
                    return readProfile;
                } catch (IOException e3) {
                    this.mDiagnostics.onResultReceived(7, e3);
                    return readProfile;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    this.mDiagnostics.onResultReceived(7, e4);
                }
                throw th;
            }
        } catch (IOException e5) {
            this.mDiagnostics.onResultReceived(7, e5);
            inputStream.close();
            return null;
        } catch (IllegalStateException e6) {
            this.mDiagnostics.onResultReceived(8, e6);
            inputStream.close();
            return null;
        }
    }

    private static boolean requiresMetadata() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return false;
        }
        switch (i) {
        }
        return false;
    }

    private void result(final int i, @Nullable final Object obj) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.profileinstaller.a
            @Override // java.lang.Runnable
            public final void run() {
                DeviceProfileWriter.this.a(i, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Object obj) {
        this.mDiagnostics.onResultReceived(i, obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.mDesiredVersion == null) {
            result(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.mCurProfile.canWrite()) {
            this.mDeviceSupportsAotProfile = true;
            return true;
        }
        result(4, null);
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter read() {
        DeviceProfileWriter addMetadata;
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (this.mDesiredVersion == null) {
            return this;
        }
        InputStream profileInputStream = getProfileInputStream(this.mAssetManager);
        if (profileInputStream != null) {
            this.mProfile = readProfileInternal(profileInputStream);
        }
        DexProfileData[] dexProfileDataArr = this.mProfile;
        return (dexProfileDataArr == null || !requiresMetadata() || (addMetadata = addMetadata(dexProfileDataArr, this.mDesiredVersion)) == null) ? this : addMetadata;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        ByteArrayOutputStream byteArrayOutputStream;
        DexProfileData[] dexProfileDataArr = this.mProfile;
        byte[] bArr = this.mDesiredVersion;
        if (dexProfileDataArr != null && bArr != null) {
            assertDeviceAllowsProfileInstallerAotWritesCalled();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ProfileTranscoder.writeHeader(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                this.mDiagnostics.onResultReceived(7, e2);
            } catch (IllegalStateException e3) {
                this.mDiagnostics.onResultReceived(8, e3);
            }
            if (!ProfileTranscoder.transcodeAndWriteBody(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                this.mDiagnostics.onResultReceived(5, null);
                this.mProfile = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.mTranscodedProfile = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.mProfile = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean write() {
        byte[] bArr = this.mTranscodedProfile;
        if (bArr == null) {
            return false;
        }
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.mCurProfile);
                    try {
                        Encoding.writeAll(byteArrayInputStream, fileOutputStream);
                        result(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.mTranscodedProfile = null;
                this.mProfile = null;
            }
        } catch (FileNotFoundException e2) {
            result(6, e2);
            return false;
        } catch (IOException e3) {
            result(7, e3);
            return false;
        }
    }
}
