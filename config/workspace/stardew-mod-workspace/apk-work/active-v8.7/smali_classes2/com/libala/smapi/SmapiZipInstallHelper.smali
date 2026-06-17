.class public final Lcom/libala/smapi/SmapiZipInstallHelper;
.super Ljava/lang/Object;
.source "SmapiZipInstallHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;
    }
.end annotation


# static fields
.field private static final REQUEST_INSTALL_SMAPI:I = 0xee4e


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/app/Activity;)V
    .locals 0

    .line 25
    invoke-static {p0}, Lcom/libala/smapi/SmapiZipInstallHelper;->pickZip(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$100(Landroid/app/Activity;Landroid/net/Uri;)Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 25
    invoke-static {p0, p1}, Lcom/libala/smapi/SmapiZipInstallHelper;->install(Landroid/app/Activity;Landroid/net/Uri;)Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    .line 25
    invoke-static {p0, p1}, Lcom/libala/smapi/SmapiZipInstallHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$300(Landroid/app/Activity;Ljava/lang/Throwable;)V
    .locals 0

    .line 25
    invoke-static {p0, p1}, Lcom/libala/smapi/SmapiZipInstallHelper;->writeInstallError(Landroid/app/Activity;Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic access$400(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 25
    invoke-static {p0, p1, p2}, Lcom/libala/smapi/SmapiZipInstallHelper;->showError(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static install(Landroid/app/Activity;Landroid/net/Uri;)Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 105
    invoke-static {p0, p1}, Lcom/libala/smapi/SmapiZipInstallHelper;->queryDisplayName(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 106
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 107
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 108
    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 109
    const-string v2, ".zip"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_12

    const-string v2, "smapi-android"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 112
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 113
    if-eqz v1, :cond_11

    .line 115
    new-instance v2, Ljava/io/File;

    const-string v3, "Stardew Assemblies"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 116
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    const-string v3, "\u65e0\u6cd5\u521b\u5efa\u76ee\u5f55\uff1a"

    if-nez v1, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 117
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 119
    :cond_3
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0

    .line 121
    if-eqz p0, :cond_10

    .line 124
    nop

    .line 125
    const/high16 p1, 0x10000

    new-array p1, p1, [B

    .line 126
    new-instance v4, Ljava/util/zip/ZipInputStream;

    invoke-direct {v4, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p0, 0x0

    const/4 v5, 0x0

    .line 129
    :goto_1
    :try_start_0
    invoke-virtual {v4}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v6

    if-eqz v6, :cond_e

    .line 130
    invoke-virtual {v6}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    invoke-virtual {v6}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x5c

    const/16 v8, 0x2f

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    .line 133
    invoke-static {v6}, Lcom/libala/smapi/SmapiZipInstallHelper;->stripTopFolder(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 134
    if-nez v7, :cond_5

    .line 135
    goto :goto_1

    .line 136
    :cond_5
    invoke-static {v7}, Lcom/libala/smapi/SmapiZipInstallHelper;->isSafeRelativePath(Ljava/lang/String;)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v9, "SMAPI ZIP \u4e2d\u5305\u542b\u4e0d\u5b89\u5168\u8def\u5f84\uff1a"

    if-eqz v8, :cond_d

    .line 139
    :try_start_1
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 140
    invoke-virtual {v8}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v7

    .line 141
    invoke-virtual {v7, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 143
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_2

    .line 144
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u76ee\u6807\u8def\u5f84\u662f\u76ee\u5f55\uff0c\u65e0\u6cd5\u5199\u5165\u6587\u4ef6\uff1a"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 145
    :cond_7
    :goto_2
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    .line 146
    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_9

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_3

    .line 147
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 148
    :cond_9
    :goto_3
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v8}, Ljava/io/File;->canWrite()Z

    move-result v6

    if-nez v6, :cond_a

    .line 149
    const/4 v6, 0x1

    invoke-virtual {v8, v6}, Ljava/io/File;->setWritable(Z)Z

    .line 151
    :cond_a
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v8, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    :goto_4
    :try_start_2
    invoke-virtual {v4, p1}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_b

    .line 155
    invoke-virtual {v6, p1, p0, v7}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    .line 157
    :cond_b
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 158
    nop

    .line 159
    add-int/lit8 v5, v5, 0x1

    .line 160
    goto/16 :goto_1

    .line 157
    :catchall_0
    move-exception p0

    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 158
    throw p0

    .line 142
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 137
    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 162
    :cond_e
    invoke-virtual {v4}, Ljava/util/zip/ZipInputStream;->close()V

    .line 163
    nop

    .line 165
    if-eqz v5, :cond_f

    .line 167
    new-instance p0, Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;

    invoke-direct {p0, v0, v5}, Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;-><init>(Ljava/lang/String;I)V

    return-object p0

    .line 166
    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ZIP \u4e2d\u6ca1\u6709\u53ef\u5b89\u88c5\u7684 SMAPI \u6587\u4ef6"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 162
    :catchall_1
    move-exception p0

    invoke-virtual {v4}, Ljava/util/zip/ZipInputStream;->close()V

    .line 163
    throw p0

    .line 122
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u8bfb\u53d6\u9009\u62e9\u7684 ZIP \u6587\u4ef6"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 114
    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u83b7\u53d6\u542f\u52a8\u5668\u6570\u636e\u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 110
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u8bf7\u9009\u62e9\u540d\u79f0\u5305\u542b SMAPI-Android \u7684\u5b89\u5353\u7248\u672c ZIP \u6587\u4ef6\uff1a"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw p0

    :goto_6
    goto :goto_5
.end method

.method private static installInBackground(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 2

    .line 75
    const-string v0, "\u6b63\u5728\u5b89\u88c5 SMAPI..."

    invoke-static {p0, v0}, Lcom/libala/smapi/SmapiZipInstallHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 76
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/libala/smapi/SmapiZipInstallHelper$2;

    invoke-direct {v1, p0, p1}, Lcom/libala/smapi/SmapiZipInstallHelper$2;-><init>(Landroid/app/Activity;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 101
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 102
    return-void
.end method

.method private static isSafeRelativePath(Ljava/lang/String;)Z
    .locals 5

    .line 180
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, ":"

    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "//"

    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    .line 182
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 183
    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v3, p0, v2

    .line 184
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, ".."

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 183
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 185
    :cond_2
    :goto_1
    return v1

    .line 187
    :cond_3
    const/4 p0, 0x1

    return p0

    .line 181
    :cond_4
    :goto_2
    return v1
.end method

.method public static onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    .locals 1

    .line 52
    const v0, 0xee4e

    if-eq p1, v0, :cond_0

    .line 53
    const/4 p0, 0x0

    return p0

    .line 54
    :cond_0
    const/4 p1, -0x1

    const/4 v0, 0x1

    if-ne p2, p1, :cond_2

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/libala/smapi/SmapiZipInstallHelper;->installInBackground(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 58
    return v0

    .line 55
    :cond_2
    :goto_0
    return v0
.end method

.method private static pickZip(Landroid/app/Activity;)V
    .locals 5

    .line 63
    const-string v0, "application/zip"

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 64
    const-string v2, "android.intent.category.OPENABLE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    const-string v2, "android.intent.extra.MIME_TYPES"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const-string v0, "application/octet-stream"

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const-string v0, "*/*"

    const/4 v4, 0x2

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    const-string v0, "\u8bf7\u9009\u62e9 Android \u7248 SMAPI ZIP"

    invoke-static {v1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const v1, 0xee4e

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    invoke-static {p0, v0}, Lcom/libala/smapi/SmapiZipInstallHelper;->writeInstallError(Landroid/app/Activity;Ljava/lang/Throwable;)V

    .line 70
    const-string v1, "\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668\u5931\u8d25"

    invoke-static {p0, v1, v0}, Lcom/libala/smapi/SmapiZipInstallHelper;->showError(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    :goto_0
    return-void
.end method

.method private static queryDisplayName(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
    .locals 7

    .line 191
    nop

    .line 193
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 194
    if-eqz p0, :cond_1

    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 195
    const-string p1, "_display_name"

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    .line 196
    if-ltz p1, :cond_1

    .line 197
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    if-eqz p0, :cond_0

    .line 202
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 197
    :cond_0
    return-object p1

    .line 199
    :catchall_0
    move-exception p1

    goto :goto_0

    .line 201
    :cond_1
    if-eqz p0, :cond_2

    .line 202
    goto :goto_1

    .line 199
    :catchall_1
    move-exception p0

    move-object p0, v0

    .line 201
    :goto_0
    if-eqz p0, :cond_2

    .line 202
    :goto_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 204
    :cond_2
    return-object v0
.end method

.method private static runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 1

    .line 245
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p0, v0, :cond_0

    .line 246
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 248
    :cond_0
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 249
    :goto_0
    return-void
.end method

.method private static show(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 236
    new-instance v0, Lcom/libala/smapi/SmapiZipInstallHelper$3;

    invoke-direct {v0, p0, p1}, Lcom/libala/smapi/SmapiZipInstallHelper$3;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/libala/smapi/SmapiZipInstallHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 242
    return-void
.end method

.method private static showError(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 228
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 229
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 230
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 231
    const-string p1, "\u786e\u5b9a"

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 232
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 233
    return-void
.end method

.method private static stripTopFolder(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 171
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 173
    :cond_0
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 174
    if-ltz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 176
    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 175
    :cond_2
    :goto_0
    return-object v1

    .line 172
    :cond_3
    :goto_1
    return-object v1
.end method

.method public static wireInstallButton(Landroid/app/Activity;)V
    .locals 4

    .line 32
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "InstallSMAPIZip"

    const-string v2, "id"

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    return-void

    .line 38
    :cond_1
    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_2

    .line 39
    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    const-string v2, "\u4ece ZIP \u5b89\u88c5 SMAPI"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    :cond_2
    new-instance v1, Lcom/libala/smapi/SmapiZipInstallHelper$1;

    invoke-direct {v1, p0}, Lcom/libala/smapi/SmapiZipInstallHelper$1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u521d\u59cb\u5316 SMAPI \u5b89\u88c5\u6309\u94ae\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/SmapiZipInstallHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 49
    :goto_0
    return-void
.end method

.method private static writeInstallError(Landroid/app/Activity;Ljava/lang/Throwable;)V
    .locals 4

    .line 209
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 210
    if-nez p0, :cond_0

    .line 211
    return-void

    .line 212
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "ErrorLogs"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 213
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result p0

    if-nez p0, :cond_1

    .line 214
    return-void

    .line 215
    :cond_1
    new-instance p0, Ljava/io/PrintWriter;

    new-instance v1, Ljava/io/FileOutputStream;

    new-instance v2, Ljava/io/File;

    const-string v3, "launcher-install-error.txt"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {v1, v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-direct {p0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 217
    :try_start_1
    const-string v0, "SMAPI ZIP install failed"

    invoke-virtual {p0, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 218
    invoke-virtual {p0}, Ljava/io/PrintWriter;->println()V

    .line 219
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    :try_start_2
    invoke-virtual {p0}, Ljava/io/PrintWriter;->close()V

    .line 222
    nop

    .line 224
    goto :goto_0

    .line 221
    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ljava/io/PrintWriter;->close()V

    .line 222
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 223
    :catchall_1
    move-exception p0

    .line 225
    :goto_0
    return-void
.end method
