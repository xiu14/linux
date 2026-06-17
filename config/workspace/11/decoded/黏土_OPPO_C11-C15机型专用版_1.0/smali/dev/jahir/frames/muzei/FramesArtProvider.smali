.class public Ldev/jahir/frames/muzei/FramesArtProvider;
.super Lcom/google/android/apps/muzei/api/provider/MuzeiArtProvider;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final worker$delegate:Lp4/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/apps/muzei/api/provider/MuzeiArtProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La2/c;

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Ldev/jahir/frames/muzei/FramesArtProvider;->worker$delegate:Lp4/c;

    .line 16
    .line 17
    return-void
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

.method private final createShareAction(Lcom/google/android/apps/muzei/api/provider/Artwork;)Landroidx/core/app/RemoteActionCompat;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    sget v1, Ldev/jahir/frames/R$string;->share:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getString(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Landroid/content/Intent;

    .line 19
    .line 20
    const-string v3, "android.intent.action.SEND"

    .line 21
    .line 22
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v3, "text/plain"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    sget v3, Ldev/jahir/frames/R$string;->share_text:I

    .line 31
    .line 32
    iget-object v4, p1, Lcom/google/android/apps/muzei/api/provider/Artwork;->e:Ljava/lang/String;

    .line 33
    .line 34
    const-string v5, ""

    .line 35
    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    move-object v4, v5

    .line 39
    :cond_0
    iget-object p1, p1, Lcom/google/android/apps/muzei/api/provider/Artwork;->f:Ljava/lang/String;

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    move-object p1, v5

    .line 44
    :cond_1
    invoke-static {v0}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    if-nez v7, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v5, v7

    .line 56
    :goto_0
    const-string v7, "https://play.google.com/store/apps/details?id="

    .line 57
    .line 58
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const/4 v7, 0x4

    .line 63
    new-array v7, v7, [Ljava/lang/Object;

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    aput-object v4, v7, v8

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    aput-object p1, v7, v4

    .line 70
    .line 71
    const/4 p1, 0x2

    .line 72
    aput-object v6, v7, p1

    .line 73
    .line 74
    const/4 p1, 0x3

    .line 75
    aput-object v5, v7, p1

    .line 76
    .line 77
    invoke-virtual {v0, v3, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string v3, "android.intent.extra.TEXT"

    .line 82
    .line 83
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    const/high16 p1, 0x10000000

    .line 87
    .line 88
    invoke-virtual {v2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    new-instance p1, Landroidx/core/app/RemoteActionCompat;

    .line 92
    .line 93
    sget v3, Ldev/jahir/frames/R$drawable;->ic_share:I

    .line 94
    .line 95
    sget-object v4, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-static {v4, v5, v3}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    const/16 v5, 0x17

    .line 112
    .line 113
    if-lt v4, v5, :cond_3

    .line 114
    .line 115
    const/high16 v4, 0xc000000

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    const/high16 v4, 0x8000000

    .line 119
    .line 120
    :goto_1
    invoke-static {v0, v8, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p1, v3, v1, v1, v0}, Landroidx/core/app/RemoteActionCompat;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)V

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_4
    const/4 p1, 0x0

    .line 129
    return-object p1
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

.method public static synthetic d()Ldev/jahir/frames/muzei/FramesArtWorker;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/frames/muzei/FramesArtProvider;->worker_delegate$lambda$0()Ldev/jahir/frames/muzei/FramesArtWorker;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
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

.method private static final worker_delegate$lambda$0()Ldev/jahir/frames/muzei/FramesArtWorker;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/muzei/FramesArtWorker;

    .line 2
    .line 3
    invoke-direct {v0}, Ldev/jahir/frames/muzei/FramesArtWorker;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
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


# virtual methods
.method public getCommandActions(Lcom/google/android/apps/muzei/api/provider/Artwork;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/apps/muzei/api/provider/Artwork;",
            ")",
            "Ljava/util/List<",
            "Landroidx/core/app/RemoteActionCompat;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "artwork"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-super {p0, p1}, Lcom/google/android/apps/muzei/api/provider/MuzeiArtProvider;->getCommandActions(Lcom/google/android/apps/muzei/api/provider/Artwork;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/frames/muzei/FramesArtProvider;->createShareAction(Lcom/google/android/apps/muzei/api/provider/Artwork;)Landroidx/core/app/RemoteActionCompat;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-static {p1}, Lq3/a;->Q(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1
    sget-object p1, Lq4/r;->h:Lq4/r;

    .line 29
    .line 30
    return-object p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getPreferences(Landroid/content/Context;)Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldev/jahir/frames/data/Preferences;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ldev/jahir/frames/data/Preferences;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getWorker()Ldev/jahir/frames/muzei/FramesArtWorker;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/muzei/FramesArtProvider;->worker$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/muzei/FramesArtWorker;

    .line 8
    .line 9
    return-object v0
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

.method public onLoadRequested(Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldev/jahir/frames/muzei/FramesArtProvider;->getPreferences(Landroid/content/Context;)Ldev/jahir/frames/data/Preferences;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_7

    .line 17
    .line 18
    :cond_1
    invoke-virtual {p1}, Ldev/jahir/frames/data/Preferences;->getFunctionalDashboard()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_b

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_b

    .line 29
    .line 30
    invoke-static {v1}, Ldev/jahir/frames/extensions/context/ContextKt;->isNetworkAvailable(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    if-ne v1, v2, :cond_b

    .line 36
    .line 37
    invoke-virtual {p1}, Ldev/jahir/frames/data/Preferences;->getRefreshMuzeiOnWiFiOnly()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_a

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x0

    .line 48
    if-eqz v1, :cond_9

    .line 49
    .line 50
    :try_start_0
    const-class v4, Landroid/net/ConnectivityManager;

    .line 51
    .line 52
    invoke-static {v1, v4}, Lq3/a;->J(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Landroid/net/ConnectivityManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    nop

    .line 60
    move-object v4, v0

    .line 61
    :goto_1
    if-nez v4, :cond_3

    .line 62
    .line 63
    :try_start_1
    const-string v5, "connectivity"

    .line 64
    .line 65
    invoke-virtual {v1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    instance-of v5, v1, Landroid/net/ConnectivityManager;

    .line 70
    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    move-object v0, v1

    .line 74
    check-cast v0, Landroid/net/ConnectivityManager;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :catch_1
    nop

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    :goto_2
    move-object v4, v0

    .line 80
    :cond_3
    :goto_3
    if-nez v4, :cond_5

    .line 81
    .line 82
    :cond_4
    :goto_4
    const/4 v0, 0x0

    .line 83
    goto :goto_5

    .line 84
    :cond_5
    :try_start_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    const/16 v1, 0x17

    .line 87
    .line 88
    if-lt v0, v1, :cond_7

    .line 89
    .line 90
    invoke-static {v4}, Ln0/d;->b(Landroid/net/ConnectivityManager;)Landroid/net/Network;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-nez v0, :cond_6

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_6
    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    goto :goto_5

    .line 108
    :catch_2
    nop

    .line 109
    goto :goto_4

    .line 110
    :cond_7
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-nez v0, :cond_8

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_8
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_4

    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    .line 130
    .line 131
    .line 132
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 133
    if-ne v0, v2, :cond_4

    .line 134
    .line 135
    const/4 v0, 0x1

    .line 136
    :goto_5
    if-ne v0, v2, :cond_9

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_9
    const/4 v2, 0x0

    .line 140
    :goto_6
    if-eqz v2, :cond_b

    .line 141
    .line 142
    invoke-virtual {p0}, Ldev/jahir/frames/muzei/FramesArtProvider;->getWorker()Ldev/jahir/frames/muzei/FramesArtWorker;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v0, v1, p1}, Ldev/jahir/frames/muzei/FramesArtWorker;->loadWallpapers(Landroid/content/Context;Ldev/jahir/frames/data/Preferences;)V

    .line 151
    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_a
    invoke-virtual {p0}, Ldev/jahir/frames/muzei/FramesArtProvider;->getWorker()Ldev/jahir/frames/muzei/FramesArtWorker;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1, p1}, Ldev/jahir/frames/muzei/FramesArtWorker;->loadWallpapers(Landroid/content/Context;Ldev/jahir/frames/data/Preferences;)V

    .line 163
    .line 164
    .line 165
    :cond_b
    :goto_7
    return-void
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public onLowMemory()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/content/ContentProvider;->onLowMemory()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/muzei/FramesArtProvider;->getWorker()Ldev/jahir/frames/muzei/FramesArtWorker;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v3, v1, v2}, Ldev/jahir/frames/muzei/FramesArtWorker;->destroy$library_release$default(Ldev/jahir/frames/muzei/FramesArtWorker;ZILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
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
