.class public final Lg2/b0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public h:Lg2/y;

.field public i:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg2/b0;->h:Lg2/y;

    .line 4
    .line 5
    iget-object v2, v0, Lg2/b0;->i:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 15
    .line 16
    .line 17
    sget-object v3, Lg2/c0;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v7, 0x1

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    :cond_0
    const/4 v9, 0x1

    .line 27
    goto/16 :goto_10

    .line 28
    .line 29
    :cond_1
    invoke-static {}, Lg2/c0;->b()Lq/f;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3, v2}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    if-nez v4, :cond_3

    .line 40
    .line 41
    new-instance v4, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2, v4}, Lq/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_2
    const/4 v6, 0x0

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-lez v6, :cond_2

    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v4, Lg2/a0;

    .line 66
    .line 67
    invoke-direct {v4, v0, v3}, Lg2/a0;-><init>(Lg2/b0;Lq/f;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v4}, Lg2/y;->a(Lg2/w;)V

    .line 71
    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-virtual {v1, v2, v3}, Lg2/y;->i(Landroid/view/ViewGroup;Z)V

    .line 75
    .line 76
    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const/4 v8, 0x0

    .line 84
    :goto_1
    if-ge v8, v4, :cond_4

    .line 85
    .line 86
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    add-int/lit8 v8, v8, 0x1

    .line 91
    .line 92
    check-cast v9, Lg2/y;

    .line 93
    .line 94
    invoke-virtual {v9, v2}, Lg2/y;->E(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v4, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 104
    .line 105
    new-instance v4, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v4, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 111
    .line 112
    iget-object v4, v1, Lg2/y;->n:Lu2/n;

    .line 113
    .line 114
    iget-object v6, v1, Lg2/y;->o:Lu2/n;

    .line 115
    .line 116
    new-instance v8, Lq/f;

    .line 117
    .line 118
    iget-object v9, v4, Lu2/n;->h:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v9, Lq/f;

    .line 121
    .line 122
    invoke-direct {v8, v9}, Lq/f;-><init>(Lq/k;)V

    .line 123
    .line 124
    .line 125
    new-instance v9, Lq/f;

    .line 126
    .line 127
    iget-object v10, v6, Lu2/n;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Lq/f;

    .line 130
    .line 131
    invoke-direct {v9, v10}, Lq/f;-><init>(Lq/k;)V

    .line 132
    .line 133
    .line 134
    const/4 v10, 0x0

    .line 135
    :goto_2
    iget-object v11, v1, Lg2/y;->q:[I

    .line 136
    .line 137
    array-length v12, v11

    .line 138
    if-ge v10, v12, :cond_10

    .line 139
    .line 140
    aget v11, v11, v10

    .line 141
    .line 142
    if-eq v11, v7, :cond_d

    .line 143
    .line 144
    const/4 v12, 0x2

    .line 145
    if-eq v11, v12, :cond_b

    .line 146
    .line 147
    const/4 v12, 0x3

    .line 148
    if-eq v11, v12, :cond_9

    .line 149
    .line 150
    const/4 v12, 0x4

    .line 151
    if-eq v11, v12, :cond_5

    .line 152
    .line 153
    move-object v5, v6

    .line 154
    const/16 v18, 0x1

    .line 155
    .line 156
    goto/16 :goto_9

    .line 157
    .line 158
    :cond_5
    iget-object v11, v4, Lu2/n;->j:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v11, Lq/i;

    .line 161
    .line 162
    iget-object v12, v6, Lu2/n;->j:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v12, Lq/i;

    .line 165
    .line 166
    invoke-virtual {v11}, Lq/i;->i()I

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    const/4 v14, 0x0

    .line 171
    :goto_3
    if-ge v14, v13, :cond_8

    .line 172
    .line 173
    invoke-virtual {v11, v14}, Lq/i;->j(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    check-cast v15, Landroid/view/View;

    .line 178
    .line 179
    if-eqz v15, :cond_7

    .line 180
    .line 181
    invoke-virtual {v1, v15}, Lg2/y;->x(Landroid/view/View;)Z

    .line 182
    .line 183
    .line 184
    move-result v16

    .line 185
    if-eqz v16, :cond_7

    .line 186
    .line 187
    move-object/from16 v17, v6

    .line 188
    .line 189
    invoke-virtual {v11, v14}, Lq/i;->g(I)J

    .line 190
    .line 191
    .line 192
    move-result-wide v5

    .line 193
    invoke-virtual {v12, v5, v6}, Lq/i;->e(J)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    check-cast v5, Landroid/view/View;

    .line 198
    .line 199
    if-eqz v5, :cond_6

    .line 200
    .line 201
    invoke-virtual {v1, v5}, Lg2/y;->x(Landroid/view/View;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_6

    .line 206
    .line 207
    invoke-virtual {v8, v15}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    check-cast v6, Lg2/h0;

    .line 212
    .line 213
    invoke-virtual {v9, v5}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v18

    .line 217
    move-object/from16 v3, v18

    .line 218
    .line 219
    check-cast v3, Lg2/h0;

    .line 220
    .line 221
    if-eqz v6, :cond_6

    .line 222
    .line 223
    if-eqz v3, :cond_6

    .line 224
    .line 225
    const/16 v18, 0x1

    .line 226
    .line 227
    iget-object v7, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    iget-object v6, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8, v15}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v9, v5}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_6
    :goto_4
    const/16 v18, 0x1

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_7
    move-object/from16 v17, v6

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :goto_5
    add-int/lit8 v14, v14, 0x1

    .line 251
    .line 252
    move-object/from16 v6, v17

    .line 253
    .line 254
    const/4 v3, 0x0

    .line 255
    const/4 v7, 0x1

    .line 256
    goto :goto_3

    .line 257
    :cond_8
    const/16 v18, 0x1

    .line 258
    .line 259
    move-object v5, v6

    .line 260
    goto/16 :goto_9

    .line 261
    .line 262
    :cond_9
    move-object/from16 v17, v6

    .line 263
    .line 264
    const/16 v18, 0x1

    .line 265
    .line 266
    iget-object v3, v4, Lu2/n;->i:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v3, Landroid/util/SparseArray;

    .line 269
    .line 270
    move-object/from16 v5, v17

    .line 271
    .line 272
    iget-object v6, v5, Lu2/n;->i:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v6, Landroid/util/SparseArray;

    .line 275
    .line 276
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    const/4 v11, 0x0

    .line 281
    :goto_6
    if-ge v11, v7, :cond_f

    .line 282
    .line 283
    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v12

    .line 287
    check-cast v12, Landroid/view/View;

    .line 288
    .line 289
    if-eqz v12, :cond_a

    .line 290
    .line 291
    invoke-virtual {v1, v12}, Lg2/y;->x(Landroid/view/View;)Z

    .line 292
    .line 293
    .line 294
    move-result v13

    .line 295
    if-eqz v13, :cond_a

    .line 296
    .line 297
    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->keyAt(I)I

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    invoke-virtual {v6, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v13

    .line 305
    check-cast v13, Landroid/view/View;

    .line 306
    .line 307
    if-eqz v13, :cond_a

    .line 308
    .line 309
    invoke-virtual {v1, v13}, Lg2/y;->x(Landroid/view/View;)Z

    .line 310
    .line 311
    .line 312
    move-result v14

    .line 313
    if-eqz v14, :cond_a

    .line 314
    .line 315
    invoke-virtual {v8, v12}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    check-cast v14, Lg2/h0;

    .line 320
    .line 321
    invoke-virtual {v9, v13}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v15

    .line 325
    check-cast v15, Lg2/h0;

    .line 326
    .line 327
    if-eqz v14, :cond_a

    .line 328
    .line 329
    if-eqz v15, :cond_a

    .line 330
    .line 331
    iget-object v0, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    iget-object v0, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    invoke-virtual {v8, v12}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v9, v13}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    :cond_a
    add-int/lit8 v11, v11, 0x1

    .line 348
    .line 349
    move-object/from16 v0, p0

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_b
    move-object v5, v6

    .line 353
    const/16 v18, 0x1

    .line 354
    .line 355
    iget-object v0, v4, Lu2/n;->k:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Lq/f;

    .line 358
    .line 359
    iget-object v3, v5, Lu2/n;->k:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v3, Lq/f;

    .line 362
    .line 363
    iget v6, v0, Lq/k;->j:I

    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    :goto_7
    if-ge v7, v6, :cond_f

    .line 367
    .line 368
    invoke-virtual {v0, v7}, Lq/k;->i(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v11

    .line 372
    check-cast v11, Landroid/view/View;

    .line 373
    .line 374
    if-eqz v11, :cond_c

    .line 375
    .line 376
    invoke-virtual {v1, v11}, Lg2/y;->x(Landroid/view/View;)Z

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    if-eqz v12, :cond_c

    .line 381
    .line 382
    invoke-virtual {v0, v7}, Lq/k;->f(I)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v12

    .line 386
    invoke-virtual {v3, v12}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    check-cast v12, Landroid/view/View;

    .line 391
    .line 392
    if-eqz v12, :cond_c

    .line 393
    .line 394
    invoke-virtual {v1, v12}, Lg2/y;->x(Landroid/view/View;)Z

    .line 395
    .line 396
    .line 397
    move-result v13

    .line 398
    if-eqz v13, :cond_c

    .line 399
    .line 400
    invoke-virtual {v8, v11}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v13

    .line 404
    check-cast v13, Lg2/h0;

    .line 405
    .line 406
    invoke-virtual {v9, v12}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v14

    .line 410
    check-cast v14, Lg2/h0;

    .line 411
    .line 412
    if-eqz v13, :cond_c

    .line 413
    .line 414
    if-eqz v14, :cond_c

    .line 415
    .line 416
    iget-object v15, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 417
    .line 418
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    iget-object v13, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    invoke-virtual {v8, v11}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v9, v12}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    :cond_c
    add-int/lit8 v7, v7, 0x1

    .line 433
    .line 434
    goto :goto_7

    .line 435
    :cond_d
    move-object v5, v6

    .line 436
    const/16 v18, 0x1

    .line 437
    .line 438
    iget v0, v8, Lq/k;->j:I

    .line 439
    .line 440
    add-int/lit8 v0, v0, -0x1

    .line 441
    .line 442
    :goto_8
    if-ltz v0, :cond_f

    .line 443
    .line 444
    invoke-virtual {v8, v0}, Lq/k;->f(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    check-cast v3, Landroid/view/View;

    .line 449
    .line 450
    if-eqz v3, :cond_e

    .line 451
    .line 452
    invoke-virtual {v1, v3}, Lg2/y;->x(Landroid/view/View;)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    if-eqz v6, :cond_e

    .line 457
    .line 458
    invoke-virtual {v9, v3}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    check-cast v3, Lg2/h0;

    .line 463
    .line 464
    if-eqz v3, :cond_e

    .line 465
    .line 466
    iget-object v6, v3, Lg2/h0;->b:Landroid/view/View;

    .line 467
    .line 468
    invoke-virtual {v1, v6}, Lg2/y;->x(Landroid/view/View;)Z

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    if-eqz v6, :cond_e

    .line 473
    .line 474
    invoke-virtual {v8, v0}, Lq/k;->g(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    check-cast v6, Lg2/h0;

    .line 479
    .line 480
    iget-object v7, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 481
    .line 482
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    iget-object v6, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 486
    .line 487
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    :cond_e
    add-int/lit8 v0, v0, -0x1

    .line 491
    .line 492
    goto :goto_8

    .line 493
    :cond_f
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 494
    .line 495
    move-object/from16 v0, p0

    .line 496
    .line 497
    move-object v6, v5

    .line 498
    const/4 v3, 0x0

    .line 499
    const/4 v7, 0x1

    .line 500
    goto/16 :goto_2

    .line 501
    .line 502
    :cond_10
    const/16 v18, 0x1

    .line 503
    .line 504
    const/4 v0, 0x0

    .line 505
    :goto_a
    iget v3, v8, Lq/k;->j:I

    .line 506
    .line 507
    if-ge v0, v3, :cond_12

    .line 508
    .line 509
    invoke-virtual {v8, v0}, Lq/k;->i(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    check-cast v3, Lg2/h0;

    .line 514
    .line 515
    iget-object v4, v3, Lg2/h0;->b:Landroid/view/View;

    .line 516
    .line 517
    invoke-virtual {v1, v4}, Lg2/y;->x(Landroid/view/View;)Z

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-eqz v4, :cond_11

    .line 522
    .line 523
    iget-object v4, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 524
    .line 525
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    iget-object v3, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 529
    .line 530
    const/4 v4, 0x0

    .line 531
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    :cond_11
    add-int/lit8 v0, v0, 0x1

    .line 535
    .line 536
    goto :goto_a

    .line 537
    :cond_12
    const/4 v0, 0x0

    .line 538
    :goto_b
    iget v3, v9, Lq/k;->j:I

    .line 539
    .line 540
    if-ge v0, v3, :cond_14

    .line 541
    .line 542
    invoke-virtual {v9, v0}, Lq/k;->i(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    check-cast v3, Lg2/h0;

    .line 547
    .line 548
    iget-object v4, v3, Lg2/h0;->b:Landroid/view/View;

    .line 549
    .line 550
    invoke-virtual {v1, v4}, Lg2/y;->x(Landroid/view/View;)Z

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    if-eqz v4, :cond_13

    .line 555
    .line 556
    iget-object v4, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 557
    .line 558
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    iget-object v3, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 562
    .line 563
    const/4 v4, 0x0

    .line 564
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    goto :goto_c

    .line 568
    :cond_13
    const/4 v4, 0x0

    .line 569
    :goto_c
    add-int/lit8 v0, v0, 0x1

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_14
    invoke-static {}, Lg2/y;->r()Lq/f;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    iget v3, v0, Lq/k;->j:I

    .line 577
    .line 578
    invoke-virtual {v2}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    add-int/lit8 v3, v3, -0x1

    .line 583
    .line 584
    :goto_d
    if-ltz v3, :cond_1c

    .line 585
    .line 586
    invoke-virtual {v0, v3}, Lq/k;->f(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v5

    .line 590
    check-cast v5, Landroid/animation/Animator;

    .line 591
    .line 592
    if-eqz v5, :cond_17

    .line 593
    .line 594
    invoke-virtual {v0, v5}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v6

    .line 598
    check-cast v6, Lg2/s;

    .line 599
    .line 600
    if-eqz v6, :cond_17

    .line 601
    .line 602
    iget-object v7, v6, Lg2/s;->e:Lg2/y;

    .line 603
    .line 604
    iget-object v8, v6, Lg2/s;->a:Landroid/view/View;

    .line 605
    .line 606
    if-eqz v8, :cond_17

    .line 607
    .line 608
    iget-object v9, v6, Lg2/s;->d:Landroid/view/WindowId;

    .line 609
    .line 610
    invoke-virtual {v4, v9}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v9

    .line 614
    if-eqz v9, :cond_17

    .line 615
    .line 616
    iget-object v6, v6, Lg2/s;->c:Lg2/h0;

    .line 617
    .line 618
    const/4 v9, 0x1

    .line 619
    invoke-virtual {v1, v8, v9}, Lg2/y;->t(Landroid/view/View;Z)Lg2/h0;

    .line 620
    .line 621
    .line 622
    move-result-object v10

    .line 623
    invoke-virtual {v1, v8, v9}, Lg2/y;->p(Landroid/view/View;Z)Lg2/h0;

    .line 624
    .line 625
    .line 626
    move-result-object v11

    .line 627
    if-nez v10, :cond_15

    .line 628
    .line 629
    if-nez v11, :cond_15

    .line 630
    .line 631
    iget-object v9, v1, Lg2/y;->o:Lu2/n;

    .line 632
    .line 633
    iget-object v9, v9, Lu2/n;->h:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v9, Lq/f;

    .line 636
    .line 637
    invoke-virtual {v9, v8}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v8

    .line 641
    move-object v11, v8

    .line 642
    check-cast v11, Lg2/h0;

    .line 643
    .line 644
    :cond_15
    if-nez v10, :cond_16

    .line 645
    .line 646
    if-eqz v11, :cond_17

    .line 647
    .line 648
    :cond_16
    invoke-virtual {v7, v6, v11}, Lg2/y;->w(Lg2/h0;Lg2/h0;)Z

    .line 649
    .line 650
    .line 651
    move-result v6

    .line 652
    if-eqz v6, :cond_17

    .line 653
    .line 654
    invoke-virtual {v7}, Lg2/y;->q()Lg2/y;

    .line 655
    .line 656
    .line 657
    move-result-object v6

    .line 658
    iget-object v8, v7, Lg2/y;->u:Ljava/util/ArrayList;

    .line 659
    .line 660
    iget-object v6, v6, Lg2/y;->F:Lg2/v;

    .line 661
    .line 662
    if-eqz v6, :cond_18

    .line 663
    .line 664
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v5}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    if-nez v5, :cond_17

    .line 678
    .line 679
    sget-object v5, Lg2/x;->c:Lcom/google/android/datatransport/runtime/a;

    .line 680
    .line 681
    const/4 v6, 0x0

    .line 682
    invoke-virtual {v7, v7, v5, v6}, Lg2/y;->z(Lg2/y;Lg2/x;Z)V

    .line 683
    .line 684
    .line 685
    iget-boolean v5, v7, Lg2/y;->y:Z

    .line 686
    .line 687
    if-nez v5, :cond_1b

    .line 688
    .line 689
    const/4 v9, 0x1

    .line 690
    iput-boolean v9, v7, Lg2/y;->y:Z

    .line 691
    .line 692
    sget-object v5, Lg2/x;->b:Lcom/google/android/datatransport/runtime/a;

    .line 693
    .line 694
    invoke-virtual {v7, v7, v5, v6}, Lg2/y;->z(Lg2/y;Lg2/x;Z)V

    .line 695
    .line 696
    .line 697
    goto :goto_f

    .line 698
    :cond_17
    const/4 v6, 0x0

    .line 699
    goto :goto_f

    .line 700
    :cond_18
    const/4 v6, 0x0

    .line 701
    invoke-virtual {v5}, Landroid/animation/Animator;->isRunning()Z

    .line 702
    .line 703
    .line 704
    move-result v7

    .line 705
    if-nez v7, :cond_1a

    .line 706
    .line 707
    invoke-virtual {v5}, Landroid/animation/Animator;->isStarted()Z

    .line 708
    .line 709
    .line 710
    move-result v7

    .line 711
    if-eqz v7, :cond_19

    .line 712
    .line 713
    goto :goto_e

    .line 714
    :cond_19
    invoke-virtual {v0, v5}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    goto :goto_f

    .line 718
    :cond_1a
    :goto_e
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    .line 719
    .line 720
    .line 721
    :cond_1b
    :goto_f
    add-int/lit8 v3, v3, -0x1

    .line 722
    .line 723
    const/16 v18, 0x1

    .line 724
    .line 725
    goto/16 :goto_d

    .line 726
    .line 727
    :cond_1c
    iget-object v3, v1, Lg2/y;->n:Lu2/n;

    .line 728
    .line 729
    iget-object v4, v1, Lg2/y;->o:Lu2/n;

    .line 730
    .line 731
    iget-object v5, v1, Lg2/y;->r:Ljava/util/ArrayList;

    .line 732
    .line 733
    iget-object v6, v1, Lg2/y;->s:Ljava/util/ArrayList;

    .line 734
    .line 735
    invoke-virtual/range {v1 .. v6}, Lg2/y;->n(Landroid/view/ViewGroup;Lu2/n;Lu2/n;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 736
    .line 737
    .line 738
    iget-object v0, v1, Lg2/y;->F:Lg2/v;

    .line 739
    .line 740
    if-nez v0, :cond_1d

    .line 741
    .line 742
    invoke-virtual {v1}, Lg2/y;->F()V

    .line 743
    .line 744
    .line 745
    const/16 v18, 0x1

    .line 746
    .line 747
    return v18

    .line 748
    :cond_1d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 749
    .line 750
    const/16 v2, 0x22

    .line 751
    .line 752
    if-lt v0, v2, :cond_0

    .line 753
    .line 754
    invoke-virtual {v1}, Lg2/y;->B()V

    .line 755
    .line 756
    .line 757
    iget-object v0, v1, Lg2/y;->F:Lg2/v;

    .line 758
    .line 759
    iget-object v2, v0, Lg2/v;->g:Lg2/e0;

    .line 760
    .line 761
    iget-wide v3, v2, Lg2/y;->E:J

    .line 762
    .line 763
    const-wide/16 v5, 0x0

    .line 764
    .line 765
    cmp-long v7, v3, v5

    .line 766
    .line 767
    if-nez v7, :cond_1e

    .line 768
    .line 769
    const-wide/16 v5, 0x1

    .line 770
    .line 771
    :cond_1e
    iget-wide v3, v0, Lg2/v;->a:J

    .line 772
    .line 773
    invoke-virtual {v2, v5, v6, v3, v4}, Lg2/e0;->G(JJ)V

    .line 774
    .line 775
    .line 776
    iput-wide v5, v0, Lg2/v;->a:J

    .line 777
    .line 778
    iget-object v0, v1, Lg2/y;->F:Lg2/v;

    .line 779
    .line 780
    const/4 v9, 0x1

    .line 781
    iput-boolean v9, v0, Lg2/v;->b:Z

    .line 782
    .line 783
    :goto_10
    return v9
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

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lg2/b0;->i:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lg2/c0;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lg2/c0;->b()Lq/f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-lez v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    :goto_0
    if-ge v2, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    check-cast v3, Lg2/y;

    .line 50
    .line 51
    invoke-virtual {v3, p1}, Lg2/y;->E(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p1, p0, Lg2/b0;->h:Lg2/y;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-virtual {p1, v0}, Lg2/y;->j(Z)V

    .line 59
    .line 60
    .line 61
    return-void
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
