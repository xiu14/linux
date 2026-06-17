.class public final Lw/i;
.super Lw/l;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lw/i;->k:[I

    .line 5
    .line 6
    return-void
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

.method public static m([IIIIIFI)V
    .locals 2

    .line 1
    sub-int/2addr p2, p1

    .line 2
    sub-int/2addr p4, p3

    .line 3
    const/4 p1, -0x1

    .line 4
    const/4 p3, 0x0

    .line 5
    const/high16 v0, 0x3f000000    # 0.5f

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p6, p1, :cond_2

    .line 9
    .line 10
    if-eqz p6, :cond_1

    .line 11
    .line 12
    if-eq p6, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    int-to-float p1, p2

    .line 16
    mul-float p1, p1, p5

    .line 17
    .line 18
    add-float/2addr p1, v0

    .line 19
    float-to-int p1, p1

    .line 20
    aput p2, p0, p3

    .line 21
    .line 22
    aput p1, p0, v1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    int-to-float p1, p4

    .line 26
    mul-float p1, p1, p5

    .line 27
    .line 28
    add-float/2addr p1, v0

    .line 29
    float-to-int p1, p1

    .line 30
    aput p1, p0, p3

    .line 31
    .line 32
    aput p4, p0, v1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    int-to-float p1, p4

    .line 36
    mul-float p1, p1, p5

    .line 37
    .line 38
    add-float/2addr p1, v0

    .line 39
    float-to-int p1, p1

    .line 40
    int-to-float p6, p2

    .line 41
    div-float/2addr p6, p5

    .line 42
    add-float/2addr p6, v0

    .line 43
    float-to-int p5, p6

    .line 44
    if-gt p1, p2, :cond_3

    .line 45
    .line 46
    aput p1, p0, p3

    .line 47
    .line 48
    aput p4, p0, v1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    if-gt p5, p4, :cond_4

    .line 52
    .line 53
    aput p2, p0, p3

    .line 54
    .line 55
    aput p5, p0, v1

    .line 56
    .line 57
    :cond_4
    :goto_0
    return-void
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
.end method


# virtual methods
.method public final a(Lw/d;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/l;->j:I

    .line 4
    .line 5
    invoke-static {v1}, Lu/h;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq v1, v2, :cond_26

    .line 12
    .line 13
    iget-object v1, v0, Lw/l;->e:Lw/f;

    .line 14
    .line 15
    iget-boolean v4, v1, Lw/e;->j:Z

    .line 16
    .line 17
    const/high16 v5, 0x3f000000    # 0.5f

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    iget-object v7, v0, Lw/l;->h:Lw/e;

    .line 21
    .line 22
    iget-object v8, v0, Lw/l;->i:Lw/e;

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iget v4, v0, Lw/l;->d:I

    .line 27
    .line 28
    if-ne v4, v2, :cond_0

    .line 29
    .line 30
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 31
    .line 32
    iget v9, v4, Lv/d;->j:I

    .line 33
    .line 34
    iget-object v10, v4, Lv/d;->e:Lw/k;

    .line 35
    .line 36
    const/4 v11, 0x2

    .line 37
    if-eq v9, v11, :cond_1c

    .line 38
    .line 39
    if-eq v9, v2, :cond_1

    .line 40
    .line 41
    :cond_0
    :goto_0
    const/high16 p1, 0x3f000000    # 0.5f

    .line 42
    .line 43
    goto/16 :goto_a

    .line 44
    .line 45
    :cond_1
    iget v9, v4, Lv/d;->k:I

    .line 46
    .line 47
    const/4 v11, -0x1

    .line 48
    if-eqz v9, :cond_6

    .line 49
    .line 50
    if-ne v9, v2, :cond_2

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_2
    iget v9, v4, Lv/d;->M:I

    .line 54
    .line 55
    if-eq v9, v11, :cond_5

    .line 56
    .line 57
    if-eqz v9, :cond_4

    .line 58
    .line 59
    if-eq v9, v6, :cond_3

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    iget-object v9, v10, Lw/l;->e:Lw/f;

    .line 64
    .line 65
    iget v9, v9, Lw/e;->g:I

    .line 66
    .line 67
    int-to-float v9, v9

    .line 68
    iget v4, v4, Lv/d;->L:F

    .line 69
    .line 70
    :goto_1
    mul-float v9, v9, v4

    .line 71
    .line 72
    :goto_2
    add-float/2addr v9, v5

    .line 73
    float-to-int v4, v9

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    iget-object v9, v10, Lw/l;->e:Lw/f;

    .line 76
    .line 77
    iget v9, v9, Lw/e;->g:I

    .line 78
    .line 79
    int-to-float v9, v9

    .line 80
    iget v4, v4, Lv/d;->L:F

    .line 81
    .line 82
    div-float/2addr v9, v4

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    iget-object v9, v10, Lw/l;->e:Lw/f;

    .line 85
    .line 86
    iget v9, v9, Lw/e;->g:I

    .line 87
    .line 88
    int-to-float v9, v9

    .line 89
    iget v4, v4, Lv/d;->L:F

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :goto_3
    invoke-virtual {v1, v4}, Lw/f;->d(I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    :goto_4
    iget-object v9, v10, Lw/l;->h:Lw/e;

    .line 97
    .line 98
    iget-object v10, v10, Lw/l;->i:Lw/e;

    .line 99
    .line 100
    iget-object v12, v4, Lv/d;->x:Lv/c;

    .line 101
    .line 102
    iget-object v12, v12, Lv/c;->d:Lv/c;

    .line 103
    .line 104
    if-eqz v12, :cond_7

    .line 105
    .line 106
    const/4 v12, 0x1

    .line 107
    goto :goto_5

    .line 108
    :cond_7
    const/4 v12, 0x0

    .line 109
    :goto_5
    iget-object v13, v4, Lv/d;->y:Lv/c;

    .line 110
    .line 111
    iget-object v13, v13, Lv/c;->d:Lv/c;

    .line 112
    .line 113
    if-eqz v13, :cond_8

    .line 114
    .line 115
    const/4 v13, 0x1

    .line 116
    goto :goto_6

    .line 117
    :cond_8
    const/4 v13, 0x0

    .line 118
    :goto_6
    iget-object v14, v4, Lv/d;->z:Lv/c;

    .line 119
    .line 120
    iget-object v14, v14, Lv/c;->d:Lv/c;

    .line 121
    .line 122
    if-eqz v14, :cond_9

    .line 123
    .line 124
    const/4 v14, 0x1

    .line 125
    goto :goto_7

    .line 126
    :cond_9
    const/4 v14, 0x0

    .line 127
    :goto_7
    iget-object v15, v4, Lv/d;->A:Lv/c;

    .line 128
    .line 129
    iget-object v15, v15, Lv/c;->d:Lv/c;

    .line 130
    .line 131
    if-eqz v15, :cond_a

    .line 132
    .line 133
    const/4 v15, 0x1

    .line 134
    :goto_8
    const/high16 p1, 0x3f000000    # 0.5f

    .line 135
    .line 136
    goto :goto_9

    .line 137
    :cond_a
    const/4 v15, 0x0

    .line 138
    goto :goto_8

    .line 139
    :goto_9
    iget v5, v4, Lv/d;->M:I

    .line 140
    .line 141
    if-eqz v12, :cond_10

    .line 142
    .line 143
    if-eqz v13, :cond_10

    .line 144
    .line 145
    if-eqz v14, :cond_10

    .line 146
    .line 147
    if-eqz v15, :cond_10

    .line 148
    .line 149
    iget v4, v4, Lv/d;->L:F

    .line 150
    .line 151
    iget-boolean v11, v9, Lw/e;->j:Z

    .line 152
    .line 153
    iget-object v12, v9, Lw/e;->l:Ljava/util/ArrayList;

    .line 154
    .line 155
    sget-object v16, Lw/i;->k:[I

    .line 156
    .line 157
    if-eqz v11, :cond_c

    .line 158
    .line 159
    iget-boolean v11, v10, Lw/e;->j:Z

    .line 160
    .line 161
    if-eqz v11, :cond_c

    .line 162
    .line 163
    iget-boolean v2, v7, Lw/e;->c:Z

    .line 164
    .line 165
    if-eqz v2, :cond_25

    .line 166
    .line 167
    iget-boolean v2, v8, Lw/e;->c:Z

    .line 168
    .line 169
    if-nez v2, :cond_b

    .line 170
    .line 171
    goto/16 :goto_c

    .line 172
    .line 173
    :cond_b
    iget-object v2, v7, Lw/e;->l:Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Lw/e;

    .line 180
    .line 181
    iget v2, v2, Lw/e;->g:I

    .line 182
    .line 183
    iget v7, v7, Lw/e;->f:I

    .line 184
    .line 185
    add-int v17, v2, v7

    .line 186
    .line 187
    iget-object v2, v8, Lw/e;->l:Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lw/e;

    .line 194
    .line 195
    iget v2, v2, Lw/e;->g:I

    .line 196
    .line 197
    iget v7, v8, Lw/e;->f:I

    .line 198
    .line 199
    sub-int v18, v2, v7

    .line 200
    .line 201
    iget v2, v9, Lw/e;->g:I

    .line 202
    .line 203
    iget v7, v9, Lw/e;->f:I

    .line 204
    .line 205
    add-int v19, v2, v7

    .line 206
    .line 207
    iget v2, v10, Lw/e;->g:I

    .line 208
    .line 209
    iget v7, v10, Lw/e;->f:I

    .line 210
    .line 211
    sub-int v20, v2, v7

    .line 212
    .line 213
    move/from16 v21, v4

    .line 214
    .line 215
    move/from16 v22, v5

    .line 216
    .line 217
    invoke-static/range {v16 .. v22}, Lw/i;->m([IIIIIFI)V

    .line 218
    .line 219
    .line 220
    aget v2, v16, v3

    .line 221
    .line 222
    invoke-virtual {v1, v2}, Lw/f;->d(I)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v0, Lw/l;->b:Lv/d;

    .line 226
    .line 227
    iget-object v1, v1, Lv/d;->e:Lw/k;

    .line 228
    .line 229
    iget-object v1, v1, Lw/l;->e:Lw/f;

    .line 230
    .line 231
    aget v2, v16, v6

    .line 232
    .line 233
    invoke-virtual {v1, v2}, Lw/f;->d(I)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_c
    move/from16 v21, v4

    .line 238
    .line 239
    move/from16 v22, v5

    .line 240
    .line 241
    iget-boolean v4, v7, Lw/e;->j:Z

    .line 242
    .line 243
    if-eqz v4, :cond_e

    .line 244
    .line 245
    iget-boolean v4, v8, Lw/e;->j:Z

    .line 246
    .line 247
    if-eqz v4, :cond_e

    .line 248
    .line 249
    iget-boolean v4, v9, Lw/e;->c:Z

    .line 250
    .line 251
    if-eqz v4, :cond_25

    .line 252
    .line 253
    iget-boolean v4, v10, Lw/e;->c:Z

    .line 254
    .line 255
    if-nez v4, :cond_d

    .line 256
    .line 257
    goto/16 :goto_c

    .line 258
    .line 259
    :cond_d
    iget v4, v7, Lw/e;->g:I

    .line 260
    .line 261
    iget v5, v7, Lw/e;->f:I

    .line 262
    .line 263
    add-int v17, v4, v5

    .line 264
    .line 265
    iget v4, v8, Lw/e;->g:I

    .line 266
    .line 267
    iget v5, v8, Lw/e;->f:I

    .line 268
    .line 269
    sub-int v18, v4, v5

    .line 270
    .line 271
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, Lw/e;

    .line 276
    .line 277
    iget v4, v4, Lw/e;->g:I

    .line 278
    .line 279
    iget v5, v9, Lw/e;->f:I

    .line 280
    .line 281
    add-int v19, v4, v5

    .line 282
    .line 283
    iget-object v4, v10, Lw/e;->l:Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    check-cast v4, Lw/e;

    .line 290
    .line 291
    iget v4, v4, Lw/e;->g:I

    .line 292
    .line 293
    iget v5, v10, Lw/e;->f:I

    .line 294
    .line 295
    sub-int v20, v4, v5

    .line 296
    .line 297
    invoke-static/range {v16 .. v22}, Lw/i;->m([IIIIIFI)V

    .line 298
    .line 299
    .line 300
    aget v4, v16, v3

    .line 301
    .line 302
    invoke-virtual {v1, v4}, Lw/f;->d(I)V

    .line 303
    .line 304
    .line 305
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 306
    .line 307
    iget-object v4, v4, Lv/d;->e:Lw/k;

    .line 308
    .line 309
    iget-object v4, v4, Lw/l;->e:Lw/f;

    .line 310
    .line 311
    aget v5, v16, v6

    .line 312
    .line 313
    invoke-virtual {v4, v5}, Lw/f;->d(I)V

    .line 314
    .line 315
    .line 316
    :cond_e
    iget-boolean v4, v7, Lw/e;->c:Z

    .line 317
    .line 318
    if-eqz v4, :cond_25

    .line 319
    .line 320
    iget-boolean v4, v8, Lw/e;->c:Z

    .line 321
    .line 322
    if-eqz v4, :cond_25

    .line 323
    .line 324
    iget-boolean v4, v9, Lw/e;->c:Z

    .line 325
    .line 326
    if-eqz v4, :cond_25

    .line 327
    .line 328
    iget-boolean v4, v10, Lw/e;->c:Z

    .line 329
    .line 330
    if-nez v4, :cond_f

    .line 331
    .line 332
    goto/16 :goto_c

    .line 333
    .line 334
    :cond_f
    iget-object v4, v7, Lw/e;->l:Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    check-cast v4, Lw/e;

    .line 341
    .line 342
    iget v4, v4, Lw/e;->g:I

    .line 343
    .line 344
    iget v5, v7, Lw/e;->f:I

    .line 345
    .line 346
    add-int v17, v4, v5

    .line 347
    .line 348
    iget-object v4, v8, Lw/e;->l:Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    check-cast v4, Lw/e;

    .line 355
    .line 356
    iget v4, v4, Lw/e;->g:I

    .line 357
    .line 358
    iget v5, v8, Lw/e;->f:I

    .line 359
    .line 360
    sub-int v18, v4, v5

    .line 361
    .line 362
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    check-cast v4, Lw/e;

    .line 367
    .line 368
    iget v4, v4, Lw/e;->g:I

    .line 369
    .line 370
    iget v5, v9, Lw/e;->f:I

    .line 371
    .line 372
    add-int v19, v4, v5

    .line 373
    .line 374
    iget-object v4, v10, Lw/e;->l:Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    check-cast v4, Lw/e;

    .line 381
    .line 382
    iget v4, v4, Lw/e;->g:I

    .line 383
    .line 384
    iget v5, v10, Lw/e;->f:I

    .line 385
    .line 386
    sub-int v20, v4, v5

    .line 387
    .line 388
    invoke-static/range {v16 .. v22}, Lw/i;->m([IIIIIFI)V

    .line 389
    .line 390
    .line 391
    aget v4, v16, v3

    .line 392
    .line 393
    invoke-virtual {v1, v4}, Lw/f;->d(I)V

    .line 394
    .line 395
    .line 396
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 397
    .line 398
    iget-object v4, v4, Lv/d;->e:Lw/k;

    .line 399
    .line 400
    iget-object v4, v4, Lw/l;->e:Lw/f;

    .line 401
    .line 402
    aget v5, v16, v6

    .line 403
    .line 404
    invoke-virtual {v4, v5}, Lw/f;->d(I)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_a

    .line 408
    .line 409
    :cond_10
    if-eqz v12, :cond_16

    .line 410
    .line 411
    if-eqz v14, :cond_16

    .line 412
    .line 413
    iget-boolean v9, v7, Lw/e;->c:Z

    .line 414
    .line 415
    if-eqz v9, :cond_25

    .line 416
    .line 417
    iget-boolean v9, v8, Lw/e;->c:Z

    .line 418
    .line 419
    if-nez v9, :cond_11

    .line 420
    .line 421
    goto/16 :goto_c

    .line 422
    .line 423
    :cond_11
    iget v4, v4, Lv/d;->L:F

    .line 424
    .line 425
    iget-object v9, v7, Lw/e;->l:Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    check-cast v9, Lw/e;

    .line 432
    .line 433
    iget v9, v9, Lw/e;->g:I

    .line 434
    .line 435
    iget v10, v7, Lw/e;->f:I

    .line 436
    .line 437
    add-int/2addr v9, v10

    .line 438
    iget-object v10, v8, Lw/e;->l:Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v10

    .line 444
    check-cast v10, Lw/e;

    .line 445
    .line 446
    iget v10, v10, Lw/e;->g:I

    .line 447
    .line 448
    iget v12, v8, Lw/e;->f:I

    .line 449
    .line 450
    sub-int/2addr v10, v12

    .line 451
    if-eq v5, v11, :cond_14

    .line 452
    .line 453
    if-eqz v5, :cond_14

    .line 454
    .line 455
    if-eq v5, v6, :cond_12

    .line 456
    .line 457
    goto/16 :goto_a

    .line 458
    .line 459
    :cond_12
    sub-int/2addr v10, v9

    .line 460
    invoke-virtual {v0, v10, v3}, Lw/l;->g(II)I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    int-to-float v9, v5

    .line 465
    div-float/2addr v9, v4

    .line 466
    add-float v9, v9, p1

    .line 467
    .line 468
    float-to-int v9, v9

    .line 469
    invoke-virtual {v0, v9, v6}, Lw/l;->g(II)I

    .line 470
    .line 471
    .line 472
    move-result v10

    .line 473
    if-eq v9, v10, :cond_13

    .line 474
    .line 475
    int-to-float v5, v10

    .line 476
    mul-float v5, v5, v4

    .line 477
    .line 478
    add-float v5, v5, p1

    .line 479
    .line 480
    float-to-int v5, v5

    .line 481
    :cond_13
    invoke-virtual {v1, v5}, Lw/f;->d(I)V

    .line 482
    .line 483
    .line 484
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 485
    .line 486
    iget-object v4, v4, Lv/d;->e:Lw/k;

    .line 487
    .line 488
    iget-object v4, v4, Lw/l;->e:Lw/f;

    .line 489
    .line 490
    invoke-virtual {v4, v10}, Lw/f;->d(I)V

    .line 491
    .line 492
    .line 493
    goto/16 :goto_a

    .line 494
    .line 495
    :cond_14
    sub-int/2addr v10, v9

    .line 496
    invoke-virtual {v0, v10, v3}, Lw/l;->g(II)I

    .line 497
    .line 498
    .line 499
    move-result v5

    .line 500
    int-to-float v9, v5

    .line 501
    mul-float v9, v9, v4

    .line 502
    .line 503
    add-float v9, v9, p1

    .line 504
    .line 505
    float-to-int v9, v9

    .line 506
    invoke-virtual {v0, v9, v6}, Lw/l;->g(II)I

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    if-eq v9, v10, :cond_15

    .line 511
    .line 512
    int-to-float v5, v10

    .line 513
    div-float/2addr v5, v4

    .line 514
    add-float v5, v5, p1

    .line 515
    .line 516
    float-to-int v5, v5

    .line 517
    :cond_15
    invoke-virtual {v1, v5}, Lw/f;->d(I)V

    .line 518
    .line 519
    .line 520
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 521
    .line 522
    iget-object v4, v4, Lv/d;->e:Lw/k;

    .line 523
    .line 524
    iget-object v4, v4, Lw/l;->e:Lw/f;

    .line 525
    .line 526
    invoke-virtual {v4, v10}, Lw/f;->d(I)V

    .line 527
    .line 528
    .line 529
    goto/16 :goto_a

    .line 530
    .line 531
    :cond_16
    if-eqz v13, :cond_1d

    .line 532
    .line 533
    if-eqz v15, :cond_1d

    .line 534
    .line 535
    iget-boolean v12, v9, Lw/e;->c:Z

    .line 536
    .line 537
    if-eqz v12, :cond_25

    .line 538
    .line 539
    iget-boolean v12, v10, Lw/e;->c:Z

    .line 540
    .line 541
    if-nez v12, :cond_17

    .line 542
    .line 543
    goto/16 :goto_c

    .line 544
    .line 545
    :cond_17
    iget v4, v4, Lv/d;->L:F

    .line 546
    .line 547
    iget-object v12, v9, Lw/e;->l:Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v12

    .line 553
    check-cast v12, Lw/e;

    .line 554
    .line 555
    iget v12, v12, Lw/e;->g:I

    .line 556
    .line 557
    iget v9, v9, Lw/e;->f:I

    .line 558
    .line 559
    add-int/2addr v12, v9

    .line 560
    iget-object v9, v10, Lw/e;->l:Ljava/util/ArrayList;

    .line 561
    .line 562
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    check-cast v9, Lw/e;

    .line 567
    .line 568
    iget v9, v9, Lw/e;->g:I

    .line 569
    .line 570
    iget v10, v10, Lw/e;->f:I

    .line 571
    .line 572
    sub-int/2addr v9, v10

    .line 573
    if-eq v5, v11, :cond_1a

    .line 574
    .line 575
    if-eqz v5, :cond_18

    .line 576
    .line 577
    if-eq v5, v6, :cond_1a

    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_18
    sub-int/2addr v9, v12

    .line 581
    invoke-virtual {v0, v9, v6}, Lw/l;->g(II)I

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    int-to-float v9, v5

    .line 586
    mul-float v9, v9, v4

    .line 587
    .line 588
    add-float v9, v9, p1

    .line 589
    .line 590
    float-to-int v9, v9

    .line 591
    invoke-virtual {v0, v9, v3}, Lw/l;->g(II)I

    .line 592
    .line 593
    .line 594
    move-result v10

    .line 595
    if-eq v9, v10, :cond_19

    .line 596
    .line 597
    int-to-float v5, v10

    .line 598
    div-float/2addr v5, v4

    .line 599
    add-float v5, v5, p1

    .line 600
    .line 601
    float-to-int v5, v5

    .line 602
    :cond_19
    invoke-virtual {v1, v10}, Lw/f;->d(I)V

    .line 603
    .line 604
    .line 605
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 606
    .line 607
    iget-object v4, v4, Lv/d;->e:Lw/k;

    .line 608
    .line 609
    iget-object v4, v4, Lw/l;->e:Lw/f;

    .line 610
    .line 611
    invoke-virtual {v4, v5}, Lw/f;->d(I)V

    .line 612
    .line 613
    .line 614
    goto :goto_a

    .line 615
    :cond_1a
    sub-int/2addr v9, v12

    .line 616
    invoke-virtual {v0, v9, v6}, Lw/l;->g(II)I

    .line 617
    .line 618
    .line 619
    move-result v5

    .line 620
    int-to-float v9, v5

    .line 621
    div-float/2addr v9, v4

    .line 622
    add-float v9, v9, p1

    .line 623
    .line 624
    float-to-int v9, v9

    .line 625
    invoke-virtual {v0, v9, v3}, Lw/l;->g(II)I

    .line 626
    .line 627
    .line 628
    move-result v10

    .line 629
    if-eq v9, v10, :cond_1b

    .line 630
    .line 631
    int-to-float v5, v10

    .line 632
    mul-float v5, v5, v4

    .line 633
    .line 634
    add-float v5, v5, p1

    .line 635
    .line 636
    float-to-int v5, v5

    .line 637
    :cond_1b
    invoke-virtual {v1, v10}, Lw/f;->d(I)V

    .line 638
    .line 639
    .line 640
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 641
    .line 642
    iget-object v4, v4, Lv/d;->e:Lw/k;

    .line 643
    .line 644
    iget-object v4, v4, Lw/l;->e:Lw/f;

    .line 645
    .line 646
    invoke-virtual {v4, v5}, Lw/f;->d(I)V

    .line 647
    .line 648
    .line 649
    goto :goto_a

    .line 650
    :cond_1c
    const/high16 p1, 0x3f000000    # 0.5f

    .line 651
    .line 652
    iget-object v5, v4, Lv/d;->I:Lv/d;

    .line 653
    .line 654
    if-eqz v5, :cond_1d

    .line 655
    .line 656
    iget-object v5, v5, Lv/d;->d:Lw/i;

    .line 657
    .line 658
    iget-object v5, v5, Lw/l;->e:Lw/f;

    .line 659
    .line 660
    iget-boolean v9, v5, Lw/e;->j:Z

    .line 661
    .line 662
    if-eqz v9, :cond_1d

    .line 663
    .line 664
    iget v4, v4, Lv/d;->o:F

    .line 665
    .line 666
    iget v5, v5, Lw/e;->g:I

    .line 667
    .line 668
    int-to-float v5, v5

    .line 669
    mul-float v5, v5, v4

    .line 670
    .line 671
    add-float v5, v5, p1

    .line 672
    .line 673
    float-to-int v4, v5

    .line 674
    invoke-virtual {v1, v4}, Lw/f;->d(I)V

    .line 675
    .line 676
    .line 677
    :cond_1d
    :goto_a
    iget-boolean v4, v7, Lw/e;->c:Z

    .line 678
    .line 679
    iget-object v5, v7, Lw/e;->l:Ljava/util/ArrayList;

    .line 680
    .line 681
    if-eqz v4, :cond_25

    .line 682
    .line 683
    iget-boolean v4, v8, Lw/e;->c:Z

    .line 684
    .line 685
    iget-object v9, v8, Lw/e;->l:Ljava/util/ArrayList;

    .line 686
    .line 687
    if-nez v4, :cond_1e

    .line 688
    .line 689
    goto/16 :goto_c

    .line 690
    .line 691
    :cond_1e
    iget-boolean v4, v7, Lw/e;->j:Z

    .line 692
    .line 693
    if-eqz v4, :cond_1f

    .line 694
    .line 695
    iget-boolean v4, v8, Lw/e;->j:Z

    .line 696
    .line 697
    if-eqz v4, :cond_1f

    .line 698
    .line 699
    iget-boolean v4, v1, Lw/e;->j:Z

    .line 700
    .line 701
    if-eqz v4, :cond_1f

    .line 702
    .line 703
    goto/16 :goto_c

    .line 704
    .line 705
    :cond_1f
    iget-boolean v4, v1, Lw/e;->j:Z

    .line 706
    .line 707
    if-nez v4, :cond_20

    .line 708
    .line 709
    iget v4, v0, Lw/l;->d:I

    .line 710
    .line 711
    if-ne v4, v2, :cond_20

    .line 712
    .line 713
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 714
    .line 715
    iget v10, v4, Lv/d;->j:I

    .line 716
    .line 717
    if-nez v10, :cond_20

    .line 718
    .line 719
    invoke-virtual {v4}, Lv/d;->q()Z

    .line 720
    .line 721
    .line 722
    move-result v4

    .line 723
    if-nez v4, :cond_20

    .line 724
    .line 725
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    check-cast v2, Lw/e;

    .line 730
    .line 731
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    check-cast v3, Lw/e;

    .line 736
    .line 737
    iget v2, v2, Lw/e;->g:I

    .line 738
    .line 739
    iget v4, v7, Lw/e;->f:I

    .line 740
    .line 741
    add-int/2addr v2, v4

    .line 742
    iget v3, v3, Lw/e;->g:I

    .line 743
    .line 744
    iget v4, v8, Lw/e;->f:I

    .line 745
    .line 746
    add-int/2addr v3, v4

    .line 747
    sub-int v4, v3, v2

    .line 748
    .line 749
    invoke-virtual {v7, v2}, Lw/e;->d(I)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v8, v3}, Lw/e;->d(I)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v1, v4}, Lw/f;->d(I)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :cond_20
    iget-boolean v4, v1, Lw/e;->j:Z

    .line 760
    .line 761
    if-nez v4, :cond_22

    .line 762
    .line 763
    iget v4, v0, Lw/l;->d:I

    .line 764
    .line 765
    if-ne v4, v2, :cond_22

    .line 766
    .line 767
    iget v2, v0, Lw/l;->a:I

    .line 768
    .line 769
    if-ne v2, v6, :cond_22

    .line 770
    .line 771
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 772
    .line 773
    .line 774
    move-result v2

    .line 775
    if-lez v2, :cond_22

    .line 776
    .line 777
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    if-lez v2, :cond_22

    .line 782
    .line 783
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    check-cast v2, Lw/e;

    .line 788
    .line 789
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v4

    .line 793
    check-cast v4, Lw/e;

    .line 794
    .line 795
    iget v2, v2, Lw/e;->g:I

    .line 796
    .line 797
    iget v6, v7, Lw/e;->f:I

    .line 798
    .line 799
    add-int/2addr v2, v6

    .line 800
    iget v4, v4, Lw/e;->g:I

    .line 801
    .line 802
    iget v6, v8, Lw/e;->f:I

    .line 803
    .line 804
    add-int/2addr v4, v6

    .line 805
    sub-int/2addr v4, v2

    .line 806
    iget v2, v1, Lw/f;->m:I

    .line 807
    .line 808
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 809
    .line 810
    .line 811
    move-result v2

    .line 812
    iget-object v4, v0, Lw/l;->b:Lv/d;

    .line 813
    .line 814
    iget v6, v4, Lv/d;->n:I

    .line 815
    .line 816
    iget v4, v4, Lv/d;->m:I

    .line 817
    .line 818
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    if-lez v6, :cond_21

    .line 823
    .line 824
    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    .line 825
    .line 826
    .line 827
    move-result v2

    .line 828
    :cond_21
    invoke-virtual {v1, v2}, Lw/f;->d(I)V

    .line 829
    .line 830
    .line 831
    :cond_22
    iget-boolean v2, v1, Lw/e;->j:Z

    .line 832
    .line 833
    if-nez v2, :cond_23

    .line 834
    .line 835
    goto :goto_c

    .line 836
    :cond_23
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    check-cast v2, Lw/e;

    .line 841
    .line 842
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    check-cast v3, Lw/e;

    .line 847
    .line 848
    iget v4, v2, Lw/e;->g:I

    .line 849
    .line 850
    iget v5, v7, Lw/e;->f:I

    .line 851
    .line 852
    add-int/2addr v5, v4

    .line 853
    iget v6, v3, Lw/e;->g:I

    .line 854
    .line 855
    iget v9, v8, Lw/e;->f:I

    .line 856
    .line 857
    add-int/2addr v9, v6

    .line 858
    iget-object v10, v0, Lw/l;->b:Lv/d;

    .line 859
    .line 860
    iget v10, v10, Lv/d;->S:F

    .line 861
    .line 862
    if-ne v2, v3, :cond_24

    .line 863
    .line 864
    const/high16 v10, 0x3f000000    # 0.5f

    .line 865
    .line 866
    goto :goto_b

    .line 867
    :cond_24
    move v4, v5

    .line 868
    move v6, v9

    .line 869
    :goto_b
    sub-int/2addr v6, v4

    .line 870
    iget v2, v1, Lw/e;->g:I

    .line 871
    .line 872
    sub-int/2addr v6, v2

    .line 873
    int-to-float v2, v4

    .line 874
    add-float v2, v2, p1

    .line 875
    .line 876
    int-to-float v3, v6

    .line 877
    mul-float v3, v3, v10

    .line 878
    .line 879
    add-float/2addr v3, v2

    .line 880
    float-to-int v2, v3

    .line 881
    invoke-virtual {v7, v2}, Lw/e;->d(I)V

    .line 882
    .line 883
    .line 884
    iget v2, v7, Lw/e;->g:I

    .line 885
    .line 886
    iget v1, v1, Lw/e;->g:I

    .line 887
    .line 888
    add-int/2addr v2, v1

    .line 889
    invoke-virtual {v8, v2}, Lw/e;->d(I)V

    .line 890
    .line 891
    .line 892
    :cond_25
    :goto_c
    return-void

    .line 893
    :cond_26
    iget-object v1, v0, Lw/l;->b:Lv/d;

    .line 894
    .line 895
    iget-object v2, v1, Lv/d;->x:Lv/c;

    .line 896
    .line 897
    iget-object v1, v1, Lv/d;->z:Lv/c;

    .line 898
    .line 899
    invoke-virtual {v0, v2, v1, v3}, Lw/l;->l(Lv/c;Lv/c;I)V

    .line 900
    .line 901
    .line 902
    return-void
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
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
.end method

.method public final d()V
    .locals 13

    .line 1
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 2
    .line 3
    iget-boolean v1, v0, Lv/d;->a:Z

    .line 4
    .line 5
    iget-object v2, p0, Lw/l;->e:Lw/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lv/d;->l()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2, v0}, Lw/f;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, v2, Lw/e;->j:Z

    .line 17
    .line 18
    iget-object v1, v2, Lw/e;->k:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v3, v2, Lw/e;->l:Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    const/4 v5, 0x4

    .line 24
    const/4 v6, 0x1

    .line 25
    const/4 v7, 0x0

    .line 26
    iget-object v8, p0, Lw/l;->i:Lw/e;

    .line 27
    .line 28
    iget-object v9, p0, Lw/l;->h:Lw/e;

    .line 29
    .line 30
    if-nez v0, :cond_4

    .line 31
    .line 32
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 33
    .line 34
    iget-object v10, v0, Lv/d;->c0:[I

    .line 35
    .line 36
    aget v10, v10, v7

    .line 37
    .line 38
    iput v10, p0, Lw/l;->d:I

    .line 39
    .line 40
    if-eq v10, v4, :cond_7

    .line 41
    .line 42
    if-ne v10, v5, :cond_3

    .line 43
    .line 44
    iget-object v11, v0, Lv/d;->I:Lv/d;

    .line 45
    .line 46
    if-eqz v11, :cond_1

    .line 47
    .line 48
    iget-object v12, v11, Lv/d;->c0:[I

    .line 49
    .line 50
    aget v12, v12, v7

    .line 51
    .line 52
    if-eq v12, v6, :cond_2

    .line 53
    .line 54
    :cond_1
    iget-object v12, v11, Lv/d;->c0:[I

    .line 55
    .line 56
    aget v12, v12, v7

    .line 57
    .line 58
    if-ne v12, v5, :cond_3

    .line 59
    .line 60
    :cond_2
    invoke-virtual {v11}, Lv/d;->l()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v1, v11, Lv/d;->d:Lw/i;

    .line 65
    .line 66
    iget-object v3, p0, Lw/l;->b:Lv/d;

    .line 67
    .line 68
    iget-object v3, v3, Lv/d;->x:Lv/c;

    .line 69
    .line 70
    invoke-virtual {v3}, Lv/c;->c()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    sub-int/2addr v0, v3

    .line 75
    iget-object v3, p0, Lw/l;->b:Lv/d;

    .line 76
    .line 77
    iget-object v3, v3, Lv/d;->z:Lv/c;

    .line 78
    .line 79
    invoke-virtual {v3}, Lv/c;->c()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    sub-int/2addr v0, v3

    .line 84
    iget-object v3, v1, Lw/l;->h:Lw/e;

    .line 85
    .line 86
    iget-object v4, p0, Lw/l;->b:Lv/d;

    .line 87
    .line 88
    iget-object v4, v4, Lv/d;->x:Lv/c;

    .line 89
    .line 90
    invoke-virtual {v4}, Lv/c;->c()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-static {v9, v3, v4}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v1, Lw/l;->i:Lw/e;

    .line 98
    .line 99
    iget-object v3, p0, Lw/l;->b:Lv/d;

    .line 100
    .line 101
    iget-object v3, v3, Lv/d;->z:Lv/c;

    .line 102
    .line 103
    invoke-virtual {v3}, Lv/c;->c()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    neg-int v3, v3

    .line 108
    invoke-static {v8, v1, v3}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v0}, Lw/f;->d(I)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    if-ne v10, v6, :cond_7

    .line 116
    .line 117
    invoke-virtual {v0}, Lv/d;->l()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-virtual {v2, v0}, Lw/f;->d(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    iget v0, p0, Lw/l;->d:I

    .line 126
    .line 127
    if-ne v0, v5, :cond_7

    .line 128
    .line 129
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 130
    .line 131
    iget-object v10, v0, Lv/d;->I:Lv/d;

    .line 132
    .line 133
    if-eqz v10, :cond_5

    .line 134
    .line 135
    iget-object v11, v10, Lv/d;->c0:[I

    .line 136
    .line 137
    aget v11, v11, v7

    .line 138
    .line 139
    if-eq v11, v6, :cond_6

    .line 140
    .line 141
    :cond_5
    iget-object v11, v10, Lv/d;->c0:[I

    .line 142
    .line 143
    aget v11, v11, v7

    .line 144
    .line 145
    if-ne v11, v5, :cond_7

    .line 146
    .line 147
    :cond_6
    iget-object v1, v10, Lv/d;->d:Lw/i;

    .line 148
    .line 149
    iget-object v1, v1, Lw/l;->h:Lw/e;

    .line 150
    .line 151
    iget-object v0, v0, Lv/d;->x:Lv/c;

    .line 152
    .line 153
    invoke-virtual {v0}, Lv/c;->c()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-static {v9, v1, v0}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v10, Lv/d;->d:Lw/i;

    .line 161
    .line 162
    iget-object v0, v0, Lw/l;->i:Lw/e;

    .line 163
    .line 164
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 165
    .line 166
    iget-object v1, v1, Lv/d;->z:Lv/c;

    .line 167
    .line 168
    invoke-virtual {v1}, Lv/c;->c()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    neg-int v1, v1

    .line 173
    invoke-static {v8, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_7
    :goto_0
    iget-boolean v0, v2, Lw/e;->j:Z

    .line 178
    .line 179
    if-eqz v0, :cond_e

    .line 180
    .line 181
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 182
    .line 183
    iget-boolean v10, v0, Lv/d;->a:Z

    .line 184
    .line 185
    if-eqz v10, :cond_e

    .line 186
    .line 187
    iget-object v1, v0, Lv/d;->F:[Lv/c;

    .line 188
    .line 189
    aget-object v3, v1, v7

    .line 190
    .line 191
    iget-object v4, v3, Lv/c;->d:Lv/c;

    .line 192
    .line 193
    if-eqz v4, :cond_b

    .line 194
    .line 195
    aget-object v5, v1, v6

    .line 196
    .line 197
    iget-object v5, v5, Lv/c;->d:Lv/c;

    .line 198
    .line 199
    if-eqz v5, :cond_b

    .line 200
    .line 201
    invoke-virtual {v0}, Lv/d;->q()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_8

    .line 206
    .line 207
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 208
    .line 209
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    .line 210
    .line 211
    aget-object v0, v0, v7

    .line 212
    .line 213
    invoke-virtual {v0}, Lv/c;->c()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    iput v0, v9, Lw/e;->f:I

    .line 218
    .line 219
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 220
    .line 221
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    .line 222
    .line 223
    aget-object v0, v0, v6

    .line 224
    .line 225
    invoke-virtual {v0}, Lv/c;->c()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    neg-int v0, v0

    .line 230
    iput v0, v8, Lw/e;->f:I

    .line 231
    .line 232
    return-void

    .line 233
    :cond_8
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 234
    .line 235
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    .line 236
    .line 237
    aget-object v0, v0, v7

    .line 238
    .line 239
    invoke-static {v0}, Lw/l;->h(Lv/c;)Lw/e;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-eqz v0, :cond_9

    .line 244
    .line 245
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 246
    .line 247
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 248
    .line 249
    aget-object v1, v1, v7

    .line 250
    .line 251
    invoke-virtual {v1}, Lv/c;->c()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-static {v9, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 256
    .line 257
    .line 258
    :cond_9
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 259
    .line 260
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    .line 261
    .line 262
    aget-object v0, v0, v6

    .line 263
    .line 264
    invoke-static {v0}, Lw/l;->h(Lv/c;)Lw/e;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-eqz v0, :cond_a

    .line 269
    .line 270
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 271
    .line 272
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 273
    .line 274
    aget-object v1, v1, v6

    .line 275
    .line 276
    invoke-virtual {v1}, Lv/c;->c()I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    neg-int v1, v1

    .line 281
    invoke-static {v8, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 282
    .line 283
    .line 284
    :cond_a
    iput-boolean v6, v9, Lw/e;->b:Z

    .line 285
    .line 286
    iput-boolean v6, v8, Lw/e;->b:Z

    .line 287
    .line 288
    return-void

    .line 289
    :cond_b
    if-eqz v4, :cond_c

    .line 290
    .line 291
    invoke-static {v3}, Lw/l;->h(Lv/c;)Lw/e;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-eqz v0, :cond_1a

    .line 296
    .line 297
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 298
    .line 299
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 300
    .line 301
    aget-object v1, v1, v7

    .line 302
    .line 303
    invoke-virtual {v1}, Lv/c;->c()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v9, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 308
    .line 309
    .line 310
    iget v0, v2, Lw/e;->g:I

    .line 311
    .line 312
    invoke-static {v8, v9, v0}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :cond_c
    aget-object v1, v1, v6

    .line 317
    .line 318
    iget-object v3, v1, Lv/c;->d:Lv/c;

    .line 319
    .line 320
    if-eqz v3, :cond_d

    .line 321
    .line 322
    invoke-static {v1}, Lw/l;->h(Lv/c;)Lw/e;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    if-eqz v0, :cond_1a

    .line 327
    .line 328
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 329
    .line 330
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 331
    .line 332
    aget-object v1, v1, v6

    .line 333
    .line 334
    invoke-virtual {v1}, Lv/c;->c()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    neg-int v1, v1

    .line 339
    invoke-static {v8, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 340
    .line 341
    .line 342
    iget v0, v2, Lw/e;->g:I

    .line 343
    .line 344
    neg-int v0, v0

    .line 345
    invoke-static {v9, v8, v0}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :cond_d
    instance-of v1, v0, Lv/i;

    .line 350
    .line 351
    if-nez v1, :cond_1a

    .line 352
    .line 353
    iget-object v1, v0, Lv/d;->I:Lv/d;

    .line 354
    .line 355
    if-eqz v1, :cond_1a

    .line 356
    .line 357
    const/4 v1, 0x7

    .line 358
    invoke-virtual {v0, v1}, Lv/d;->g(I)Lv/c;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    iget-object v0, v0, Lv/c;->d:Lv/c;

    .line 363
    .line 364
    if-nez v0, :cond_1a

    .line 365
    .line 366
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 367
    .line 368
    iget-object v1, v0, Lv/d;->I:Lv/d;

    .line 369
    .line 370
    iget-object v1, v1, Lv/d;->d:Lw/i;

    .line 371
    .line 372
    iget-object v1, v1, Lw/l;->h:Lw/e;

    .line 373
    .line 374
    invoke-virtual {v0}, Lv/d;->m()I

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    invoke-static {v9, v1, v0}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 379
    .line 380
    .line 381
    iget v0, v2, Lw/e;->g:I

    .line 382
    .line 383
    invoke-static {v8, v9, v0}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :cond_e
    iget v0, p0, Lw/l;->d:I

    .line 388
    .line 389
    if-ne v0, v4, :cond_15

    .line 390
    .line 391
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 392
    .line 393
    iget v10, v0, Lv/d;->j:I

    .line 394
    .line 395
    iget-object v11, v0, Lv/d;->e:Lw/k;

    .line 396
    .line 397
    const/4 v12, 0x2

    .line 398
    if-eq v10, v12, :cond_13

    .line 399
    .line 400
    if-eq v10, v4, :cond_f

    .line 401
    .line 402
    goto/16 :goto_1

    .line 403
    .line 404
    :cond_f
    iget v10, v0, Lv/d;->k:I

    .line 405
    .line 406
    if-ne v10, v4, :cond_12

    .line 407
    .line 408
    iput-object p0, v9, Lw/e;->a:Lw/l;

    .line 409
    .line 410
    iput-object p0, v8, Lw/e;->a:Lw/l;

    .line 411
    .line 412
    iget-object v4, v11, Lw/l;->h:Lw/e;

    .line 413
    .line 414
    iput-object p0, v4, Lw/e;->a:Lw/l;

    .line 415
    .line 416
    iget-object v4, v11, Lw/l;->i:Lw/e;

    .line 417
    .line 418
    iput-object p0, v4, Lw/e;->a:Lw/l;

    .line 419
    .line 420
    iput-object p0, v2, Lw/e;->a:Lw/l;

    .line 421
    .line 422
    invoke-virtual {v0}, Lv/d;->r()Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-eqz v0, :cond_10

    .line 427
    .line 428
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 429
    .line 430
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 431
    .line 432
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 433
    .line 434
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 438
    .line 439
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 440
    .line 441
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 442
    .line 443
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 449
    .line 450
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 451
    .line 452
    iget-object v1, v0, Lw/l;->e:Lw/f;

    .line 453
    .line 454
    iput-object p0, v1, Lw/e;->a:Lw/l;

    .line 455
    .line 456
    iget-object v0, v0, Lw/l;->h:Lw/e;

    .line 457
    .line 458
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 462
    .line 463
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 464
    .line 465
    iget-object v0, v0, Lw/l;->i:Lw/e;

    .line 466
    .line 467
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 471
    .line 472
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 473
    .line 474
    iget-object v0, v0, Lw/l;->h:Lw/e;

    .line 475
    .line 476
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 482
    .line 483
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 484
    .line 485
    iget-object v0, v0, Lw/l;->i:Lw/e;

    .line 486
    .line 487
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 488
    .line 489
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    goto/16 :goto_1

    .line 493
    .line 494
    :cond_10
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 495
    .line 496
    invoke-virtual {v0}, Lv/d;->q()Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_11

    .line 501
    .line 502
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 503
    .line 504
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 505
    .line 506
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 507
    .line 508
    iget-object v0, v0, Lw/e;->l:Ljava/util/ArrayList;

    .line 509
    .line 510
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 514
    .line 515
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 516
    .line 517
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 518
    .line 519
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    goto :goto_1

    .line 523
    :cond_11
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 524
    .line 525
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 526
    .line 527
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 528
    .line 529
    iget-object v0, v0, Lw/e;->l:Ljava/util/ArrayList;

    .line 530
    .line 531
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    goto :goto_1

    .line 535
    :cond_12
    iget-object v0, v11, Lw/l;->e:Lw/f;

    .line 536
    .line 537
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 541
    .line 542
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 546
    .line 547
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 548
    .line 549
    iget-object v0, v0, Lw/l;->h:Lw/e;

    .line 550
    .line 551
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 552
    .line 553
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 557
    .line 558
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 559
    .line 560
    iget-object v0, v0, Lw/l;->i:Lw/e;

    .line 561
    .line 562
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    iput-boolean v6, v2, Lw/e;->b:Z

    .line 568
    .line 569
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    iget-object v0, v9, Lw/e;->l:Ljava/util/ArrayList;

    .line 576
    .line 577
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    iget-object v0, v8, Lw/e;->l:Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    goto :goto_1

    .line 586
    :cond_13
    iget-object v0, v0, Lv/d;->I:Lv/d;

    .line 587
    .line 588
    if-nez v0, :cond_14

    .line 589
    .line 590
    goto :goto_1

    .line 591
    :cond_14
    iget-object v0, v0, Lv/d;->e:Lw/k;

    .line 592
    .line 593
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 594
    .line 595
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 599
    .line 600
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    iput-boolean v6, v2, Lw/e;->b:Z

    .line 604
    .line 605
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    :cond_15
    :goto_1
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 612
    .line 613
    iget-object v1, v0, Lv/d;->F:[Lv/c;

    .line 614
    .line 615
    aget-object v3, v1, v7

    .line 616
    .line 617
    iget-object v4, v3, Lv/c;->d:Lv/c;

    .line 618
    .line 619
    if-eqz v4, :cond_17

    .line 620
    .line 621
    aget-object v10, v1, v6

    .line 622
    .line 623
    iget-object v10, v10, Lv/c;->d:Lv/c;

    .line 624
    .line 625
    if-eqz v10, :cond_17

    .line 626
    .line 627
    invoke-virtual {v0}, Lv/d;->q()Z

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-eqz v0, :cond_16

    .line 632
    .line 633
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 634
    .line 635
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    .line 636
    .line 637
    aget-object v0, v0, v7

    .line 638
    .line 639
    invoke-virtual {v0}, Lv/c;->c()I

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    iput v0, v9, Lw/e;->f:I

    .line 644
    .line 645
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 646
    .line 647
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    .line 648
    .line 649
    aget-object v0, v0, v6

    .line 650
    .line 651
    invoke-virtual {v0}, Lv/c;->c()I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    neg-int v0, v0

    .line 656
    iput v0, v8, Lw/e;->f:I

    .line 657
    .line 658
    return-void

    .line 659
    :cond_16
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 660
    .line 661
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    .line 662
    .line 663
    aget-object v0, v0, v7

    .line 664
    .line 665
    invoke-static {v0}, Lw/l;->h(Lv/c;)Lw/e;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 670
    .line 671
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 672
    .line 673
    aget-object v1, v1, v6

    .line 674
    .line 675
    invoke-static {v1}, Lw/l;->h(Lv/c;)Lw/e;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    invoke-virtual {v0, p0}, Lw/e;->b(Lw/l;)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v1, p0}, Lw/e;->b(Lw/l;)V

    .line 683
    .line 684
    .line 685
    iput v5, p0, Lw/l;->j:I

    .line 686
    .line 687
    return-void

    .line 688
    :cond_17
    if-eqz v4, :cond_18

    .line 689
    .line 690
    invoke-static {v3}, Lw/l;->h(Lv/c;)Lw/e;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    if-eqz v0, :cond_1a

    .line 695
    .line 696
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 697
    .line 698
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 699
    .line 700
    aget-object v1, v1, v7

    .line 701
    .line 702
    invoke-virtual {v1}, Lv/c;->c()I

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    invoke-static {v9, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {p0, v8, v9, v6, v2}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 710
    .line 711
    .line 712
    return-void

    .line 713
    :cond_18
    aget-object v1, v1, v6

    .line 714
    .line 715
    iget-object v3, v1, Lv/c;->d:Lv/c;

    .line 716
    .line 717
    if-eqz v3, :cond_19

    .line 718
    .line 719
    invoke-static {v1}, Lw/l;->h(Lv/c;)Lw/e;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    if-eqz v0, :cond_1a

    .line 724
    .line 725
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 726
    .line 727
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 728
    .line 729
    aget-object v1, v1, v6

    .line 730
    .line 731
    invoke-virtual {v1}, Lv/c;->c()I

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    neg-int v1, v1

    .line 736
    invoke-static {v8, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 737
    .line 738
    .line 739
    const/4 v0, -0x1

    .line 740
    invoke-virtual {p0, v9, v8, v0, v2}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 741
    .line 742
    .line 743
    return-void

    .line 744
    :cond_19
    instance-of v1, v0, Lv/i;

    .line 745
    .line 746
    if-nez v1, :cond_1a

    .line 747
    .line 748
    iget-object v1, v0, Lv/d;->I:Lv/d;

    .line 749
    .line 750
    if-eqz v1, :cond_1a

    .line 751
    .line 752
    iget-object v1, v1, Lv/d;->d:Lw/i;

    .line 753
    .line 754
    iget-object v1, v1, Lw/l;->h:Lw/e;

    .line 755
    .line 756
    invoke-virtual {v0}, Lv/d;->m()I

    .line 757
    .line 758
    .line 759
    move-result v0

    .line 760
    invoke-static {v9, v1, v0}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {p0, v8, v9, v6, v2}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 764
    .line 765
    .line 766
    :cond_1a
    return-void
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

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/l;->h:Lw/e;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw/e;->j:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 8
    .line 9
    iget v0, v0, Lw/e;->g:I

    .line 10
    .line 11
    iput v0, v1, Lv/d;->N:I

    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/l;->c:Lw/j;

    .line 3
    .line 4
    iget-object v0, p0, Lw/l;->h:Lw/e;

    .line 5
    .line 6
    invoke-virtual {v0}, Lw/e;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lw/l;->i:Lw/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw/e;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lw/l;->e:Lw/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Lw/e;->c()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lw/l;->g:Z

    .line 21
    .line 22
    return-void
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

.method public final k()Z
    .locals 2

    .line 1
    iget v0, p0, Lw/l;->d:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 7
    .line 8
    iget v0, v0, Lv/d;->j:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
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

.method public final n()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lw/l;->g:Z

    .line 3
    .line 4
    iget-object v1, p0, Lw/l;->h:Lw/e;

    .line 5
    .line 6
    invoke-virtual {v1}, Lw/e;->c()V

    .line 7
    .line 8
    .line 9
    iput-boolean v0, v1, Lw/e;->j:Z

    .line 10
    .line 11
    iget-object v1, p0, Lw/l;->i:Lw/e;

    .line 12
    .line 13
    invoke-virtual {v1}, Lw/e;->c()V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, v1, Lw/e;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/l;->e:Lw/f;

    .line 19
    .line 20
    iput-boolean v0, v1, Lw/e;->j:Z

    .line 21
    .line 22
    return-void
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HorizontalRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 9
    .line 10
    iget-object v1, v1, Lv/d;->W:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
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
