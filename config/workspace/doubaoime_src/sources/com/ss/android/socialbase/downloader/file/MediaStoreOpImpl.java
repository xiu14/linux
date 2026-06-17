package com.ss.android.socialbase.downloader.file;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class MediaStoreOpImpl implements IDownloadFileOp {
    private boolean enableMediaStoreSecurityStrategy;
    private File file;
    private int type;
    private Uri uri;

    public MediaStoreOpImpl(Uri uri, int i, boolean z) {
        this.uri = uri;
        this.type = i;
        this.enableMediaStoreSecurityStrategy = z;
        String path = getPath();
        if (TextUtils.isEmpty(path)) {
            return;
        }
        this.file = new File(path);
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public boolean canWrite() {
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public boolean delete() {
        try {
            if (this.enableMediaStoreSecurityStrategy) {
                return DownloadFileUtils.emptyFile(obtainOutputStream());
            }
            DownloadFileUtils.deleteUri(this.uri);
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public boolean exists() {
        return DownloadFileUtils.exists(this.uri);
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public String getAbsolutePath() {
        File file = this.file;
        return file != null ? file.getAbsolutePath() : "";
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public String getCanonicalPath() throws IOException {
        File file = this.file;
        return file != null ? file.getCanonicalPath() : "";
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public String getExtraMsg() {
        return "";
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    @Nullable
    public File getFile() {
        return this.file;
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public int getFileType() {
        return this.type;
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public File getParentFile() {
        File file = this.file;
        if (file != null) {
            return file.getParentFile();
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public String getPath() {
        return DownloadFileUtils.getFilePathFromUri(this.uri);
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public boolean isDirectory() {
        File file = this.file;
        if (file != null) {
            return file.isDirectory();
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public long lastModified() {
        File file = this.file;
        if (file == null || !file.exists()) {
            return 0L;
        }
        return this.file.lastModified();
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public long length() {
        return DownloadFileUtils.getLength(this.uri);
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public boolean mkdirs() {
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public FileInputStream obtainInputStream() throws IOException {
        if (this.uri != null) {
            return new FileInputStream(DownloadFileUtils.getFileDescriptor(this.uri, DownloadFileUtils.MODE_READ));
        }
        throw new IOException("Fail to obtain InputStream, uri is null");
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public FileOutputStream obtainOutputStream() throws IOException {
        if (this.uri != null) {
            return new FileOutputStream(DownloadFileUtils.getFileDescriptor(this.uri, DownloadFileUtils.MODE_WRITE));
        }
        throw new IOException("Fail to obtain OutputStream, uri is null");
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public boolean renameTo(DownloadFile downloadFile) {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.file.IDownloadFileOp
    public boolean setLastModified(long j) {
        File file = this.file;
        if (file == null || !file.exists()) {
            return false;
        }
        return this.file.setLastModified(j);
    }
}
