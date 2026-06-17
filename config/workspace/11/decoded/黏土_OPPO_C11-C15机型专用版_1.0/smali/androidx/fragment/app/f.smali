.class public final Landroidx/fragment/app/f;
.super Landroidx/fragment/app/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final b:Z

.field public c:Z

.field public d:Landroidx/fragment/app/r0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/h2;Z)V
    .locals 1

    .line 1
    const-string v0, "operation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/fragment/app/k;-><init>(Landroidx/fragment/app/h2;)V

    .line 7
    .line 8
    .line 9
    iput-boolean p2, p0, Landroidx/fragment/app/f;->b:Z

    .line 10
    .line 11
    return-void
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
.method public final b(Landroid/content/Context;)Landroidx/fragment/app/r0;
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/f;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/f;->d:Landroidx/fragment/app/r0;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 9
    .line 10
    iget-object v1, v0, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 11
    .line 12
    iget v0, v0, Landroidx/fragment/app/h2;->a:I

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-virtual {v1}, Landroidx/fragment/app/l0;->getNextTransition()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-boolean v5, p0, Landroidx/fragment/app/f;->b:Z

    .line 27
    .line 28
    if-eqz v5, :cond_3

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/fragment/app/l0;->getPopEnterAnim()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {v1}, Landroidx/fragment/app/l0;->getPopExitAnim()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    if-eqz v0, :cond_4

    .line 43
    .line 44
    invoke-virtual {v1}, Landroidx/fragment/app/l0;->getEnterAnim()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    invoke-virtual {v1}, Landroidx/fragment/app/l0;->getExitAnim()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    :goto_1
    invoke-virtual {v1, v3, v3, v3, v3}, Landroidx/fragment/app/l0;->setAnimations(IIII)V

    .line 54
    .line 55
    .line 56
    iget-object v3, v1, Landroidx/fragment/app/l0;->mContainer:Landroid/view/ViewGroup;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    if-eqz v3, :cond_5

    .line 60
    .line 61
    sget v7, Le1/b;->visible_removing_fragment_view_tag:I

    .line 62
    .line 63
    invoke-virtual {v3, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    iget-object v3, v1, Landroidx/fragment/app/l0;->mContainer:Landroid/view/ViewGroup;

    .line 70
    .line 71
    sget v7, Le1/b;->visible_removing_fragment_view_tag:I

    .line 72
    .line 73
    invoke-virtual {v3, v7, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_5
    iget-object v3, v1, Landroidx/fragment/app/l0;->mContainer:Landroid/view/ViewGroup;

    .line 77
    .line 78
    if-eqz v3, :cond_6

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_6
    invoke-virtual {v1, v2, v0, v5}, Landroidx/fragment/app/l0;->onCreateAnimation(IZI)Landroid/view/animation/Animation;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-eqz v3, :cond_7

    .line 93
    .line 94
    new-instance v6, Landroidx/fragment/app/r0;

    .line 95
    .line 96
    invoke-direct {v6, v3}, Landroidx/fragment/app/r0;-><init>(Landroid/view/animation/Animation;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_7
    invoke-virtual {v1, v2, v0, v5}, Landroidx/fragment/app/l0;->onCreateAnimator(IZI)Landroid/animation/Animator;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-eqz v1, :cond_8

    .line 106
    .line 107
    new-instance v6, Landroidx/fragment/app/r0;

    .line 108
    .line 109
    invoke-direct {v6, v1}, Landroidx/fragment/app/r0;-><init>(Landroid/animation/Animator;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_8
    if-nez v5, :cond_13

    .line 115
    .line 116
    if-eqz v2, :cond_13

    .line 117
    .line 118
    const/16 v1, 0x1001

    .line 119
    .line 120
    if-eq v2, v1, :cond_11

    .line 121
    .line 122
    const/16 v1, 0x2002

    .line 123
    .line 124
    if-eq v2, v1, :cond_f

    .line 125
    .line 126
    const/16 v1, 0x2005

    .line 127
    .line 128
    if-eq v2, v1, :cond_d

    .line 129
    .line 130
    const/16 v1, 0x1003

    .line 131
    .line 132
    if-eq v2, v1, :cond_b

    .line 133
    .line 134
    const/16 v1, 0x1004

    .line 135
    .line 136
    if-eq v2, v1, :cond_9

    .line 137
    .line 138
    const/4 v0, -0x1

    .line 139
    const/4 v5, -0x1

    .line 140
    goto :goto_3

    .line 141
    :cond_9
    if-eqz v0, :cond_a

    .line 142
    .line 143
    const v0, 0x10100b8

    .line 144
    .line 145
    .line 146
    invoke-static {p1, v0}, Lq3/a;->b0(Landroid/content/Context;I)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    :goto_2
    move v5, v0

    .line 151
    goto :goto_3

    .line 152
    :cond_a
    const v0, 0x10100b9

    .line 153
    .line 154
    .line 155
    invoke-static {p1, v0}, Lq3/a;->b0(Landroid/content/Context;I)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    goto :goto_2

    .line 160
    :cond_b
    if-eqz v0, :cond_c

    .line 161
    .line 162
    sget v0, Le1/a;->fragment_fade_enter:I

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_c
    sget v0, Le1/a;->fragment_fade_exit:I

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_d
    if-eqz v0, :cond_e

    .line 169
    .line 170
    const v0, 0x10100ba

    .line 171
    .line 172
    .line 173
    invoke-static {p1, v0}, Lq3/a;->b0(Landroid/content/Context;I)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    goto :goto_2

    .line 178
    :cond_e
    const v0, 0x10100bb

    .line 179
    .line 180
    .line 181
    invoke-static {p1, v0}, Lq3/a;->b0(Landroid/content/Context;I)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    goto :goto_2

    .line 186
    :cond_f
    if-eqz v0, :cond_10

    .line 187
    .line 188
    sget v0, Le1/a;->fragment_close_enter:I

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_10
    sget v0, Le1/a;->fragment_close_exit:I

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_11
    if-eqz v0, :cond_12

    .line 195
    .line 196
    sget v0, Le1/a;->fragment_open_enter:I

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_12
    sget v0, Le1/a;->fragment_open_exit:I

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_13
    :goto_3
    if-eqz v5, :cond_16

    .line 203
    .line 204
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const-string v1, "anim"

    .line 213
    .line 214
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_14

    .line 219
    .line 220
    :try_start_0
    invoke-static {p1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-eqz v1, :cond_16

    .line 225
    .line 226
    new-instance v2, Landroidx/fragment/app/r0;

    .line 227
    .line 228
    invoke-direct {v2, v1}, Landroidx/fragment/app/r0;-><init>(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 229
    .line 230
    .line 231
    :goto_4
    move-object v6, v2

    .line 232
    goto :goto_5

    .line 233
    :catch_0
    move-exception p1

    .line 234
    throw p1

    .line 235
    :catch_1
    :cond_14
    :try_start_1
    invoke-static {p1, v5}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_16

    .line 240
    .line 241
    new-instance v2, Landroidx/fragment/app/r0;

    .line 242
    .line 243
    invoke-direct {v2, v1}, Landroidx/fragment/app/r0;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 244
    .line 245
    .line 246
    goto :goto_4

    .line 247
    :catch_2
    move-exception v1

    .line 248
    if-nez v0, :cond_15

    .line 249
    .line 250
    invoke-static {p1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    if-eqz p1, :cond_16

    .line 255
    .line 256
    new-instance v6, Landroidx/fragment/app/r0;

    .line 257
    .line 258
    invoke-direct {v6, p1}, Landroidx/fragment/app/r0;-><init>(Landroid/view/animation/Animation;)V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_15
    throw v1

    .line 263
    :cond_16
    :goto_5
    iput-object v6, p0, Landroidx/fragment/app/f;->d:Landroidx/fragment/app/r0;

    .line 264
    .line 265
    iput-boolean v4, p0, Landroidx/fragment/app/f;->c:Z

    .line 266
    .line 267
    return-object v6
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
