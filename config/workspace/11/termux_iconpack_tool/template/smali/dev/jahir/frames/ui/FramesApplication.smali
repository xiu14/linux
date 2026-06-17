.class public Ldev/jahir/frames/ui/FramesApplication;
.super Landroid/app/Application;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ly2/f;


# instance fields
.field private final oneSignalAppId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Ldev/jahir/frames/ui/FramesApplication;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 4
    iput-object p1, p0, Ldev/jahir/frames/ui/FramesApplication;->oneSignalAppId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/FramesApplication;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Ldev/jahir/frames/ui/FramesApplication;)Lh3/d;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/FramesApplication;->newImageLoader$lambda$0(Ldev/jahir/frames/ui/FramesApplication;)Lh3/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic b(Ldev/jahir/frames/ui/FramesApplication;)Lb3/b;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/FramesApplication;->newImageLoader$lambda$1(Ldev/jahir/frames/ui/FramesApplication;)Lb3/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private static final newImageLoader$lambda$0(Ldev/jahir/frames/ui/FramesApplication;)Lh3/d;
    .locals 3

    .line 1
    new-instance v0, Lh3/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lh3/a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-wide v1, 0x3fd3333333333333L    # 0.3

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v1, v0, Lh3/a;->b:D

    .line 12
    .line 13
    invoke-virtual {v0}, Lh3/a;->a()Lh3/e;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method private static final newImageLoader$lambda$1(Ldev/jahir/frames/ui/FramesApplication;)Lb3/b;
    .locals 3

    .line 1
    new-instance v0, Lb3/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lb3/a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "getCacheDir(...)"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, La5/a;->T(Ljava/io/File;)Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v1, Lj6/z;->i:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p0}, La1/d;->p(Ljava/io/File;)Lj6/z;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iput-object p0, v0, Lb3/a;->a:Lj6/z;

    .line 26
    .line 27
    const-wide v1, 0x3fc999999999999aL    # 0.2

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide v1, v0, Lb3/a;->c:D

    .line 33
    .line 34
    invoke-virtual {v0}, Lb3/a;->a()Lb3/j;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
    .line 39
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


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ldev/jahir/frames/extensions/context/ContextKt;->setDefaultDashboardTheme(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ldev/jahir/frames/ui/FramesApplication;->c(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final c(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lm1/a;->a:Ljava/util/HashSet;

    .line 5
    .line 6
    const-string p1, "Installing application"

    .line 7
    .line 8
    const-string v0, "MultiDex"

    .line 9
    .line 10
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    sget-boolean p1, Lm1/a;->b:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p1, "VM has multidex support, MultiDex support library is disabled."

    .line 18
    .line 19
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    :try_start_1
    const-string v1, "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."

    .line 30
    .line 31
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    :goto_0
    if-nez p1, :cond_1

    .line 36
    .line 37
    const-string p1, "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled."

    .line 38
    .line 39
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_1
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    new-instance v1, Ljava/io/File;

    .line 46
    .line 47
    iget-object v2, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/io/File;

    .line 53
    .line 54
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v1, v2}, Lm1/a;->b(Ldev/jahir/frames/ui/FramesApplication;Ljava/io/File;Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    .line 61
    .line 62
    const-string p1, "install done"

    .line 63
    .line 64
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    :goto_1
    return-void

    .line 68
    :goto_2
    const-string v1, "MultiDex installation failure"

    .line 69
    .line 70
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 71
    .line 72
    .line 73
    new-instance v0, Ljava/lang/RuntimeException;

    .line 74
    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v2, "MultiDex installation failed ("

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, ")."

    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v0
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

.method public final getOneSignalAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/FramesApplication;->oneSignalAppId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
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

.method public newImageLoader()Ly2/e;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroidx/lifecycle/a1;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Landroidx/lifecycle/a1;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Landroidx/lifecycle/a1;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lj3/c;

    .line 11
    .line 12
    iget-object v4, v2, Lj3/c;->a:Ln5/r;

    .line 13
    .line 14
    iget-object v5, v2, Lj3/c;->b:Ln5/r;

    .line 15
    .line 16
    iget-object v6, v2, Lj3/c;->c:Ln5/r;

    .line 17
    .line 18
    iget-object v7, v2, Lj3/c;->d:Ln5/r;

    .line 19
    .line 20
    iget-object v8, v2, Lj3/c;->e:Ln3/d;

    .line 21
    .line 22
    iget-object v9, v2, Lj3/c;->f:Lk3/d;

    .line 23
    .line 24
    iget-object v10, v2, Lj3/c;->g:Landroid/graphics/Bitmap$Config;

    .line 25
    .line 26
    iget-boolean v12, v2, Lj3/c;->i:Z

    .line 27
    .line 28
    iget-object v13, v2, Lj3/c;->j:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    iget-object v14, v2, Lj3/c;->k:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    iget-object v15, v2, Lj3/c;->l:Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    iget-object v3, v2, Lj3/c;->m:Lj3/b;

    .line 35
    .line 36
    iget-object v11, v2, Lj3/c;->n:Lj3/b;

    .line 37
    .line 38
    iget-object v2, v2, Lj3/c;->o:Lj3/b;

    .line 39
    .line 40
    move-object/from16 v16, v3

    .line 41
    .line 42
    new-instance v3, Lj3/c;

    .line 43
    .line 44
    move-object/from16 v17, v11

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    move-object/from16 v18, v2

    .line 48
    .line 49
    invoke-direct/range {v3 .. v18}, Lj3/c;-><init>(Ln5/r;Ln5/r;Ln5/r;Ln5/r;Ln3/d;Lk3/d;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lj3/b;Lj3/b;Lj3/b;)V

    .line 50
    .line 51
    .line 52
    iput-object v3, v1, Landroidx/lifecycle/a1;->j:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v2, Lm4/a;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v2, v0, v3}, Lm4/a;-><init>(Ldev/jahir/frames/ui/FramesApplication;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, v1, Landroidx/lifecycle/a1;->k:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance v2, Lm4/a;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-direct {v2, v0, v3}, Lm4/a;-><init>(Ldev/jahir/frames/ui/FramesApplication;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, v1, Landroidx/lifecycle/a1;->l:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {v1}, Landroidx/lifecycle/a1;->d()Ly2/j;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    return-object v1
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

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/appcompat/app/b0;->h:Landroidx/room/c1;

    .line 5
    .line 6
    sget v0, Landroidx/appcompat/widget/p4;->a:I

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
