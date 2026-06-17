package com.bytedance.feedbackerlib.matisse.internal.loader;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.loader.content.CursorLoader;
import com.bytedance.feedbackerlib.matisse.MimeType;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes.dex */
public class AlbumLoader extends CursorLoader {
    private static final Uri a = MediaStore.Files.getContentUri("external");
    private static final String[] b = {DBDefinition.ID, "bucket_id", "bucket_display_name", "mime_type", "uri", "count"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f4863c = {DBDefinition.ID, "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f4864d = {DBDefinition.ID, "bucket_id", "bucket_display_name", "mime_type"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f4865e = {String.valueOf(1), String.valueOf(3)};

    private AlbumLoader(Context context, String str, String[] strArr) {
        super(context, a, a() ? f4863c : f4864d, str, strArr, "datetaken DESC");
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT < 29;
    }

    private static Uri b(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndex(DBDefinition.ID));
        String string = cursor.getString(cursor.getColumnIndex("mime_type"));
        return ContentUris.withAppendedId(MimeType.isImage(string) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MimeType.isVideo(string) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external"), j);
    }

    public static CursorLoader c(Context context) {
        return new AlbumLoader(context, a() ? "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id" : "(media_type=? OR media_type=?) AND _size>0", f4865e);
    }

    @Override // androidx.loader.content.Loader
    public void onContentChanged() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    @Override // androidx.loader.content.CursorLoader, androidx.loader.content.AsyncTaskLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor loadInBackground() {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.matisse.internal.loader.AlbumLoader.loadInBackground():android.database.Cursor");
    }
}
