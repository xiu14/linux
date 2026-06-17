.class Lcom/google/android/material/snackbar/BaseTransientBottomBar$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/snackbar/BaseTransientBottomBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 9

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    if-eq v0, v3, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    .line 14
    .line 15
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 16
    .line 17
    iget-object v4, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 18
    .line 19
    iget-object v5, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 20
    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v5, v3}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_4

    .line 29
    .line 30
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_4

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_4

    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->getAnimationMode()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-ne v4, v3, :cond_2

    .line 47
    .line 48
    new-array v1, v1, [F

    .line 49
    .line 50
    fill-array-data v1, :array_0

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d:Landroid/animation/TimeInterpolator;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$11;

    .line 63
    .line 64
    invoke-direct {v2, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$11;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 68
    .line 69
    .line 70
    iget v2, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b:I

    .line 71
    .line 72
    int-to-long v4, v2

    .line 73
    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 74
    .line 75
    .line 76
    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$10;

    .line 77
    .line 78
    invoke-direct {v2, v0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$10;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 85
    .line 86
    .line 87
    return v3

    .line 88
    :cond_2
    new-instance v1, Landroid/animation/ValueAnimator;

    .line 89
    .line 90
    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object v4, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 94
    .line 95
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    instance-of v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 104
    .line 105
    if-eqz v6, :cond_3

    .line 106
    .line 107
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 108
    .line 109
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 110
    .line 111
    add-int/2addr v5, v4

    .line 112
    :cond_3
    filled-new-array {v2, v5}, [I

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 117
    .line 118
    .line 119
    iget-object v2, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:Landroid/animation/TimeInterpolator;

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 122
    .line 123
    .line 124
    iget v2, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c:I

    .line 125
    .line 126
    int-to-long v4, v2

    .line 127
    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 128
    .line 129
    .line 130
    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$15;

    .line 131
    .line 132
    invoke-direct {v2, v0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$15;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 136
    .line 137
    .line 138
    new-instance p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$16;

    .line 139
    .line 140
    invoke-direct {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$16;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 147
    .line 148
    .line 149
    return v3

    .line 150
    :cond_4
    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e()V

    .line 151
    .line 152
    .line 153
    return v3

    .line 154
    :cond_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    .line 157
    .line 158
    iget-object v0, p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 159
    .line 160
    iget-object v4, p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Landroid/view/ViewGroup;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    if-nez v5, :cond_8

    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    instance-of v6, v5, Lz/e;

    .line 173
    .line 174
    if-eqz v6, :cond_6

    .line 175
    .line 176
    check-cast v5, Lz/e;

    .line 177
    .line 178
    new-instance v6, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    .line 179
    .line 180
    invoke-direct {v6}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;-><init>()V

    .line 181
    .line 182
    .line 183
    iget-object v7, v6, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;->p:Lcom/google/android/material/snackbar/BaseTransientBottomBar$BehaviorDelegate;

    .line 184
    .line 185
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v8, p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 189
    .line 190
    iput-object v8, v7, Lcom/google/android/material/snackbar/BaseTransientBottomBar$BehaviorDelegate;->a:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 191
    .line 192
    new-instance v7, Lcom/google/android/material/snackbar/BaseTransientBottomBar$7;

    .line 193
    .line 194
    invoke-direct {v7, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$7;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 195
    .line 196
    .line 197
    iput-object v7, v6, Lcom/google/android/material/behavior/SwipeDismissBehavior;->i:Lcom/google/android/material/behavior/SwipeDismissBehavior$OnDismissListener;

    .line 198
    .line 199
    invoke-virtual {v5, v6}, Lz/e;->b(Lz/b;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c()Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    if-nez v6, :cond_6

    .line 207
    .line 208
    const/16 v6, 0x50

    .line 209
    .line 210
    iput v6, v5, Lz/e;->g:I

    .line 211
    .line 212
    :cond_6
    iput-boolean v3, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->r:Z

    .line 213
    .line 214
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 215
    .line 216
    .line 217
    iput-boolean v2, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->r:Z

    .line 218
    .line 219
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c()Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    if-nez v5, :cond_7

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_7
    new-array v2, v1, [I

    .line 227
    .line 228
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c()Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v5, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 233
    .line 234
    .line 235
    aget v2, v2, v3

    .line 236
    .line 237
    new-array v1, v1, [I

    .line 238
    .line 239
    invoke-virtual {v4, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 240
    .line 241
    .line 242
    aget v1, v1, v3

    .line 243
    .line 244
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    add-int/2addr v4, v1

    .line 249
    sub-int v2, v4, v2

    .line 250
    .line 251
    :goto_1
    iput v2, p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->q:I

    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i()V

    .line 254
    .line 255
    .line 256
    const/4 v1, 0x4

    .line 257
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 258
    .line 259
    .line 260
    :cond_8
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_9

    .line 267
    .line 268
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->h()V

    .line 269
    .line 270
    .line 271
    return v3

    .line 272
    :cond_9
    iput-boolean v3, p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->t:Z

    .line 273
    .line 274
    return v3

    .line 275
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
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
