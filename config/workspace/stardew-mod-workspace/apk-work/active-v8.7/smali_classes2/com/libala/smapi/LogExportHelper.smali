.class public final Lcom/libala/smapi/LogExportHelper;
.super Ljava/lang/Object;
.source "LogExportHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/libala/smapi/LogExportHelper$OutputTarget;
    }
.end annotation


# static fields
.field private static final ALIAS_FILE:Ljava/lang/String; = ".smapi-launcher-names.properties"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/app/Activity;)V
    .locals 0

    .line 30
    invoke-static {p0}, Lcom/libala/smapi/LogExportHelper;->exportInBackground(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$100(Landroid/app/Activity;Ljava/lang/String;)Lcom/libala/smapi/LogExportHelper$OutputTarget;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 30
    invoke-static {p0, p1}, Lcom/libala/smapi/LogExportHelper;->openDownloadsOutput(Landroid/app/Activity;Ljava/lang/String;)Lcom/libala/smapi/LogExportHelper$OutputTarget;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Landroid/app/Activity;Ljava/util/zip/ZipOutputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 30
    invoke-static {p0, p1}, Lcom/libala/smapi/LogExportHelper;->writePackage(Landroid/app/Activity;Ljava/util/zip/ZipOutputStream;)V

    return-void
.end method

.method static synthetic access$300(Landroid/app/Activity;Lcom/libala/smapi/LogExportHelper$OutputTarget;)V
    .locals 0

    .line 30
    invoke-static {p0, p1}, Lcom/libala/smapi/LogExportHelper;->finishDownloadsOutput(Landroid/app/Activity;Lcom/libala/smapi/LogExportHelper$OutputTarget;)V

    return-void
.end method

.method static synthetic access$400(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    .line 30
    invoke-static {p0, p1}, Lcom/libala/smapi/LogExportHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$500(Lcom/libala/smapi/LogExportHelper$OutputTarget;)V
    .locals 0

    .line 30
    invoke-static {p0}, Lcom/libala/smapi/LogExportHelper;->closeQuietly(Lcom/libala/smapi/LogExportHelper$OutputTarget;)V

    return-void
.end method

.method private static addDirectory(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 212
    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    .line 213
    if-nez p2, :cond_0

    .line 214
    return-void

    .line 215
    :cond_0
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v2, p2, v1

    .line 216
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 217
    invoke-static {p0, p1, v2, p3}, Lcom/libala/smapi/LogExportHelper;->addDirectory(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    .line 218
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 219
    invoke-virtual {p1}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v2}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/net/URI;->relativize(Ljava/net/URI;)Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 220
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v2, v3}, Lcom/libala/smapi/LogExportHelper;->addFile(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V

    .line 215
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 223
    :cond_3
    return-void
.end method

.method private static addFile(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 226
    new-instance v0, Ljava/util/zip/ZipEntry;

    invoke-static {p2}, Lcom/libala/smapi/LogExportHelper;->cleanEntryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 227
    invoke-virtual {p0, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 228
    new-instance p2, Ljava/io/FileInputStream;

    invoke-direct {p2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 230
    const/high16 p1, 0x10000

    :try_start_0
    new-array p1, p1, [B

    .line 232
    :goto_0
    invoke-virtual {p2, p1}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 233
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Ljava/util/zip/ZipOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 235
    :cond_0
    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V

    .line 236
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 237
    nop

    .line 238
    return-void

    .line 235
    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V

    .line 236
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 237
    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private static addText(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 241
    new-instance v0, Ljava/util/zip/ZipEntry;

    invoke-static {p1}, Lcom/libala/smapi/LogExportHelper;->cleanEntryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 242
    invoke-virtual {p0, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 243
    const-string p1, "UTF-8"

    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/zip/ZipOutputStream;->write([B)V

    .line 244
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 245
    return-void
.end method

.method private static buildAppInfo(Landroid/app/Activity;Ljava/io/File;)Ljava/lang/String;
    .locals 3

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    const-string v1, "Export time: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 168
    const-string v1, "Package: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 169
    const-string p0, "Data dir: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    const-string p0, "Android API: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    const-string p0, "Android version: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    sget-object p1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 172
    const-string p0, "Device: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    sget-object p1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const/16 p1, 0x20

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p0

    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    const-string p0, "Upload: disabled; this package was exported locally.\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static cleanEntryName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 248
    const/16 v0, 0x5c

    const/16 v1, 0x2f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const-string v0, "^/+"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static closeQuietly(Lcom/libala/smapi/LogExportHelper$OutputTarget;)V
    .locals 1

    .line 304
    if-eqz p0, :cond_1

    iget-object v0, p0, Lcom/libala/smapi/LogExportHelper$OutputTarget;->output:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    goto :goto_1

    .line 307
    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/libala/smapi/LogExportHelper$OutputTarget;->output:Ljava/io/OutputStream;

    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    goto :goto_0

    .line 308
    :catchall_0
    move-exception p0

    .line 310
    :goto_0
    return-void

    .line 305
    :cond_1
    :goto_1
    return-void
.end method

.method private static exportInBackground(Landroid/app/Activity;)V
    .locals 2

    .line 57
    const-string v0, "\u6b63\u5728\u5bfc\u51fa\u65e5\u5fd7\u5305..."

    invoke-static {p0, v0}, Lcom/libala/smapi/LogExportHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 58
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/libala/smapi/LogExportHelper$2;

    invoke-direct {v1, p0}, Lcom/libala/smapi/LogExportHelper$2;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 97
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 98
    return-void
.end method

.method private static finishDownloadsOutput(Landroid/app/Activity;Lcom/libala/smapi/LogExportHelper$OutputTarget;)V
    .locals 3

    .line 202
    if-nez p1, :cond_0

    .line 203
    return-void

    .line 204
    :cond_0
    iget-object v0, p1, Lcom/libala/smapi/LogExportHelper$OutputTarget;->uri:Landroid/net/Uri;

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 205
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 206
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "is_pending"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 207
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    iget-object p1, p1, Lcom/libala/smapi/LogExportHelper$OutputTarget;->uri:Landroid/net/Uri;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1, v1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 209
    :cond_1
    return-void
.end method

.method private static loadAliases(Ljava/io/File;)Ljava/util/Properties;
    .locals 3

    .line 256
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 257
    new-instance v1, Ljava/io/File;

    const-string v2, ".smapi-launcher-names.properties"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 258
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    .line 259
    return-object v0

    .line 260
    :cond_0
    nop

    .line 262
    const/4 p0, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 263
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 266
    nop

    .line 268
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    goto :goto_1

    .line 264
    :catchall_0
    move-exception p0

    move-object p0, v2

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 266
    :goto_0
    if-eqz p0, :cond_1

    .line 268
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 270
    :goto_1
    goto :goto_2

    .line 269
    :catchall_2
    move-exception p0

    goto :goto_1

    .line 273
    :cond_1
    :goto_2
    return-object v0
.end method

.method private static openDownloadsOutput(Landroid/app/Activity;Ljava/lang/String;)Lcom/libala/smapi/LogExportHelper$OutputTarget;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 178
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_2

    .line 179
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 180
    const-string v1, "_display_name"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v1, "mime_type"

    const-string v2, "application/zip"

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v1, "relative_path"

    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "is_pending"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 184
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    .line 185
    sget-object v1, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {p0, v1, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    .line 186
    if-eqz v0, :cond_1

    .line 188
    invoke-virtual {p0, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object p0

    .line 189
    if-eqz p0, :cond_0

    .line 191
    new-instance v1, Lcom/libala/smapi/LogExportHelper$OutputTarget;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Download/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p0, v0, p1}, Lcom/libala/smapi/LogExportHelper$OutputTarget;-><init>(Ljava/io/OutputStream;Landroid/net/Uri;Ljava/lang/String;)V

    return-object v1

    .line 190
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u5199\u5165 Download \u65e5\u5fd7\u5305"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 187
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u5728 Download \u521b\u5efa\u65e5\u5fd7\u5305"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 194
    :cond_2
    sget-object p0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {p0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 195
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 196
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u65e0\u6cd5\u521b\u5efa Download \u76ee\u5f55\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 197
    :cond_4
    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 198
    new-instance p0, Lcom/libala/smapi/LogExportHelper$OutputTarget;

    new-instance p1, Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v1, v0}, Lcom/libala/smapi/LogExportHelper$OutputTarget;-><init>(Ljava/io/OutputStream;Landroid/net/Uri;Ljava/lang/String;)V

    return-object p0
.end method

.method private static readManifestName(Ljava/io/File;)Ljava/lang/String;
    .locals 5

    .line 277
    nop

    .line 279
    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const-string p0, "UTF-8"

    invoke-direct {v2, v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 281
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 282
    const-string v0, "\"Name\""

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 283
    if-gez v0, :cond_0

    .line 284
    goto :goto_0

    .line 285
    :cond_0
    const/16 v2, 0x3a

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 286
    add-int/lit8 v2, v0, 0x1

    const/16 v3, 0x22

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    .line 287
    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 288
    if-ltz v0, :cond_1

    if-ltz v2, :cond_1

    if-le v3, v2, :cond_1

    .line 289
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 293
    nop

    .line 295
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 297
    goto :goto_1

    .line 296
    :catchall_0
    move-exception v0

    .line 289
    :goto_1
    return-object p0

    .line 290
    :cond_1
    goto :goto_0

    .line 293
    :cond_2
    nop

    .line 295
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    goto :goto_3

    .line 291
    :catchall_1
    move-exception p0

    move-object v0, v1

    goto :goto_2

    :catchall_2
    move-exception p0

    .line 293
    :goto_2
    if-eqz v0, :cond_3

    .line 295
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 297
    :goto_3
    goto :goto_4

    .line 296
    :catchall_3
    move-exception p0

    goto :goto_3

    .line 300
    :cond_3
    :goto_4
    const-string p0, ""

    return-object p0
.end method

.method private static runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 1

    .line 322
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p0, v0, :cond_0

    .line 323
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 325
    :cond_0
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 326
    :goto_0
    return-void
.end method

.method private static safeEntryPart(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 252
    const/16 v0, 0x5c

    const/16 v1, 0x5f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x3a

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static show(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 313
    new-instance v0, Lcom/libala/smapi/LogExportHelper$3;

    invoke-direct {v0, p0, p1}, Lcom/libala/smapi/LogExportHelper$3;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/libala/smapi/LogExportHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 319
    return-void
.end method

.method public static wireLogExportButton(Landroid/app/Activity;)V
    .locals 4

    .line 37
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "UploadLog"

    const-string v2, "id"

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    return-void

    .line 43
    :cond_1
    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_2

    .line 44
    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    const-string v2, "\u5bfc\u51fa\u65e5\u5fd7\u5305"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    :cond_2
    new-instance v1, Lcom/libala/smapi/LogExportHelper$1;

    invoke-direct {v1, p0}, Lcom/libala/smapi/LogExportHelper$1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u521d\u59cb\u5316\u65e5\u5fd7\u5bfc\u51fa\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/LogExportHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 54
    :goto_0
    return-void
.end method

.method private static writeModReport(Ljava/util/zip/ZipOutputStream;Ljava/io/File;)V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 117
    move-object/from16 v0, p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    const-string v2, "MOD list\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    const-string v2, "========\n\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->exists()Z

    move-result v2

    const-string v3, "Mods/mod-list.txt"

    if-nez v2, :cond_0

    .line 121
    const-string v2, "\u6ca1\u6709\u627e\u5230 Mods \u76ee\u5f55\u3002\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lcom/libala/smapi/LogExportHelper;->addText(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    return-void

    .line 126
    :cond_0
    invoke-static/range {p1 .. p1}, Lcom/libala/smapi/LogExportHelper;->loadAliases(Ljava/io/File;)Ljava/util/Properties;

    move-result-object v2

    .line 127
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 128
    const/4 v5, 0x0

    if-nez v4, :cond_1

    .line 129
    new-array v4, v5, [Ljava/io/File;

    .line 131
    :cond_1
    nop

    .line 132
    array-length v6, v4

    const/4 v7, 0x0

    :goto_0
    if-ge v5, v6, :cond_a

    aget-object v8, v4, v5

    .line 133
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v9

    if-nez v9, :cond_2

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    new-instance v9, Ljava/io/File;

    const-string v10, "manifest.json"

    invoke-direct {v9, v8, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 136
    new-instance v11, Ljava/io/File;

    const-string v12, "manifest.json.disabled"

    invoke-direct {v11, v8, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 137
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v13

    if-nez v13, :cond_3

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v13

    if-nez v13, :cond_3

    .line 138
    nop

    .line 132
    :goto_1
    move-object/from16 v16, v2

    move-object/from16 v17, v4

    goto/16 :goto_6

    .line 140
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 141
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v13

    .line 142
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    const-string v15, ""

    invoke-virtual {v2, v14, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    .line 143
    if-eqz v13, :cond_4

    move-object v15, v9

    goto :goto_2

    :cond_4
    move-object v15, v11

    :goto_2
    invoke-static {v15}, Lcom/libala/smapi/LogExportHelper;->readManifestName(Ljava/io/File;)Ljava/lang/String;

    move-result-object v15

    .line 144
    move-object/from16 v16, v2

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v17, v4

    const-string v4, ". "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    const-string v2, "   \u72b6\u6001: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v13, :cond_5

    const-string v18, "\u542f\u7528"

    goto :goto_3

    :cond_5
    const-string v18, "\u505c\u7528"

    :goto_3
    move-object/from16 v4, v18

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    .line 147
    const-string v2, "   Manifest Name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    :cond_6
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_7

    .line 149
    const-string v2, "   \u542f\u52a8\u5668\u663e\u793a\u540d: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 150
    :cond_7
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Mods/manifests/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/libala/smapi/LogExportHelper;->safeEntryPart(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v13, :cond_8

    goto :goto_4

    :cond_8
    move-object v10, v12

    :goto_4
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 153
    if-eqz v13, :cond_9

    goto :goto_5

    :cond_9
    move-object v9, v11

    :goto_5
    invoke-static {v0, v9, v2}, Lcom/libala/smapi/LogExportHelper;->addFile(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V

    .line 132
    :goto_6
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v16

    move-object/from16 v4, v17

    goto/16 :goto_0

    .line 156
    :cond_a
    if-nez v7, :cond_b

    .line 157
    const-string v2, "\u6ca1\u6709\u627e\u5230\u5e26 manifest.json \u7684 MOD\u3002\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    :cond_b
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lcom/libala/smapi/LogExportHelper;->addText(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    new-instance v1, Ljava/io/File;

    const-string v2, ".smapi-launcher-names.properties"

    move-object/from16 v3, p1

    invoke-direct {v1, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 161
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 162
    const-string v2, "Mods/.smapi-launcher-names.properties"

    invoke-static {v0, v1, v2}, Lcom/libala/smapi/LogExportHelper;->addFile(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V

    .line 163
    :cond_c
    return-void
.end method

.method private static writePackage(Landroid/app/Activity;Ljava/util/zip/ZipOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 102
    if-eqz v0, :cond_1

    .line 105
    new-instance v1, Ljava/io/File;

    const-string v2, "ErrorLogs"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 106
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 107
    invoke-static {p1, v1, v1, v2}, Lcom/libala/smapi/LogExportHelper;->addDirectory(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0

    .line 109
    :cond_0
    const-string v1, "ErrorLogs/README.txt"

    const-string v2, "\u6ca1\u6709\u627e\u5230 ErrorLogs \u76ee\u5f55\u3002\n"

    invoke-static {p1, v1, v2}, Lcom/libala/smapi/LogExportHelper;->addText(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_0
    new-instance v1, Ljava/io/File;

    const-string v2, "Mods"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 112
    invoke-static {p1, v1}, Lcom/libala/smapi/LogExportHelper;->writeModReport(Ljava/util/zip/ZipOutputStream;Ljava/io/File;)V

    .line 113
    const-string v1, "app-info.txt"

    invoke-static {p0, v0}, Lcom/libala/smapi/LogExportHelper;->buildAppInfo(Landroid/app/Activity;Ljava/io/File;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, v1, p0}, Lcom/libala/smapi/LogExportHelper;->addText(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    return-void

    .line 103
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u83b7\u53d6\u542f\u52a8\u5668\u6570\u636e\u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
