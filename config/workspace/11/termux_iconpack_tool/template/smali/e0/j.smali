.class public abstract Le0/j;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:Lu2/f;

.field public static final b:Landroidx/recyclerview/widget/r2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Le0/o;

    .line 8
    .line 9
    invoke-direct {v0}, Lu2/f;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Le0/j;->a:Lu2/f;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Le0/n;

    .line 20
    .line 21
    invoke-direct {v0}, Le0/m;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Le0/j;->a:Lu2/f;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/16 v1, 0x1a

    .line 28
    .line 29
    if-lt v0, v1, :cond_2

    .line 30
    .line 31
    new-instance v0, Le0/m;

    .line 32
    .line 33
    invoke-direct {v0}, Le0/m;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Le0/j;->a:Lu2/f;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/16 v1, 0x18

    .line 40
    .line 41
    if-lt v0, v1, :cond_4

    .line 42
    .line 43
    sget-object v0, Le0/l;->c:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const-string v1, "TypefaceCompatApi24Impl"

    .line 48
    .line 49
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 50
    .line 51
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_3
    if-eqz v0, :cond_4

    .line 55
    .line 56
    new-instance v0, Le0/l;

    .line 57
    .line 58
    invoke-direct {v0}, Lu2/f;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, Le0/j;->a:Lu2/f;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    new-instance v0, Le0/k;

    .line 65
    .line 66
    invoke-direct {v0}, Lu2/f;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v0, Le0/j;->a:Lu2/f;

    .line 70
    .line 71
    :goto_0
    new-instance v0, Landroidx/recyclerview/widget/r2;

    .line 72
    .line 73
    const/16 v1, 0x10

    .line 74
    .line 75
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/r2;-><init>(I)V

    .line 76
    .line 77
    .line 78
    sput-object v0, Le0/j;->b:Landroidx/recyclerview/widget/r2;

    .line 79
    .line 80
    return-void
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

