.class public final Ldev/jahir/frames/data/workers/WallpaperDownloader;
.super Ldev/jahir/frames/data/workers/ContextAwareWorker;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/data/workers/WallpaperDownloader$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/frames/data/workers/WallpaperDownloader$Companion;

.field public static final DOWNLOAD_FILE_EXISTED:Ljava/lang/String; = "download_file_existed"

.field public static final DOWNLOAD_IS_LOCAL:Ljava/lang/String; = "download_is_local"

.field public static final DOWNLOAD_PATH_KEY:Ljava/lang/String; = "download_path"

.field public static final DOWNLOAD_TASK_KEY:Ljava/lang/String; = "download_task"

.field public static final DOWNLOAD_URL_KEY:Ljava/lang/String; = "download_url"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/data/workers/WallpaperDownloader$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/data/workers/WallpaperDownloader;->Companion:Ldev/jahir/frames/data/workers/WallpaperDownloader$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "params"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/workers/ContextAwareWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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
.end method

.method public static final synthetic access$downloadUsingNotificationManager(Ldev/jahir/frames/data/workers/WallpaperDownloader;Ljava/lang/String;Ljava/io/File;)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/workers/WallpaperDownloader;->downloadUsingNotificationManager(Ljava/lang/String;Ljava/io/File;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
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
    .line 38
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

.method private final downloadUsingNotificationManager(Ljava/lang/String;Ljava/io/File;)J
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "file://"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Ll5/m;->j0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    const-string v1, "file:///android_asset/"

    .line 13
    .line 14
    const-string v3, ""

    .line 15
    .line 16
    invoke-static {v0, v1, v3, v2}, Ll5/m;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ldev/jahir/frames/data/network/LocalDownloadListenerThread;

    .line 21
    .line 22
    invoke-virtual {p0}, Ldev/jahir/frames/data/workers/ContextAwareWorker;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    move-object/from16 v4, p2

    .line 27
    .line 28
    invoke-direct {v1, v3, v0, v4, p0}, Ldev/jahir/frames/data/network/LocalDownloadListenerThread;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    new-instance v1, Lg5/e;

    .line 39
    .line 40
    shr-int/lit8 v3, v0, 0x1f

    .line 41
    .line 42
    not-int v4, v0

    .line 43
    shl-int/lit8 v5, v0, 0xa

    .line 44
    .line 45
    ushr-int/lit8 v6, v3, 0x4

    .line 46
    .line 47
    xor-int/2addr v5, v6

    .line 48
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput v0, v1, Lg5/e;->j:I

    .line 52
    .line 53
    iput v3, v1, Lg5/e;->k:I

    .line 54
    .line 55
    iput v2, v1, Lg5/e;->l:I

    .line 56
    .line 57
    iput v2, v1, Lg5/e;->m:I

    .line 58
    .line 59
    iput v4, v1, Lg5/e;->n:I

    .line 60
    .line 61
    iput v5, v1, Lg5/e;->o:I

    .line 62
    .line 63
    or-int/2addr v0, v3

    .line 64
    or-int/2addr v0, v4

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    :goto_0
    const/16 v0, 0x40

    .line 68
    .line 69
    if-ge v2, v0, :cond_0

    .line 70
    .line 71
    invoke-virtual {v1}, Lg5/e;->a()I

    .line 72
    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {v1}, Lg5/e;->a()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-long v2, v0

    .line 82
    const/16 v0, 0x20

    .line 83
    .line 84
    shl-long/2addr v2, v0

    .line 85
    invoke-virtual {v1}, Lg5/e;->a()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    int-to-long v0, v0

    .line 90
    add-long/2addr v2, v0

    .line 91
    return-wide v2

    .line 92
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    const-string v1, "Initial state must have at least one non-zero element."

    .line 95
    .line 96
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_2
    move-object/from16 v4, p2

    .line 101
    .line 102
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const-wide/16 v5, -0x1

    .line 107
    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    goto/16 :goto_5

    .line 111
    .line 112
    :cond_3
    invoke-virtual {p0}, Ldev/jahir/frames/data/workers/ContextAwareWorker;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const/4 v7, 0x1

    .line 117
    if-eqz v3, :cond_4

    .line 118
    .line 119
    invoke-static {v3}, Ldev/jahir/frames/extensions/context/ContextKt;->getPreferences(Landroid/content/Context;)Ldev/jahir/frames/data/Preferences;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-eqz v3, :cond_4

    .line 124
    .line 125
    invoke-virtual {v3}, Ldev/jahir/frames/data/Preferences;->getShouldDownloadOnWiFiOnly()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    goto :goto_1

    .line 130
    :cond_4
    const/4 v3, 0x1

    .line 131
    :goto_1
    if-eqz v3, :cond_5

    .line 132
    .line 133
    const/4 v8, 0x2

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    const/4 v8, 0x3

    .line 136
    :goto_2
    new-instance v9, Landroid/app/DownloadManager$Request;

    .line 137
    .line 138
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {v9, v0}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v9, v0}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ldev/jahir/frames/data/workers/ContextAwareWorker;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const/4 v11, 0x0

    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    sget v12, Ldev/jahir/frames/R$string;->downloading_wallpaper:I

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    new-array v14, v7, [Ljava/lang/Object;

    .line 166
    .line 167
    aput-object v13, v14, v2

    .line 168
    .line 169
    invoke-static {v0, v12, v14}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    goto :goto_3

    .line 174
    :cond_6
    move-object v0, v11

    .line 175
    :goto_3
    invoke-virtual {v9, v0}, Landroid/app/DownloadManager$Request;->setDescription(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9, v1}, Landroid/app/DownloadManager$Request;->setDestinationUri(Landroid/net/Uri;)Landroid/app/DownloadManager$Request;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v8}, Landroid/app/DownloadManager$Request;->setAllowedNetworkTypes(I)Landroid/app/DownloadManager$Request;

    .line 182
    .line 183
    .line 184
    xor-int/lit8 v0, v3, 0x1

    .line 185
    .line 186
    invoke-virtual {v9, v0}, Landroid/app/DownloadManager$Request;->setAllowedOverRoaming(Z)Landroid/app/DownloadManager$Request;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v9, v7}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9}, Landroid/app/DownloadManager$Request;->allowScanningByMediaScanner()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Ldev/jahir/frames/data/workers/ContextAwareWorker;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_7

    .line 200
    .line 201
    const-string v1, "download"

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    goto :goto_4

    .line 208
    :cond_7
    move-object v0, v11

    .line 209
    :goto_4
    instance-of v1, v0, Landroid/app/DownloadManager;

    .line 210
    .line 211
    if-eqz v1, :cond_8

    .line 212
    .line 213
    move-object v11, v0

    .line 214
    check-cast v11, Landroid/app/DownloadManager;

    .line 215
    .line 216
    :cond_8
    if-nez v11, :cond_9

    .line 217
    .line 218
    :goto_5
    return-wide v5

    .line 219
    :cond_9
    :try_start_0
    invoke-virtual {v11, v9}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    new-instance v4, Ldev/jahir/frames/data/network/DownloadListenerThread;

    .line 224
    .line 225
    invoke-virtual {p0}, Ldev/jahir/frames/data/workers/ContextAwareWorker;->getContext()Landroid/content/Context;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    const-string v0, "getAbsolutePath(...)"

    .line 234
    .line 235
    invoke-static {v9, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    move-object v10, p0

    .line 239
    move-object v6, v11

    .line 240
    invoke-direct/range {v4 .. v10}, Ldev/jahir/frames/data/network/DownloadListenerThread;-><init>(Landroid/content/Context;Landroid/app/DownloadManager;JLjava/lang/String;Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 244
    .line 245
    .line 246
    return-wide v7

    .line 247
    :catch_0
    move-exception v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 249
    .line 250
    .line 251
    return-wide v5
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
.end method


# virtual methods
.method public doWork(Lt4/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ll2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;

    .line 7
    .line 8
    iget v1, v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;-><init>(Ldev/jahir/frames/data/workers/WallpaperDownloader;Lt4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$2;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {p1, p0, v2}, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$2;-><init>(Ldev/jahir/frames/data/workers/WallpaperDownloader;Lt4/c;)V

    .line 55
    .line 56
    .line 57
    iput v3, v0, Ldev/jahir/frames/data/workers/WallpaperDownloader$doWork$1;->label:I

    .line 58
    .line 59
    invoke-static {p1, v0}, Ln5/x;->e(Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    const-string v0, "coroutineScope(...)"

    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object p1
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

.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lk4/b;->a(Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Ldev/jahir/frames/data/workers/ContextAwareWorker;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, "Unexpected error!"

    .line 22
    .line 23
    :cond_0
    const/4 v1, 0x1

    .line 24
    invoke-static {v0, p1, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->toast(Landroid/content/Context;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :catch_0
    :cond_1
    return-void
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

.method public onProgress(I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk4/b;->b(Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener;I)V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lk4/b;->c(Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    sget-object v0, Ldev/jahir/frames/data/network/MediaScanner;->INSTANCE:Ldev/jahir/frames/data/network/MediaScanner;

    .line 10
    .line 11
    invoke-virtual {p0}, Ldev/jahir/frames/data/workers/ContextAwareWorker;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1, p1}, Ldev/jahir/frames/data/network/MediaScanner;->scan(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    return-void
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
