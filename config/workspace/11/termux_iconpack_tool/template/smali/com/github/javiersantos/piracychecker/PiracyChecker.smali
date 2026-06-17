.class public final Lcom/github/javiersantos/piracychecker/PiracyChecker;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HardwareIds"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/javiersantos/piracychecker/PiracyChecker$Companion;
    }
.end annotation


# static fields
.field public static final synthetic t:I


# instance fields
.field public final a:Lcom/github/javiersantos/piracychecker/enums/Display;

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Ljava/lang/String;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/ArrayList;

.field public l:Lcom/github/javiersantos/piracychecker/callbacks/AllowCallback;

.field public m:Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;

.field public n:Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;

.field public o:Lcom/github/javiersantos/licensing/LibraryChecker;

.field public p:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

.field public q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/github/javiersantos/piracychecker/PiracyChecker$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/github/javiersantos/piracychecker/PiracyChecker$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public constructor <init>(Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;)V
    .locals 3

    .line 1
    sget v0, Lcom/github/javiersantos/piracychecker/R$string;->app_unlicensed:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v0, v1

    .line 13
    :goto_0
    sget v2, Lcom/github/javiersantos/piracychecker/R$string;->app_unlicensed_description:I

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    move-object v1, v2

    .line 22
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->r:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->s:Ljava/lang/String;

    .line 30
    .line 31
    const/4 p1, -0x1

    .line 32
    iput p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->d:I

    .line 33
    .line 34
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/Display;->h:Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->a:Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->j:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->k:Ljava/util/ArrayList;

    .line 51
    .line 52
    sget p1, Lcom/github/javiersantos/piracychecker/R$color;->colorPrimary:I

    .line 53
    .line 54
    iput p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->b:I

    .line 55
    .line 56
    sget p1, Lcom/github/javiersantos/piracychecker/R$color;->colorPrimaryDark:I

    .line 57
    .line 58
    iput p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->c:I

    .line 59
    .line 60
    return-void
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
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->o:Lcom/github/javiersantos/licensing/LibraryChecker;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/github/javiersantos/licensing/LibraryChecker;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->o:Lcom/github/javiersantos/licensing/LibraryChecker;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v2, v0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    :try_start_1
    iget-object v2, v0, Lcom/github/javiersantos/licensing/LibraryChecker;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    :try_start_2
    const-string v2, "LibraryChecker"

    .line 25
    .line 26
    const-string v3, "Unable to unbind from licensing service (already unbound)"

    .line 27
    .line 28
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :goto_0
    iput-object v1, v0, Lcom/github/javiersantos/licensing/LibraryChecker;->g:Lcom/android/vending/licensing/ILicensingService;

    .line 32
    .line 33
    :cond_1
    iget-object v2, v0, Lcom/github/javiersantos/licensing/LibraryChecker;->i:Landroid/os/Handler;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/os/Looper;->quit()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    throw v1

    .line 47
    :cond_2
    :goto_1
    iput-object v1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->o:Lcom/github/javiersantos/licensing/LibraryChecker;

    .line 48
    .line 49
    return-void
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

