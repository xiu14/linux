.class public final Landroidx/lifecycle/b0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/b0;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/f0;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/lifecycle/f0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/lifecycle/f0;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/lifecycle/f0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/lifecycle/f0;

    .line 17
    .line 18
    sget-object v3, Landroidx/lifecycle/f0;->k:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v3, v2, Landroidx/lifecycle/f0;->f:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-object v0, p0, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroidx/lifecycle/f0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->l(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/lifecycle/b0;->h:I

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    check-cast v4, Lz5/c;

    .line 16
    .line 17
    monitor-enter v4

    .line 18
    :try_start_0
    invoke-virtual {v4}, Lz5/c;->c()Lz5/a;

    .line 19
    .line 20
    .line 21
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 22
    monitor-exit v4

    .line 23
    if-nez v5, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v4, v5, Lz5/a;->c:Lz5/b;

    .line 27
    .line 28
    invoke-static {v4}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v6, v0

    .line 34
    check-cast v6, Lz5/c;

    .line 35
    .line 36
    sget-object v0, Lz5/c;->j:Ljava/util/logging/Logger;

    .line 37
    .line 38
    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 39
    .line 40
    invoke-virtual {v0, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 47
    .line 48
    .line 49
    move-result-wide v8

    .line 50
    const-string v0, "starting"

    .line 51
    .line 52
    invoke-static {v5, v4, v0}, Lq3/a;->b(Lz5/a;Lz5/b;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move-wide v8, v2

    .line 57
    :goto_1
    :try_start_1
    invoke-static {v6, v5}, Lz5/c;->a(Lz5/c;Lz5/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    if-eqz v7, :cond_0

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    sub-long/2addr v6, v8

    .line 67
    invoke-static {v6, v7}, Lq3/a;->C(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v6, "finished run in "

    .line 72
    .line 73
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v5, v4, v0}, Lq3/a;->b(Lz5/a;Lz5/b;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    :try_start_2
    iget-object v2, v6, Lz5/c;->a:Lw5/i;

    .line 83
    .line 84
    iget-object v2, v2, Lw5/i;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    if-eqz v7, :cond_3

    .line 94
    .line 95
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    sub-long/2addr v2, v8

    .line 100
    invoke-static {v2, v3}, Lq3/a;->C(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v3, "failed a run in "

    .line 105
    .line 106
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v5, v4, v2}, Lq3/a;->b(Lz5/a;Lz5/b;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    throw v0

    .line 114
    :catchall_2
    move-exception v0

    .line 115
    monitor-exit v4

    .line 116
    throw v0

    .line 117
    :pswitch_0
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ly0/g;

    .line 120
    .line 121
    iget-object v2, v0, Ly0/g;->j:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 122
    .line 123
    iget-object v3, v0, Ly0/g;->h:Lw0/d;

    .line 124
    .line 125
    iget v3, v3, Lw0/d;->o:I

    .line 126
    .line 127
    iget v6, v0, Ly0/g;->g:I

    .line 128
    .line 129
    const/4 v7, 0x3

    .line 130
    if-ne v6, v7, :cond_4

    .line 131
    .line 132
    const/4 v8, 0x1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const/4 v8, 0x0

    .line 135
    :goto_2
    const/4 v9, 0x5

    .line 136
    if-eqz v8, :cond_6

    .line 137
    .line 138
    invoke-virtual {v2, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    if-eqz v10, :cond_5

    .line 143
    .line 144
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    neg-int v11, v11

    .line 149
    goto :goto_3

    .line 150
    :cond_5
    const/4 v11, 0x0

    .line 151
    :goto_3
    add-int/2addr v11, v3

    .line 152
    goto :goto_4

    .line 153
    :cond_6
    invoke-virtual {v2, v9}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    sub-int/2addr v11, v3

    .line 162
    :goto_4
    if-eqz v10, :cond_c

    .line 163
    .line 164
    if-eqz v8, :cond_7

    .line 165
    .line 166
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-lt v3, v11, :cond_8

    .line 171
    .line 172
    :cond_7
    if-nez v8, :cond_c

    .line 173
    .line 174
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-le v3, v11, :cond_c

    .line 179
    .line 180
    :cond_8
    invoke-virtual {v2, v10}, Landroidx/drawerlayout/widget/DrawerLayout;->i(Landroid/view/View;)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_c

    .line 185
    .line 186
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    check-cast v3, Ly0/d;

    .line 191
    .line 192
    iget-object v0, v0, Ly0/g;->h:Lw0/d;

    .line 193
    .line 194
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    invoke-virtual {v0, v10, v11, v8}, Lw0/d;->s(Landroid/view/View;II)Z

    .line 199
    .line 200
    .line 201
    iput-boolean v4, v3, Ly0/d;->c:Z

    .line 202
    .line 203
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 204
    .line 205
    .line 206
    if-ne v6, v7, :cond_9

    .line 207
    .line 208
    const/4 v7, 0x5

    .line 209
    :cond_9
    invoke-virtual {v2, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    invoke-virtual {v2, v0, v4}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroid/view/View;Z)V

    .line 216
    .line 217
    .line 218
    :cond_a
    iget-boolean v0, v2, Landroidx/drawerlayout/widget/DrawerLayout;->y:Z

    .line 219
    .line 220
    if-nez v0, :cond_c

    .line 221
    .line 222
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 223
    .line 224
    .line 225
    move-result-wide v6

    .line 226
    const/4 v12, 0x0

    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v10, 0x3

    .line 229
    const/4 v11, 0x0

    .line 230
    move-wide v8, v6

    .line 231
    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    :goto_5
    if-ge v5, v3, :cond_b

    .line 240
    .line 241
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-virtual {v6, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 246
    .line 247
    .line 248
    add-int/lit8 v5, v5, 0x1

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_b
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 252
    .line 253
    .line 254
    iput-boolean v4, v2, Landroidx/drawerlayout/widget/DrawerLayout;->y:Z

    .line 255
    .line 256
    :cond_c
    return-void

    .line 257
    :pswitch_1
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Lw0/d;

    .line 260
    .line 261
    invoke-virtual {v0, v5}, Lw0/d;->p(I)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_2
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Ls0/g;

    .line 268
    .line 269
    iget-object v4, v0, Ls0/g;->j:Landroidx/appcompat/widget/e2;

    .line 270
    .line 271
    iget-object v6, v0, Ls0/g;->h:Ls0/a;

    .line 272
    .line 273
    iget-boolean v7, v0, Ls0/g;->v:Z

    .line 274
    .line 275
    if-nez v7, :cond_d

    .line 276
    .line 277
    goto/16 :goto_7

    .line 278
    .line 279
    :cond_d
    iget-boolean v7, v0, Ls0/g;->t:Z

    .line 280
    .line 281
    if-eqz v7, :cond_e

    .line 282
    .line 283
    iput-boolean v5, v0, Ls0/g;->t:Z

    .line 284
    .line 285
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 286
    .line 287
    .line 288
    move-result-wide v7

    .line 289
    iput-wide v7, v6, Ls0/a;->e:J

    .line 290
    .line 291
    iput-wide v2, v6, Ls0/a;->g:J

    .line 292
    .line 293
    iput-wide v7, v6, Ls0/a;->f:J

    .line 294
    .line 295
    const/high16 v2, 0x3f000000    # 0.5f

    .line 296
    .line 297
    iput v2, v6, Ls0/a;->h:F

    .line 298
    .line 299
    :cond_e
    iget-wide v2, v6, Ls0/a;->g:J

    .line 300
    .line 301
    const-wide/16 v7, 0x0

    .line 302
    .line 303
    cmp-long v9, v2, v7

    .line 304
    .line 305
    if-lez v9, :cond_f

    .line 306
    .line 307
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 308
    .line 309
    .line 310
    move-result-wide v2

    .line 311
    iget-wide v9, v6, Ls0/a;->g:J

    .line 312
    .line 313
    iget v11, v6, Ls0/a;->i:I

    .line 314
    .line 315
    int-to-long v11, v11

    .line 316
    add-long/2addr v9, v11

    .line 317
    cmp-long v11, v2, v9

    .line 318
    .line 319
    if-lez v11, :cond_f

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_f
    invoke-virtual {v0}, Ls0/g;->e()Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-nez v2, :cond_10

    .line 327
    .line 328
    :goto_6
    iput-boolean v5, v0, Ls0/g;->v:Z

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_10
    iget-boolean v2, v0, Ls0/g;->u:Z

    .line 332
    .line 333
    if-eqz v2, :cond_11

    .line 334
    .line 335
    iput-boolean v5, v0, Ls0/g;->u:Z

    .line 336
    .line 337
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 338
    .line 339
    .line 340
    move-result-wide v9

    .line 341
    const/4 v15, 0x0

    .line 342
    const/16 v16, 0x0

    .line 343
    .line 344
    const/4 v13, 0x3

    .line 345
    const/4 v14, 0x0

    .line 346
    move-wide v11, v9

    .line 347
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v4, v2}, Landroidx/appcompat/widget/e2;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 355
    .line 356
    .line 357
    :cond_11
    iget-wide v2, v6, Ls0/a;->f:J

    .line 358
    .line 359
    cmp-long v5, v2, v7

    .line 360
    .line 361
    if-eqz v5, :cond_12

    .line 362
    .line 363
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 364
    .line 365
    .line 366
    move-result-wide v2

    .line 367
    invoke-virtual {v6, v2, v3}, Ls0/a;->a(J)F

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    const/high16 v7, -0x3f800000    # -4.0f

    .line 372
    .line 373
    mul-float v7, v7, v5

    .line 374
    .line 375
    mul-float v7, v7, v5

    .line 376
    .line 377
    const/high16 v8, 0x40800000    # 4.0f

    .line 378
    .line 379
    mul-float v5, v5, v8

    .line 380
    .line 381
    add-float/2addr v5, v7

    .line 382
    iget-wide v7, v6, Ls0/a;->f:J

    .line 383
    .line 384
    sub-long v7, v2, v7

    .line 385
    .line 386
    iput-wide v2, v6, Ls0/a;->f:J

    .line 387
    .line 388
    long-to-float v2, v7

    .line 389
    mul-float v2, v2, v5

    .line 390
    .line 391
    iget v3, v6, Ls0/a;->d:F

    .line 392
    .line 393
    mul-float v2, v2, v3

    .line 394
    .line 395
    float-to-int v2, v2

    .line 396
    iget-object v0, v0, Ls0/g;->x:Landroidx/appcompat/widget/e2;

    .line 397
    .line 398
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 399
    .line 400
    .line 401
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 402
    .line 403
    invoke-virtual {v4, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 404
    .line 405
    .line 406
    :goto_7
    return-void

    .line 407
    :cond_12
    new-instance v0, Ljava/lang/RuntimeException;

    .line 408
    .line 409
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 410
    .line 411
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v0

    .line 415
    :pswitch_3
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, Lp3/x;

    .line 418
    .line 419
    iget-object v2, v0, Lp3/x;->d:Lp3/b;

    .line 420
    .line 421
    invoke-virtual {v2, v5}, Lp3/b;->m(I)V

    .line 422
    .line 423
    .line 424
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzie;->F:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 425
    .line 426
    sget-object v4, Lp3/f0;->i:Lp3/e;

    .line 427
    .line 428
    invoke-virtual {v2, v3, v4}, Lp3/b;->l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v4}, Lp3/x;->c(Lp3/e;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_4
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lh/e;

    .line 438
    .line 439
    invoke-virtual {v0, v4}, Lh/g;->a(Z)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :pswitch_5
    iget-object v0, v1, Landroidx/lifecycle/b0;->i:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;

    .line 449
    .line 450
    iget-boolean v2, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->o:Z

    .line 451
    .line 452
    if-nez v2, :cond_15

    .line 453
    .line 454
    iget-object v2, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->p:Landroid/animation/ObjectAnimator;

    .line 455
    .line 456
    if-eqz v2, :cond_13

    .line 457
    .line 458
    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    .line 459
    .line 460
    .line 461
    :cond_13
    const-string v2, "offsetX"

    .line 462
    .line 463
    iget-object v3, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->a:Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 464
    .line 465
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    invoke-virtual {v3}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    if-ne v3, v4, :cond_14

    .line 478
    .line 479
    const/4 v4, -0x1

    .line 480
    :cond_14
    iget v3, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->g:I

    .line 481
    .line 482
    iget v6, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->d:I

    .line 483
    .line 484
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    mul-int v3, v3, v4

    .line 489
    .line 490
    filled-new-array {v3}, [I

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-static {v0, v2, v3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    iput-object v2, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->p:Landroid/animation/ObjectAnimator;

    .line 499
    .line 500
    new-instance v3, Lg1/a;

    .line 501
    .line 502
    invoke-direct {v3, v5}, Lg1/a;-><init>(I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 506
    .line 507
    .line 508
    iget-object v2, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->p:Landroid/animation/ObjectAnimator;

    .line 509
    .line 510
    const-wide/16 v3, 0xc8

    .line 511
    .line 512
    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 513
    .line 514
    .line 515
    iget-object v0, v0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->p:Landroid/animation/ObjectAnimator;

    .line 516
    .line 517
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 518
    .line 519
    .line 520
    :cond_15
    return-void

    .line 521
    :pswitch_6
    invoke-direct {v1}, Landroidx/lifecycle/b0;->a()V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method
