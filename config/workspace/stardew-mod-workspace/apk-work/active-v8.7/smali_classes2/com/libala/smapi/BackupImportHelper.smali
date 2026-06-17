.class public final Lcom/libala/smapi/BackupImportHelper;
.super Ljava/lang/Object;
.source "BackupImportHelper.java"


# static fields
.field private static final ALLOWED_TOP_FOLDERS:[Ljava/lang/String;

.field private static final REQUEST_IMPORT_BACKUP:I = 0xee4c


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 23
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "Mods"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "Saves"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/libala/smapi/BackupImportHelper;->ALLOWED_TOP_FOLDERS:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 0

    .line 21
    invoke-static {p0, p1}, Lcom/libala/smapi/BackupImportHelper;->importInBackground(Landroid/app/Activity;Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic access$100(Landroid/app/Activity;Landroid/net/Uri;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 21
    invoke-static {p0, p1}, Lcom/libala/smapi/BackupImportHelper;->importBackup(Landroid/app/Activity;Landroid/net/Uri;)I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    .line 21
    invoke-static {p0, p1}, Lcom/libala/smapi/BackupImportHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static importBackup(Landroid/app/Activity;Landroid/net/Uri;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 113
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 114
    if-eqz v0, :cond_8

    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 117
    nop

    .line 119
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    .line 120
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0

    .line 121
    if-eqz p0, :cond_7

    .line 124
    const/high16 p1, 0x10000

    new-array p1, p1, [B

    .line 125
    new-instance v2, Ljava/util/zip/ZipInputStream;

    invoke-direct {v2, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p0, 0x0

    const/4 v3, 0x0

    .line 128
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 129
    invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 130
    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x5c

    const/16 v6, 0x2f

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    .line 133
    invoke-static {v4}, Lcom/libala/smapi/BackupImportHelper;->isAllowedEntry(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 134
    goto :goto_0

    .line 136
    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 137
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v6

    .line 138
    invoke-virtual {v6, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 141
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    .line 142
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    .line 143
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u65e0\u6cd5\u521b\u5efa\u76ee\u5f55\uff1a"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 145
    :cond_3
    :goto_1
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v5, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 148
    :goto_2
    :try_start_1
    invoke-virtual {v2, p1}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_4

    .line 149
    invoke-virtual {v4, p1, p0, v5}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 151
    :cond_4
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 152
    nop

    .line 153
    add-int/lit8 v3, v3, 0x1

    .line 154
    goto :goto_0

    .line 151
    :catchall_0
    move-exception p0

    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 152
    throw p0

    .line 139
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u5907\u4efd ZIP \u4e2d\u5305\u542b\u4e0d\u5b89\u5168\u8def\u5f84\uff1a"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 156
    :cond_6
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V

    .line 157
    nop

    .line 158
    return v3

    .line 156
    :catchall_1
    move-exception p0

    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V

    .line 157
    throw p0

    .line 122
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u8bfb\u53d6\u9009\u62e9\u7684 ZIP \u6587\u4ef6"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 115
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u83b7\u53d6\u542f\u52a8\u5668\u6570\u636e\u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method

.method private static importInBackground(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 2

    .line 80
    const-string v0, "\u6b63\u5728\u5bfc\u5165\u5907\u4efd..."

    invoke-static {p0, v0}, Lcom/libala/smapi/BackupImportHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 81
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/libala/smapi/BackupImportHelper$3;

    invoke-direct {v1, p0, p1}, Lcom/libala/smapi/BackupImportHelper$3;-><init>(Landroid/app/Activity;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 109
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 110
    return-void
.end method

.method private static isAllowedEntry(Ljava/lang/String;)Z
    .locals 6

    .line 162
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, ":"

    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "//"

    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    .line 164
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 165
    array-length v0, p0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    .line 166
    return v1

    .line 167
    :cond_1
    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v3, p0, v2

    .line 168
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, ".."

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 167
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 169
    :cond_3
    :goto_1
    return v1

    .line 171
    :cond_4
    aget-object p0, p0, v1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 172
    sget-object v0, Lcom/libala/smapi/BackupImportHelper;->ALLOWED_TOP_FOLDERS:[Ljava/lang/String;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_6

    aget-object v4, v0, v3

    .line 173
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 174
    const/4 p0, 0x1

    return p0

    .line 172
    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 176
    :cond_6
    return v1

    .line 163
    :cond_7
    :goto_3
    return v1
.end method

.method public static onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    .locals 1

    .line 59
    const v0, 0xee4c

    if-eq p1, v0, :cond_0

    .line 60
    const/4 p0, 0x0

    return p0

    .line 61
    :cond_0
    const/4 p1, -0x1

    const/4 v0, 0x1

    if-ne p2, p1, :cond_2

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    .line 65
    new-instance p2, Landroid/app/AlertDialog$Builder;

    invoke-direct {p2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 66
    const-string p3, "\u5bfc\u5165\u5b8c\u6574\u5907\u4efd"

    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p2

    .line 67
    const-string p3, "\u5c06\u6062\u590d\u5907\u4efd ZIP \u91cc\u7684 Mods \u548c Saves\u3002\n\n\u540c\u540d MOD\u3001\u914d\u7f6e\u548c\u5b58\u6863\u4f1a\u88ab\u8986\u76d6\u3002\u5efa\u8bae\u53ea\u5728\u6d4b\u8bd5\u542f\u52a8\u5668\u4e2d\u64cd\u4f5c\u3002"

    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p2

    new-instance p3, Lcom/libala/smapi/BackupImportHelper$2;

    invoke-direct {p3, p0, p1}, Lcom/libala/smapi/BackupImportHelper$2;-><init>(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 68
    const-string p0, "\u786e\u8ba4\u5bfc\u5165"

    invoke-virtual {p2, p0, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 74
    const-string p1, "\u53d6\u6d88"

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 75
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 76
    return v0

    .line 62
    :cond_2
    :goto_0
    return v0
.end method

.method private static runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 1

    .line 189
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p0, v0, :cond_0

    .line 190
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 192
    :cond_0
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 193
    :goto_0
    return-void
.end method

.method private static show(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 180
    new-instance v0, Lcom/libala/smapi/BackupImportHelper$4;

    invoke-direct {v0, p0, p1}, Lcom/libala/smapi/BackupImportHelper$4;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/libala/smapi/BackupImportHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 186
    return-void
.end method

.method public static startImport(Landroid/app/Activity;)V
    .locals 5

    .line 48
    const-string v0, "application/zip"

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 49
    const-string v2, "android.intent.category.OPENABLE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 51
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

    .line 52
    const-string v0, "\u8bf7\u9009\u62e9\u5907\u4efd ZIP"

    invoke-static {v1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const v1, 0xee4c

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/BackupImportHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 56
    :goto_0
    return-void
.end method

.method public static wireImportButton(Landroid/app/Activity;)V
    .locals 4

    .line 29
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "ImportBackup"

    const-string v2, "id"

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    return-void

    .line 35
    :cond_1
    new-instance v1, Lcom/libala/smapi/BackupImportHelper$1;

    invoke-direct {v1, p0}, Lcom/libala/smapi/BackupImportHelper$1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u521d\u59cb\u5316\u5bfc\u5165\u6309\u94ae\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/BackupImportHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 44
    :goto_0
    return-void
.end method