.method public final b(Z)V
    .locals 59

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 4
    .line 5
    sget-object v2, Lcom/github/javiersantos/piracychecker/enums/AppType;->i:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 6
    .line 7
    if-eqz v1, :cond_10

    .line 8
    .line 9
    iget-boolean v4, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->f:Z

    .line 10
    .line 11
    iget-boolean v5, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->g:Z

    .line 12
    .line 13
    const-string v6, "extraApps"

    .line 14
    .line 15
    iget-object v7, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->k:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {v7, v6}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 38
    .line 39
    const-string v29, "c"

    .line 40
    .line 41
    const-string v30, "h"

    .line 42
    .line 43
    const-string v9, "c"

    .line 44
    .line 45
    const-string v10, "o"

    .line 46
    .line 47
    const-string v11, "m"

    .line 48
    .line 49
    const-string v12, "."

    .line 50
    .line 51
    const-string v13, "c"

    .line 52
    .line 53
    const-string v14, "h"

    .line 54
    .line 55
    const-string v15, "e"

    .line 56
    .line 57
    const-string v16, "l"

    .line 58
    .line 59
    const-string v17, "p"

    .line 60
    .line 61
    const-string v18, "u"

    .line 62
    .line 63
    const-string v19, "s"

    .line 64
    .line 65
    const-string v20, "."

    .line 66
    .line 67
    const-string v21, "l"

    .line 68
    .line 69
    const-string v22, "a"

    .line 70
    .line 71
    const-string v23, "c"

    .line 72
    .line 73
    const-string v24, "k"

    .line 74
    .line 75
    const-string v25, "y"

    .line 76
    .line 77
    const-string v26, "p"

    .line 78
    .line 79
    const-string v27, "a"

    .line 80
    .line 81
    const-string v28, "t"

    .line 82
    .line 83
    filled-new-array/range {v9 .. v30}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    const-string v10, "LuckyPatcher"

    .line 88
    .line 89
    sget-object v11, Lcom/github/javiersantos/piracychecker/enums/AppType;->h:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 90
    .line 91
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 98
    .line 99
    const-string v37, "e"

    .line 100
    .line 101
    const-string v38, "r"

    .line 102
    .line 103
    const-string v12, "c"

    .line 104
    .line 105
    const-string v13, "o"

    .line 106
    .line 107
    const-string v14, "m"

    .line 108
    .line 109
    const-string v15, "."

    .line 110
    .line 111
    const-string v16, "d"

    .line 112
    .line 113
    const-string v17, "i"

    .line 114
    .line 115
    const-string v18, "m"

    .line 116
    .line 117
    const-string v19, "o"

    .line 118
    .line 119
    const-string v20, "n"

    .line 120
    .line 121
    const-string v21, "v"

    .line 122
    .line 123
    const-string v22, "i"

    .line 124
    .line 125
    const-string v23, "d"

    .line 126
    .line 127
    const-string v24, "e"

    .line 128
    .line 129
    const-string v25, "o"

    .line 130
    .line 131
    const-string v26, "."

    .line 132
    .line 133
    const-string v27, "l"

    .line 134
    .line 135
    const-string v28, "u"

    .line 136
    .line 137
    const-string v29, "c"

    .line 138
    .line 139
    const-string v30, "k"

    .line 140
    .line 141
    const-string v31, "y"

    .line 142
    .line 143
    const-string v32, "p"

    .line 144
    .line 145
    const-string v33, "a"

    .line 146
    .line 147
    const-string v34, "t"

    .line 148
    .line 149
    const-string v35, "c"

    .line 150
    .line 151
    const-string v36, "h"

    .line 152
    .line 153
    filled-new-array/range {v12 .. v38}, [Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 164
    .line 165
    const-string v23, "l"

    .line 166
    .line 167
    const-string v24, "p"

    .line 168
    .line 169
    const-string v12, "c"

    .line 170
    .line 171
    const-string v13, "o"

    .line 172
    .line 173
    const-string v14, "m"

    .line 174
    .line 175
    const-string v15, "."

    .line 176
    .line 177
    const-string v16, "f"

    .line 178
    .line 179
    const-string v17, "o"

    .line 180
    .line 181
    const-string v18, "r"

    .line 182
    .line 183
    const-string v19, "p"

    .line 184
    .line 185
    const-string v20, "d"

    .line 186
    .line 187
    const-string v21, "a"

    .line 188
    .line 189
    const-string v22, "."

    .line 190
    .line 191
    filled-new-array/range {v12 .. v24}, [Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 202
    .line 203
    const-string v57, "c"

    .line 204
    .line 205
    const-string v58, "e"

    .line 206
    .line 207
    const-string v12, "c"

    .line 208
    .line 209
    const-string v13, "o"

    .line 210
    .line 211
    const-string v14, "m"

    .line 212
    .line 213
    const-string v15, "."

    .line 214
    .line 215
    const-string v16, "a"

    .line 216
    .line 217
    const-string v17, "n"

    .line 218
    .line 219
    const-string v18, "d"

    .line 220
    .line 221
    const-string v19, "r"

    .line 222
    .line 223
    const-string v20, "o"

    .line 224
    .line 225
    const-string v21, "i"

    .line 226
    .line 227
    const-string v22, "d"

    .line 228
    .line 229
    const-string v23, "."

    .line 230
    .line 231
    const-string v24, "v"

    .line 232
    .line 233
    const-string v25, "e"

    .line 234
    .line 235
    const-string v26, "n"

    .line 236
    .line 237
    const-string v27, "d"

    .line 238
    .line 239
    const-string v28, "i"

    .line 240
    .line 241
    const-string v29, "n"

    .line 242
    .line 243
    const-string v30, "g"

    .line 244
    .line 245
    const-string v31, "."

    .line 246
    .line 247
    const-string v32, "b"

    .line 248
    .line 249
    const-string v33, "i"

    .line 250
    .line 251
    const-string v34, "l"

    .line 252
    .line 253
    const-string v35, "l"

    .line 254
    .line 255
    const-string v36, "i"

    .line 256
    .line 257
    const-string v37, "n"

    .line 258
    .line 259
    const-string v38, "g"

    .line 260
    .line 261
    const-string v39, "."

    .line 262
    .line 263
    const-string v40, "I"

    .line 264
    .line 265
    const-string v41, "n"

    .line 266
    .line 267
    const-string v42, "A"

    .line 268
    .line 269
    const-string v43, "p"

    .line 270
    .line 271
    const-string v44, "p"

    .line 272
    .line 273
    const-string v45, "B"

    .line 274
    .line 275
    const-string v46, "i"

    .line 276
    .line 277
    const-string v47, "l"

    .line 278
    .line 279
    const-string v48, "l"

    .line 280
    .line 281
    const-string v49, "i"

    .line 282
    .line 283
    const-string v50, "n"

    .line 284
    .line 285
    const-string v51, "g"

    .line 286
    .line 287
    const-string v52, "S"

    .line 288
    .line 289
    const-string v53, "e"

    .line 290
    .line 291
    const-string v54, "r"

    .line 292
    .line 293
    const-string v55, "v"

    .line 294
    .line 295
    const-string v56, "i"

    .line 296
    .line 297
    filled-new-array/range {v12 .. v58}, [Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 308
    .line 309
    const-string v57, "c"

    .line 310
    .line 311
    const-string v58, "e"

    .line 312
    .line 313
    const-string v12, "c"

    .line 314
    .line 315
    const-string v13, "o"

    .line 316
    .line 317
    const-string v14, "m"

    .line 318
    .line 319
    const-string v15, "."

    .line 320
    .line 321
    const-string v16, "a"

    .line 322
    .line 323
    const-string v17, "n"

    .line 324
    .line 325
    const-string v18, "d"

    .line 326
    .line 327
    const-string v19, "r"

    .line 328
    .line 329
    const-string v20, "o"

    .line 330
    .line 331
    const-string v21, "i"

    .line 332
    .line 333
    const-string v22, "d"

    .line 334
    .line 335
    const-string v23, "."

    .line 336
    .line 337
    const-string v24, "v"

    .line 338
    .line 339
    const-string v25, "e"

    .line 340
    .line 341
    const-string v26, "n"

    .line 342
    .line 343
    const-string v27, "d"

    .line 344
    .line 345
    const-string v28, "i"

    .line 346
    .line 347
    const-string v29, "n"

    .line 348
    .line 349
    const-string v30, "g"

    .line 350
    .line 351
    const-string v31, "."

    .line 352
    .line 353
    const-string v32, "b"

    .line 354
    .line 355
    const-string v33, "i"

    .line 356
    .line 357
    const-string v34, "l"

    .line 358
    .line 359
    const-string v35, "l"

    .line 360
    .line 361
    const-string v36, "i"

    .line 362
    .line 363
    const-string v37, "n"

    .line 364
    .line 365
    const-string v38, "g"

    .line 366
    .line 367
    const-string v39, "."

    .line 368
    .line 369
    const-string v40, "I"

    .line 370
    .line 371
    const-string v41, "n"

    .line 372
    .line 373
    const-string v42, "A"

    .line 374
    .line 375
    const-string v43, "p"

    .line 376
    .line 377
    const-string v44, "p"

    .line 378
    .line 379
    const-string v45, "B"

    .line 380
    .line 381
    const-string v46, "i"

    .line 382
    .line 383
    const-string v47, "l"

    .line 384
    .line 385
    const-string v48, "l"

    .line 386
    .line 387
    const-string v49, "i"

    .line 388
    .line 389
    const-string v50, "n"

    .line 390
    .line 391
    const-string v51, "g"

    .line 392
    .line 393
    const-string v52, "S"

    .line 394
    .line 395
    const-string v53, "o"

    .line 396
    .line 397
    const-string v54, "r"

    .line 398
    .line 399
    const-string v55, "v"

    .line 400
    .line 401
    const-string v56, "i"

    .line 402
    .line 403
    filled-new-array/range {v12 .. v58}, [Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v9

    .line 407
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 414
    .line 415
    const-string v29, "n"

    .line 416
    .line 417
    const-string v30, "c"

    .line 418
    .line 419
    const-string v12, "c"

    .line 420
    .line 421
    const-string v13, "o"

    .line 422
    .line 423
    const-string v14, "m"

    .line 424
    .line 425
    const-string v15, "."

    .line 426
    .line 427
    const-string v16, "a"

    .line 428
    .line 429
    const-string v17, "n"

    .line 430
    .line 431
    const-string v18, "d"

    .line 432
    .line 433
    const-string v19, "r"

    .line 434
    .line 435
    const-string v20, "o"

    .line 436
    .line 437
    const-string v21, "i"

    .line 438
    .line 439
    const-string v22, "d"

    .line 440
    .line 441
    const-string v23, "."

    .line 442
    .line 443
    const-string v24, "v"

    .line 444
    .line 445
    const-string v25, "e"

    .line 446
    .line 447
    const-string v26, "n"

    .line 448
    .line 449
    const-string v27, "d"

    .line 450
    .line 451
    const-string v28, "i"

    .line 452
    .line 453
    filled-new-array/range {v12 .. v30}, [Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v9

    .line 457
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 464
    .line 465
    const-string v31, "e"

    .line 466
    .line 467
    const-string v32, "r"

    .line 468
    .line 469
    const-string v12, "u"

    .line 470
    .line 471
    const-string v13, "r"

    .line 472
    .line 473
    const-string v14, "e"

    .line 474
    .line 475
    const-string v15, "t"

    .line 476
    .line 477
    const-string v16, "."

    .line 478
    .line 479
    const-string v17, "j"

    .line 480
    .line 481
    const-string v18, "a"

    .line 482
    .line 483
    const-string v19, "s"

    .line 484
    .line 485
    const-string v20, "i"

    .line 486
    .line 487
    const-string v21, "2"

    .line 488
    .line 489
    const-string v22, "1"

    .line 490
    .line 491
    const-string v23, "6"

    .line 492
    .line 493
    const-string v24, "9"

    .line 494
    .line 495
    const-string v25, "."

    .line 496
    .line 497
    const-string v26, "p"

    .line 498
    .line 499
    const-string v27, "a"

    .line 500
    .line 501
    const-string v28, "t"

    .line 502
    .line 503
    const-string v29, "c"

    .line 504
    .line 505
    const-string v30, "h"

    .line 506
    .line 507
    filled-new-array/range {v12 .. v32}, [Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v9

    .line 511
    const-string v10, "UretPatcher"

    .line 512
    .line 513
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 520
    .line 521
    const-string v35, "e"

    .line 522
    .line 523
    const-string v36, "r"

    .line 524
    .line 525
    const-string v12, "z"

    .line 526
    .line 527
    const-string v13, "o"

    .line 528
    .line 529
    const-string v14, "n"

    .line 530
    .line 531
    const-string v15, "e"

    .line 532
    .line 533
    const-string v16, "."

    .line 534
    .line 535
    const-string v17, "j"

    .line 536
    .line 537
    const-string v18, "a"

    .line 538
    .line 539
    const-string v19, "s"

    .line 540
    .line 541
    const-string v20, "i"

    .line 542
    .line 543
    const-string v21, "2"

    .line 544
    .line 545
    const-string v22, "1"

    .line 546
    .line 547
    const-string v23, "6"

    .line 548
    .line 549
    const-string v24, "9"

    .line 550
    .line 551
    const-string v25, "."

    .line 552
    .line 553
    const-string v26, "u"

    .line 554
    .line 555
    const-string v27, "r"

    .line 556
    .line 557
    const-string v28, "e"

    .line 558
    .line 559
    const-string v29, "t"

    .line 560
    .line 561
    const-string v30, "p"

    .line 562
    .line 563
    const-string v31, "a"

    .line 564
    .line 565
    const-string v32, "t"

    .line 566
    .line 567
    const-string v33, "c"

    .line 568
    .line 569
    const-string v34, "h"

    .line 570
    .line 571
    filled-new-array/range {v12 .. v36}, [Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v9

    .line 575
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 582
    .line 583
    const-string v24, "l"

    .line 584
    .line 585
    const-string v25, "3"

    .line 586
    .line 587
    const-string v12, "p"

    .line 588
    .line 589
    const-string v13, "."

    .line 590
    .line 591
    const-string v14, "j"

    .line 592
    .line 593
    const-string v15, "a"

    .line 594
    .line 595
    const-string v16, "s"

    .line 596
    .line 597
    const-string v17, "i"

    .line 598
    .line 599
    const-string v18, "2"

    .line 600
    .line 601
    const-string v19, "1"

    .line 602
    .line 603
    const-string v20, "6"

    .line 604
    .line 605
    const-string v21, "9"

    .line 606
    .line 607
    const-string v22, "."

    .line 608
    .line 609
    const-string v23, "a"

    .line 610
    .line 611
    filled-new-array/range {v12 .. v25}, [Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v9

    .line 615
    const-string v10, "ActionLauncherPatcher"

    .line 616
    .line 617
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 624
    .line 625
    const-string v28, "o"

    .line 626
    .line 627
    const-string v29, "m"

    .line 628
    .line 629
    const-string v12, "c"

    .line 630
    .line 631
    const-string v13, "c"

    .line 632
    .line 633
    const-string v14, "."

    .line 634
    .line 635
    const-string v15, "m"

    .line 636
    .line 637
    const-string v16, "a"

    .line 638
    .line 639
    const-string v17, "d"

    .line 640
    .line 641
    const-string v18, "k"

    .line 642
    .line 643
    const-string v19, "i"

    .line 644
    .line 645
    const-string v20, "t"

    .line 646
    .line 647
    const-string v21, "e"

    .line 648
    .line 649
    const-string v22, "."

    .line 650
    .line 651
    const-string v23, "f"

    .line 652
    .line 653
    const-string v24, "r"

    .line 654
    .line 655
    const-string v25, "e"

    .line 656
    .line 657
    const-string v26, "e"

    .line 658
    .line 659
    const-string v27, "d"

    .line 660
    .line 661
    filled-new-array/range {v12 .. v29}, [Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v9

    .line 665
    const-string v10, "Freedom"

    .line 666
    .line 667
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 674
    .line 675
    const-string v31, "o"

    .line 676
    .line 677
    const-string v32, "m"

    .line 678
    .line 679
    const-string v12, "c"

    .line 680
    .line 681
    const-string v13, "c"

    .line 682
    .line 683
    const-string v14, "."

    .line 684
    .line 685
    const-string v15, "c"

    .line 686
    .line 687
    const-string v16, "z"

    .line 688
    .line 689
    const-string v17, "."

    .line 690
    .line 691
    const-string v18, "m"

    .line 692
    .line 693
    const-string v19, "a"

    .line 694
    .line 695
    const-string v20, "d"

    .line 696
    .line 697
    const-string v21, "k"

    .line 698
    .line 699
    const-string v22, "i"

    .line 700
    .line 701
    const-string v23, "t"

    .line 702
    .line 703
    const-string v24, "e"

    .line 704
    .line 705
    const-string v25, "."

    .line 706
    .line 707
    const-string v26, "f"

    .line 708
    .line 709
    const-string v27, "r"

    .line 710
    .line 711
    const-string v28, "e"

    .line 712
    .line 713
    const-string v29, "e"

    .line 714
    .line 715
    const-string v30, "d"

    .line 716
    .line 717
    filled-new-array/range {v12 .. v32}, [Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v9

    .line 721
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 728
    .line 729
    const-string v28, "c"

    .line 730
    .line 731
    const-string v29, "k"

    .line 732
    .line 733
    const-string v12, "o"

    .line 734
    .line 735
    const-string v13, "r"

    .line 736
    .line 737
    const-string v14, "g"

    .line 738
    .line 739
    const-string v15, "."

    .line 740
    .line 741
    const-string v16, "c"

    .line 742
    .line 743
    const-string v17, "r"

    .line 744
    .line 745
    const-string v18, "e"

    .line 746
    .line 747
    const-string v19, "e"

    .line 748
    .line 749
    const-string v20, "p"

    .line 750
    .line 751
    const-string v21, "l"

    .line 752
    .line 753
    const-string v22, "a"

    .line 754
    .line 755
    const-string v23, "y"

    .line 756
    .line 757
    const-string v24, "s"

    .line 758
    .line 759
    const-string v25, "."

    .line 760
    .line 761
    const-string v26, "h"

    .line 762
    .line 763
    const-string v27, "a"

    .line 764
    .line 765
    filled-new-array/range {v12 .. v29}, [Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    const-string v10, "CreeHack"

    .line 770
    .line 771
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 778
    .line 779
    const-string v26, "p"

    .line 780
    .line 781
    const-string v27, "k"

    .line 782
    .line 783
    const-string v12, "c"

    .line 784
    .line 785
    const-string v13, "o"

    .line 786
    .line 787
    const-string v14, "m"

    .line 788
    .line 789
    const-string v15, "."

    .line 790
    .line 791
    const-string v16, "h"

    .line 792
    .line 793
    const-string v17, "a"

    .line 794
    .line 795
    const-string v18, "p"

    .line 796
    .line 797
    const-string v19, "p"

    .line 798
    .line 799
    const-string v20, "y"

    .line 800
    .line 801
    const-string v21, "m"

    .line 802
    .line 803
    const-string v22, "o"

    .line 804
    .line 805
    const-string v23, "d"

    .line 806
    .line 807
    const-string v24, "."

    .line 808
    .line 809
    const-string v25, "a"

    .line 810
    .line 811
    filled-new-array/range {v12 .. v27}, [Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v9

    .line 815
    const-string v10, "HappyMod"

    .line 816
    .line 817
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 824
    .line 825
    const-string v30, "c"

    .line 826
    .line 827
    const-string v31, "k"

    .line 828
    .line 829
    const-string v12, "o"

    .line 830
    .line 831
    const-string v13, "r"

    .line 832
    .line 833
    const-string v14, "g"

    .line 834
    .line 835
    const-string v15, "."

    .line 836
    .line 837
    const-string v16, "s"

    .line 838
    .line 839
    const-string v17, "b"

    .line 840
    .line 841
    const-string v18, "t"

    .line 842
    .line 843
    const-string v19, "o"

    .line 844
    .line 845
    const-string v20, "o"

    .line 846
    .line 847
    const-string v21, "l"

    .line 848
    .line 849
    const-string v22, "s"

    .line 850
    .line 851
    const-string v23, "."

    .line 852
    .line 853
    const-string v24, "g"

    .line 854
    .line 855
    const-string v25, "a"

    .line 856
    .line 857
    const-string v26, "m"

    .line 858
    .line 859
    const-string v27, "e"

    .line 860
    .line 861
    const-string v28, "h"

    .line 862
    .line 863
    const-string v29, "a"

    .line 864
    .line 865
    filled-new-array/range {v12 .. v31}, [Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v9

    .line 869
    const-string v10, "Game Hacker"

    .line 870
    .line 871
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 878
    .line 879
    const-string v29, "e"

    .line 880
    .line 881
    const-string v30, "r"

    .line 882
    .line 883
    const-string v12, "c"

    .line 884
    .line 885
    const-string v13, "o"

    .line 886
    .line 887
    const-string v14, "m"

    .line 888
    .line 889
    const-string v15, "."

    .line 890
    .line 891
    const-string v16, "z"

    .line 892
    .line 893
    const-string v17, "u"

    .line 894
    .line 895
    const-string v18, "n"

    .line 896
    .line 897
    const-string v19, "e"

    .line 898
    .line 899
    const-string v20, "."

    .line 900
    .line 901
    const-string v21, "g"

    .line 902
    .line 903
    const-string v22, "a"

    .line 904
    .line 905
    const-string v23, "m"

    .line 906
    .line 907
    const-string v24, "e"

    .line 908
    .line 909
    const-string v25, "k"

    .line 910
    .line 911
    const-string v26, "i"

    .line 912
    .line 913
    const-string v27, "l"

    .line 914
    .line 915
    const-string v28, "l"

    .line 916
    .line 917
    filled-new-array/range {v12 .. v30}, [Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v9

    .line 921
    const-string v12, "Game Killer Cheats"

    .line 922
    .line 923
    invoke-direct {v8, v12, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 930
    .line 931
    const-string v24, "e"

    .line 932
    .line 933
    const-string v25, "r"

    .line 934
    .line 935
    const-string v12, "c"

    .line 936
    .line 937
    const-string v13, "o"

    .line 938
    .line 939
    const-string v14, "m"

    .line 940
    .line 941
    const-string v15, "."

    .line 942
    .line 943
    const-string v16, "a"

    .line 944
    .line 945
    const-string v17, "a"

    .line 946
    .line 947
    const-string v18, "g"

    .line 948
    .line 949
    const-string v19, "."

    .line 950
    .line 951
    const-string v20, "k"

    .line 952
    .line 953
    const-string v21, "i"

    .line 954
    .line 955
    const-string v22, "l"

    .line 956
    .line 957
    const-string v23, "l"

    .line 958
    .line 959
    filled-new-array/range {v12 .. v25}, [Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v9

    .line 963
    const-string v12, "AGK - App Killer"

    .line 964
    .line 965
    invoke-direct {v8, v12, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 972
    .line 973
    const-string v34, "e"

    .line 974
    .line 975
    const-string v35, "r"

    .line 976
    .line 977
    const-string v12, "c"

    .line 978
    .line 979
    const-string v13, "o"

    .line 980
    .line 981
    const-string v14, "m"

    .line 982
    .line 983
    const-string v15, "."

    .line 984
    .line 985
    const-string v16, "k"

    .line 986
    .line 987
    const-string v17, "i"

    .line 988
    .line 989
    const-string v18, "l"

    .line 990
    .line 991
    const-string v19, "l"

    .line 992
    .line 993
    const-string v20, "e"

    .line 994
    .line 995
    const-string v21, "r"

    .line 996
    .line 997
    const-string v22, "a"

    .line 998
    .line 999
    const-string v23, "p"

    .line 1000
    .line 1001
    const-string v24, "p"

    .line 1002
    .line 1003
    const-string v25, "."

    .line 1004
    .line 1005
    const-string v26, "g"

    .line 1006
    .line 1007
    const-string v27, "a"

    .line 1008
    .line 1009
    const-string v28, "m"

    .line 1010
    .line 1011
    const-string v29, "e"

    .line 1012
    .line 1013
    const-string v30, "k"

    .line 1014
    .line 1015
    const-string v31, "i"

    .line 1016
    .line 1017
    const-string v32, "l"

    .line 1018
    .line 1019
    const-string v33, "l"

    .line 1020
    .line 1021
    filled-new-array/range {v12 .. v35}, [Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v9

    .line 1025
    const-string v12, "Game Killer"

    .line 1026
    .line 1027
    invoke-direct {v8, v12, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1031
    .line 1032
    .line 1033
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1034
    .line 1035
    const-string v19, "s"

    .line 1036
    .line 1037
    const-string v20, "q"

    .line 1038
    .line 1039
    const-string v13, "c"

    .line 1040
    .line 1041
    const-string v14, "n"

    .line 1042
    .line 1043
    const-string v15, "."

    .line 1044
    .line 1045
    const-string v16, "l"

    .line 1046
    .line 1047
    const-string v17, "m"

    .line 1048
    .line 1049
    const-string v18, "."

    .line 1050
    .line 1051
    filled-new-array/range {v13 .. v20}, [Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v9

    .line 1055
    invoke-direct {v8, v12, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1062
    .line 1063
    const-string v32, "i"

    .line 1064
    .line 1065
    const-string v33, "h"

    .line 1066
    .line 1067
    const-string v12, "n"

    .line 1068
    .line 1069
    const-string v13, "e"

    .line 1070
    .line 1071
    const-string v14, "t"

    .line 1072
    .line 1073
    const-string v15, "."

    .line 1074
    .line 1075
    const-string v16, "s"

    .line 1076
    .line 1077
    const-string v17, "c"

    .line 1078
    .line 1079
    const-string v18, "h"

    .line 1080
    .line 1081
    const-string v19, "w"

    .line 1082
    .line 1083
    const-string v20, "a"

    .line 1084
    .line 1085
    const-string v21, "r"

    .line 1086
    .line 1087
    const-string v22, "z"

    .line 1088
    .line 1089
    const-string v23, "i"

    .line 1090
    .line 1091
    const-string v24, "s"

    .line 1092
    .line 1093
    const-string v25, "."

    .line 1094
    .line 1095
    const-string v26, "g"

    .line 1096
    .line 1097
    const-string v27, "a"

    .line 1098
    .line 1099
    const-string v28, "m"

    .line 1100
    .line 1101
    const-string v29, "e"

    .line 1102
    .line 1103
    const-string v30, "_"

    .line 1104
    .line 1105
    const-string v31, "c"

    .line 1106
    .line 1107
    filled-new-array/range {v12 .. v33}, [Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v9

    .line 1111
    const-string v12, "Game CheatIng Hacker"

    .line 1112
    .line 1113
    invoke-direct {v8, v12, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1120
    .line 1121
    const-string v29, "w"

    .line 1122
    .line 1123
    const-string v30, "d"

    .line 1124
    .line 1125
    const-string v12, "c"

    .line 1126
    .line 1127
    const-string v13, "o"

    .line 1128
    .line 1129
    const-string v14, "m"

    .line 1130
    .line 1131
    const-string v15, "."

    .line 1132
    .line 1133
    const-string v16, "b"

    .line 1134
    .line 1135
    const-string v17, "a"

    .line 1136
    .line 1137
    const-string v18, "s"

    .line 1138
    .line 1139
    const-string v19, "e"

    .line 1140
    .line 1141
    const-string v20, "a"

    .line 1142
    .line 1143
    const-string v21, "p"

    .line 1144
    .line 1145
    const-string v22, "p"

    .line 1146
    .line 1147
    const-string v23, "f"

    .line 1148
    .line 1149
    const-string v24, "u"

    .line 1150
    .line 1151
    const-string v25, "l"

    .line 1152
    .line 1153
    const-string v26, "l"

    .line 1154
    .line 1155
    const-string v27, "."

    .line 1156
    .line 1157
    const-string v28, "f"

    .line 1158
    .line 1159
    filled-new-array/range {v12 .. v30}, [Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v9

    .line 1163
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1170
    .line 1171
    const-string v52, "r"

    .line 1172
    .line 1173
    const-string v53, "d"

    .line 1174
    .line 1175
    const-string v12, "c"

    .line 1176
    .line 1177
    const-string v13, "o"

    .line 1178
    .line 1179
    const-string v14, "m"

    .line 1180
    .line 1181
    const-string v15, "."

    .line 1182
    .line 1183
    const-string v16, "g"

    .line 1184
    .line 1185
    const-string v17, "i"

    .line 1186
    .line 1187
    const-string v18, "t"

    .line 1188
    .line 1189
    const-string v19, "h"

    .line 1190
    .line 1191
    const-string v20, "u"

    .line 1192
    .line 1193
    const-string v21, "b"

    .line 1194
    .line 1195
    const-string v22, "."

    .line 1196
    .line 1197
    const-string v23, "o"

    .line 1198
    .line 1199
    const-string v24, "n"

    .line 1200
    .line 1201
    const-string v25, "e"

    .line 1202
    .line 1203
    const-string v26, "m"

    .line 1204
    .line 1205
    const-string v27, "i"

    .line 1206
    .line 1207
    const-string v28, "n"

    .line 1208
    .line 1209
    const-string v29, "u"

    .line 1210
    .line 1211
    const-string v30, "s"

    .line 1212
    .line 1213
    const-string v31, "o"

    .line 1214
    .line 1215
    const-string v32, "n"

    .line 1216
    .line 1217
    const-string v33, "e"

    .line 1218
    .line 1219
    const-string v34, "."

    .line 1220
    .line 1221
    const-string v35, "d"

    .line 1222
    .line 1223
    const-string v36, "i"

    .line 1224
    .line 1225
    const-string v37, "s"

    .line 1226
    .line 1227
    const-string v38, "a"

    .line 1228
    .line 1229
    const-string v39, "b"

    .line 1230
    .line 1231
    const-string v40, "l"

    .line 1232
    .line 1233
    const-string v41, "e"

    .line 1234
    .line 1235
    const-string v42, "c"

    .line 1236
    .line 1237
    const-string v43, "o"

    .line 1238
    .line 1239
    const-string v44, "n"

    .line 1240
    .line 1241
    const-string v45, "t"

    .line 1242
    .line 1243
    const-string v46, "e"

    .line 1244
    .line 1245
    const-string v47, "n"

    .line 1246
    .line 1247
    const-string v48, "t"

    .line 1248
    .line 1249
    const-string v49, "g"

    .line 1250
    .line 1251
    const-string v50, "u"

    .line 1252
    .line 1253
    const-string v51, "a"

    .line 1254
    .line 1255
    filled-new-array/range {v12 .. v53}, [Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v9

    .line 1259
    const-string v10, "Content Guard Disabler"

    .line 1260
    .line 1261
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1265
    .line 1266
    .line 1267
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1268
    .line 1269
    const-string v45, "r"

    .line 1270
    .line 1271
    const-string v46, "d"

    .line 1272
    .line 1273
    const-string v12, "c"

    .line 1274
    .line 1275
    const-string v13, "o"

    .line 1276
    .line 1277
    const-string v14, "m"

    .line 1278
    .line 1279
    const-string v15, "."

    .line 1280
    .line 1281
    const-string v16, "o"

    .line 1282
    .line 1283
    const-string v17, "n"

    .line 1284
    .line 1285
    const-string v18, "e"

    .line 1286
    .line 1287
    const-string v19, "m"

    .line 1288
    .line 1289
    const-string v20, "i"

    .line 1290
    .line 1291
    const-string v21, "n"

    .line 1292
    .line 1293
    const-string v22, "u"

    .line 1294
    .line 1295
    const-string v23, "s"

    .line 1296
    .line 1297
    const-string v24, "o"

    .line 1298
    .line 1299
    const-string v25, "n"

    .line 1300
    .line 1301
    const-string v26, "e"

    .line 1302
    .line 1303
    const-string v27, "."

    .line 1304
    .line 1305
    const-string v28, "d"

    .line 1306
    .line 1307
    const-string v29, "i"

    .line 1308
    .line 1309
    const-string v30, "s"

    .line 1310
    .line 1311
    const-string v31, "a"

    .line 1312
    .line 1313
    const-string v32, "b"

    .line 1314
    .line 1315
    const-string v33, "l"

    .line 1316
    .line 1317
    const-string v34, "e"

    .line 1318
    .line 1319
    const-string v35, "c"

    .line 1320
    .line 1321
    const-string v36, "o"

    .line 1322
    .line 1323
    const-string v37, "n"

    .line 1324
    .line 1325
    const-string v38, "t"

    .line 1326
    .line 1327
    const-string v39, "e"

    .line 1328
    .line 1329
    const-string v40, "n"

    .line 1330
    .line 1331
    const-string v41, "t"

    .line 1332
    .line 1333
    const-string v42, "g"

    .line 1334
    .line 1335
    const-string v43, "u"

    .line 1336
    .line 1337
    const-string v44, "a"

    .line 1338
    .line 1339
    filled-new-array/range {v12 .. v46}, [Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v9

    .line 1343
    invoke-direct {v8, v10, v9, v11}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1347
    .line 1348
    .line 1349
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1350
    .line 1351
    const-string v23, "p"

    .line 1352
    .line 1353
    const-string v24, "t"

    .line 1354
    .line 1355
    const-string v12, "c"

    .line 1356
    .line 1357
    const-string v13, "m"

    .line 1358
    .line 1359
    const-string v14, "."

    .line 1360
    .line 1361
    const-string v15, "a"

    .line 1362
    .line 1363
    const-string v16, "p"

    .line 1364
    .line 1365
    const-string v17, "t"

    .line 1366
    .line 1367
    const-string v18, "o"

    .line 1368
    .line 1369
    const-string v19, "i"

    .line 1370
    .line 1371
    const-string v20, "d"

    .line 1372
    .line 1373
    const-string v21, "e"

    .line 1374
    .line 1375
    const-string v22, "."

    .line 1376
    .line 1377
    filled-new-array/range {v12 .. v24}, [Ljava/lang/String;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v9

    .line 1381
    const-string v10, "Aptoide"

    .line 1382
    .line 1383
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1387
    .line 1388
    .line 1389
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1390
    .line 1391
    const-string v30, "e"

    .line 1392
    .line 1393
    const-string v31, "t"

    .line 1394
    .line 1395
    const-string v12, "o"

    .line 1396
    .line 1397
    const-string v13, "r"

    .line 1398
    .line 1399
    const-string v14, "g"

    .line 1400
    .line 1401
    const-string v15, "."

    .line 1402
    .line 1403
    const-string v16, "b"

    .line 1404
    .line 1405
    const-string v17, "l"

    .line 1406
    .line 1407
    const-string v18, "a"

    .line 1408
    .line 1409
    const-string v19, "c"

    .line 1410
    .line 1411
    const-string v20, "k"

    .line 1412
    .line 1413
    const-string v21, "m"

    .line 1414
    .line 1415
    const-string v22, "a"

    .line 1416
    .line 1417
    const-string v23, "r"

    .line 1418
    .line 1419
    const-string v24, "t"

    .line 1420
    .line 1421
    const-string v25, "."

    .line 1422
    .line 1423
    const-string v26, "m"

    .line 1424
    .line 1425
    const-string v27, "a"

    .line 1426
    .line 1427
    const-string v28, "r"

    .line 1428
    .line 1429
    const-string v29, "k"

    .line 1430
    .line 1431
    filled-new-array/range {v12 .. v31}, [Ljava/lang/String;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v9

    .line 1435
    const-string v10, "BlackMart"

    .line 1436
    .line 1437
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1444
    .line 1445
    const-string v28, "h"

    .line 1446
    .line 1447
    const-string v29, "a"

    .line 1448
    .line 1449
    const-string v12, "c"

    .line 1450
    .line 1451
    const-string v13, "o"

    .line 1452
    .line 1453
    const-string v14, "m"

    .line 1454
    .line 1455
    const-string v15, "."

    .line 1456
    .line 1457
    const-string v16, "b"

    .line 1458
    .line 1459
    const-string v17, "l"

    .line 1460
    .line 1461
    const-string v18, "a"

    .line 1462
    .line 1463
    const-string v19, "c"

    .line 1464
    .line 1465
    const-string v20, "k"

    .line 1466
    .line 1467
    const-string v21, "m"

    .line 1468
    .line 1469
    const-string v22, "a"

    .line 1470
    .line 1471
    const-string v23, "r"

    .line 1472
    .line 1473
    const-string v24, "t"

    .line 1474
    .line 1475
    const-string v25, "a"

    .line 1476
    .line 1477
    const-string v26, "l"

    .line 1478
    .line 1479
    const-string v27, "p"

    .line 1480
    .line 1481
    filled-new-array/range {v12 .. v29}, [Ljava/lang/String;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v9

    .line 1485
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1489
    .line 1490
    .line 1491
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1492
    .line 1493
    const-string v23, "i"

    .line 1494
    .line 1495
    const-string v24, "e"

    .line 1496
    .line 1497
    const-string v12, "c"

    .line 1498
    .line 1499
    const-string v13, "o"

    .line 1500
    .line 1501
    const-string v14, "m"

    .line 1502
    .line 1503
    const-string v15, "."

    .line 1504
    .line 1505
    const-string v16, "m"

    .line 1506
    .line 1507
    const-string v17, "o"

    .line 1508
    .line 1509
    const-string v18, "b"

    .line 1510
    .line 1511
    const-string v19, "o"

    .line 1512
    .line 1513
    const-string v20, "g"

    .line 1514
    .line 1515
    const-string v21, "e"

    .line 1516
    .line 1517
    const-string v22, "n"

    .line 1518
    .line 1519
    filled-new-array/range {v12 .. v24}, [Ljava/lang/String;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v9

    .line 1523
    const-string v10, "Mobogenie"

    .line 1524
    .line 1525
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1529
    .line 1530
    .line 1531
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1532
    .line 1533
    const-string v30, "i"

    .line 1534
    .line 1535
    const-string v31, "d"

    .line 1536
    .line 1537
    const-string v12, "m"

    .line 1538
    .line 1539
    const-string v13, "e"

    .line 1540
    .line 1541
    const-string v14, "."

    .line 1542
    .line 1543
    const-string v15, "o"

    .line 1544
    .line 1545
    const-string v16, "n"

    .line 1546
    .line 1547
    const-string v17, "e"

    .line 1548
    .line 1549
    const-string v18, "m"

    .line 1550
    .line 1551
    const-string v19, "o"

    .line 1552
    .line 1553
    const-string v20, "b"

    .line 1554
    .line 1555
    const-string v21, "i"

    .line 1556
    .line 1557
    const-string v22, "l"

    .line 1558
    .line 1559
    const-string v23, "e"

    .line 1560
    .line 1561
    const-string v24, "."

    .line 1562
    .line 1563
    const-string v25, "a"

    .line 1564
    .line 1565
    const-string v26, "n"

    .line 1566
    .line 1567
    const-string v27, "d"

    .line 1568
    .line 1569
    const-string v28, "r"

    .line 1570
    .line 1571
    const-string v29, "o"

    .line 1572
    .line 1573
    filled-new-array/range {v12 .. v31}, [Ljava/lang/String;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v9

    .line 1577
    const-string v10, "1Mobile"

    .line 1578
    .line 1579
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1583
    .line 1584
    .line 1585
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1586
    .line 1587
    const-string v27, "p"

    .line 1588
    .line 1589
    const-string v28, "p"

    .line 1590
    .line 1591
    const-string v12, "c"

    .line 1592
    .line 1593
    const-string v13, "o"

    .line 1594
    .line 1595
    const-string v14, "m"

    .line 1596
    .line 1597
    const-string v15, "."

    .line 1598
    .line 1599
    const-string v16, "r"

    .line 1600
    .line 1601
    const-string v17, "e"

    .line 1602
    .line 1603
    const-string v18, "p"

    .line 1604
    .line 1605
    const-string v19, "o"

    .line 1606
    .line 1607
    const-string v20, "d"

    .line 1608
    .line 1609
    const-string v21, "r"

    .line 1610
    .line 1611
    const-string v22, "o"

    .line 1612
    .line 1613
    const-string v23, "i"

    .line 1614
    .line 1615
    const-string v24, "d"

    .line 1616
    .line 1617
    const-string v25, "."

    .line 1618
    .line 1619
    const-string v26, "a"

    .line 1620
    .line 1621
    filled-new-array/range {v12 .. v28}, [Ljava/lang/String;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v9

    .line 1625
    const-string v10, "GetApk"

    .line 1626
    .line 1627
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1631
    .line 1632
    .line 1633
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1634
    .line 1635
    const-string v28, "d"

    .line 1636
    .line 1637
    const-string v29, "s"

    .line 1638
    .line 1639
    const-string v12, "c"

    .line 1640
    .line 1641
    const-string v13, "o"

    .line 1642
    .line 1643
    const-string v14, "m"

    .line 1644
    .line 1645
    const-string v15, "."

    .line 1646
    .line 1647
    const-string v16, "g"

    .line 1648
    .line 1649
    const-string v17, "e"

    .line 1650
    .line 1651
    const-string v18, "t"

    .line 1652
    .line 1653
    const-string v19, "j"

    .line 1654
    .line 1655
    const-string v20, "a"

    .line 1656
    .line 1657
    const-string v21, "r"

    .line 1658
    .line 1659
    const-string v22, "."

    .line 1660
    .line 1661
    const-string v23, "r"

    .line 1662
    .line 1663
    const-string v24, "e"

    .line 1664
    .line 1665
    const-string v25, "w"

    .line 1666
    .line 1667
    const-string v26, "a"

    .line 1668
    .line 1669
    const-string v27, "r"

    .line 1670
    .line 1671
    filled-new-array/range {v12 .. v29}, [Ljava/lang/String;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v9

    .line 1675
    const-string v10, "GetJar"

    .line 1676
    .line 1677
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1681
    .line 1682
    .line 1683
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1684
    .line 1685
    const-string v33, "e"

    .line 1686
    .line 1687
    const-string v34, "r"

    .line 1688
    .line 1689
    const-string v12, "c"

    .line 1690
    .line 1691
    const-string v13, "o"

    .line 1692
    .line 1693
    const-string v14, "m"

    .line 1694
    .line 1695
    const-string v15, "."

    .line 1696
    .line 1697
    const-string v16, "s"

    .line 1698
    .line 1699
    const-string v17, "l"

    .line 1700
    .line 1701
    const-string v18, "i"

    .line 1702
    .line 1703
    const-string v19, "d"

    .line 1704
    .line 1705
    const-string v20, "e"

    .line 1706
    .line 1707
    const-string v21, "m"

    .line 1708
    .line 1709
    const-string v22, "e"

    .line 1710
    .line 1711
    const-string v23, "."

    .line 1712
    .line 1713
    const-string v24, "s"

    .line 1714
    .line 1715
    const-string v25, "a"

    .line 1716
    .line 1717
    const-string v26, "m"

    .line 1718
    .line 1719
    const-string v27, "."

    .line 1720
    .line 1721
    const-string v28, "m"

    .line 1722
    .line 1723
    const-string v29, "a"

    .line 1724
    .line 1725
    const-string v30, "n"

    .line 1726
    .line 1727
    const-string v31, "a"

    .line 1728
    .line 1729
    const-string v32, "g"

    .line 1730
    .line 1731
    filled-new-array/range {v12 .. v34}, [Ljava/lang/String;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v9

    .line 1735
    const-string v10, "SlideMe"

    .line 1736
    .line 1737
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1741
    .line 1742
    .line 1743
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1744
    .line 1745
    const-string v21, "k"

    .line 1746
    .line 1747
    const-string v22, "e"

    .line 1748
    .line 1749
    const-string v12, "n"

    .line 1750
    .line 1751
    const-string v13, "e"

    .line 1752
    .line 1753
    const-string v14, "t"

    .line 1754
    .line 1755
    const-string v15, "."

    .line 1756
    .line 1757
    const-string v16, "a"

    .line 1758
    .line 1759
    const-string v17, "p"

    .line 1760
    .line 1761
    const-string v18, "p"

    .line 1762
    .line 1763
    const-string v19, "c"

    .line 1764
    .line 1765
    const-string v20, "a"

    .line 1766
    .line 1767
    filled-new-array/range {v12 .. v22}, [Ljava/lang/String;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v9

    .line 1771
    const-string v10, "ACMarket"

    .line 1772
    .line 1773
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1774
    .line 1775
    .line 1776
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1777
    .line 1778
    .line 1779
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1780
    .line 1781
    const-string v25, "r"

    .line 1782
    .line 1783
    const-string v26, "e"

    .line 1784
    .line 1785
    const-string v12, "a"

    .line 1786
    .line 1787
    const-string v13, "c"

    .line 1788
    .line 1789
    const-string v14, "."

    .line 1790
    .line 1791
    const-string v15, "m"

    .line 1792
    .line 1793
    const-string v16, "a"

    .line 1794
    .line 1795
    const-string v17, "r"

    .line 1796
    .line 1797
    const-string v18, "k"

    .line 1798
    .line 1799
    const-string v19, "e"

    .line 1800
    .line 1801
    const-string v20, "t"

    .line 1802
    .line 1803
    const-string v21, "."

    .line 1804
    .line 1805
    const-string v22, "s"

    .line 1806
    .line 1807
    const-string v23, "t"

    .line 1808
    .line 1809
    const-string v24, "o"

    .line 1810
    .line 1811
    filled-new-array/range {v12 .. v26}, [Ljava/lang/String;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v9

    .line 1815
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1816
    .line 1817
    .line 1818
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1819
    .line 1820
    .line 1821
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1822
    .line 1823
    const-string v21, "k"

    .line 1824
    .line 1825
    const-string v22, "e"

    .line 1826
    .line 1827
    const-string v12, "c"

    .line 1828
    .line 1829
    const-string v13, "o"

    .line 1830
    .line 1831
    const-string v14, "m"

    .line 1832
    .line 1833
    const-string v15, "."

    .line 1834
    .line 1835
    const-string v16, "a"

    .line 1836
    .line 1837
    const-string v17, "p"

    .line 1838
    .line 1839
    const-string v18, "p"

    .line 1840
    .line 1841
    const-string v19, "c"

    .line 1842
    .line 1843
    const-string v20, "a"

    .line 1844
    .line 1845
    filled-new-array/range {v12 .. v22}, [Ljava/lang/String;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v9

    .line 1849
    const-string v10, "AppCake"

    .line 1850
    .line 1851
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1852
    .line 1853
    .line 1854
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1855
    .line 1856
    .line 1857
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1858
    .line 1859
    const-string v19, "p"

    .line 1860
    .line 1861
    const-string v20, "p"

    .line 1862
    .line 1863
    const-string v12, "c"

    .line 1864
    .line 1865
    const-string v13, "o"

    .line 1866
    .line 1867
    const-string v14, "m"

    .line 1868
    .line 1869
    const-string v15, "."

    .line 1870
    .line 1871
    const-string v16, "z"

    .line 1872
    .line 1873
    const-string v17, "m"

    .line 1874
    .line 1875
    const-string v18, "a"

    .line 1876
    .line 1877
    filled-new-array/range {v12 .. v20}, [Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v9

    .line 1881
    const-string v10, "Z Market"

    .line 1882
    .line 1883
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1887
    .line 1888
    .line 1889
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1890
    .line 1891
    const-string v36, "e"

    .line 1892
    .line 1893
    const-string v37, "r"

    .line 1894
    .line 1895
    const-string v12, "c"

    .line 1896
    .line 1897
    const-string v13, "o"

    .line 1898
    .line 1899
    const-string v14, "m"

    .line 1900
    .line 1901
    const-string v15, "."

    .line 1902
    .line 1903
    const-string v16, "d"

    .line 1904
    .line 1905
    const-string v17, "v"

    .line 1906
    .line 1907
    const-string v18, "."

    .line 1908
    .line 1909
    const-string v19, "m"

    .line 1910
    .line 1911
    const-string v20, "a"

    .line 1912
    .line 1913
    const-string v21, "r"

    .line 1914
    .line 1915
    const-string v22, "k"

    .line 1916
    .line 1917
    const-string v23, "e"

    .line 1918
    .line 1919
    const-string v24, "t"

    .line 1920
    .line 1921
    const-string v25, "m"

    .line 1922
    .line 1923
    const-string v26, "o"

    .line 1924
    .line 1925
    const-string v27, "d"

    .line 1926
    .line 1927
    const-string v28, "."

    .line 1928
    .line 1929
    const-string v29, "i"

    .line 1930
    .line 1931
    const-string v30, "n"

    .line 1932
    .line 1933
    const-string v31, "s"

    .line 1934
    .line 1935
    const-string v32, "t"

    .line 1936
    .line 1937
    const-string v33, "a"

    .line 1938
    .line 1939
    const-string v34, "l"

    .line 1940
    .line 1941
    const-string v35, "l"

    .line 1942
    .line 1943
    filled-new-array/range {v12 .. v37}, [Ljava/lang/String;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v9

    .line 1947
    const-string v10, "Modded Play Store"

    .line 1948
    .line 1949
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 1950
    .line 1951
    .line 1952
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1953
    .line 1954
    .line 1955
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 1956
    .line 1957
    const-string v30, "i"

    .line 1958
    .line 1959
    const-string v31, "d"

    .line 1960
    .line 1961
    const-string v12, "o"

    .line 1962
    .line 1963
    const-string v13, "r"

    .line 1964
    .line 1965
    const-string v14, "g"

    .line 1966
    .line 1967
    const-string v15, "."

    .line 1968
    .line 1969
    const-string v16, "m"

    .line 1970
    .line 1971
    const-string v17, "o"

    .line 1972
    .line 1973
    const-string v18, "b"

    .line 1974
    .line 1975
    const-string v19, "i"

    .line 1976
    .line 1977
    const-string v20, "l"

    .line 1978
    .line 1979
    const-string v21, "i"

    .line 1980
    .line 1981
    const-string v22, "s"

    .line 1982
    .line 1983
    const-string v23, "m"

    .line 1984
    .line 1985
    const-string v24, "."

    .line 1986
    .line 1987
    const-string v25, "a"

    .line 1988
    .line 1989
    const-string v26, "n"

    .line 1990
    .line 1991
    const-string v27, "d"

    .line 1992
    .line 1993
    const-string v28, "r"

    .line 1994
    .line 1995
    const-string v29, "o"

    .line 1996
    .line 1997
    filled-new-array/range {v12 .. v31}, [Ljava/lang/String;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v9

    .line 2001
    const-string v10, "Mobilism Market"

    .line 2002
    .line 2003
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2007
    .line 2008
    .line 2009
    new-instance v8, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 2010
    .line 2011
    const-string v27, "e"

    .line 2012
    .line 2013
    const-string v28, "e"

    .line 2014
    .line 2015
    const-string v12, "c"

    .line 2016
    .line 2017
    const-string v13, "o"

    .line 2018
    .line 2019
    const-string v14, "m"

    .line 2020
    .line 2021
    const-string v15, "."

    .line 2022
    .line 2023
    const-string v16, "a"

    .line 2024
    .line 2025
    const-string v17, "l"

    .line 2026
    .line 2027
    const-string v18, "l"

    .line 2028
    .line 2029
    const-string v19, "i"

    .line 2030
    .line 2031
    const-string v20, "n"

    .line 2032
    .line 2033
    const-string v21, "o"

    .line 2034
    .line 2035
    const-string v22, "n"

    .line 2036
    .line 2037
    const-string v23, "e"

    .line 2038
    .line 2039
    const-string v24, "."

    .line 2040
    .line 2041
    const-string v25, "f"

    .line 2042
    .line 2043
    const-string v26, "r"

    .line 2044
    .line 2045
    filled-new-array/range {v12 .. v28}, [Ljava/lang/String;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v9

    .line 2049
    const-string v10, "All-in-one Downloader"

    .line 2050
    .line 2051
    invoke-direct {v8, v10, v9, v2}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V

    .line 2052
    .line 2053
    .line 2054
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2055
    .line 2056
    .line 2057
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2058
    .line 2059
    .line 2060
    new-instance v7, Ljava/util/HashSet;

    .line 2061
    .line 2062
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 2063
    .line 2064
    .line 2065
    new-instance v8, Ljava/util/ArrayList;

    .line 2066
    .line 2067
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2068
    .line 2069
    .line 2070
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 2071
    .line 2072
    .line 2073
    move-result v9

    .line 2074
    const/4 v12, 0x0

    .line 2075
    :cond_1
    :goto_0
    if-ge v12, v9, :cond_2

    .line 2076
    .line 2077
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v13

    .line 2081
    add-int/lit8 v12, v12, 0x1

    .line 2082
    .line 2083
    move-object v14, v13

    .line 2084
    check-cast v14, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 2085
    .line 2086
    invoke-virtual {v14}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->a()Ljava/lang/String;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v14

    .line 2090
    invoke-virtual {v7, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2091
    .line 2092
    .line 2093
    move-result v14

    .line 2094
    if-eqz v14, :cond_1

    .line 2095
    .line 2096
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2097
    .line 2098
    .line 2099
    goto :goto_0

    .line 2100
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    .line 2101
    .line 2102
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2103
    .line 2104
    .line 2105
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v7

    .line 2109
    if-eqz v7, :cond_3

    .line 2110
    .line 2111
    const/16 v8, 0x80

    .line 2112
    .line 2113
    invoke-virtual {v7, v8}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v8

    .line 2117
    goto :goto_1

    .line 2118
    :catch_0
    nop

    .line 2119
    goto/16 :goto_9

    .line 2120
    .line 2121
    :cond_3
    const/4 v8, 0x0

    .line 2122
    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 2123
    .line 2124
    .line 2125
    move-result v9

    .line 2126
    const/4 v12, 0x0

    .line 2127
    const/4 v13, 0x0

    .line 2128
    :goto_2
    if-ge v13, v9, :cond_10

    .line 2129
    .line 2130
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v14

    .line 2134
    add-int/lit8 v13, v13, 0x1

    .line 2135
    .line 2136
    check-cast v14, Lcom/github/javiersantos/piracychecker/enums/PirateApp;

    .line 2137
    .line 2138
    if-eqz v4, :cond_4

    .line 2139
    .line 2140
    iget-object v10, v14, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->b:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 2141
    .line 2142
    if-ne v10, v11, :cond_4

    .line 2143
    .line 2144
    const/4 v10, 0x1

    .line 2145
    goto :goto_3

    .line 2146
    :cond_4
    const/4 v10, 0x0

    .line 2147
    :goto_3
    if-eqz v5, :cond_5

    .line 2148
    .line 2149
    const/16 v17, 0x1

    .line 2150
    .line 2151
    iget-object v15, v14, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->b:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 2152
    .line 2153
    if-ne v15, v2, :cond_6

    .line 2154
    .line 2155
    const/4 v15, 0x1

    .line 2156
    goto :goto_4

    .line 2157
    :cond_5
    const/16 v17, 0x1

    .line 2158
    .line 2159
    :cond_6
    const/4 v15, 0x0

    .line 2160
    :goto_4
    iget-object v3, v14, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->b:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 2161
    .line 2162
    move-object/from16 v19, v1

    .line 2163
    .line 2164
    sget-object v1, Lcom/github/javiersantos/piracychecker/enums/AppType;->j:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 2165
    .line 2166
    if-ne v3, v1, :cond_7

    .line 2167
    .line 2168
    const/4 v1, 0x1

    .line 2169
    goto :goto_5

    .line 2170
    :cond_7
    const/4 v1, 0x0

    .line 2171
    :goto_5
    if-nez v10, :cond_8

    .line 2172
    .line 2173
    if-nez v15, :cond_8

    .line 2174
    .line 2175
    if-eqz v1, :cond_e

    .line 2176
    .line 2177
    :cond_8
    if-eqz v8, :cond_9

    .line 2178
    .line 2179
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 2180
    .line 2181
    .line 2182
    move-result v1

    .line 2183
    if-eqz v1, :cond_a

    .line 2184
    .line 2185
    :cond_9
    const/4 v12, 0x0

    .line 2186
    goto :goto_6

    .line 2187
    :cond_a
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v1

    .line 2191
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2192
    .line 2193
    .line 2194
    move-result v3

    .line 2195
    if-eqz v3, :cond_9

    .line 2196
    .line 2197
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v3

    .line 2201
    check-cast v3, Landroid/content/pm/ApplicationInfo;

    .line 2202
    .line 2203
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2204
    .line 2205
    const-string v10, "it.packageName"

    .line 2206
    .line 2207
    invoke-static {v3, v10}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2208
    .line 2209
    .line 2210
    invoke-virtual {v14}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->a()Ljava/lang/String;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v10

    .line 2214
    invoke-static {v3, v10}, Ll5/e;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2215
    .line 2216
    .line 2217
    move-result v3

    .line 2218
    if-eqz v3, :cond_b

    .line 2219
    .line 2220
    const/4 v12, 0x1

    .line 2221
    :goto_6
    if-nez v12, :cond_e

    .line 2222
    .line 2223
    invoke-virtual {v14}, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->a()Ljava/lang/String;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v1

    .line 2227
    invoke-virtual {v7, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2231
    if-eqz v1, :cond_d

    .line 2232
    .line 2233
    :try_start_1
    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v3

    .line 2237
    const/high16 v10, 0x10000

    .line 2238
    .line 2239
    invoke-virtual {v3, v1, v10}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v1

    .line 2243
    if-eqz v1, :cond_c

    .line 2244
    .line 2245
    goto :goto_7

    .line 2246
    :cond_c
    sget-object v1, Lq4/r;->h:Lq4/r;

    .line 2247
    .line 2248
    :goto_7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 2249
    .line 2250
    .line 2251
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 2252
    xor-int/lit8 v1, v1, 0x1

    .line 2253
    .line 2254
    move v12, v1

    .line 2255
    goto :goto_8

    .line 2256
    :catch_1
    nop

    .line 2257
    :cond_d
    const/4 v12, 0x0

    .line 2258
    :cond_e
    :goto_8
    if-eqz v12, :cond_f

    .line 2259
    .line 2260
    goto :goto_a

    .line 2261
    :cond_f
    move-object/from16 v1, v19

    .line 2262
    .line 2263
    goto/16 :goto_2

    .line 2264
    .line 2265
    :cond_10
    :goto_9
    const/4 v14, 0x0

    .line 2266
    :goto_a
    if-eqz p1, :cond_14

    .line 2267
    .line 2268
    iget-boolean v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->h:Z

    .line 2269
    .line 2270
    if-eqz v1, :cond_11

    .line 2271
    .line 2272
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 2273
    .line 2274
    if-eqz v1, :cond_11

    .line 2275
    .line 2276
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v1

    .line 2280
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 2281
    .line 2282
    and-int/lit8 v1, v1, 0x2

    .line 2283
    .line 2284
    if-eqz v1, :cond_11

    .line 2285
    .line 2286
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->m:Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;

    .line 2287
    .line 2288
    if-eqz v1, :cond_17

    .line 2289
    .line 2290
    sget-object v2, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->k:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 2291
    .line 2292
    const/4 v3, 0x0

    .line 2293
    invoke-interface {v1, v2, v3}, Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;->doNotAllow(Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;Lcom/github/javiersantos/piracychecker/enums/PirateApp;)V

    .line 2294
    .line 2295
    .line 2296
    return-void

    .line 2297
    :cond_11
    if-eqz v14, :cond_13

    .line 2298
    .line 2299
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->m:Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;

    .line 2300
    .line 2301
    if-eqz v1, :cond_17

    .line 2302
    .line 2303
    iget-object v3, v14, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->b:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 2304
    .line 2305
    if-ne v3, v2, :cond_12

    .line 2306
    .line 2307
    sget-object v2, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->n:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 2308
    .line 2309
    goto :goto_b

    .line 2310
    :cond_12
    sget-object v2, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->l:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 2311
    .line 2312
    :goto_b
    invoke-interface {v1, v2, v14}, Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;->doNotAllow(Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;Lcom/github/javiersantos/piracychecker/enums/PirateApp;)V

    .line 2313
    .line 2314
    .line 2315
    return-void

    .line 2316
    :cond_13
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->l:Lcom/github/javiersantos/piracychecker/callbacks/AllowCallback;

    .line 2317
    .line 2318
    if-eqz v1, :cond_17

    .line 2319
    .line 2320
    invoke-interface {v1}, Lcom/github/javiersantos/piracychecker/callbacks/AllowCallback;->allow()V

    .line 2321
    .line 2322
    .line 2323
    return-void

    .line 2324
    :cond_14
    if-eqz v14, :cond_16

    .line 2325
    .line 2326
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->m:Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;

    .line 2327
    .line 2328
    if-eqz v1, :cond_17

    .line 2329
    .line 2330
    iget-object v3, v14, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->b:Lcom/github/javiersantos/piracychecker/enums/AppType;

    .line 2331
    .line 2332
    if-ne v3, v2, :cond_15

    .line 2333
    .line 2334
    sget-object v2, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->n:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 2335
    .line 2336
    goto :goto_c

    .line 2337
    :cond_15
    sget-object v2, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->l:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 2338
    .line 2339
    :goto_c
    invoke-interface {v1, v2, v14}, Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;->doNotAllow(Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;Lcom/github/javiersantos/piracychecker/enums/PirateApp;)V

    .line 2340
    .line 2341
    .line 2342
    return-void

    .line 2343
    :cond_16
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->m:Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;

    .line 2344
    .line 2345
    if-eqz v1, :cond_17

    .line 2346
    .line 2347
    sget-object v2, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->i:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 2348
    .line 2349
    const/4 v3, 0x0

    .line 2350
    invoke-interface {v1, v2, v3}, Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;->doNotAllow(Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;Lcom/github/javiersantos/piracychecker/enums/PirateApp;)V

    .line 2351
    .line 2352
    .line 2353
    :cond_17
    return-void
.end method