.method public static a(Landroid/content/Context;Ld0/e;Landroid/content/res/Resources;ILjava/lang/String;IILd0/b;Z)Landroid/graphics/Typeface;
    .locals 14

    .line 1
    move/from16 v4, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, p1, Ld0/h;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v6, -0x3

    .line 9
    if-eqz v2, :cond_d

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Ld0/h;

    .line 13
    .line 14
    iget-object v2, v0, Ld0/h;->d:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v2, v5}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v8, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 32
    .line 33
    invoke-static {v8, v5}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2, v8}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    move-object v2, v7

    .line 47
    :goto_1
    if-eqz v2, :cond_3

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    new-instance p0, Landroid/os/Handler;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroidx/appcompat/app/z;

    .line 61
    .line 62
    invoke-direct {v0, v3, v1, v2}, Landroidx/appcompat/app/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v2

    .line 69
    :cond_3
    const/4 v8, 0x1

    .line 70
    if-eqz p8, :cond_5

    .line 71
    .line 72
    iget v2, v0, Ld0/h;->c:I

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    :goto_2
    const/4 v2, 0x1

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const/4 v2, 0x0

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    if-nez v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_3
    const/4 v9, -0x1

    .line 84
    if-eqz p8, :cond_6

    .line 85
    .line 86
    iget v10, v0, Ld0/h;->b:I

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const/4 v10, -0x1

    .line 90
    :goto_4
    new-instance v11, Landroid/os/Handler;

    .line 91
    .line 92
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-direct {v11, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 97
    .line 98
    .line 99
    new-instance v12, La1/q;

    .line 100
    .line 101
    const/16 v13, 0xb

    .line 102
    .line 103
    invoke-direct {v12, v5, v13}, La1/q;-><init>(CI)V

    .line 104
    .line 105
    .line 106
    iput-object v1, v12, La1/q;->i:Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v0, v0, Ld0/h;->a:Landroidx/lifecycle/a1;

    .line 109
    .line 110
    new-instance v13, Lu2/c;

    .line 111
    .line 112
    invoke-direct {v13, v12, v11}, Lu2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    if-eqz v2, :cond_9

    .line 116
    .line 117
    sget-object v1, Lj0/g;->a:Landroidx/recyclerview/widget/r2;

    .line 118
    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Landroidx/lifecycle/a1;->m:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v2, "-"

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    sget-object v2, Lj0/g;->a:Landroidx/recyclerview/widget/r2;

    .line 144
    .line 145
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/r2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Landroid/graphics/Typeface;

    .line 150
    .line 151
    if-eqz v2, :cond_7

    .line 152
    .line 153
    new-instance p0, Landroidx/recyclerview/widget/e;

    .line 154
    .line 155
    invoke-direct {p0, v12, v2, v3, v5}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v11, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    :goto_5
    move-object v7, v2

    .line 162
    goto/16 :goto_9

    .line 163
    .line 164
    :cond_7
    if-ne v10, v9, :cond_8

    .line 165
    .line 166
    invoke-static {v1, p0, v0, v4}, Lj0/g;->a(Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/a1;I)Lj0/f;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v13, p0}, Lu2/c;->h(Lj0/f;)V

    .line 171
    .line 172
    .line 173
    iget-object v7, p0, Lj0/f;->a:Landroid/graphics/Typeface;

    .line 174
    .line 175
    goto/16 :goto_9

    .line 176
    .line 177
    :cond_8
    move-object v3, v0

    .line 178
    new-instance v0, Lj0/d;

    .line 179
    .line 180
    const/4 v5, 0x0

    .line 181
    move-object v2, p0

    .line 182
    invoke-direct/range {v0 .. v5}, Lj0/d;-><init>(Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/a1;II)V

    .line 183
    .line 184
    .line 185
    :try_start_0
    sget-object p0, Lj0/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 186
    .line 187
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 188
    .line 189
    .line 190
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 191
    int-to-long v0, v10

    .line 192
    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 193
    .line 194
    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 198
    :try_start_2
    check-cast p0, Lj0/f;

    .line 199
    .line 200
    invoke-virtual {v13, p0}, Lu2/c;->h(Lj0/f;)V

    .line 201
    .line 202
    .line 203
    iget-object v7, p0, Lj0/f;->a:Landroid/graphics/Typeface;

    .line 204
    .line 205
    goto/16 :goto_9

    .line 206
    .line 207
    :catch_0
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    goto :goto_6

    .line 210
    :catch_1
    move-exception v0

    .line 211
    move-object p0, v0

    .line 212
    goto :goto_7

    .line 213
    :catch_2
    new-instance p0, Ljava/lang/InterruptedException;

    .line 214
    .line 215
    const-string v0, "timeout"

    .line 216
    .line 217
    invoke-direct {p0, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p0

    .line 221
    :goto_6
    throw p0

    .line 222
    :goto_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 223
    .line 224
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 228
    :catch_3
    iget-object p0, v13, Lu2/c;->i:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p0, Landroid/os/Handler;

    .line 231
    .line 232
    iget-object v0, v13, Lu2/c;->h:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, La1/q;

    .line 235
    .line 236
    new-instance v1, La1/k;

    .line 237
    .line 238
    invoke-direct {v1, v0, v6}, La1/k;-><init>(La1/q;I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 242
    .line 243
    .line 244
    goto/16 :goto_9

    .line 245
    .line 246
    :cond_9
    sget-object v1, Lj0/g;->a:Landroidx/recyclerview/widget/r2;

    .line 247
    .line 248
    new-instance v1, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    iget-object v2, v0, Landroidx/lifecycle/a1;->m:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v2, Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v2, "-"

    .line 261
    .line 262
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    sget-object v2, Lj0/g;->a:Landroidx/recyclerview/widget/r2;

    .line 273
    .line 274
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/r2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    check-cast v2, Landroid/graphics/Typeface;

    .line 279
    .line 280
    if-eqz v2, :cond_a

    .line 281
    .line 282
    new-instance p0, Landroidx/recyclerview/widget/e;

    .line 283
    .line 284
    invoke-direct {p0, v12, v2, v3, v5}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v11, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 288
    .line 289
    .line 290
    goto/16 :goto_5

    .line 291
    .line 292
    :cond_a
    new-instance v2, Lj0/e;

    .line 293
    .line 294
    invoke-direct {v2, v5, v13}, Lj0/e;-><init>(ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    sget-object v5, Lj0/g;->c:Ljava/lang/Object;

    .line 298
    .line 299
    monitor-enter v5

    .line 300
    :try_start_3
    sget-object v3, Lj0/g;->d:Lq/k;

    .line 301
    .line 302
    invoke-virtual {v3, v1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    check-cast v6, Ljava/util/ArrayList;

    .line 307
    .line 308
    if-eqz v6, :cond_b

    .line 309
    .line 310
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    monitor-exit v5

    .line 314
    goto :goto_9

    .line 315
    :catchall_0
    move-exception v0

    .line 316
    move-object p0, v0

    .line 317
    goto :goto_a

    .line 318
    :cond_b
    new-instance v6, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3, v1, v6}, Lq/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 330
    move-object v3, v0

    .line 331
    new-instance v0, Lj0/d;

    .line 332
    .line 333
    const/4 v5, 0x1

    .line 334
    move-object v2, p0

    .line 335
    invoke-direct/range {v0 .. v5}, Lj0/d;-><init>(Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/a1;II)V

    .line 336
    .line 337
    .line 338
    sget-object p0, Lj0/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 339
    .line 340
    new-instance v2, Lj0/e;

    .line 341
    .line 342
    invoke-direct {v2, v8, v1}, Lj0/e;-><init>(ILjava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    if-nez v1, :cond_c

    .line 350
    .line 351
    new-instance v1, Landroid/os/Handler;

    .line 352
    .line 353
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_c
    new-instance v1, Landroid/os/Handler;

    .line 362
    .line 363
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 364
    .line 365
    .line 366
    :goto_8
    new-instance v3, Lj0/k;

    .line 367
    .line 368
    invoke-direct {v3}, Lj0/k;-><init>()V

    .line 369
    .line 370
    .line 371
    iput-object v0, v3, Lj0/k;->i:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v2, v3, Lj0/k;->j:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v1, v3, Lj0/k;->k:Ljava/lang/Object;

    .line 376
    .line 377
    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 378
    .line 379
    .line 380
    :goto_9
    move-object p0, v7

    .line 381
    move-object/from16 v7, p2

    .line 382
    .line 383
    goto :goto_b

    .line 384
    :goto_a
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 385
    throw p0

    .line 386
    :cond_d
    sget-object v5, Le0/j;->a:Lu2/f;

    .line 387
    .line 388
    move-object v0, p1

    .line 389
    check-cast v0, Ld0/f;

    .line 390
    .line 391
    move-object/from16 v7, p2

    .line 392
    .line 393
    invoke-virtual {v5, p0, v0, v7, v4}, Lu2/f;->i(Landroid/content/Context;Ld0/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    if-eqz v1, :cond_f

    .line 398
    .line 399
    if-eqz p0, :cond_e

    .line 400
    .line 401
    new-instance v0, Landroid/os/Handler;

    .line 402
    .line 403
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 408
    .line 409
    .line 410
    new-instance v2, Landroidx/appcompat/app/z;

    .line 411
    .line 412
    invoke-direct {v2, v3, v1, p0}, Landroidx/appcompat/app/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 416
    .line 417
    .line 418
    goto :goto_b

    .line 419
    :cond_e
    invoke-virtual {v1, v6}, Ld0/b;->a(I)V

    .line 420
    .line 421
    .line 422
    :cond_f
    :goto_b
    if-eqz p0, :cond_10

    .line 423
    .line 424
    sget-object v0, Le0/j;->b:Landroidx/recyclerview/widget/r2;

    .line 425
    .line 426
    invoke-static/range {p2 .. p6}, Le0/j;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-virtual {v0, v1, p0}, Landroidx/recyclerview/widget/r2;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    :cond_10
    return-object p0
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
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
.end method
