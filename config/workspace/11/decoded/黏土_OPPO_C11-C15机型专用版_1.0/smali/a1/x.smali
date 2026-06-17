.class public final synthetic La1/x;
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
    iput p1, p0, La1/x;->h:I

    .line 2
    .line 3
    iput-object p2, p0, La1/x;->i:Ljava/lang/Object;

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


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, La1/x;->h:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ln5/y0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, v5}, Ln5/y0;->b(Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ldev/jahir/frames/data/network/LocalDownloadListenerThread;

    .line 26
    .line 27
    invoke-static {v0}, Ldev/jahir/frames/data/network/LocalDownloadListenerThread;->d(Ldev/jahir/frames/data/network/LocalDownloadListenerThread;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ldev/jahir/blueprint/ui/activities/DrawerBlueprintActivity;

    .line 34
    .line 35
    invoke-static {v0}, Ldev/jahir/blueprint/ui/activities/DrawerBlueprintActivity;->y0(Ldev/jahir/blueprint/ui/activities/DrawerBlueprintActivity;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 42
    .line 43
    invoke-static {v0}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->i0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_3
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/google/android/material/motion/MaterialBackOrchestrator;

    .line 50
    .line 51
    invoke-virtual {v0, v4}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->a(Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_4
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_5
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkInitializer;

    .line 66
    .line 67
    iget-object v3, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkInitializer;->d:Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard;

    .line 68
    .line 69
    new-instance v4, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 70
    .line 71
    invoke-direct {v4, v2, v0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v3, v4}, Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard;->a(Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard$CriticalSection;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_6
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v7, v0

    .line 81
    check-cast v7, Landroid/app/Activity;

    .line 82
    .line 83
    invoke-virtual {v7}, Landroid/app/Activity;->isFinishing()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_a

    .line 88
    .line 89
    sget-object v8, Lb0/l;->g:Landroid/os/Handler;

    .line 90
    .line 91
    sget-object v0, Lb0/l;->f:Ljava/lang/reflect/Method;

    .line 92
    .line 93
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 v10, 0x1c

    .line 96
    .line 97
    if-lt v9, v10, :cond_1

    .line 98
    .line 99
    invoke-virtual {v7}, Landroid/app/Activity;->recreate()V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_1
    const/16 v10, 0x1b

    .line 105
    .line 106
    const/16 v11, 0x1a

    .line 107
    .line 108
    if-eq v9, v11, :cond_2

    .line 109
    .line 110
    if-ne v9, v10, :cond_3

    .line 111
    .line 112
    :cond_2
    if-nez v0, :cond_3

    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_3
    sget-object v12, Lb0/l;->e:Ljava/lang/reflect/Method;

    .line 117
    .line 118
    if-nez v12, :cond_4

    .line 119
    .line 120
    sget-object v12, Lb0/l;->d:Ljava/lang/reflect/Method;

    .line 121
    .line 122
    if-nez v12, :cond_4

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_4
    :try_start_0
    sget-object v12, Lb0/l;->c:Ljava/lang/reflect/Field;

    .line 127
    .line 128
    invoke-virtual {v12, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    if-nez v12, :cond_5

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_5
    sget-object v13, Lb0/l;->b:Ljava/lang/reflect/Field;

    .line 136
    .line 137
    invoke-virtual {v13, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    if-nez v13, :cond_6

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_6
    invoke-virtual {v7}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    new-instance v15, Lb0/k;

    .line 149
    .line 150
    invoke-direct {v15, v7}, Lb0/k;-><init>(Landroid/app/Activity;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v14, v15}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 154
    .line 155
    .line 156
    const/16 v16, 0x3

    .line 157
    .line 158
    new-instance v2, Landroidx/recyclerview/widget/e;

    .line 159
    .line 160
    invoke-direct {v2, v15, v12, v4, v6}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 164
    .line 165
    .line 166
    if-eq v9, v11, :cond_8

    .line 167
    .line 168
    if-ne v9, v10, :cond_7

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_7
    const/4 v2, 0x0

    .line 172
    goto :goto_1

    .line 173
    :cond_8
    :goto_0
    const/4 v2, 0x1

    .line 174
    :goto_1
    if-eqz v2, :cond_9

    .line 175
    .line 176
    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const/16 v9, 0x9

    .line 181
    .line 182
    new-array v9, v9, [Ljava/lang/Object;

    .line 183
    .line 184
    aput-object v12, v9, v6

    .line 185
    .line 186
    aput-object v5, v9, v4

    .line 187
    .line 188
    aput-object v5, v9, v3

    .line 189
    .line 190
    aput-object v2, v9, v16

    .line 191
    .line 192
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 193
    .line 194
    const/4 v4, 0x4

    .line 195
    aput-object v2, v9, v4

    .line 196
    .line 197
    const/4 v4, 0x5

    .line 198
    aput-object v5, v9, v4

    .line 199
    .line 200
    const/4 v4, 0x6

    .line 201
    aput-object v5, v9, v4

    .line 202
    .line 203
    const/4 v4, 0x7

    .line 204
    aput-object v2, v9, v4

    .line 205
    .line 206
    const/16 v4, 0x8

    .line 207
    .line 208
    aput-object v2, v9, v4

    .line 209
    .line 210
    invoke-virtual {v0, v13, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    goto :goto_3

    .line 216
    :cond_9
    invoke-virtual {v7}, Landroid/app/Activity;->recreate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 217
    .line 218
    .line 219
    :goto_2
    :try_start_2
    new-instance v0, Landroidx/recyclerview/widget/e;

    .line 220
    .line 221
    invoke-direct {v0, v14, v15, v3, v6}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_5

    .line 228
    :goto_3
    new-instance v2, Landroidx/recyclerview/widget/e;

    .line 229
    .line 230
    invoke-direct {v2, v14, v15, v3, v6}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 234
    .line 235
    .line 236
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 237
    :catchall_1
    :goto_4
    invoke-virtual {v7}, Landroid/app/Activity;->recreate()V

    .line 238
    .line 239
    .line 240
    :cond_a
    :goto_5
    return-void

    .line 241
    :pswitch_7
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lb/r;

    .line 244
    .line 245
    invoke-static {v0}, Lb/r;->a(Lb/r;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_8
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Lb/m;

    .line 252
    .line 253
    iget-object v2, v0, Lb/m;->i:Ljava/lang/Runnable;

    .line 254
    .line 255
    if-eqz v2, :cond_b

    .line 256
    .line 257
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 258
    .line 259
    .line 260
    iput-object v5, v0, Lb/m;->i:Ljava/lang/Runnable;

    .line 261
    .line 262
    :cond_b
    return-void

    .line 263
    :pswitch_9
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Landroidx/room/e0;

    .line 266
    .line 267
    iget v2, v0, Landroidx/lifecycle/f0;->c:I

    .line 268
    .line 269
    if-lez v2, :cond_c

    .line 270
    .line 271
    const/4 v2, 0x1

    .line 272
    goto :goto_6

    .line 273
    :cond_c
    const/4 v2, 0x0

    .line 274
    :goto_6
    iget-object v7, v0, Landroidx/room/e0;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 275
    .line 276
    invoke-virtual {v7, v6, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_d

    .line 281
    .line 282
    if-eqz v2, :cond_d

    .line 283
    .line 284
    iget-object v2, v0, Landroidx/room/e0;->l:Landroidx/room/r0;

    .line 285
    .line 286
    invoke-virtual {v2}, Landroidx/room/r0;->getCoroutineScope()Ln5/v;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    iget-object v4, v0, Landroidx/room/e0;->r:Lt4/h;

    .line 291
    .line 292
    new-instance v7, Landroidx/room/x0;

    .line 293
    .line 294
    invoke-direct {v7, v0, v5, v6}, Landroidx/room/x0;-><init>(Landroidx/room/e0;Lt4/c;I)V

    .line 295
    .line 296
    .line 297
    invoke-static {v2, v4, v5, v7, v3}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 298
    .line 299
    .line 300
    :cond_d
    return-void

    .line 301
    :pswitch_a
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, Landroidx/lifecycle/n0;

    .line 304
    .line 305
    iget-object v2, v0, Landroidx/lifecycle/n0;->m:Landroidx/lifecycle/y;

    .line 306
    .line 307
    iget v3, v0, Landroidx/lifecycle/n0;->i:I

    .line 308
    .line 309
    if-nez v3, :cond_e

    .line 310
    .line 311
    iput-boolean v4, v0, Landroidx/lifecycle/n0;->j:Z

    .line 312
    .line 313
    sget-object v3, Landroidx/lifecycle/n;->ON_PAUSE:Landroidx/lifecycle/n;

    .line 314
    .line 315
    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/n;)V

    .line 316
    .line 317
    .line 318
    :cond_e
    iget v3, v0, Landroidx/lifecycle/n0;->h:I

    .line 319
    .line 320
    if-nez v3, :cond_f

    .line 321
    .line 322
    iget-boolean v3, v0, Landroidx/lifecycle/n0;->j:Z

    .line 323
    .line 324
    if-eqz v3, :cond_f

    .line 325
    .line 326
    sget-object v3, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 327
    .line 328
    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/n;)V

    .line 329
    .line 330
    .line 331
    iput-boolean v4, v0, Landroidx/lifecycle/n0;->k:Z

    .line 332
    .line 333
    :cond_f
    return-void

    .line 334
    :pswitch_b
    iget-object v0, v1, La1/x;->i:Ljava/lang/Object;

    .line 335
    .line 336
    move-object v2, v0

    .line 337
    check-cast v2, La1/y;

    .line 338
    .line 339
    const-string v0, "fetchFonts result is not OK. ("

    .line 340
    .line 341
    iget-object v5, v2, La1/y;->k:Ljava/lang/Object;

    .line 342
    .line 343
    monitor-enter v5

    .line 344
    :try_start_3
    iget-object v7, v2, La1/y;->o:Le6/d;

    .line 345
    .line 346
    if-nez v7, :cond_10

    .line 347
    .line 348
    monitor-exit v5

    .line 349
    goto/16 :goto_c

    .line 350
    .line 351
    :catchall_2
    move-exception v0

    .line 352
    goto/16 :goto_e

    .line 353
    .line 354
    :cond_10
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 355
    :try_start_4
    invoke-virtual {v2}, La1/y;->c()Lj0/h;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    iget v7, v5, Lj0/h;->e:I

    .line 360
    .line 361
    if-ne v7, v3, :cond_11

    .line 362
    .line 363
    iget-object v3, v2, La1/y;->k:Ljava/lang/Object;

    .line 364
    .line 365
    monitor-enter v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 366
    :try_start_5
    monitor-exit v3

    .line 367
    goto :goto_7

    .line 368
    :catchall_3
    move-exception v0

    .line 369
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 370
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 371
    :catchall_4
    move-exception v0

    .line 372
    goto/16 :goto_a

    .line 373
    .line 374
    :cond_11
    :goto_7
    if-nez v7, :cond_14

    .line 375
    .line 376
    :try_start_7
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 377
    .line 378
    sget-object v3, Li0/p;->b:Ljava/lang/reflect/Method;

    .line 379
    .line 380
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    iget-object v0, v2, La1/y;->j:La1/d;

    .line 384
    .line 385
    iget-object v3, v2, La1/y;->h:Landroid/content/Context;

    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    new-array v0, v4, [Lj0/h;

    .line 391
    .line 392
    aput-object v5, v0, v6

    .line 393
    .line 394
    sget-object v4, Le0/j;->a:Lu2/f;

    .line 395
    .line 396
    invoke-virtual {v4, v3, v0, v6}, Lu2/f;->j(Landroid/content/Context;[Lj0/h;I)Landroid/graphics/Typeface;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iget-object v3, v2, La1/y;->h:Landroid/content/Context;

    .line 401
    .line 402
    iget-object v4, v5, Lj0/h;->a:Landroid/net/Uri;

    .line 403
    .line 404
    invoke-static {v3, v4}, La/a;->O(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 405
    .line 406
    .line 407
    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 408
    if-eqz v3, :cond_13

    .line 409
    .line 410
    if-eqz v0, :cond_13

    .line 411
    .line 412
    :try_start_8
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 413
    .line 414
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    new-instance v4, Lu2/i;

    .line 418
    .line 419
    invoke-static {v3}, Lq3/a;->U(Ljava/nio/MappedByteBuffer;)Lb1/b;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-direct {v4, v0, v3}, Lu2/i;-><init>(Landroid/graphics/Typeface;Lb1/b;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 424
    .line 425
    .line 426
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 427
    .line 428
    .line 429
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 430
    .line 431
    .line 432
    iget-object v3, v2, La1/y;->k:Ljava/lang/Object;

    .line 433
    .line 434
    monitor-enter v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 435
    :try_start_b
    iget-object v0, v2, La1/y;->o:Le6/d;

    .line 436
    .line 437
    if-eqz v0, :cond_12

    .line 438
    .line 439
    invoke-virtual {v0, v4}, Le6/d;->F(Lu2/i;)V

    .line 440
    .line 441
    .line 442
    goto :goto_8

    .line 443
    :catchall_5
    move-exception v0

    .line 444
    goto :goto_9

    .line 445
    :cond_12
    :goto_8
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 446
    :try_start_c
    invoke-virtual {v2}, La1/y;->a()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 447
    .line 448
    .line 449
    goto :goto_c

    .line 450
    :goto_9
    :try_start_d
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 451
    :try_start_e
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 452
    :catchall_6
    move-exception v0

    .line 453
    :try_start_f
    sget-object v3, Li0/p;->b:Ljava/lang/reflect/Method;

    .line 454
    .line 455
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 456
    .line 457
    .line 458
    throw v0

    .line 459
    :cond_13
    new-instance v0, Ljava/lang/RuntimeException;

    .line 460
    .line 461
    const-string v3, "Unable to open file."

    .line 462
    .line 463
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 467
    :catchall_7
    move-exception v0

    .line 468
    :try_start_10
    sget-object v3, Li0/p;->b:Ljava/lang/reflect/Method;

    .line 469
    .line 470
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 471
    .line 472
    .line 473
    throw v0

    .line 474
    :cond_14
    new-instance v3, Ljava/lang/RuntimeException;

    .line 475
    .line 476
    new-instance v4, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const-string v0, ")"

    .line 485
    .line 486
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 497
    :goto_a
    iget-object v3, v2, La1/y;->k:Ljava/lang/Object;

    .line 498
    .line 499
    monitor-enter v3

    .line 500
    :try_start_11
    iget-object v4, v2, La1/y;->o:Le6/d;

    .line 501
    .line 502
    if-eqz v4, :cond_15

    .line 503
    .line 504
    invoke-virtual {v4, v0}, Le6/d;->E(Ljava/lang/Throwable;)V

    .line 505
    .line 506
    .line 507
    goto :goto_b

    .line 508
    :catchall_8
    move-exception v0

    .line 509
    goto :goto_d

    .line 510
    :cond_15
    :goto_b
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 511
    invoke-virtual {v2}, La1/y;->a()V

    .line 512
    .line 513
    .line 514
    :goto_c
    return-void

    .line 515
    :goto_d
    :try_start_12
    monitor-exit v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 516
    throw v0

    .line 517
    :goto_e
    :try_start_13
    monitor-exit v5
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 518
    throw v0

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
