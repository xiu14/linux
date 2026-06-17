.class public Lcom/github/javiersantos/licensing/LibraryChecker;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SimpleDateFormat",
        "HardwareIds"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;
    }
.end annotation


# static fields
.field public static final j:Ljava/security/SecureRandom;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/github/javiersantos/licensing/ServerManagedPolicy;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/HashSet;

.field public final f:Ljava/util/LinkedList;

.field public g:Lcom/android/vending/licensing/ILicensingService;

.field public final h:Ljava/security/PublicKey;

.field public final i:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/security/SecureRandom;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/github/javiersantos/licensing/LibraryChecker;->j:Ljava/security/SecureRandom;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/github/javiersantos/licensing/ServerManagedPolicy;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->e:Ljava/util/HashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->f:Ljava/util/LinkedList;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->a:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->b:Lcom/github/javiersantos/licensing/ServerManagedPolicy;

    .line 21
    .line 22
    const-string p2, "LibraryChecker"

    .line 23
    .line 24
    :try_start_0
    invoke-static {p3}, Lcom/github/javiersantos/licensing/util/Base64;->a(Ljava/lang/String;)[B

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    const-string v0, "RSA"

    .line 29
    .line 30
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Ljava/security/spec/X509EncodedKeySpec;

    .line 35
    .line 36
    invoke-direct {v1, p3}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 40
    .line 41
    .line 42
    move-result-object p3
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/github/javiersantos/licensing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1

    .line 43
    iput-object p3, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->h:Ljava/security/PublicKey;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    iput-object p3, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->c:Ljava/lang/String;

    .line 50
    .line 51
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p1, p3, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    goto :goto_0

    .line 67
    :catch_0
    const-string p1, "Package not found. could not get version code."

    .line 68
    .line 69
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    const-string p1, ""

    .line 73
    .line 74
    :goto_0
    iput-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->d:Ljava/lang/String;

    .line 75
    .line 76
    new-instance p1, Landroid/os/HandlerThread;

    .line 77
    .line 78
    const-string p2, "background thread"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 84
    .line 85
    .line 86
    new-instance p2, Landroid/os/Handler;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 93
    .line 94
    .line 95
    iput-object p2, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->i:Landroid/os/Handler;

    .line 96
    .line 97
    return-void

    .line 98
    :catch_1
    move-exception p1

    .line 99
    goto :goto_1

    .line 100
    :catch_2
    move-exception p1

    .line 101
    goto :goto_2

    .line 102
    :catch_3
    move-exception p1

    .line 103
    goto :goto_3

    .line 104
    :goto_1
    const-string p3, "Invalid key specification."

    .line 105
    .line 106
    invoke-static {p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw p2

    .line 115
    :goto_2
    const-string p3, "Could not decode from Base64."

    .line 116
    .line 117
    invoke-static {p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw p2

    .line 126
    :goto_3
    new-instance p2, Ljava/lang/RuntimeException;

    .line 127
    .line 128
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw p2
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->b:Lcom/github/javiersantos/licensing/ServerManagedPolicy;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/github/javiersantos/licensing/ServerManagedPolicy;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "LibraryChecker"

    .line 11
    .line 12
    const-string v1, "Using cached license response"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->a()V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :catchall_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    new-instance v0, Lcom/github/javiersantos/licensing/LibraryValidator;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->b:Lcom/github/javiersantos/licensing/ServerManagedPolicy;

    .line 29
    .line 30
    new-instance v2, Lcom/github/javiersantos/licensing/NullDeviceLimiter;

    .line 31
    .line 32
    invoke-direct {v2}, Lcom/github/javiersantos/licensing/NullDeviceLimiter;-><init>()V

    .line 33
    .line 34
    .line 35
    sget-object v3, Lcom/github/javiersantos/licensing/LibraryChecker;->j:Ljava/security/SecureRandom;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/util/Random;->nextInt()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget-object v5, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->c:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v6, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->d:Ljava/lang/String;

    .line 44
    .line 45
    move-object v3, p1

    .line 46
    invoke-direct/range {v0 .. v6}, Lcom/github/javiersantos/licensing/LibraryValidator;-><init>(Lcom/github/javiersantos/licensing/ServerManagedPolicy;Lcom/github/javiersantos/licensing/NullDeviceLimiter;Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;ILjava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    const-string p1, "LibraryChecker"

    .line 54
    .line 55
    const-string v1, "Binding to licensing service."

    .line 56
    .line 57
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->a:Landroid/content/Context;

    .line 61
    .line 62
    new-instance v1, Landroid/content/Intent;

    .line 63
    .line 64
    new-instance v2, Ljava/lang/String;

    .line 65
    .line 66
    const-string v4, "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="

    .line 67
    .line 68
    invoke-static {v4}, Lcom/github/javiersantos/licensing/util/Base64;->a(Ljava/lang/String;)[B

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-direct {v2, v4}, Ljava/lang/String;-><init>([B)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, Ljava/lang/String;

    .line 79
    .line 80
    const-string v4, "Y29tLmFuZHJvaWQudmVuZGluZw=="

    .line 81
    .line 82
    invoke-static {v4}, Lcom/github/javiersantos/licensing/util/Base64;->a(Ljava/lang/String;)[B

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-direct {v2, v4}, Ljava/lang/String;-><init>([B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const/4 v2, 0x1

    .line 94
    invoke-virtual {p1, v1, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_1

    .line 99
    .line 100
    iget-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->f:Ljava/util/LinkedList;

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catch_0
    move-exception v0

    .line 107
    move-object p1, v0

    .line 108
    goto :goto_0

    .line 109
    :cond_1
    const-string p1, "LibraryChecker"

    .line 110
    .line 111
    const-string v1, "Could not bind to service."

    .line 112
    .line 113
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/github/javiersantos/licensing/LibraryChecker;->d(Lcom/github/javiersantos/licensing/LibraryValidator;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/github/javiersantos/licensing/util/Base64DecoderException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catch_1
    const/4 p1, 0x6

    .line 125
    invoke-virtual {v3, p1}, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->b(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    iget-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->f:Ljava/util/LinkedList;

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/github/javiersantos/licensing/LibraryChecker;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    .line 137
    :goto_1
    monitor-exit p0

    .line 138
    return-void

    .line 139
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    throw p1
.end method

.method public final declared-synchronized b()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->e:Ljava/util/HashSet;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/github/javiersantos/licensing/LibraryValidator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    :try_start_1
    invoke-virtual {p0, v1}, Lcom/github/javiersantos/licensing/LibraryChecker;->c(Lcom/github/javiersantos/licensing/LibraryValidator;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->f:Ljava/util/LinkedList;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :catch_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lcom/github/javiersantos/licensing/LibraryValidator;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    :try_start_3
    iget-object v2, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->f:Ljava/util/LinkedList;

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 53
    throw v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final declared-synchronized c(Lcom/github/javiersantos/licensing/LibraryValidator;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->e:Ljava/util/HashSet;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->e:Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    :try_start_1
    iget-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    :try_start_2
    const-string p1, "LibraryChecker"

    .line 26
    .line 27
    const-string v0, "Unable to unbind from licensing service (already unbound)"

    .line 28
    .line 29
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :goto_0
    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    :cond_0
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 39
    throw p1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final declared-synchronized d(Lcom/github/javiersantos/licensing/LibraryValidator;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->b:Lcom/github/javiersantos/licensing/ServerManagedPolicy;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, 0xc48

    .line 6
    .line 7
    invoke-virtual {v0, v2, v1}, Lcom/github/javiersantos/licensing/ServerManagedPolicy;->b(ILcom/github/javiersantos/licensing/ResponseData;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->b:Lcom/github/javiersantos/licensing/ServerManagedPolicy;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/github/javiersantos/licensing/ServerManagedPolicy;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p1, p1, Lcom/github/javiersantos/licensing/LibraryValidator;->b:Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->a()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object p1, p1, Lcom/github/javiersantos/licensing/LibraryValidator;->b:Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :goto_0
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1
    .line 35
    .line 36
    .line 37
.end method

.method public final e()V
    .locals 7

    .line 1
    const-string v0, "LibraryChecker"

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->f:Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/github/javiersantos/licensing/LibraryValidator;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "Calling checkLicense on service for "

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v3, v1, Lcom/github/javiersantos/licensing/LibraryValidator;->d:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;

    .line 36
    .line 37
    iget v3, v1, Lcom/github/javiersantos/licensing/LibraryValidator;->c:I

    .line 38
    .line 39
    int-to-long v3, v3

    .line 40
    iget-object v5, v1, Lcom/github/javiersantos/licensing/LibraryValidator;->d:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v6, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;

    .line 43
    .line 44
    invoke-direct {v6, p0, v1}, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;-><init>(Lcom/github/javiersantos/licensing/LibraryChecker;Lcom/github/javiersantos/licensing/LibraryValidator;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, v3, v4, v5, v6}, Lcom/android/vending/licensing/ILicensingService;->f0(JLjava/lang/String;Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->e:Ljava/util/HashSet;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v2

    .line 57
    const-string v3, "RemoteException in checkLicense call."

    .line 58
    .line 59
    invoke-static {v0, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lcom/github/javiersantos/licensing/LibraryChecker;->d(Lcom/github/javiersantos/licensing/LibraryValidator;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget p1, Lr3/c;->c:I

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p1, "com.android.vending.licensing.ILicensingService"

    .line 9
    .line 10
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    instance-of v0, p1, Lcom/android/vending/licensing/ILicensingService;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p1, Lcom/android/vending/licensing/ILicensingService;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance p1, Lr3/b;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p2, p1, Lr3/b;->c:Landroid/os/IBinder;

    .line 29
    .line 30
    :goto_0
    iput-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/github/javiersantos/licensing/LibraryChecker;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final declared-synchronized onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string p1, "LibraryChecker"

    .line 3
    .line 4
    const-string v0, "Service unexpectedly disconnected."

    .line 5
    .line 6
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
