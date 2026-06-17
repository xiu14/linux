.class public final Lcom/libala/smapi/ModArchiveInstallHelper;
.super Ljava/lang/Object;
.source "ModArchiveInstallHelper.java"


# static fields
.field private static final REQUEST_INSTALL_MOD:I = 0x5a42

.field private static final SUPPORTED_EXTENSIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 39
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, ".zip"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ".rar"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/libala/smapi/ModArchiveInstallHelper;->SUPPORTED_EXTENSIONS:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/app/Activity;)V
    .locals 0

    .line 37
    invoke-static {p0}, Lcom/libala/smapi/ModArchiveInstallHelper;->wireInstallModButtonNow(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$100(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 37
    invoke-static {p0, p1}, Lcom/libala/smapi/ModArchiveInstallHelper;->getDisplayName(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 37
    invoke-static {p0, p1, p2}, Lcom/libala/smapi/ModArchiveInstallHelper;->installOne(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static synthetic access$300(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 37
    invoke-static {p0}, Lcom/libala/smapi/ModArchiveInstallHelper;->shortMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Ljava/util/List;)Ljava/lang/String;
    .locals 0

    .line 37
    invoke-static {p0}, Lcom/libala/smapi/ModArchiveInstallHelper;->joinLines(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    .line 37
    invoke-static {p0, p1}, Lcom/libala/smapi/ModArchiveInstallHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static addOverlayInstallButton(Landroid/app/Activity;)V
    .locals 5

    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 86
    instance-of v1, v0, Landroid/view/ViewGroup;

    const-string v2, "libala_install_mod_overlay"

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0, v2}, Lcom/libala/smapi/ModArchiveInstallHelper;->hasTaggedView(Landroid/view/ViewGroup;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    return-void

    .line 89
    :cond_0
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 90
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 91
    const-string v1, "\u5bfc\u5165 MOD"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 92
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setAllCaps(Z)V

    .line 93
    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 94
    const/16 v2, 0x7d

    const/16 v3, 0x32

    const/16 v4, 0x2e

    invoke-static {v4, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 95
    const/16 v2, 0x34

    invoke-static {p0, v2}, Lcom/libala/smapi/ModArchiveInstallHelper;->dp(Landroid/app/Activity;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setMinHeight(I)V

    .line 96
    const/16 v2, 0x12

    invoke-static {p0, v2}, Lcom/libala/smapi/ModArchiveInstallHelper;->dp(Landroid/app/Activity;I)I

    move-result v3

    invoke-static {p0, v2}, Lcom/libala/smapi/ModArchiveInstallHelper;->dp(Landroid/app/Activity;I)I

    move-result v2

    invoke-virtual {v0, v3, v1, v2, v1}, Landroid/widget/Button;->setPadding(IIII)V

    .line 97
    const/16 v1, 0x18

    invoke-static {p0, v1}, Lcom/libala/smapi/ModArchiveInstallHelper;->dp(Landroid/app/Activity;I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setElevation(F)V

    .line 98
    invoke-static {p0, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->configureInstallButton(Landroid/app/Activity;Landroid/view/View;)V

    .line 100
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 101
    const/16 v2, 0xb4

    invoke-static {p0, v2}, Lcom/libala/smapi/ModArchiveInstallHelper;->dp(Landroid/app/Activity;I)I

    move-result v2

    const/4 v3, -0x2

    const v4, 0x800053

    invoke-direct {v1, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 105
    const/16 v2, 0x20

    invoke-static {p0, v2}, Lcom/libala/smapi/ModArchiveInstallHelper;->dp(Landroid/app/Activity;I)I

    move-result v2

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 106
    const/16 v2, 0x14

    invoke-static {p0, v2}, Lcom/libala/smapi/ModArchiveInstallHelper;->dp(Landroid/app/Activity;I)I

    move-result v2

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 107
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    invoke-virtual {v0}, Landroid/widget/Button;->bringToFront()V

    .line 109
    return-void
.end method

.method private static configureInstallButton(Landroid/app/Activity;Landroid/view/View;)V
    .locals 2

    .line 74
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 75
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "\u5bfc\u5165 MOD"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    :cond_0
    new-instance v0, Lcom/libala/smapi/ModArchiveInstallHelper$2;

    invoke-direct {v0, p0}, Lcom/libala/smapi/ModArchiveInstallHelper$2;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    return-void
.end method

.method private static copyDirectory(Ljava/io/File;Ljava/io/File;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 405
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 406
    return-void

    .line 407
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    const-string v1, "\u65e0\u6cd5\u521b\u5efa\u76ee\u5f55\uff1a"

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 408
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 409
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    .line 410
    if-nez p0, :cond_3

    .line 411
    return-void

    .line 412
    :cond_3
    array-length v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_9

    aget-object v4, p0, v3

    .line 413
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, p1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 414
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 415
    invoke-static {v4, v5}, Lcom/libala/smapi/ModArchiveInstallHelper;->copyDirectory(Ljava/io/File;Ljava/io/File;)V

    goto :goto_4

    .line 416
    :cond_4
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 417
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    .line 418
    if-eqz v6, :cond_6

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    .line 419
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 420
    :cond_6
    :goto_2
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 421
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v5, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 423
    const/high16 v5, 0x10000

    :try_start_0
    new-array v5, v5, [B

    .line 425
    :goto_3
    invoke-virtual {v6, v5}, Ljava/io/FileInputStream;->read([B)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_7

    .line 426
    invoke-virtual {v4, v5, v2, v7}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 428
    :cond_7
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 429
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    .line 430
    goto :goto_4

    .line 428
    :catchall_0
    move-exception p0

    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 429
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    .line 430
    throw p0

    .line 412
    :cond_8
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 433
    :cond_9
    return-void
.end method

.method private static copyUriToFile(Landroid/app/Activity;Landroid/net/Uri;Ljava/io/File;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 346
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0

    .line 347
    if-eqz p0, :cond_3

    .line 349
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    .line 350
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 351
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u521b\u5efa\u7f13\u5b58\u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 352
    :cond_1
    :goto_0
    new-instance p1, Ljava/io/FileOutputStream;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 354
    const/high16 p2, 0x10000

    :try_start_0
    new-array p2, p2, [B

    .line 356
    :goto_1
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 357
    invoke-virtual {p1, p2, v0, v1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 359
    :cond_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 360
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 361
    nop

    .line 362
    return-void

    .line 359
    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 360
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 361
    throw p2

    .line 348
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u8bfb\u53d6\u9009\u62e9\u7684\u6587\u4ef6"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method

.method private static deleteRecursive(Ljava/io/File;)V
    .locals 4

    .line 436
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 438
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 439
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    .line 440
    if-eqz v0, :cond_1

    .line 441
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 442
    invoke-static {v3}, Lcom/libala/smapi/ModArchiveInstallHelper;->deleteRecursive(Ljava/io/File;)V

    .line 441
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 445
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 446
    return-void

    .line 437
    :cond_2
    :goto_1
    return-void
.end method

.method private static dp(Landroid/app/Activity;I)I
    .locals 0

    .line 123
    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method private static extractRar(Ljava/io/File;Ljava/io/File;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 299
    new-instance v0, Lcom/github/junrar/Archive;

    invoke-direct {v0, p0}, Lcom/github/junrar/Archive;-><init>(Ljava/io/File;)V

    .line 301
    :try_start_0
    invoke-virtual {v0}, Lcom/github/junrar/Archive;->isEncrypted()Z

    move-result p0

    if-nez p0, :cond_6

    invoke-virtual {v0}, Lcom/github/junrar/Archive;->isPasswordProtected()Z

    move-result p0

    if-nez p0, :cond_6

    .line 303
    const/high16 p0, 0x10000

    new-array p0, p0, [B

    .line 304
    invoke-virtual {v0}, Lcom/github/junrar/Archive;->getFileHeaders()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/junrar/rarfile/FileHeader;

    .line 305
    invoke-virtual {v2}, Lcom/github/junrar/rarfile/FileHeader;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 306
    goto :goto_0

    .line 307
    :cond_0
    invoke-virtual {v2}, Lcom/github/junrar/rarfile/FileHeader;->isEncrypted()Z

    move-result v3

    if-nez v3, :cond_4

    .line 309
    invoke-virtual {v2}, Lcom/github/junrar/rarfile/FileHeader;->getFileNameString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/libala/smapi/ModArchiveInstallHelper;->safeOutputFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 310
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    .line 311
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    .line 312
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u65e0\u6cd5\u521b\u5efa\u76ee\u5f55\uff1a"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 313
    :cond_2
    :goto_1
    invoke-virtual {v0, v2}, Lcom/github/junrar/Archive;->getInputStream(Lcom/github/junrar/rarfile/FileHeader;)Ljava/io/InputStream;

    move-result-object v2

    .line 314
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 317
    :goto_2
    :try_start_1
    invoke-virtual {v2, p0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v5, -0x1

    if-eq v3, v5, :cond_3

    .line 318
    const/4 v5, 0x0

    invoke-virtual {v4, p0, v5, v3}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 320
    :cond_3
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 321
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 322
    nop

    .line 323
    goto :goto_0

    .line 320
    :catchall_0
    move-exception p0

    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 321
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 322
    throw p0

    .line 308
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u4e0d\u652f\u6301\u52a0\u5bc6\u6587\u4ef6\uff1a"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v2}, Lcom/github/junrar/rarfile/FileHeader;->getFileNameString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 325
    :cond_5
    invoke-virtual {v0}, Lcom/github/junrar/Archive;->close()V

    .line 326
    nop

    .line 327
    return-void

    .line 302
    :cond_6
    :try_start_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u4e0d\u652f\u6301\u52a0\u5bc6\u6216\u5e26\u5bc6\u7801\u7684 RAR"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 325
    :catchall_1
    move-exception p0

    invoke-virtual {v0}, Lcom/github/junrar/Archive;->close()V

    .line 326
    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method

.method private static extractZip(Ljava/io/File;Ljava/io/File;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 272
    new-instance v0, Ljava/util/zip/ZipInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 275
    const/high16 p0, 0x10000

    :try_start_0
    new-array p0, p0, [B

    .line 276
    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 277
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 278
    goto :goto_0

    .line 279
    :cond_0
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/libala/smapi/ModArchiveInstallHelper;->safeOutputFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 280
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 281
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 282
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u65e0\u6cd5\u521b\u5efa\u76ee\u5f55\uff1a"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 283
    :cond_2
    :goto_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 286
    :goto_2
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_3

    .line 287
    const/4 v3, 0x0

    invoke-virtual {v2, p0, v3, v1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 289
    :cond_3
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 290
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 291
    nop

    .line 292
    goto :goto_0

    .line 289
    :catchall_0
    move-exception p0

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 290
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 291
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 294
    :cond_4
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V

    .line 295
    nop

    .line 296
    return-void

    .line 294
    :catchall_1
    move-exception p0

    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V

    .line 295
    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method

.method private static findManifestFiles(Ljava/io/File;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .line 365
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    .line 366
    if-nez p0, :cond_0

    .line 367
    return-void

    .line 368
    :cond_0
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v2, p0, v1

    .line 369
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 370
    invoke-static {v2, p1}, Lcom/libala/smapi/ModArchiveInstallHelper;->findManifestFiles(Ljava/io/File;Ljava/util/List;)V

    goto :goto_1

    .line 371
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "manifest.json"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 372
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 368
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 374
    :cond_3
    return-void
.end method

.method private static getDisplayName(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
    .locals 7

    .line 461
    nop

    .line 463
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

    move-result-object v0

    .line 464
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 465
    const-string p0, "_display_name"

    invoke-interface {v0, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p0

    .line 466
    if-ltz p0, :cond_1

    .line 467
    invoke-interface {v0, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 468
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v1, :cond_1

    .line 469
    nop

    .line 474
    if-eqz v0, :cond_0

    .line 475
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 469
    :cond_0
    return-object p0

    .line 474
    :cond_1
    if-eqz v0, :cond_2

    .line 475
    goto :goto_0

    .line 472
    :catchall_0
    move-exception p0

    .line 474
    if-eqz v0, :cond_2

    .line 475
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 477
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p0

    .line 478
    if-nez p0, :cond_3

    const-string p0, "selected-archive"

    :cond_3
    return-object p0
.end method

.method private static hasTaggedView(Landroid/view/ViewGroup;Ljava/lang/Object;)Z
    .locals 5

    .line 112
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 113
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 114
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 115
    return v4

    .line 116
    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lcom/libala/smapi/ModArchiveInstallHelper;->hasTaggedView(Landroid/view/ViewGroup;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 117
    return v4

    .line 112
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 119
    :cond_2
    return v0
.end method

.method private static installInBackground(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/ArrayList<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    .line 169
    const-string v0, "\u6b63\u5728\u5b89\u88c5 MOD..."

    invoke-static {p0, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 170
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/libala/smapi/ModArchiveInstallHelper$3;

    invoke-direct {v1, p1, p0}, Lcom/libala/smapi/ModArchiveInstallHelper$3;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 199
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 200
    return-void
.end method

.method private static installOne(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;)I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 203
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 204
    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    .line 205
    const-string v3, ".rar"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    .line 206
    if-nez v2, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\u53ea\u652f\u6301 ZIP \u6216 RAR \u6587\u4ef6"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 209
    :cond_1
    :goto_0
    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 210
    if-eqz v4, :cond_11

    .line 213
    new-instance v5, Ljava/io/File;

    const-string v6, "Cache/ModImport"

    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 214
    new-instance v6, Ljava/io/File;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 215
    new-instance v7, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "selected-"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    if-eqz v0, :cond_2

    move-object v1, v3

    :cond_2
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 216
    invoke-static {v6}, Lcom/libala/smapi/ModArchiveInstallHelper;->deleteRecursive(Ljava/io/File;)V

    .line 217
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 219
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 220
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u521b\u5efa\u7f13\u5b58\u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 223
    :cond_4
    :goto_1
    :try_start_0
    invoke-static {p0, p1, v7}, Lcom/libala/smapi/ModArchiveInstallHelper;->copyUriToFile(Landroid/app/Activity;Landroid/net/Uri;Ljava/io/File;)V

    .line 224
    if-eqz v2, :cond_5

    .line 225
    invoke-static {v7, v6}, Lcom/libala/smapi/ModArchiveInstallHelper;->extractZip(Ljava/io/File;Ljava/io/File;)V

    goto :goto_2

    .line 227
    :cond_5
    invoke-static {v7, v6}, Lcom/libala/smapi/ModArchiveInstallHelper;->extractRar(Ljava/io/File;Ljava/io/File;)V

    .line 229
    :goto_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 230
    invoke-static {v6, p0}, Lcom/libala/smapi/ModArchiveInstallHelper;->findManifestFiles(Ljava/io/File;Ljava/util/List;)V

    .line 231
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_e

    .line 234
    new-instance p1, Ljava/io/File;

    const-string v0, "Mods"

    invoke-direct {p1, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 235
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    .line 236
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u521b\u5efa Mods \u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 238
    :cond_7
    :goto_3
    new-instance v0, Ljava/io/File;

    const-string v1, "manifest.json"

    invoke-direct {v0, v6, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 239
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 240
    invoke-static {p2}, Lcom/libala/smapi/ModArchiveInstallHelper;->stripExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/libala/smapi/ModArchiveInstallHelper;->readUniqueId(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/libala/smapi/ModArchiveInstallHelper;->safeFolderName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 241
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->copyDirectory(Ljava/io/File;Ljava/io/File;)V

    .line 242
    goto :goto_5

    .line 243
    :cond_8
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    .line 244
    const/4 v0, 0x0

    if-nez p2, :cond_9

    .line 245
    new-array p2, v0, [Ljava/io/File;

    .line 246
    :cond_9
    new-instance v1, Lcom/libala/smapi/ModArchiveInstallHelper$4;

    invoke-direct {v1}, Lcom/libala/smapi/ModArchiveInstallHelper$4;-><init>()V

    invoke-static {p2, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 252
    nop

    .line 253
    array-length v1, p2

    const/4 v2, 0x0

    :goto_4
    if-ge v0, v1, :cond_b

    aget-object v3, p2, v0

    .line 254
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_a

    .line 255
    new-instance v4, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v3, v4}, Lcom/libala/smapi/ModArchiveInstallHelper;->copyDirectory(Ljava/io/File;Ljava/io/File;)V

    .line 256
    add-int/lit8 v2, v2, 0x1

    .line 253
    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 259
    :cond_b
    if-eqz v2, :cond_d

    .line 263
    :goto_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 265
    invoke-static {v6}, Lcom/libala/smapi/ModArchiveInstallHelper;->deleteRecursive(Ljava/io/File;)V

    .line 266
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 267
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 263
    :cond_c
    return p0

    .line 260
    :cond_d
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u538b\u7f29\u5305\u5185\u6ca1\u6709\u53ef\u5b89\u88c5\u7684 MOD \u6587\u4ef6\u5939"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 232
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u538b\u7f29\u5305\u5185\u6ca1\u6709 manifest.json"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    :catchall_0
    move-exception p0

    invoke-static {v6}, Lcom/libala/smapi/ModArchiveInstallHelper;->deleteRecursive(Ljava/io/File;)V

    .line 266
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 267
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 268
    :cond_f
    throw p0

    .line 218
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u521b\u5efa\u4e34\u65f6\u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 211
    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\u65e0\u6cd5\u83b7\u53d6\u542f\u52a8\u5668\u6570\u636e\u76ee\u5f55"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw p0

    :goto_7
    goto :goto_6
.end method

.method private static joinLines(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 489
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 490
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 491
    if-lez v1, :cond_0

    .line 492
    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 493
    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 495
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    .locals 2

    .line 127
    const/16 v0, 0x5a42

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    .line 128
    return v1

    .line 129
    :cond_0
    const/4 p1, -0x1

    const/4 v0, 0x1

    if-ne p2, p1, :cond_6

    if-nez p3, :cond_1

    goto :goto_2

    .line 132
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    invoke-virtual {p3}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 134
    invoke-virtual {p3}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object p2

    .line 135
    nop

    :goto_0
    invoke-virtual {p2}, Landroid/content/ClipData;->getItemCount()I

    move-result p3

    if-ge v1, p3, :cond_4

    .line 136
    invoke-virtual {p2, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object p3

    .line 137
    if-eqz p3, :cond_2

    .line 138
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 140
    :cond_3
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 141
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 140
    :cond_4
    nop

    .line 143
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    .line 144
    invoke-static {p0, p1}, Lcom/libala/smapi/ModArchiveInstallHelper;->installInBackground(Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 145
    :cond_5
    return v0

    .line 130
    :cond_6
    :goto_2
    return v0
.end method

.method private static readAllBytes(Ljava/io/File;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 388
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 390
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v1

    long-to-int p0, v1

    new-array v1, p0, [B

    .line 391
    const/4 v2, 0x0

    .line 392
    :goto_0
    if-ge v2, p0, :cond_1

    .line 393
    sub-int v3, p0, v2

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/FileInputStream;->read([BII)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 394
    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    .line 395
    goto :goto_1

    .line 396
    :cond_0
    add-int/2addr v2, v3

    .line 397
    goto :goto_0

    .line 398
    :cond_1
    :goto_1
    nop

    .line 400
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 398
    return-object v1

    .line 400
    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 401
    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method

.method private static readUniqueId(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 378
    :try_start_0
    invoke-static {p0}, Lcom/libala/smapi/ModArchiveInstallHelper;->readAllBytes(Ljava/io/File;)[B

    move-result-object p0

    .line 379
    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, p0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 380
    const-string p0, "UniqueID"

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 381
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    move-object p1, p0

    :cond_0
    return-object p1

    .line 382
    :catchall_0
    move-exception p0

    .line 383
    return-object p1
.end method

.method private static runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    .line 508
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 509
    return-void
.end method

.method private static safeFolderName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 449
    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 450
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 451
    const-string p0, "ImportedMod"

    .line 452
    :cond_1
    const-string v0, "[\\\\/:*?\"<>|]"

    const-string v1, "_"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static safeOutputFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 330
    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    const/16 v0, 0x5c

    const/16 v1, 0x2f

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 331
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "\u538b\u7f29\u5305\u5305\u542b\u4e0d\u5b89\u5168\u8def\u5f84\uff1a"

    if-eqz v1, :cond_4

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v3, v3

    if-eqz v3, :cond_4

    .line 333
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 334
    array-length v3, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    aget-object v5, v1, v4

    .line 335
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, ".."

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 334
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 336
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 338
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 339
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p0

    .line 340
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 342
    return-object p0

    .line 341
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 332
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method

.method private static shortMessage(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 482
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 483
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 484
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 485
    :cond_1
    return-object v0
.end method

.method private static show(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 499
    new-instance v0, Lcom/libala/smapi/ModArchiveInstallHelper$5;

    invoke-direct {v0, p0, p1}, Lcom/libala/smapi/ModArchiveInstallHelper$5;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->runOnUi(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 505
    return-void
.end method

.method public static startInstall(Landroid/app/Activity;)V
    .locals 7

    .line 150
    const-string v0, "*/*"

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 151
    const-string v2, "android.intent.category.OPENABLE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 154
    const-string v2, "android.intent.extra.MIME_TYPES"

    const/4 v4, 0x6

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "application/zip"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "application/x-zip-compressed"

    aput-object v5, v4, v3

    const-string v3, "application/vnd.rar"

    const/4 v5, 0x2

    aput-object v3, v4, v5

    const-string v3, "application/x-rar-compressed"

    const/4 v5, 0x3

    aput-object v3, v4, v5

    const-string v3, "application/octet-stream"

    const/4 v5, 0x4

    aput-object v3, v4, v5

    const/4 v3, 0x5

    aput-object v0, v4, v3

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    const-string v0, "\u8bf7\u9009\u62e9 MOD \u538b\u7f29\u5305\uff08ZIP/RAR\uff09"

    invoke-static {v1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x5a42

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    goto :goto_0

    .line 163
    :catchall_0
    move-exception v0

    .line 164
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

    invoke-static {p0, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 166
    :goto_0
    return-void
.end method

.method private static stripExtension(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 456
    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 457
    if-lez v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static wireInstallModButton(Landroid/app/Activity;)V
    .locals 3

    .line 45
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 46
    new-instance v1, Lcom/libala/smapi/ModArchiveInstallHelper$1;

    invoke-direct {v1, p0}, Lcom/libala/smapi/ModArchiveInstallHelper$1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u521d\u59cb\u5316 MOD \u5b89\u88c5\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 55
    :goto_0
    return-void
.end method

.method private static wireInstallModButtonNow(Landroid/app/Activity;)V
    .locals 4

    .line 59
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "InstallModBtn"

    const-string v2, "id"

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 60
    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 61
    :goto_0
    if-eqz v0, :cond_1

    .line 62
    invoke-static {p0, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->configureInstallButton(Landroid/app/Activity;Landroid/view/View;)V

    .line 63
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ModManagerActivity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    invoke-static {p0}, Lcom/libala/smapi/ModArchiveInstallHelper;->addOverlayInstallButton(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    :cond_2
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u521d\u59cb\u5316 MOD \u5b89\u88c5\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->show(Landroid/app/Activity;Ljava/lang/String;)V

    .line 71
    :goto_1
    return-void
.end method
